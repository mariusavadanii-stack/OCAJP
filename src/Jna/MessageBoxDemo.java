package Jna;

import com.sun.jna.Library;  // JNA interface for mapping native libraries
import com.sun.jna.Native;   // JNA class used to load DLLs dynamically

public class MessageBoxDemo {

    // Interface that maps functions from user32.dll
    public interface User32 extends Library {

        // Loads user32.dll and binds its functions to this interface
        User32 INSTANCE = Native.load("user32", User32.class);

        // Declaration of the native Windows function:
        // int MessageBoxA(HWND hwnd, LPCSTR text, LPCSTR caption, UINT type)
        int MessageBoxA(int hwnd, String text, String caption, int type);
    }

    public static void main(String[] args) {

        // Calls the native MessageBoxA function to show a popup window
        User32.INSTANCE.MessageBoxA(
                0,                                           // No parent window (NULL)
                "Salut George!  MessageBox real din Windows.", // Message text
                "User32.dll Demo",                            // Window title
                0                                             // MessageBox type (OK button)
        );
    }
}