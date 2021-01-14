package org.levintech.bd.bdjobsupport;

/**
 * @author levinliu
 * Created on 2021/1/14
 * (Change file header on Settings -> Editor -> File and Code Templates)
 */
public class Cluster {
    private String yarnUrl;

    public String getYarnUrl() {
        return yarnUrl;
    }

    public void setYarnUrl(String yarnUrl) {
        this.yarnUrl = yarnUrl;
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "yarnUrl='" + yarnUrl + '\'' +
                '}';
    }
}
