/* 학기 : 1학기
 * 과목 : Java 프로그래밍 
 * 과제 : J6
 * 소속 : IT 융합 자율학부
 * 이름 : 남궁혜민
 * 학번 : 202214052 
 */

package lib;

import java.util.Scanner;

// 인터페이스 Weapon과 클래스 Airplane을 상속받기 위해 extends와 implements를 사용
public class Fighter extends Airplane implements Weapon{
		//필드 (해당 클래스에서만 접근 할 수 있도록 private로 설정)
		private boolean stealth;
		
		//생성자 
		public Fighter(String id) {
			super(id,"전투기");
			this.stealth = false; 
		}
		
		public Fighter(String id, boolean stealth) {
			super(id,"전투기");
			this.stealth = stealth;
		}
		
		//메소드  
		
		public boolean stealthOn(){			//스탤스 모드 true로 설정
			return this.stealth = true;
		}
		
		public boolean stealthOff() {		//스탤스 모드 false로 설정
			return this.stealth = false;
		}
		
		public boolean getStealth() { 		//스탤스 모드의 상태로 반환
			return stealth;
		}
	
		
		// 클래스 Airplane을 오버라이딩하여 추상메소드 구현  (조상의 메소드 사용을 위해 super 사용) 
		@Override
		public void takeoff(){
			super.getID();
			System.out.println("전투기 "+super.getID()+"가 이륙합니다.");
		}
		
		@Override
		public void landing() {
			super.getID();
			System.out.println("전투기 "+ super.getID()+"가 착륙합니다.");
		}
		
		@Override
		public void flight() {
			super.getID();
			System.out.println("전투기 "+super.getID()+"가 비행합니다.");
		}
		
		@Override
		public void showInfo() {
			System.out.println("식별 번호 : " + super.getID());
			System.out.println("비행기 타입 : " + super.getType());
			System.out.println("스텔스 모드 : " + stealth );
		}
		
		// 인터페이스 Weapon을 오버라이딩하여 추상메소드 구현 (조상의 메소드 사용을 위해 super 사용) 
		public void loadWeapon() {
			System.out.println(super.getID()+" 무기 장착");	// 객체 ID 명시 
			for(int i =0; i<weaponList.length;i++) {		// 반복문을 이용하여 weaponList 배열에 저장된 무기 장착
				System.out.println(weaponList[i]+" 무기가 장착되었습니다.");
			}
		
		}
		
		public void showWeapon() {
//			super.getID();
			System.out.println(super.getID()+" 무기 목록");	// 객체 ID 명시 
			for(int i=0;i<weaponList.length; i++) {			// 반복문을 이용하여 weaponList 배열에 저장된 무기 목록 출력
				System.out.println((i+1)+":"+weaponList[i]);
			}
			
		}
		public void selectWeapon() {
			
			Scanner scanner = new Scanner(System.in);		// 무기 번호를 입력받기 위해 스캐너 객체 사용
			System.out.print("무기를 선택하시오: ");
			int input_number= scanner.nextInt();
			
			for(int i =0; i<weaponList.length;i++) {		// 반복문을 이용해, 선택된 무기를 사용 
				if ((i+1)==input_number) 
					{if((i+1==1)||(i+1==3))
						System.out.println(weaponList[i]+"이 발사되었습니다.");
					else
						System.out.println(weaponList[i]+"가 발사되었습니다.");
					}
				else continue;
			}

			scanner.close();
		}
		
}
