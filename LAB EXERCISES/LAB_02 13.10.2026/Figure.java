public class Figure {
    private double height, width;
    private String type;
    public Figure( String type, double height, double width) {
        this.height = height;
        this.width = width;
        this.type=type;
    }
 
    public double getHeight() {
        return height;
    }
 
    public void setHeight(double height) {
        this.height = height;
    }
 
    public double getWidth() {
        return width;
    }
 
    public void setWidth(double width) {
        this.width = width;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
public double checkType(String type){
        if (type.equals("Квадрат")) return liceKvadrat();
        else if (type.equals("Правоъгълник")) return licePravougulnik();
        else return 0;
}
    public double licePravougulnik(){
       return width*height;
    }
    public double liceKvadrat(){
        return this.width*this.height;
    }
}
