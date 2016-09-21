package test;

/**
 * Created by lon on 16-5-4.
 */
public class ToIp {
    public static void main(String[] args) {
        String ip = toIp(20*10000*10000);
        System.out.println(ip);
    }
    public static String toIp(long ip) {
        final long[] mask = {0x000000FF, 0x0000FF00, 0x00FF0000, 0xFF000000};
        final StringBuilder ipAddress = new StringBuilder();
        for (int i = 0; i < mask.length; i++) {
            ipAddress.insert(0, (ip & mask[i]) >> (i * 8));
            if (i < mask.length - 1) {
                ipAddress.insert(0, ".");
            }
        }
        return ipAddress.toString();
    }

}
