public class Superbazarbill {
    public static void main(String[] args) {
        double quantity,rate,bill,discount,net;
        quantity=100;
        rate=55;
        bill=quantity*rate;
        discount=bill*10/100;
        net=bill-discount;
        System.out.println("Total amount"+net);
        


    }
}
