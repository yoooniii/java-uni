import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
/*
        Person p1=new Person("Ivan",22);
        System.out.println("Name: "+p1.getName()+", Age: " + p1.getAge());
        Person p2=new Person();
        p2.setName("Maria");
        p2.setAge(26);
        System.out.println("Name: "+p2.getName()+", Age: " + p2.getAge());
 */
        /*
        System.out.print("Радиусът на кръга е: ");
        double rad=inp.nextDouble();
        Circle c1=new Circle(rad);
        System.out.print("Лицето на кръга с радиус "+rad+" е: "+c1.liceNaKrug(rad)+"кв.м.ед");
        */
 
        System.out.print("Въведете вид на фигурата: ");
        String type=inp.nextLine();
        System.out.print("Въведете височина и широчина на фигурата: ");
        double width=inp.nextDouble();
        double height=inp.nextDouble();
        System.out.print("Въведете вид на фигура 2: ");
        String type1=inp.nextLine();
        System.out.print("Въведете височина и широчина на фигура 2: ");
        double width1=inp.nextDouble();
        double height1=inp.nextDouble();
        Figure f1=new Figure(type,width,height);
        Figure f2=new Figure(type1,width1,height1);
        System.out.print("Лицето на фигурата е: "+f1.licePravougulnik()+"кв.м.ед");
        System.out.print("Лицето на фигурата е: "+f2.liceKvadrat()+"кв.м.ед");
 
        /*
        Mammal m=new Mammal();
        m.MakesSound();
        Bird b=new Bird();
        b.MakesSound();
        */
 
    }
}
