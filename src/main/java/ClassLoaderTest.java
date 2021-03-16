/**
 * 해당 클래스는 다양한 클래스가 어떤 클래스 로더들을 사용하여 로드되어지는지 확인하기 위해 작성되었다.
 *
 * 확장 클래스로더도 확인해보고 싶었으나, 해당하는 클래스를 찾지 못했다.
 * $JAVA_HOME/lib/ext 또는 java.ext.dirs 시스템 property 에 지정된 클래스가 존재하지 않는것으로 보이는데 확인이 필요하다.
 * */

public class ClassLoaderTest {

    public static void main(String[] args) {
        System.out.println("Classloader of this class: " + ClassLoaderTest.class.getClassLoader());
        System.out.println("Classloader of String class: " + String.class.getClassLoader());
    }
}
