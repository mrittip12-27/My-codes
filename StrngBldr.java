public class StrngBldr {
    
    public static void main(String[] args) {
        StringBuilder rer = new StringBuilder("mrittip");
        System.out.println(rer);
        System.out.print(rer.charAt(0));
        rer.setCharAt(0, 'P');
        System.out.println(rer);
        rer.delete(0,1);
        rer.append("o");
        rer.append("p");
        rer.append("l");
        System.out.println(rer);
    }
    
}
