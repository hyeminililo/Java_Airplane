/* 학기 : 1학기
 * 과목 : Java 프로그래밍 
 * 과제 : J6
 * 소속 : IT 융합 자율학부
 * 이름 : 남궁혜민
 * 학번 : 202214052 
 */

package lib;

public class Airliner extends Airplane{

		//필드 생성 (해당 클래스에서만 접근 할 수 있도록 private로 설정)
		private int passenger;
		
		//생성자 
		public Airliner(String id) {
			super(id,"여객기"); 					// 슈퍼클래스의 생성자 호출
			this.passenger = 0; 				// 탑승 인원 0으로 초기화 
		}
		
		public Airliner(String id, int passenger) {
			super(id,"여객기");
			this.passenger = passenger;
		}
		
		//메소드 
		public int setPassenger(int passenger) { // 탑승 인원수 설정
			return this.passenger = passenger;
		}
		
		public int getPassenger() {				 // 탑승 인원수 반환
			return passenger;
		}
		
		// 오버라이딩하여 추상메소드 구현  (조상의 메소드 사용을 위해 super 사용) 
		@Override
		public void takeoff(){
			super.getID();
			System.out.println("여객기 "+super.getID()+"가 이륙합니다.");  
		}
		
		@Override
		public void landing() {
			super.getID();
			System.out.println("여객기 "+ super.getID()+"가 착륙합니다.");
		}
		
		@Override
		public void flight() {
			super.getID();
			System.out.println("여겍기 "+super.getID()+"가 비행합니다.");
		}
		
		@Override  
		 public void showInfo() {
			System.out.println("식별 번호 : " +super.getID());
			System.out.println("비행기 타입: "+ super.getType());
			System.out.println("탑승 인원수: " + passenger);
		}
}


	
	