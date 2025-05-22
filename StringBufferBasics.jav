public class StringBufferBasics{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original String: " + sb);
        
        // Append
        sb.append("!");
        System.out.println("After Append: " + sb);
        System.out.println( "length: " + sb.length());
        System.out.println( "capacity: " + sb.capacity());
        System.out.println("character at index 1: "+ sb.charAt(index:1));
        // Insert
        sb.insert(5, ", Java");
        System.out.println("After Insert: " + sb);
        
        // Replace
        sb.replace(6, 11, "Python");
        System.out.println("After Replace: " + sb);
        
        // Delete
        sb.delete(5, 12);
        System.out.println("After Delete: " + sb);
        sb.deleteCharAt(5);
        System.out.println("After Delete Char At: " + sb);
        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}