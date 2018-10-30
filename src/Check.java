public class Check {
    //选择排序算法
    public void xuanze(int[] array){
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    
    public void dayin(int[] array){
        for(int i = 0; i< array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    } 
    

    public static void main(String[] args){

        int[] A={2, 4, 1, 7, 5, 8, 9, 6, 3};
        Check ck =new Check();
        ck.dayin(A);
        ck.xuanze(A);
        System.out.println();
        ck.dayin(A);
    }
}
