public class no1 {
    public static void main(String[] args) throws Exception {
       int x = 6;
       int z = 4;
       System.out.print("\n"+x+" ");
       for (int y=1; y<9; y++) {
        if (y % 2 != 0){
            x = x-z;
        }else{
            x = x+z;
        }
        System.out.print(x+"");
        z++;
        }
        System.out.println();
        } 
    } 
     

