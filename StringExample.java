public class StringExample {
    public static void main(String[] args) {
        //string methods 
        //indexing starts from 0 
        //length
        String name1="Maya Mehra";
        String name2="Maya Mehra";
        int len=name1.length();
        System.out.println(len);
        //to acess the character at particular index 
        char c=name1.charAt(8);
        System.out.println(c);

        //equality
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));

        //compareTo method
        int res=name1.compareTo(name2);
        System.out.println(res);


        //substring---hissa chahiye na uska 
        //last element is excluding 
        String sub=name1.substring(2,5);
        System.out.println(sub);


        //change case 
        String uppercase=name1.toUpperCase();
        System.out.println(uppercase);

        String lowercase=name1.toLowerCase();
        System.out.println(lowercase);

        //Strings are not mutable 
        String new_name=name1.replace("Mehra", "Roy");
        System.out.println(new_name);
    
        //contains method returns the boolean value 
    boolean consist=name1.contains("m");
    System.out.println(consist);
    
//start end 
    System.out.println(name1.startsWith("M"));
     System.out.println(name1.endsWith("a"));
    

     //index
     System.out.println(name1.indexOf("m"));
     System.out.println(name1.isEmpty());
    
    
    
    
    }
}
