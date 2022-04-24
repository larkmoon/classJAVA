### Day 01

#### Mon, Apr 4. 2022



### JAVA

- 프로그래밍 언어: source → [ compiler ]→ machine language
- JAVA
  - 인터넷이 활성화되면서 웹 애플리케이션 구축용 언어로 급부상.
  - 다양한 서버 운영 체제에서 단 한 번의 작성으로 실행 가능.
  - 다양한 장비와 데스크톱 애플리케이션, 서버 애플리케이션 개발의 중추 언어.
  - JVM(Java Virtual Machine): 자바 애플리케이션을 읽어들이고 자바 API로 실행. 
  - JRE(Java Runtime Environment): 자바 프로그램 실행 환경(JVM, 라이브러리 API)
  - JDK(Java Development Toolkit): JRE + 자바 SE 구현체(JVM, 라이브러리 API, 컴파일러 등 개발 도구)



#### 자바의 특징

 1. 이식성이 높은 언어

    - 이식성: 서로 다른 실행 환경을 가진 시스템 간에 프로그램을 옮겨 실행할 수 있는 것.

    - 소스 파일을 수정해서 재컴파일하지 않아도 JRE가 설치된 모든 운영체제에서 실행 가능.

      

 2. 객체 지향 언어(Object-oriented Programming Language)

    - OOP: 객체들을 먼저 만든 다음 조립하여 전체 프로그램을 완성하는 기법.

    - 자바를 이용해 객체를 만들기 위해 설계도인 클래스를 작성한 다음, 객체와 객체를 연결하여 OOP 실현.

    - 장점: 신속한 작업, 필요한 부분만 수정 가능하므로 유지 보수 용이.

      

      **객체 지향 언어의 특징**

      1) 추상화(Abstraction): 기능을 수행하기 위해 필요한 정보(변수)와 행위(메소드)를 묶어서 설계.

      2. 캡슐화(Encapsulation): 접근 지정자를 제한하여 사용자의 권한 제어→ 강력한 보안.

      3. 다형성(Polymorphism): 오버로딩 / 오버라이딩

      4. 상속(Inheritance): 하위 클래스에 대하여 상위 클래스의 코드를 재사용 가능.

         

 3. 함수적 스타일 코딩 지원

    - 대용량 데이터의 병렬 처리에 적합.

    - 람다식(Lambda Expressions): 컬렉션 요소를 쉽게 필터링, 매핑, 집계할 수 있도록 하며, 코드가 간결해짐.
      

 4. 메모리 자동 관리(through JVM)

    - 객체 생성 시: 자동으로 메모리 영역을 찾아 할당.

    - 사용 완료 후: Garbage Collector를 실행시켜 사용하지 않는 객체 자동으로 제거. 



5. Multithread 구현

   - Multithreading: 하나의 프로그램이 동시에 여러가지 작업을 처리해야 할 경우, 대용량 작업을 빨리 처리하기 위해 서브 작업으로 분리해서 병렬 처리해야 할 경우 필요.

   - 자바는 스레드 생성 및 제어와 관련된 라이브러리 API를 제공하므로, 실행되는 운영체제와 상관없이 멀티스레드를 쉽게 구현 가능.

     


6. Dynamic Loading 지원 
   - Dynamic Loading: 애플리케이션이 실행될 때 모든 객체를 생성하는 것이 아니라 객체가 필요한 시점에 클래스를 로딩하여 객체를 생성하는 것.
   - 유지 보수가 필요한 클래스만 수정하면 되므로 전체 애플리케이션을 다시 컴파일할 필요가 없음.

___

### Q.

- JVM의 역할

  - 자바 프로그램은 완전한 기계어가 아닌 중간 단계인 바이트 코드이므로 이를 해석하고 실행하는 가상의 운영체제 필요. JVM이 byte code를 해석하고 운영 체제에 맞는 기계어로 번역함.

  - JVM은 운영 체제에 종속적이며, 바이트 코드의 실행 결과는 모든 JVM에서 동일함.

    "Write once, run anywhere"

  - source(.java) → [ compiler(javac.exe) ] → byte code(.class )→ [ OS별 JVM ]

  - 자바의 단점: 한 번의 Compiling으로 실행 가능한 기계어가 만들어지지 않고 JVM을 통해 번역·실행되기 때문에, 완전한 기계어로 Compile하는 C, C++에 비해 속도가 느림.

    cf) https://asfirstalways.tistory.com/158

    

- API vs. 애플리케이션

  cf) https://maily.so/grabnews/posts/b2341a

  - API(Application Programming Interface): 두 개의 애플리케이션을 연결하는 매개체. API는 애플리케이션에 의해 사용되며, 애플리케이션은 인간에 의해 사용됨.

  - 자바 제공 표준 클래스 라이브러리

    https://docs.oracle.com/javase/8/docs/api/index.html

  

- Multithreading vs. Multiprocessing

  - Thread는 Process 내에서 생성되는 하나의 실행 주체.
  - Multithreading: A program execution technique that allows a single process to have multiple code segments.
  - Multiprocessing: Has more than two processors. Multiprocessing imporves the system's reliability.

  cf) https://jwprogramming.tistory.com/19

  

- Public Static void main method

  다른 프로그래밍 언어에는 함수와 메소드가 별도로 존재하지만, 자바의 함수는 따로 존재하지 않고 클래스 내에 존재함. 이러한 클래스 내의 함수를 메소드라고 부름.

  - public: 접근 제한자
  - static: 정적 함수. static으로 선언된 개체는 프로그램 시작과 동시에 메모리에 호촐되며 프로그램이 종료되는는 시점까지 유지.
  - void: 리턴되는 값이 없음

  cf) https://javacpro.tistory.com/11

  ​	https://wikidocs.net/225

  ​	https://jjunii486.tistory.com/27

  

 - 윈도우 10 cmd 'javac은 내부 또는 외부 명령, 실행할 수 있는 프로그램, 또는 배치 파일이 아닙니다' 에러 해결 https://1duri1.tistory.com/250
 - 람다식
