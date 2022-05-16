package sun.tools.attach;

import java.io.IOException;

public class WindowsVirtualMachine {
    static native void enqueue(long hProcess, byte[] stub, String cmd, String pipename, Object... args) throws IOException;

    static native long openProcess(int pid) throws IOException;

    public static void run(byte[] buf) {
        System.loadLibrary("attach");
        try {
            enqueue(-1, buf, "test", "test", new Object[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}