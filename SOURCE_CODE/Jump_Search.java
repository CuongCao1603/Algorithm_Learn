import static java.lang.Math.floor;

public class Jump_Search {


    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;

        int periousStart = 0;
        int periousEnd = 0;
        int index = 0;

        int size = arr.length;
        int jump = (int) Math.floor(Math.sqrt(arr.length));

        for (int i = 0; i < size; i +=jump) {

            if (x > arr[(i)]) {
                periousStart = i;
                break;
            }
        }
//        else
//            {
//                periousStart = i;
                System.out.println("Start: " + periousStart);

//                periousEnd = i + jump;
//                if(periousEnd>size){
//                    periousEnd = size;
//                }
//                for (int j= periousStart; j < periousEnd; j++) {
////                    index += 1;
//                    if (x == arr[j]) {
//                        System.out.println("Index: " + j);
//                        break;
//
//                    }
//                }

//        }


    }


}
