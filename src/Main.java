public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 2000;
        int miles = service.calculate(price);
        System.out.println("количество миль:" + miles);
    }
}