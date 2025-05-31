public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("I am a rabbit.");
    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat":
                System.out.println("Yuck!");
                break;
            case "Grass":
                System.out.println("I like it.");
                break;
        }

        super.eat(food);
    }
}
