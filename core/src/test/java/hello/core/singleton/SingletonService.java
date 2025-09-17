package hello.core.singleton;

public class SingletonService {
    //java 뜰 때 static 영역에 객체를 딱 1개만 생성해둔다
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    //생성자를 private 으로 설정해서 외부에서 new 키워드를 사용한 객체 생성을 막는다.
    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
