import java.util.Scanner;

public class DepositCalculator {
double clculateComplexPercentFunction(double a, double y, int d) {
       double pay = a * Math.pow((1 + y / 12), 12 * d);
       return randomComplex(pay, 2);
  }

  double calculateSimplePercentFunction(double doubleAmount, double yearRate, int depositPeriod) {
         return randomComplex(doubleAmount + doubleAmount * yearRate * depositPeriod, 2);
    }

    double randomComplex(double value, int places) {
       double ScaLe = Math.pow(10, places);
       return Math.round(value*ScaLe)/ScaLe;
}

    void doImportantJob() {
      int period;
      int action;

        Scanner abcdef = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");

      int amount = abcdef.nextInt();

      System.out.println("Введите срок вклада в годах:");
        period = abcdef.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = abcdef.nextInt();

        double outDoubleVar = 0;

        if (action ==1){
            outDoubleVar = calculateSimplePercentFunction(amount, 0.06, period);
        } else if (action == 2) {
            outDoubleVar = clculateComplexPercentFunction(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }
public static void main(String[] args) {
    new DepositCalculator().doImportantJob();
}
}
