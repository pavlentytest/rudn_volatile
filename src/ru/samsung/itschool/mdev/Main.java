package ru.samsung.itschool.mdev;

public class Main {

    public volatile static boolean flag = false;

    public static void main(String[] args) {
	    new Main().ddd();
    }

    public void ddd() {
        new Thread(gui).start();
        System.out.println("Старт графического интерфейса!");
        new Thread(logic).start();
        System.out.println("Старт логики!");
    }

    Runnable gui = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Стоп графический интерфейс!");
            flag = true;
        }
    };

    Runnable logic = new Runnable() {
        @Override
        public void run() {
           // System.out.println(flag);
            while(!flag) {
                // бесконечный цикл!!!
            }
            System.out.println("Стоп логика!");
        }
    };





}
