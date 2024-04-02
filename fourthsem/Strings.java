package fourthsem;
public class Strings {
    public static void main(String[] args) {
        String s1="siddarth";
        String s2="ramesh";
        int a=20;
        System.out.println("conversion of lower case to upper case:"+s1.toUpperCase());
        System.out.println("conversion of upper case to lower case"+s1.toLowerCase());
        System.out.println("illustration of trim method:"+s1.trim());
        System.out.println("illustration of  replace method:"+s1.replace('d', 'D'));
        System.out.println("illustration of equals to method :"+s2.equals(s1));
        System.out.println("illustration of equals to ignorecase method:"+s2.equalsIgnoreCase(s1));
        System.out.println("illustartion of lenght method :"+s1.length());
        System.out.println("illustartion of the charat method:"+s1.charAt(3));
        System.out.println("illusration of substring:"+s1.substring(2, 7));
        System.out.println("illustration of concat method:"+s1.concat(s2));
        System.out.println("illustarion of compare two method:"+s1.compareTo(s2));
        System.out.println("illustarion of value method:"+String.valueOf(a));
        System.out.println("illustration of to string method:"+s1.toString());
        System.out.println("illusration of value method:"+s1.indexOf('d'));










    }   
}
