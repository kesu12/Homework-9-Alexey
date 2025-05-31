public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("I am a Tiger.");
    }

    @Override
    public void eat(String food) {
        switch (food){
            case "Meat":
                System.out.println("I like it.");
                break;
            case "Grass":
                System.out.println("Yuck!");
                break;
        }

        super.eat(food);
    }
}
