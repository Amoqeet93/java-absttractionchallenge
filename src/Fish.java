public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " slow swim!");
        }else{
            System.out.println(getExplicitType() + " darting");
        }

    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.println("plop!");
        } else{
            System.out.println("swish!");
        }

    }
}
