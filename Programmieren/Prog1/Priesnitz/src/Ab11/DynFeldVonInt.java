package Ab11;

import java.util.Arrays;

public class DynFeldVonInt {
    private int[] array;

    public DynFeldVonInt(int n){
        this.array = new int[n];
    }
    public int length(){
        return array.length;
    }
    public int get(int i){
        return array[i];
    }
    public void set(int i, int v){
        this.array[i] = v;
    }
    public void insert(int i, int k){
        int[] neu = new int[array.length + k];
        for (int a = 0; a < neu.length; a++){
            if (a < i){
                neu[a] = array[a];
            }
            else if (a >= i  && a < (a-k)){
                neu[a] = 0;
            }else{
                neu[a] = array[a-k];
            }
        }
        System.out.println(Arrays.toString(neu));
    }

    public static void main(String[] args) {
        DynFeldVonInt a = new DynFeldVonInt(5);
        a.insert(2,5);
    }
}
