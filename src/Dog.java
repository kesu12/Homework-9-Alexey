public class Dog extends Animal {
    String food;

    private Dog (){
    }
    public static void voiceOut() {
        System.out.println("I am a Dog.");
    }

    public static void eatFood(String food) {
        switch (food){
            case "Meat":
                System.out.println("I like it.");
                break;
            case "Grass":
                System.out.println("Yuck!");
                break;
            default:
                System.out.println("Food undefined.");
        }

    }
}
