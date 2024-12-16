package Ex1_Animals;

class Baboon extends Animal{
    int numBerries;

    public Baboon(String na, int n){
        super(na);
        numBerries = n;
    }

    public String toString(){
        return  name + " eats " + numBerries + " berries per day";
    }
}
