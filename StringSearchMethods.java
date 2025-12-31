public class StringSearchMethods {
    public static void main(String[] args) {


//        String s = "Automation Testing";
//        System.out.println(s.contains("Testing"));
//
//        String r = "Ramesh";
//        System.out.println(r.contains("Manoj"));

//        String s = "Java Training";
//        System.out.println(s.startsWith("Java"));
//        System.out.println(s.endsWith("g"));

        String s = "Java,Python,C++";
        String[] arr = s.split(",");

       for (String lang : arr) {
            System.out.println(lang);
          }
    }
}
