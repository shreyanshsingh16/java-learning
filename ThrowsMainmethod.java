 class ThrowsMainmethod {
    public static void main(sstring[] args) 
    throws Exception {
        int[] arr= new int[3];
        try{
            for(int i=0;i<4;i++){
                arr[i]=i;
            }
            System.out.println(arr);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("fillin: " +e.fillInStackTrace());
            System.out.println("cause: "+e.getCause());
            System.out.println("local: "+ e.getLocalizedMessage());
            System.out.println("message: "+e.getMessage());
            System.out.println("trace: "+e.getStackTrace());
            System.out.println();
            System.out.println("trace1: "); e.printStackTrace();
            System.out.println();
            System.out.println("string: ");e.toString();
            System.out.println();
            System.out.println();
            System.out.println("Oops we went too far");
            throw (Exception) new Exception().initCause(e);
        }
        finally{
            System.out.println(arr);
        }
    }    
    }
