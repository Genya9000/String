package Run;

import Controller.Services;


public class MainMagia {
    public static void main(String[] args) {

        Services services = new Services();
        System.out.println(services.replaceWithSubstring());
        System.out.println(services.getOne());

    }
}
