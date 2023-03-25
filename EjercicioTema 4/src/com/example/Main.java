package com.example;

public class Main {
    public static void main(String[] args) {

        SmartPhone MotoEdge = new SmartPhone ("Motorola","30 Pro", "negro", "plástico", 196, "OLED", 6.7, "Android", "USB-C", 16, 4800, 256, 12,"Snapdragon 8 gen 1",8,3,true,true,true,true,true,50,60,false,144,false,false,true,true,true,false,false,false);
        SmartPhone Galaxy = new SmartPhone("Samsung","S21Fe","Phantom Gray","Android 11",169,"AMOLED",6.2,"Android 11","USB-C",12,4000,128,8,"MediaTech 1200",8,2.8,true,true,true,true,true,64,10,false,120,false,true,true,true,false,false,false,true);

        SmartWatch GalaxyWatch = new SmartWatch("Samsung","Watch5 pro","black titanium","titanio",46.5,"SAMOLED",1.3,"Wear OS","Inalambrica",80,590,16,2,"Mediatek",2,1.18,true,true,true,true,true,"black titanium",true,true);

        System.out.println(MotoEdge);
        System.out.println(Galaxy);
        System.out.println(GalaxyWatch);

    }

}