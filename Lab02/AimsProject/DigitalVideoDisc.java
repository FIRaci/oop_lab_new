package main;

public class DigitalVideoDisc {
    
     public static int nbDigitalVideoDiscs = 0;
 
     private int id;

    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
     }

    // Overloaded constructors

    public DigitalVideoDisc(String title) {
        this.title = title;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        System.out.println("Tạo DVD với ID = " + id + ", Tất cả DVDS đã có đến thời điểm hiện tại = " + nbDigitalVideoDiscs);

    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
