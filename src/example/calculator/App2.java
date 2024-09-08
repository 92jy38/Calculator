package example.calculator;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        // Calculator 객체 생성
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 프로그램 안내 메시지
            System.out.println("계산을 진행하려면 양의 정수, 연산 기호, 양의 정수를 차례대로 입력하세요. 종료하려면 'exit'을 입력하세요.");

            // 시작, 종료 조건
            System.out.print("계속하려면 아무 키나 입력하세요: ");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 첫 번째 양의 정수 입력
            System.out.print("첫 번째 양의 정수를 입력하세요: ");
            int num1 = sc.nextInt();

            // 사칙연산 기호 입력
            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            // 두 번째 양의 정수 입력
            System.out.print("두 번째 양의 정수를 입력하세요: ");
            int num2 = sc.nextInt();

            // 연산 수행 및 결과 출력
            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
                continue;
            }

            // 저장된 연산 결과 출력
            System.out.println("현재까지의 연산 결과: " + calculator.getResults());

            // 가장 먼저 저장된 결과 삭제 여부 확인
            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes/no): ");
            String deleteInput = sc.next();
            if (deleteInput.equalsIgnoreCase("yes")) {
                calculator.removeFirstResult();
                System.out.println("삭제 후 연산 결과: " + calculator.getResults());
            }
        }

        sc.close(); // Scanner 자원 해제
    }
}
