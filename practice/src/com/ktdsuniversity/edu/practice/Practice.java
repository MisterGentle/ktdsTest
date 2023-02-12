package com.ktdsuniversity.edu.practice;

public class Practice {

//	1. 변수 활용 문제
//    정수형 변수 2개를 선언하고 값을 할당해본다.
	
//2. 사칙 연산 문제 1
//    정수형 변수 4개를 선언하고 값을 할당한다.
//    값이 할당된 정수형 변수 4개의 합을 구해 새로운 정수형 변수에 할당한다.
//    합이 할당된 변수의 값을 출력해본다.

//3. 사칙 연산 문제 2
//    정수형 변수 2개를 선언하고 값을 할당한다.
//    값이 할당된 정수형 변수 2개의 곱을 구해 새로운 정수형 변수에 할당한다.
//    곱이 할당된 변수의 값을 출력해본다.
//
//4. 사칙 연산 문제 3
//    정수형 변수 2개를 선언하고 값을 할당한다.
//    값이 할당된 정수형 변수 2개의 나누기 몫을 구해 새로운 정수형 변수에 할당한다.
//    나누기 몫이 할당된 변수의 값을 출력해본다.
//
//5. 사칙 연산 문제 4
//    정수형 변수 2개를 선언하고 값을 할당한다.
//    값이 할당된 정수형 변수 2개의 나누기 나머지를 구해 새로운 정수형 변수에 할당한다.
//    나누기 나머지가 할당된 변수의 값을 출력해본다.
//    
//6. 캐스팅 문제 1
//    정수형 변수 2개를 선언하고 값을 할당한다.
//    값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
//    나누기 결과가 할당된 변수의 값을 출력해본다.
//
//7. 캐스팅 문제 2
//    정수형 변수 2개를 선언하고 값을 할당한다.
//    값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
//    나누기 결과가 할당된 변수의 값을 출력해본다.
//    단, 소수점 이하의 자리수는 2자리만 저장해 출력한다.
//    예> 10.3333333 => 10.34
//
//8. 캐스팅 문제 3
//    long 형 변수 1개를 선언하고 값을 할당한다.
//    int형 변수 1개를 선언해 long형 변수의 값을 할당한다.
//    int형 변수의 값을 출력해본다.
//    
//9. 메소드 문제 1
//    정수형 파라미터 1개를 받는 메소드를 만든다
//    전달 받은 파라미터의 값을 제곱해 반환하는 메소드를 생성하고 실행 및 결과를 출력해본다.
//    
//10. 메소드 문제 2
//    정수형 파라미터 1개를 받는 메소드를 만든다.
//    전달 받은 파라미터의 값을 double 형으로 변환해 반환하는 메소드를 생성하고 실행 및 결과를 출력해본다.
//
//11. 메소드 문제 3
//    정수형 파라미터 1개, 실수형 파라미터 1개를 받는 메소드를 만든다.
//    두 파라미터를 곱한 결과를 정수형으로 변환해 반환하는 메소드를 생성하고 실행 및 결과를 출력해본다.
//
//12. 메소드 문제 4
//    정수형 파라미터 3개를 받는 메소드를 만든다.
//    전달 받은 파라미터의 값을 모두 곱해 출력만 하는 메소드를 생성하고 실행 및 결과를 출력해본다.
//
//13. 클래스 문제 1
//    https://www.goodgag.net
//    게시글의 정보를 표현하는 클래스를 만들어 본다.
//    * 모든 Instance Method는 private 으로 만들어야 하며 Getter / Setter 가 반드시 생성되어 있어야 함.
//
//14. 클래스 문제 2 
//    클래스 문제 1에서 만든 클래스를 인스턴스화 해본다.
//
//15. 클래스 문제 3
//    클래스 문제 2에서 만든 인스턴스에 데이터를 Setting 한다.
//    Setting된 데이터를 출력해본다.
//
//16. 클래스 문제 4
//    자판기 상품을 표현하는 클래스를 만든다.
//    자판기 상품 클래스를 인스턴스화 한다.
//
//17. 제어문 문제 1
//    나이를 표현하는 변수를 하나 만들고 값을 할당한다.
//    나이를 표현하는 변수의 값이 19 미만 인 경우 "미성년자 입니다." 를 출력한다.
//    나이를 표현하는 변수의 값이 19 이상 인 경우 "성인입니다." 를 출력한다.
// 
//18. 제어문 문제 2
//    나이를 표현하는 변수를 하나 만들고 값을 할당한다.
//    나이를 표현하는 변수의 값이 7 이상이며 13 이하 인 경우 "초등학생 입니다." 를 출력한다.
//    나이를 표현하는 변수의 값이 14 이상이며 16 이하 인 경우 "중학생 입니다." 를 출력한다.
//    나이를 표현하는 변수의 값이 17 이상이며 19 이하 인 경우 "고등학생 입니다." 를 출력한다.
//    그 외의 값은 "학생이 아닙니다." 를 출력한다.
//
//19. 제어문 문제 3
//    교통카드 문제
//      교통카드에는 
//        교통카드 종류(청소년, 성인)
//        잔액
//      정보가 있다.
//      버스를 탈 때마다 청소년은 900원을 교통카드 잔액에서 차감하며
//      성인은 1300원을 교통카드 잔액에서 차감한다.
//      버스를 탈 때마다 교통카드 잔액을 출력해 본다.
//
//20. 제어문 문제 3
//     편의점 문제
//       편의점에는 10가지 종류의 제품을 판매한다.
//       판매물품은 물품 명, 물품 가격, 물품 재고 정보를 가진다.
//       
//       판매 물품이 하나씩 팔릴 때마다 물품 재고가 하나씩 차감되며
//       물품 가격 만큼 편의점의 잔고가 늘어난다.
//       
//       판매된 물품을 환불하면 환불한 물품의 재고가 하나씩 증가되며
//       물품 가격 만큼 편의점의 잔고가 줄어든다.
//       
//       물품을 3번 구매하고 1번 환불했을 경우
//       편의점의 판매물품 재고 (물품명, 가격, 재고)와 잔고를 출력해본다.
//
//21. 반복문 문제 1
//    로또 번호 만들기
//    1 부터 45 까지 중 하나의 숫자를 랜덤으로 생성해 List에 6개 적재한다.
//    List에 이미 추가된 List 인 경우 다른 랜덤 숫자를 생성해 추가한다.
//    
//    총 6개가 적대되면 로또 번호 6개를 모두 출력한다.
//
//22. 반복문 문제 2
//    Up & Down 게임 만들기
//    정수형 변수 하나를 만들어 아무 숫자나 할당 한다.
//    
//    사용자로 부터 숫자를 입력받아 정수형 변수에 할당된 값과 비교한다.
//    사용자가 입력한 값이 정수형 변수 값보다 작다면 "UP" 을 출력하고 크다면 "DOWN"을 출력한다.
//    사용자가 입력한 값이 정수형 변수 값과 같을 때까지 반복하여 게임을 진행한다.
//    같은 값을 입력하면 "정답입니다."를 출력하고 프로그램을 종료한다.
//
//23. 반복문 문제 3
//    학교 성적 관리 프로그램 만들기
//    학생 5명이 있는 학교의 성적을 관리하는 프로그램을 만든다.
//    각 학생은 3개의 과목을 수강한다.
//    
//    각 학생이 3개의 과목에서 받은 점수로 성적 등급을 할당한다.
//    성적이 100 이라면 A+
//    90점 이상이라면 A
//    80점 이상이라면 B
//    70점 이상이라면 C
//    60점 이상이라면 D
//    그 외의 점수는 F로 할당한다.
//    
//    등급이 모두 할당되면 아래와 같이 출력한다.
//    
//    학생명 | 과목 | 점수 | 등급
//    학생명 | 과목 | 점수 | 등급
//    학생명 | 과목 | 점수 | 등급
//    학생명 | 과목 | 점수 | 등급
//    학생명 | 과목 | 점수 | 등급
//    ...
//    
//24. 인터페이스 문제 1
//    스타크래프트 테란 종족의 바이오닉 유닛의 스킬을 인터페이스로 정의한다.
//    모든 바이오닉 유닛은 "이동", "정지", "홀드", "정찰" 기능을 가진다.
//      *** 인터페이스도 상속이 가능하다 ***
//      유닛
//        마린
//        메딕
//        파이어뱃
//        고스트
//        
//25. 인터페이스 문제 2
//    인터페이스 문제 1에서 생성한 인터페이스 4개로 클래스를 구현한다.
//    모든 메소드는 출력만 하는 메소드다.
//
//26. 인터페이스 문제 3
//    인터페이스 문제 2에서 생성한 구현 클래스를 모두 인스턴스화 해 실행해본다.
//    인스턴스화 규칙> Sub class is a Super class
//
//27. 메소드 오버로딩 1
//    숫자 2개를 받아 더하여 결과를 반환하는 메소드 하나 생성한다.
//    숫자 3개를 받아 더하여 결과를 반환하는 메소드 하나 생성한다.
//
//28. 메소드 오버로딩 2
//    int를 받아  double로 바꾸어 반환하는 메소드 하나 생성한다.
//    long을 받아 double로 바꾸어 반환하는 메소드 하나 생성한다.
//    float을 받아 double로 바꾸어 반환하는 메소드 하나 생성한다.
//    String을 받아 double로 바꾸어 반환하는 메소드 하나 생성한다.
//    
//29. 상속 문제 1
//    이름, 전화번호 를 가지는 클래스를 하나 생성한다.
//    이 클래스를 상속해 학교명을 추가한다.
//    
//    상속한 클래스를 인스턴스화 해본다.
//    (Sub class is a Super class)
//
//30. 상속 문제 2
//    이름, 전화번호를 가지는 클래스를 파라미터로 받는 메소드를 하나 만든다.
//    생성한 메소드에 이름, 전화번호, 학교명을 가지는 클래스의 인스턴스를 파라미터로 던진다.
//    메소드 내에서 이름, 전화번호, 학교명을 출력해 본다.
//    (파라미터 객체의 인스턴스 타입을 비교해야 한다.)
//    
//31. 인터페이스를 쓰면 얻을 수 있는 이점을 설명할 수 있는 자유 주제 예제를 하나 만들어본다.
//
//32. 예외 처리 문제 1
//    문자를 정수형으로 변환헤 반환하는 메소드를 작성한다.
//    만약 변환 중 에러가 발생하면 -1 을 반환해야 한다.
//
//33. 예외 처리 문제 2
//    문자를 double로 변환해 반환하는 메소드를 작성한다.
//    만약 변환 중 에러가 발생하면 -1.9999를 반환해야 한다.
//
//34. 예외 처리 문제 3
//    문자를 double로 변환하고 소수점 이하 2자리 까지 반올림해 반환하는 메소드를 작성한다.
//    예> "1.3451234" -> 1.34
//    만약 변환 중 에러가 발생하면 -1.9999를 반환해야 한다.
//    
//35. 주차장 관리 프로그램 작성하기
//    주차장에 차량을 35대 주차할 수 있다.
//    차량의 종류에 따라 10분당 가격이 다르다.
//      경차: 500원
//      소형차: 800원
//      준중형차: 850원
//      중형차: 1000원
//      대형차: 1500원
//     만약 모든 차량이 주차되어 있다면 "만차되어 주차할 수 없습니다."를 출력한다.
//     주차 시간은 모두 분으로 입력한다.
//     예를 들어 1시간 20분 주차를 했다면 80 으로 입력한다.
//
//36. 분을 시간으로 변경한다.
//    사용자로 부터 분을 입력받아 O시간 O분으로 출력한다.
//    예> 95를 입력하면 "1시간 30분" 으로 출력한다.
}