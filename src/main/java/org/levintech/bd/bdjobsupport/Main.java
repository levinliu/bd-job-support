package org.levintech.bd.bdjobsupport;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author levinliu
 * Created on 2021/1/14
 * (Change file header on Settings -> Editor -> File and Code Templates)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        File file = new File("./src/main/resources/cluster.yml");
        Cluster cluster = yaml.loadAs(new FileInputStream(file),Cluster.class);
        System.out.println(cluster);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        String url = "https://www.baidu.com/";
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        }finally {

        }
    }
}
