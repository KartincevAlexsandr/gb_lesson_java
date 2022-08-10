package dz1;

public class RemoveElement {

        public int removeElement(int[] nums, int val) {
            int countInt = nums.length;
            int[] newNums = nums.clone();
            for(int i = 0 , j = 0; i < nums.length; i++){
                if(newNums[i] != val){
                    nums[j++] = newNums[i];
                }else{
                    countInt--;
                }
            }
            return  countInt;
        }

}
