package dz1;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int[] newArr = arr.clone();

        for(int i =0 , j = 0; i< newArr.length; i++,j++){
            arr[i] = newArr[j];
            if(newArr[j] == 0  && i != newArr.length-1){
                i++;
                arr[i] = newArr[j];
            }
        }
        return ;
    }
}
