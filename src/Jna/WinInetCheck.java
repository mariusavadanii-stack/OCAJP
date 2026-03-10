package Jna;

import com.sun.jna.Library;  // Imports JNA interface for mapping native libraries
import com.sun.jna.Native;   // Imports JNA class used to load native DLLs

public class WinInetCheck {

    // Interface that maps the native WinInet.dll functions
    public interface WinInet extends Library {

        // Loads the Windows DLL named "wininet" and binds it to this interface
        WinInet INSTANCE = Native.load("wininet", WinInet.class);

        // Declaration of the native WinInet function:
        // BOOL InternetCheckConnectionA(LPCSTR url, DWORD flags, DWORD reserved);
        boolean InternetCheckConnectionA(String url, int flags, int reserved);
    }

    public static void main(String[] args) {

        // Calls the native function from wininet.dll to test internet connectivity
        boolean ok = WinInet.INSTANCE.InternetCheckConnectionA(
                "https://www.google.com",    // URL to test connectivity
                1,                           // FLAG_ICC_FORCE_CONNECTION: forces an actual connection attempt
                0                            // Reserved parameter (must be 0)
        );

        // Prints the result: true if internet is available, false otherwise
        System.out.println("Internet available? " + ok);
    }
}