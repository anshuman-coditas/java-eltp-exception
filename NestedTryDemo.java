public class NestedTryDemo {
    public static void main(String[] args) {
        int a=12,b=0,res=0;
        String abc=null;
        try{
            try {
                System.out.println(abc.length());
            }

            finally {
                System.out.println("Nested");
            }
            res=a/b;
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println(e);
        }

        }
    }

