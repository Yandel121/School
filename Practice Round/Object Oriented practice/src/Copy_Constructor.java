public class Copy_Constructor {
    private int length;
    private int width;
    public Copy_Constructor(int length, int width){
            this.length=length;
            this.width=width;
        }
       public Copy_Constructor(Copy_Constructor r){
            this.length=r.length;
            this.width=r.width;
        }

        public static void main(String[] args){
        Copy_Constructor r1=new Copy_Constructor(15,20);
        Copy_Constructor r2=new Copy_Constructor(r1);
        System.out.println(r1.length);
        System.out.println(r1.width);
        System.out.println(r2.length);
        System.out.println(r2.width);
        }
    }

