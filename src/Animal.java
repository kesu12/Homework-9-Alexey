public abstract class Animal {
    public void voice(){
        System.out.println("");
    }
    public void eat(String food){
        switch (food){
            case "Meat":
                break;
            case "Grass":
                break;
            default:
                System.out.println("Food undefined.");
        }
    }
}
