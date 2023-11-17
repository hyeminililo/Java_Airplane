/* 학기 : 1학기
 * 과목 : Java 프로그래밍 
 * 과제 : J6
 * 소속 : IT 융합 자율학부
 * 이름 : 남궁혜민
 * 학번 : 202214052 
 */

package lib;

// 인터페이스 작성 
public interface Weapon {
	// 배열 weaponLIst
	String weaponList[] = {"미사일", "레이저", "폭탄" };
	
	// 추상 메소드 작성 
	abstract public  void loadWeapon();
	abstract public void showWeapon();
	abstract public void selectWeapon();
}
