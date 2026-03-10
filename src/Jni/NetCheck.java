package Jni;

public class NetCheck {

    static {
        System.loadLibrary("WinInet"); // load WinInet.dll
    }

    // JNI wrapper for InternetCheckConnectionA
    public static native boolean checkConnection(String url, int flags);

    public static void main(String[] args) {
        boolean ok = checkConnection("https://www.google.com", 1);
        System.out.println("Can connect to Google? " + ok);
    }
}