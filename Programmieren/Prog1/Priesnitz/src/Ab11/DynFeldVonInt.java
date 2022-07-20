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
    public void insert(int i, int k){//gg
        int[] neu = new int[array.length + k];
        for (int a = 0; a < neu.length; a++){
            if (a < i){
                neu[a] = array[a] + 1;
            }
            else if (a >= i  && a < (i+k)){
                neu[a] = 0;
            }else{
                neu[a] = array[a-k] + 1;
            }
        }
        this.array = neu;
        System.out.println(Arrays.toString(array));
    }
    public void remove(int i, int k)throws IllegalArgumentException{
        int[] neu = new int[array.length - k];
        for (int a = 0; a < array.length;a++){
            if (i + k > array.length){
                throw new IllegalArgumentException();
            }
            if (a <= i){
                neu[a] = array[a];
            }
            if (a >= i+k){
                neu[a - k] = array[a];
            }
        }
        this.array = neu;
        System.out.println(Arrays.toString(array));
    }
    public boolean equals(DynFeldVonInt ref){
        if (ref.length() != this.array.length){
            return false;
        }
        for (int i = 0; i < array.length; i++){
            if (ref.array[i] != this.array[i]){
                return false;
            }
        }
        return true;
    }
    public String toString(){
       /** System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print("]");
        return "";**/
       return Arrays.toString(array);
    }

    public static void main(String[] args)throws Exception {
        DynFeldVonInt a = new DynFeldVonInt(5);
        a.insert(2,5);
        a.remove(2,4);
        System.out.println(a.toString());
    }
}