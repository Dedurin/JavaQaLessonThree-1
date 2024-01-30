public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 2500;
        int miles = service.calculate(price);
        System.out.println("Количество начисленных миль за купленные билет: " +  miles);
    }
}