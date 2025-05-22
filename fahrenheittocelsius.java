
public class fahrenheittocelsius {

    public static void main(String[] args) {
        for (int f = 0; f <= 300; f += 20) {
            int celsius = (int) ((5.0 / 9) * (f - 32));
            System.out.println(f + "  " + celsius);
        }
    }
}
