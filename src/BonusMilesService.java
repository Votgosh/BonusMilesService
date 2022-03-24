public class BonusMilesService {
    public int calculate(int price) {
        int bonusService = 20;
        int miles = price / bonusService;
        return miles;
    }
}
