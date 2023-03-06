import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Fibonnacci {
    // (5*N^2 + 4) ou (5*N^2 + 4) é um quadrado perfeito

    private int num;
    static int calculo(int num) {
        double check = (5*(num*num)) + 4;
        double checkTwo = (5*(num*num)) - 4;

        if(sqrt(check) - Math.floor(sqrt(check)) == 0 || sqrt(checkTwo) - Math.floor(sqrt(checkTwo)) == 0)
        {
            return 1;
        };
        return 0;
    }

}
