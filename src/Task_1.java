public class Task_1
{
    public static void main(String[] args)
    {
        double taxRate = 0.05;
        double purchasePrice = 10.50;
        double salesTax = taxRate * purchasePrice;
        double totalPrice = salesTax + purchasePrice;
        System.out.println("The sales tax on your item is " + salesTax + " and the total price of your purchase is " + totalPrice);
    }
}
