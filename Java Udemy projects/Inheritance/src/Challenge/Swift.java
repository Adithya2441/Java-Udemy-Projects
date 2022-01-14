package Challenge;

public class Swift extends Car{
    private int roadService;

    public Swift(int roadService) {
        super("Swift", "2WD", 5, 5, 5, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVelocity = getVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }
        else if(newVelocity>0 && newVelocity<=10){
            changeGear(1);
        }
        else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }
        else if(newVelocity>20 && newVelocity<=30){
            changeGear(3);
        }
        else {
            changeGear(4);
        }

        if(newVelocity>0){
            changeVelocity(newVelocity,getDirection());
        }
    }
}
