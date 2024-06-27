public  class Bitwise_operator{
   
    public static void main(String[] args){
        // Bitwise_or
        //4---00100
        //5---00101
        //or--00101  == 5
        System.out.println(4|5);

        // Bitwise_and
        //4----00100
        //5----00101
        //and--00100  == 4
        System.out.println(4&5);

        // Bitwise_xor
        //4----100
        //5----101
        //xor--001  == 1
        System.out.println(4^5);


        // Bitwise_once_complement
        //4-----100
        //1's---011 
        //add 1  +1
        //      100 == -5
        System.out.println(~4);

        //Bitwise_left_shift
        //a*2**b
        //4*2**5==128
        System.out.println(4<<5);


        //Bitwise_right_shift
        //a/2**b
        //5/2**2==1
        System.out.println(5>>2);

        


    }
}