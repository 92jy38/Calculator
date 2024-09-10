# Calculator Project


# 소개
`App1` 클래스 없이 기본적인 사칙연산을 수행할 수 있는 계산기<br>
`App2` 클래스를 적용해 기본적인 사칙연산을 수행할 수 있는 계산기<br>

프로젝트 기간 : 24.09.04 ~ 24.09.10<br>
<br>
# TOOLS
<img src="https://img.shields.io/badge/intellijidea-207BEA?style=for-the-badge&logo=intellij%20idea&logoColor=white"> SDK : Eclipse Temurin 17.0.12 <br> 
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><br>
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"><br>
<img src="https://img.shields.io/badge/notion-000000?style=or-the-badge&logo=notion&logoColor=white"/><img src="https://img.shields.io/badge/Slack-FE5196?style=or-the-badge&logo=slack&logoColor=white"/>
<br>
# 주요 기능
> ## App1
>
> 
클래스 없이 기본적인 사칙연산(➕,➖,✖️,➗)이 가능하며
양의 정수 , 연산자, 양의 정수를 차례로 입력하고 결과값을 출력합니다.

1. `Scanner(System.in)` 활용해 원하는 값과 연산자를 입력.
2.  나눗셈 연산에서 분모에 0을 입력해도 프로그램이 종료되지 않도록 코드를 작성.
3. `try - catch` 를 활용해 `InputMismatchException`를 방지.
4. 연산이 끝나도 원할 때 까지 연산 반복 가능.

> ## App2 & Calculator


클래스를 사용해 기본적인 사칙연산(➕,➖,✖️,➗)이 가능하며 Calculator 클래스를 캡슐화 하여 main 메서드에서의 직접 접근을 막아두고 getter와 setter 메서드로 필드에 접근해 가져오도록 하였습니다.

1. App1 과 다른점은 Calculator 객체를 사용하여 입력한 숫자와 연산 기호를 처리, 출력.
2. 계산 결과는 `Calculator` 클래스의 `List<Integer> results` 필드에 ArrayList 객체로 초기화되어 순차적으로 저장.
3. `getResults()` 메서드로 저장된 모든 연산 결과 조회 가능. 캡슐화 되어있기때문에 복사본을 반환하고 원본 리스트 수정 불가.
4. `setResults(List<Integer> newResults)` 메서드는 계산 결과 리스트를 수정할 때는 전달된 리스트`(newResults)`를 새로운 리스트로 복사하여 `results` 필드에 저장. 새로운 ArrayList로 복사하는 방식으로 외부 영향으로부터 내부 데이터 보호.
5. `removeFirstResult()` 메서드로 가장 먼저 저장된 계산 결과 삭제 가능.
6. App1의 `InputMismatchException` 예외 처리에  `IllegalArgumentException` 예외 처리도 보완하여 계산중 잘못된 입력으로 저장된 값들이 날라가지 않도록 2중으로 처리.
