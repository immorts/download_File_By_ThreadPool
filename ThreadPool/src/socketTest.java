import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @ClassName: socketTest
 * @Description: TODO
 * @author: immorts
 * @date: 2022/3/30  10:06 下午
 */
public class socketTest {
    public static void main(String[] args) throws UnknownHostException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("")){
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        } else {
            InetAddress[] addresses = InetAddress.getAllByName(s);
            for (InetAddress address : addresses) {
                System.out.println(address);
            }
        }
    }
}
