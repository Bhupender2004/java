// class Pen{
//     String color;
//     String type;
    
//     public void write(){
//         System.out.print("Write something.");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//     }

//     public void printType(){
//         System.out.println(this.type);
//     }
// }

// class oops{
//     public static void main(String [] args){
//         Pen p1 = new Pen();
//         p1.color = "blue";

//         Pen p2 = new Pen();
//         p2.type = "gel";

//         p1.printColor();
//         p2.printType();
//     }
// }

// class : class is a user defined data type which define its properties and its function. Class is the only logical representation of data.

// Object : Object is a run time entity. It is the instance of the class. An object may represent a person, place or anything.

// In simple words: class ---> ek blueprint ya ek template hota hai.
// aur object ---> ek real thing created from that blueprint.


// class Student{
//     String name;
//     int age;

//     public void getinfo(){
//         System.out.println("The name of the student is : "+this.name);
//         System.out.println("The age of the student is : "+this.age);

//     }
// }

// class oops{
//     public static void main(String [] args){
//         Student s1 = new Student();
//         s1.name = "Bhupender";
//         s1.age = 21;

//         s1.getinfo();
//     }
// }


// class Pen{
//     String color;
//     String type;

//     public void printfunc(){
//         System.out.println("Pen color is: "+this.color);
//         System.out.println("Pen is: "+this.type);
//     }
// }

// class oops{
//     public static void main(String [] args){
//         Pen p = new Pen();
//         p.color = "Black";
//         p.type = "Gel";

//         p.printfunc();
//     }
// }

// Polymorphism

// class Shape{
//     public void area(){
//         System.out.println("Display area of shape");
//     }
// }

// class Triangle extends Shape{
//     public void area(int b, int h){
//         System.out.println((1/2)*b*h);
//     }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }

// public class oops{
//     public static void main(String [] args){
//         Shape s1 = new Triangle();
//         s1.area();
//     }
// }



// abstract class Animal{
//     abstract void walk();
// }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }

// public class oops{
//     public static void main(String [] args){
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }


interface Animal{
    public void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
}

public class oops{
    public static void main(String [] args){
        Horse horse = new Horse();
        horse.walk();
    }
}