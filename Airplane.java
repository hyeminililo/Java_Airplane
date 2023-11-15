/* 학기 : 1학기
 * 과목 : Java 프로그래밍 
 * 과제 : J4
 * 소속 : IT 융합 자율학부
 * 이름 : 남궁혜민
 * 학번 : 202214052 
 */
public class Airplane{
	//필드 생성
	public String model;
	public String company;
	public int number;
	
	//생성자 생성
	public Airplane() {  
		this("","",0);	
	}
	
	public Airplane(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	public Airplane(String model, String company, int number) {
		this.model = model;
		this.company = company;
		this.number = number;	
	}
	
	//메소드 생성
	String setModel(String model) {
		return this.model = model;
	}
	
	public String setCompany(String company){
		return this.company = company;
		
	}
	public int setNumber(int number) {
		return this.number = number;
		
	}
	public String getModel() {
		return model;
		
	}
	public String getCompany() {
		return company;
	}
	public int getNumber() {
		return number;
		
	}
	public void showAirplane() {
		System.out.println("비행기 모델: "+ model);
		System.out.println("비행기 회사: "+ company);
		System.out.println("탑승 인원수: "+ number);
	}	
}