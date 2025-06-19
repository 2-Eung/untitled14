class Box<T> {      // T : type     // T 는 참조형 만 가능하다
    private T content;              // 컴파일시점에 타입을 주는데 object 클래스를 상속받은 참조타입들만
                                    // 컴파일시점에서 타입을 줄 수 있다. 일반타입은 상속못받아 불가능
    public Box(T content) {         // 생성자
        this.content = content;
    }
    public T getContent () {
        return content;
    }
    public void setContent (T content) {
        this.content = content;
    }
    public <E> void printContent(E extraInfo) {     // E : extra
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("ㅇㅇㅇ");
        System.out.println(stringBox.getContent());     // 게터
        stringBox.setContent("ㄴㄴㄴ");                  // 세터
        System.out.println(stringBox.getContent());     // 게터

        stringBox.printContent(123123);         // 메서드실행
        stringBox.printContent("ㅂㅂㅂ");        // 메서드실행
    }
}