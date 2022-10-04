//Task1

//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        System.out.println(color);
//    }
//}

//Task2

//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.set(0,"black");
//        System.out.println(color);
//    }
//}

//Task3

//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        String color2 = color.get(2);
//        System.out.println(color2);
//    }
//}

//Task4

//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.set(0,"black");
//        System.out.println(color);
//    }
//}

//Task5
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        color.remove(3);
//        System.out.println(color);
//    }
//}


//Task6
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        if(color.contains("red")){
//            System.out.println("red is found");
//        }
//        else{
//            System.out.println("There no word red");
//        }
//    }
//}

//Task7
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        ArrayList<String> color2 = color;
//        System.out.println(color2);
//    }
//}


//Task8
//import java.util.ArrayList;
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        Collections.shuffle(color);
//        System.out.println(color);
//    }
//}

//Task9
//import java.util.ArrayList;
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//         Collections.reverse(color);
//        System.out.println(color);
//    }
//}

//Bonus1
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        List<String> sub_List = color.subList(0, 2);
//        System.out.println(sub_List);
//    }
//}

//Bonus2
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        ArrayList<String> color2= new ArrayList<String>();
//        color2.add("blue");
//        color2.add("red");
//        color2.add("white");
//        color2.add("black");
//        if(color.equals(color2)){
//            System.out.println(color +" is equal to "+color2);
//        }
//        else {
//            System.out.println(color +" is not equal to "+color2);
//        }
//    }
//}

//Bonus3
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        Collections.swap(color, 0, 2);
//        System.out.println(color);
//    }
//}

//Bonus4
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color= new ArrayList<String>();
//        color.add("blue");
//        color.add("red");
//        color.add("white");
//        color.add("black");
//        ArrayList<String> color2= new ArrayList<String>();
//        color2.add("blue");
//        color2.add("red");
//        color2.add("white");
//        color2.add("black");
//        ArrayList<String> added = new ArrayList<String>();
//        added.addAll(color);
//        added.addAll(color2);
//        System.out.println(added);
//    }
//}
