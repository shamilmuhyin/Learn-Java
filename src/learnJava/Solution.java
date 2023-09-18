package learnJava;

public class Solution {
    // Data/ Feild / Artiubute / Properties
    private float floaNnum = 10.0F;
    private int num = (int) floaNnum;

//     Behaviour / method / Function

    public Boolean isPositive(int num){
        if(num>0){
            return true;
        }
        else
        {
            return false;
        }
    }
    public Integer getNum(){
        return this.num;
    }

}
