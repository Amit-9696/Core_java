package String;

public class StringDemo3 {
    public static void main(String[] args) {
        String str="Software Developer";
        System.out.println("LENGTH "+str.length());//18
        System.out.println("CHAR AT "+str.charAt(3));//t
        System.out.println("INDEX OF "+str.indexOf('e'));//7
        System.out.println("LAST INDEX OF "+str.lastIndexOf('e'));//16
        System.out.println("CONTAINS "+str.contains("DEV"));//false
        System.out.println("STARTS WITH "+str.startsWith("Soft"));//true
        System.out.println("ENDS WITH "+str.endsWith("per"));//true
        System.out.println("SUBSTRING 1 "+str.substring(9));//Developer
        System.out.println("SUBSTRING 2 "+str.substring(0,8));//Software
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
