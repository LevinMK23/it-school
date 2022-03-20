package com.samsung.round;

import java.io.File;

public class A {


    public static void main(String[] args) {

        class NumberPhone {

            private final String phone;

            public NumberPhone(String phone) {
                this.phone = phone;
            }

            public boolean validate() {
                return phone.matches("\\+7[0-9]{10}");
            }
        }

        System.out.println(new NumberPhone("+79112223344").validate());
        System.out.println(new NumberPhone("+7911222334").validate());
        System.out.println(new NumberPhone("79112223344").validate());


    }


    public void getFileInfo(String fileName){
        File file = new File(fileName);
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());

        InfoService service = new InfoService();
        InfoService.Paper paper = service.new Paper();

        new InfoService().new Paper();
    }
}
