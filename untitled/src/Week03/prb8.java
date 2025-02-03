package Week03;

public class prb8 {


    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int target = 2;
        prb8 prb8 = new prb8();
        int i = prb8.numberOfEmployeesWhoMetTarget(arr, target);

        System.out.println(i);
    }


    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count =0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            {
                count++;
            }
        }
        return count;

    }
}
