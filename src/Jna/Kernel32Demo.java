package Jna;

import com.sun.jna.Library;   // JNA interface for mapping native libraries from DLL
import com.sun.jna.Native;    // JNA class used to load DLLs dynamically
import com.sun.jna.Platform;  // Utility class (not used here, but imported)
                              // it tell us if we are running on WIndows or Linux

    // public class that contains our logic
public class Kernel32Demo {

    // define an interface that maps functions from kernel32.dll (APIs for Windows)
        public interface Kernel32 extends Library {


        /*
         * Native.load():
         *  - Searches for the DLL "kernel32.dll"
         *  - Loads it into the Java process
         *  - Maps the functions in the DLL to the methods in the Java interface
         * INSTANCE acts as a singleton providing access to the native functions.
         */
        Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);

        /*
         * A real Windows API function.
         * - Returns the number of milliseconds since the system was last started
         * - Takes no arguments
         * JNA will automatically bind the Java method to the native function.
         */
        int GetTickCount();

        /*
         * ASCII (A) variant of the Windows API function.
         *
         * Parameters:
         *  - byte[] buffer: the array where Windows writes the computer name
         *  - int[] len: the length of the buffer; Windows updates this value
         *               to indicate how many characters were written
         *
         * Returns true if the function succeeds.
         */
        boolean GetComputerNameA(byte[] buffer, int[] len);
    }

    public static void main(String[] args) {

        // Calls the native GetTickCount() to get system uptime
        int ms = Kernel32.INSTANCE.GetTickCount();
        System.out.println("Uptime (ms): " + ms);

        /*
         * Creates a 256-byte buffer (the maximum size allowed for the computer name).
         */
        byte[] buffer = new byte[256];
        /*
         * Windows writes the computer name into the provided buffer.
         * It also writes the actual length of the name into len[0].
         */
        int[] len = { buffer.length };

        // Calls the native function to fill the buffer with the machine name
        Kernel32.INSTANCE.GetComputerNameA(buffer, len);

        /*
         * Converts only the first len[0] characters into a String,
         * ensuring that any leftover junk data in the buffer is ignored.
         */
        String computerName = new String(buffer, 0, len[0]);
        System.out.println("Computer Name: " + computerName);
    }
}
