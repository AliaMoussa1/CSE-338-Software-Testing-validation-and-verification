public class Watermelon {
    public String areTwoPartsEven(int weight){
        if (weight>100)
            throw new IllegalArgumentException("Can't Calculate Parts!!");
        else if (weight<= 2 || !(weight % 2 == 0))
            return "No";
        else
            return "Yes";
    }
}
