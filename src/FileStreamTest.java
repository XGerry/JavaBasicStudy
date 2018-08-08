import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
/*        int bWrite[] = {11, 21, 3, 666};
        OutputStream outputStream=new FileOutputStream("test.txt");
        for (int i = 0; i <bWrite.length ; i++) {
            outputStream.write(bWrite[i]);
        }
        outputStream.close();

        InputStream is = new FileInputStream("test.txt");
        int size = is.available();

        for (int i = 0; i < size; i++) {
            System.out.print((char) is.read() + "  ");
        }
        is.close();*/
        File file=new File("a.txt");
        FileOutputStream fop =new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append("中文输入");
        // 写入到缓冲区

        writer.append("\r\n");
        // 换行

        writer.append("English");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(file);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭输入流,释放系统资源
    }
}
