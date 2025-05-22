 class StringRemoveZeroes {
    public static String removeZero(String str)
    {
        int i=0;
        while(i<str.length() && str.charAt(i)=='0')
        
            i++;
            StringBuffer sb = new StringBuffer(str);
            sb.replace(0, i, "");
            return sb.toString();
        }
       public static void main(String[] args) 
       {
        String str = "0001234500";
        String result = removeZero(str);
        System.out.println("String after removing leading zeroes: " + result);
    }
    
}
 
