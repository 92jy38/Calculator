package example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 무한 반복을 위한 안내 메시지 출력
            System.out.println("계산을 진행하려면 양의 정수, 연산 기호, 양의 정수를 차례대로 입력하세요. 종료하려면 'exit'을 입력하세요.");

            // 시작, 종료 조건
            System.out.print("계속하려면 아무 키나 입력하세요: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            try {
                // 첫 번째 양의 정수 입력
                System.out.print("첫 번째 양의 정수를 입력하세요: ");
                int num1 = scanner.nextInt();

                // 사칙연산 기호 입력
                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                // 두 번째 양의 정수 입력
                System.out.print("두 번째 양의 정수를 입력하세요: ");
                int num2 = scanner.nextInt();


                // 연산 수행 및 결과 출력
                switch (operator) {
                    case '+':
                        System.out.println("결과: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("결과: " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("결과: " + (num1 * num2));
                        break;
                    case '/':
                        // 예외처리 분모 0으로 나누기
                        if (num2 == 0) {
                            System.out.println("오류: 나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        } else {
                            System.out.println("결과: " + (num1 / num2));
                        }
                        break;
                    default:
                        System.out.println("오류: 잘못된 연산 기호입니다.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다.");
                scanner.next(); // 숫자 타입에 연산 넣었을 때 InputMistmatchException 오류 방지
            }
        }

        scanner.close(); // Scanner 자원 해제
    }
}