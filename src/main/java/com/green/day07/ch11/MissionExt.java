package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        String  fileNm = "nice_v.ery.Nice.jpg";
        String ext = fileNm.substring(fileNm.lastIndexOf("."));

        System.out.println("nice_v.ery.Nice.jpg: " + fileNm.lastIndexOf("."));

        System.out.println(ext); //jpg
    }
}
