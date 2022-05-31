import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TestCHARACTER {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\Desktop/test3.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UNICODE");
            for(int i=0; i<70000; i++) {
                //System.out.println(i + " : " + (char)i);
                osw.write(String.valueOf(i));
                osw.write(" : ");
                osw.write((char)i);
                osw.write("\n");
            }
            System.out.println("end");
        } catch (Exception e) {}
    }

}
//문자 파일로 저장하기 
//호출하고 싶은 문자는 위에 규칙 이용
