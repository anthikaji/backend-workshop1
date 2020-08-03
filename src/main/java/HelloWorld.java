public class HelloWorld {
    public String sayHi() {
    return "Hello World";
    }

    public String sayHi(String name) {
        String firstLetter = name.substring(0,1).toUpperCase();
        String remainLatters = name.substring(1);
        return  "Hello " + firstLetter + remainLatters;
//        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
    }
//    public static void main (String[] args){
////        System.out.println("HelloWorld");
//        HelloWorld h = new HelloWorld();
//        String result = h.sayHi();
//        System.out.println(result);
//    }
//    public String sayHi(){
//        return "HelloWorld";
//    }
}
