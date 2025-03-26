package main;

public class Aims {

    public static void main(String[] args) {
        

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("\nTrước khi xóa");
        printCart(anOrder);

        anOrder.removeDigitalVideoDisc(dvd2);

        System.out.println("\nSau khi xóa");
        printCart(anOrder);

        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd3);

        System.out.println("\nSau khi xóa hết");
        printCart(anOrder);

        anOrder.removeDigitalVideoDisc(dvd1);
 
 
         Cart cart = new Cart();
 
         DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
         DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
         DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
         DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King 2", "Animation", "Roger Allers", 87, 19.95f);
         DigitalVideoDisc dvd8 = new DigitalVideoDisc("Star Wars 2", "Science Fiction", "George Lucas", 87, 24.95f);
         DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin 2", "Animation", 18.99f);
 
         cart.addDigitalVideoDisc(dvd4, dvd5);
 
         System.out.println("\nSử dụng các tham số số khác nhau");
         printCart(cart);
 
         cart.addDigitalVideoDisc(dvd6, dvd7, dvd8, dvd9);
 
         System.out.println("\nSử dụng varargs");
         printCart(cart);

    }

    public static void printCart(Cart cart) {
        System.out.printf("%-3s %-20s %10s\n", "No", "Title", "Cost");
        int index = 1;
        for (DigitalVideoDisc disc : cart.getItemsOrdered()) {
            System.out.printf("%-3d %-20s %10.2f\n", index++, disc.getTitle(), disc.getCost());
        }
        System.out.printf("\n%-24s %10.2f\n", "Total Cost", cart.totalCost());
    }

}