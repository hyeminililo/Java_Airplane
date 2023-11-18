/* 학기 : 1학기
 * 과목 : Java 프로그래밍 
 * 과제 : J7
 * 소속 : IT 융합 자율학부
 * 이름 : 남궁혜민
 * 학번 : 202214052 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AirplaneManager {
	//필드 생성 
    private ArrayList<Airplane> airplanes;
    private int registOrder;
    
    // 생성자 생성
    public AirplaneManager() {
        airplanes = new ArrayList<>();
        registOrder = 1;
    }
    
    // 비행기 등록 기능을 가진 메소드 
    public void regist() {
    	System.out.println("=== 아래 정보를 입력하세요. ===");
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("비행기 제조회사: ");
        String company = scanner.nextLine();
        System.out.println("비행기 타입정보: ");
        String type = scanner.nextLine();
        
        String id = generateID(company, type);
        Airplane airplane = new Airplane(company, type, id);
        airplanes.add(airplane); //ArrayList에 추가 
        
    }
    
    // 제조회사, 타입정보, 계수번호로 구성된 식별정보 계산 기능을 가진 메소드 
    public String generateID(String company, String type) {
    	
    	// 식별번호 생성
        String companyCode;
        if (company.equals("아시아나")) {
        	companyCode = "A";
        } else if (company.equals("대한항공")) {
        	companyCode = "K";
        } else {
        	companyCode = "Z";
        }
        
        // 식별번호 생성
        String typeCode;
        if (type.equals("여객기")) {
            typeCode = "L";
        } else if (type.equals("전투기")) {
            typeCode = "F";
        } else {
            typeCode = "Z";
        }
        
        // 세자리 정수를 문자열로 만들기 위해 String.format("%03d", int) 활용
        String registCode = String.format("%03d", registOrder);
        registOrder++;
        
        return companyCode + typeCode + registCode;
    }
    
    // 전체 비행기 정보 출력 기능을 가진 메소드 
    public void showAll() {
        System.out.println("=== 전체 비행기 정보 ===");
        Iterator<Airplane> iterator = airplanes.iterator();
        while (iterator.hasNext()) {
            Airplane airplane = iterator.next();
            System.out.println("제조회사: " + airplane.getCompany());
            System.out.println("타입정보: " + airplane.getType());
            System.out.println("식별번호: " + airplane.getId());
            System.out.println("------------------------");
        
        }
    }
    // main 메소드 작성 
    public static void main(String[] args) {
        AirplaneManager manager = new AirplaneManager();	//AirplaneManager 객체 생성
        
        manager.regist();
        manager.regist();
        manager.regist();	
        
        manager.showAll();	//showAll() 메소드를 통해 전체 정보 출력
    }
}