package example.calculator;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 (캡슐화된 List)
    private List<Integer> results = new ArrayList<>();

    // 사칙연산을 수행하고 결과 반환 메서드
    public int calculate(int num1,  char operator, int num2) {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("분모에 0을 입력할 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산 기호입니다.");
        }

        // 연산 결과를 리스트에 저장
        results.add(result);
        return result;
    }

    // 연산 결과 리스트를 반환하는 Getter 메서드
    public List<Integer> getResults() {
        return new ArrayList<>(results); // 캡슐화를 위해 복사본 반환
    }

    // 결과 리스트에 값 추가하는 Setter 메서드 (필요한 경우 외부에서 결과 리스트 수정 가능)
    public void setResults(List<Integer> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    // 첫 번째 연산 결과를 삭제하는 메서드
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}
