
package arrays1;
public class Arrays1 {
    public static void main(String[] args) {
//array de 5 tempas
        float[] temperaturas={2f,3f,5f,6f,7f};
        temperaturas[2]=20f;
        
        for(int i=temperaturas.length-1;i>=0;i--)
            System.out.println("elemento"+(i+1)+"-->"+temperaturas[i]+"\n");
        for( int i=0;i<temperaturas.length;i+=2)
            System.out.println("elemento"+(i)+"-->"+temperaturas[i]+"\n");
        visualizar(temperaturas);
    
    
    
    }
    public static void visualizar (float[]tem){
        for(int i=0;i<tem.length;i++)
            System.out.println("elemento"+tem[i]);
    }
}
