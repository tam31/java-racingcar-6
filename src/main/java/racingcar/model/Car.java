package racingcar.model;

public class Car {
  private String carName;
  private int position;

    public Car(String name) {
        this.carName = name;
        position = 0;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward(int number){
        if(number >= 4){
            position ++;
        }
    }
}
