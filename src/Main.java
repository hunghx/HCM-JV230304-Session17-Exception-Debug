import exception.CheckedException;
import exception.DateFormatException;
import exception.UncheckedException;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CheckedException, DateFormatException {
        // xử lí thông qua try catch
        System.out.println("Bắt đầu chương trình");
        try{
            // khối code sinh ra ngoại lệ
            double s = getAreaTriangle(1,-2, 3);
            System.out.println(s);
        }catch (CheckedException | UncheckedException e){
            // khối code xử lí ếu có lỗi
//            System.err.println("Message : "+e.getMessage());
            e.printStackTrace();
            System.out.println("xử lí lỗi");
        }
//        catch (UncheckedException e){
//            e.printStackTrace();
//        }
        finally {
            // dù đúng hay sai đều vào finally
            // khối dọn dẹp
            System.out.println("kết thúc try catch , dọn dẹp bộ nhớ");
        }

        System.out.println("kêt thúc chương trình");



        // Bug : là lỗi logic trong chương trình, trả về kết quả không mong muốn
        // Debug :
        // + đọc code
        // + sử dụng tool
        // + research
        // + AI

        // Cách bước để debug bằng debugger
        // B1 : hiểu luồng hoạt động => dự đoán khối code sinh ra lỗi
        // B2 : đặt cac breakpoint
        // B3 : chạy debugger qua quan sát các giá trị tại vị trí breakpoint
        // B4 : suy luận tìm ra nguyên nhân lỗi và sửa

//
//        B1: Nhập vào ngày, tháng, năm từ người dùng.
//                B2 : Kiểm tra tính hợp lệ của ngày tháng năm đó bằng cách kiểm tra các điều kiện sau:
//
//        Năm phải lớn hơn 0.
//        Tháng phải nằm trong khoảng từ 1 đến 12.
//        Số ngày trong tháng phải hợp lệ (tức là phải từ 1 đến số ngày tương ứng với tháng đó).
//                B3: Nếu ngày tháng năm hợp lệ, hiển thị thông báo "Ngày tháng năm hợp lệ".
//                B4: Nếu ngày tháng năm không hợp lệ, ném ngoại lệ bất kỳ và thông báo lỗi.
            // nập vào
            int d,m,y;
            //
        if (y <=0 ){
            // ném ra ngoai lê
            throw  new DateFormatException("năm pha lon hon 0");
        }else {
            // kiểm tra tháng
            if (m<1 ||m >12){
                throw  new DateFormatException("tháng phải tu 1-12");
            }else {
                // kiểm tra số ngày trong tháng : 12/2013

            }
        }


    }
    public static double getAreaTriangle (double a, double b, double c) throws CheckedException {
        if (a<=0||b<=0||c<=0) {
            throw new UncheckedException("3 cạnh phải lớn hơn 0");
        }
        if (a+b<=c||b+c<=a||c+a<=b) {
            throw new CheckedException("tổng 2 can phai lon hon canh con lại");
        }
        // tổng 2 cạnh phải lớn hơn cạnh còn lại

        // sử dụng công thức Heron
        // tính nửa chu vi
        double  p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));



    }
    // kiểm tra số nguền tố
    public static boolean isPrime(int so){
        // số âm // ném ra checked
        //  < 2 // ném ra unchecked
        return  false;
    }
}