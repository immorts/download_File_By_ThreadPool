package MyDownload;

import MyDownload.download.Downloader;
import MyDownload.util.LogUtils;

import java.util.Scanner;

/**
 * @ClassName: main
 * @Description: TODO
 * @author: immorts
 * @date: 2022/3/30  9:32 下午
 */
public class Main {
    public static void main(String[] args) {
//        https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png
        // 下载地址
        String url = null;
        if (args == null || args.length == 0) {
            for (; ; ) {
                LogUtils.info("请输入下载地址");
                Scanner scanner = new Scanner(System.in);
                url = scanner.next();
                if (url != null) {
                    break;
                }
            }
        }else {
            url = args[0];
        }

        Downloader downloader = new Downloader();
        downloader.download(url);
    }
}