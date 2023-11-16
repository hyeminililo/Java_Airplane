/* 학기 : 1학기
 * 과목 : Java 프로그래밍 
 * 과제 : J5
 * 소속 : IT 융합 자율학부
 * 이름 : 남궁혜민
 * 학번 : 202214052 
 */ 
public class AirplaneTest {
	public static void main(String[] args) {
		//서브 클래스 Airliner에 대한 객체 생성
		Airliner airplane1 = new Airliner("A100"); 	// 매개변수 한 개 있는 생성자
		Airliner airplane2 = new Airliner("A200",500);	 // 매개변수 두 개 있는 생성자

		//서브 클래스 Fighter에 대한 객체 생성
		Fighter airplane3 = new Fighter("F300"); 	// 매개변수 한 개 있는 생성자
		Fighter airplane4 = new Fighter("F400", true); 	// 매개변수 두 개 있는 생성자
		
		//showInfo()를 이용하여 출력 
		
		airplane1.showInfo();
		
		System.out.println();
		
		airplane2.showInfo();
		
		System.out.println();
		
		airplane3.showInfo();

		System.out.println();
		
		airplane4.showInfo();
	}
}
