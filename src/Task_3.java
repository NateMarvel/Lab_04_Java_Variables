public class Task_3
{
    public static void main(String[] args)
    {
        int cardBalance = 5000;
        double interestRate = 0.17;
        double monthOneInterest = cardBalance * interestRate;
        double monthOneBalance = cardBalance + monthOneInterest;
        double monthTwoInterest = monthOneBalance * interestRate;
        double monthTwoBalance = monthOneBalance + monthTwoInterest;
        System.out.println("Your balance after one month is " + monthOneBalance + " and your interest due is " + monthOneInterest + " and your balance after two months is " + monthTwoBalance + " and your interest due is " + monthTwoInterest);
    }
}
