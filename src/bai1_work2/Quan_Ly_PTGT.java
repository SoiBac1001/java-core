
package bai1_work2;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Quan_Ly_PTGT {
    private ArrayList<PT> list; // add interface PT (bản thiết kế) vào mảng Arraylist
    static Scanner sc = new Scanner(System.in);

    public Quan_Ly_PTGT() {
        list = new ArrayList<>();
    }

    public ArrayList<PT> getList() {
        return list;
    }

    public void setList(ArrayList<PT> list) {
        this.list = list;
    }
    
    public static void main(String[] args) {
        Quan_Ly_PTGT ql = new Quan_Ly_PTGT();      
        int lc;
        while(true){
            System.out.println("1. Nhập các loại phương tiện giao thông lưu vào file PTGT.dat");
            System.out.println("2. In ra danh sách phương tiện giao thông");
            System.out.println("3. Tìm kiếm phương tiện giao thông");
            System.out.println("4. Tìm kiếm phương tiện theo khoảng xác định của từng tiêu chí");
            System.out.println("5. Tìm 1 số trường");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Tính toán theo 1 tiêu chí nào đó (gia ban)");
            System.out.println("8. Ghi thong tin ra file kieu text");
            System.out.println("9. Ghi thong tin ra file kieu Object");
            System.out.println("10. Doc thong tin tu file kieu text");
            System.out.println("11. Doc thong tin tu file kieu Object");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            lc = sc.nextInt();
            switch(lc){
                case 1:{   
                    ql.nhap();
                    break;
                }
                case 2:{                    
                    ql.disPlay(ql.list); // ql.disPlay(ql.getList());
                    break;
                }
                case 3:{
                    ql.timKiem();
                    break;
                }
                case 4:{
                    ql.timKiemTheoKhoang();
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    ql.sapXep();
                    break;
                }
                case 7:{
                    System.out.print("Nhap hang muon tinh toan gia: ");
                    ql.tinhGiaTheoHang(sc.next());
                    break;
                }
                case 8:{
                    ql.ghiFileText();
                    break;
                }
                case 9:{
                    ql.ghiFileObject();
                    break;
                }
                case 10:{
                    ql.docFileText();
                    break;
                }
                case 11:{
                    try {
                        ql.docFileObject();
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Got an ClassNotFoundException");
                    }
                    break;
                }
                case 0:{
                    System.exit(0);
                    break;
                }
            }
        }
    }
// ============== case 1: Nhập các loại phương tiện giao thông =================  
    
    public void nhap(){
        for (int i = 0; i < 20; i++) System.out.println(); 
        int lc;
        while(true){
            System.out.println("1. Nhap oto");
            System.out.println("2. Nhap xe may");
            System.out.println("3. Nhap xe tai");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            lc = sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:{ // ô tô
                    PTGT p = nhapPTGT();
                    Oto o = new Oto();
                    System.out.print("Nhap so cho ngoi: ");
                    o.setSoChoNgoi(sc.nextInt());
                    System.out.print("Nhap kieu dong co: ");
                    sc.nextLine(); // xóa bỏ bộ đệm
                    o.setKieuDongCo(sc.nextLine());
                    o.setGiaBan(p.getGiaBan());
                    o.setHangSX(p.getHangSX());
                    o.setMau(p.getMau());
                    o.setNamSX(p.getNamSX());
                    list.add(o);
                    break;
                }
                case 2:{ // xe máy
                    PTGT p = nhapPTGT();
                    XeMay xm = new XeMay();
                    System.out.print("Nhap cong suat xe may: ");
                    xm.setCongSuat(sc.nextFloat());
                    xm.setGiaBan(p.getGiaBan());
                    xm.setHangSX(p.getHangSX());
                    xm.setMau(p.getMau());
                    xm.setNamSX(p.getNamSX());
                    list.add(xm);
                    break;
                }
                case 3:{ // xe tải
                    PTGT p = nhapPTGT();
                    XeTai xt = new XeTai();
                    System.out.print("Nhap trong tai: ");
                    xt.setTrongTai(sc.nextFloat());
                    xt.setGiaBan(p.getGiaBan());
                    xt.setHangSX(p.getHangSX());
                    xt.setMau(p.getMau());
                    xt.setNamSX(p.getNamSX());
                    list.add(xt);
                    break;
                }
                case 0:{
                    break;
                }
            }
            System.out.println("");
            if(lc == 0)
                break;
        }     
    }
    
    private PTGT nhapPTGT(){
        PTGT p = new PTGT();
        System.out.print("Nhap hang SX: ");
//        p.setHangSX(sc.nextLine());
        p.hangSX = sc.next(); // do biến hangSX để ở chế độ protected nên truy nhập được kiểu này ok
        System.out.print("Nhap nam SX: ");
        p.setNamSX(sc.nextInt());
        System.out.print("Nhap mau: ");
        p.setMau(sc.next());
        System.out.print("Nhap gia ban: ");
        p.setGiaBan(sc.nextDouble());
        return p;
    }
    
// ============== case 2: Hiển thị =============================================   
    
    public void disPlay(ArrayList<PT> arr){
        System.out.println("Hang\t Nam SX\t Mau\t Gia\tC.Suat\tT.Tai\t S.Cho\t Kieu DC");
        for(PT p : arr) // duyệt từng phần tử của mảng ArrayList arr[], mỗi lần duyệt arr[i] thì gán cho đối tượng p có kiểu PT(interface)        
            System.out.println(p); // System.out.println(p.toString()); // p có thể là Oto, XeMay hoặc XeTai      
        System.out.println("");
    }
    
// ============== case 3: Tìm kiếm ============================================= 
    
    public void timKiem(){
        for (int i = 0; i < 20; i++) System.out.println(); 
        int lc;
        while(true){
            System.out.println("Tim kiem theo:");
            System.out.println("1. Hang SX");
            System.out.println("2. Nam SX");
            System.out.println("3. Gia");
            System.out.println("4. Mau sac");
            System.out.println("5. Cho ngoi");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            lc = sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1:{
                    System.out.print("Nhap ten hang SX muon tim: ");
                    timKiem1(sc.next());
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 41:{
                    break;
                }
                case 5:{
                    break;
                }
                case 0:{
                    break;
                }
            }
            System.out.println("");
            if(lc == 0)
                break;
        }      
    }
    
    
    // Tìm kiếm 1: theo tên hãng SX
//    public void timKiem1(String s){
//        ArrayList<PT> arr = new ArrayList<>(); // mảng ArrayList arr mới có kiểu PT sẽ chứa các phần tử mà tìm kiếm được để còn hiển thị ra ngoài màn hình
//        for(PT p : list){ // mảng list có kiểu PT (interface) gồm Oto, XeMay, XeTai
////            System.out.println(((PTGT)p).getHangSX().length()); // độ dài của từng tên hãng SX của từng phần tử trong mảng list
//            // cách 1: chưa tìm đc với những chuỗi con của tên hãng SX
//            /*
//            if(s.length() <= ((PTGT)p).getHangSX().length()){ // nếu chuỗi nhập vào có độ dài nhỏ hơn tên hãng SX của các phần tử (Oto, XeMay, XeTai) thì ta tiếp tục so sánh, ngược lại thì không làm gì cả
//                if(s.trim().compareToIgnoreCase(((PTGT)p).getHangSX().substring(0, s.length())) == 0) // loại bỏ khoảng trắng thừa 2 bên của chuỗi nhập vào rồi so sánh với chuỗi con cắt ra từ tên hãng SX có độ dài bằng với chuỗi nhập vào, nếu bằng nhau thì add phần tử đó vào mảng arr khai báo trước đó (để tý hiển thị)
//                    arr.add(p);
//            }   
//            */
//
//            // cách 2: s="on" (2) và hangSX="honda" (5) => cần (5-2+1) = 4 lần KT để tìm ra chuỗi con của tên hangSX khớp với chuỗi nhập vào
//            for(int i=0; i <= ((PTGT)p).getHangSX().length() - s.length(); i++){ // cần (((PTGT)p).getHangSX().length() - s.length() + 1) để tìm ra được chuỗi con của tên hãng SX khớp với chuỗi nhập vào
//                if(s.trim().compareToIgnoreCase(((PTGT)p).getHangSX().substring(i, i + s.length())) == 0) // giúp lấy chuỗi con của tên hangSX (tăng i dần lên cho đến khi khớp với chuỗi nhập)
//                    arr.add(p);
//            }
//        }
//        if(arr.size() == 0) System.out.println("Khong tim thay ten hang ban vua nhap !");
//        else disPlay(arr);
//    }
    
    // Tìm kiếm 1: theo tên hãng SX
    public void timKiem1(String s){
        ArrayList<PT> arr = new ArrayList<>(); // mảng ArrayList arr mới có kiểu PT sẽ chứa các phần tử mà tìm kiếm được để còn hiển thị ra ngoài màn hình
        for(PT p : list){ // mảng list có kiểu PT (interface) gồm Oto, XeMay, XeTai
      
            if(((PTGT)p).hangSX.toLowerCase().matches(".*" + s.toLowerCase() + ".*")) // gọi được trực tiếp do hangSX đang để protected
                arr.add(p);
            // . Khớp (match) với bất kỳ ký tự nào
            // * xuất hiện 0 hoặc nhiều lần {0,}
            // public boolean matches(String regex):trả về true nếu chuỗi này so khớp với regular expression đã cung cấp
            // String Str = new String("Welcome to Tutorialspoint.com");
            // System.out.println(Str.matches("(.*)Tutorials(.*)")); // true
            // sử dụng (.*) 2 lần để kiểm tra chỉ cần chuỗi kiểm tra có chứa các ký tự đó thì sẽ trả về true
            // sử dụng (.*) 1 lần thì bắt buộc chuỗi kiểm tra phải chứ từ đó thì mới true và vị trí để (.*) về phía chuỗi ban đầu mà còn từ, còn không thì false
        }
        if(arr.size() == 0) System.out.println("Khong tim thay ten hang ban vua nhap !");
        else disPlay(arr);
    }    
    
    // Tìm kiếm 2: theo năm SX
    
    // Tìm kiếm 3: theo giá
    
// ============== case 4: Tìm kiếm theo khoảng =================================  
    
    public void timKiemTheoKhoang(){
        for (int i = 0; i < 20; i++) System.out.println(); 
        int lc;
        while(true){
            System.out.println("Tim kiem theo khoang:");
            System.out.println("1. Tu thang...den thang (cua 1 nam)");
            System.out.println("2. Tu nam den nam (nam SX)");
            System.out.println("3. Tu gia ban...den gia ban (gia ban)");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            lc = sc.nextInt();
            sc.nextLine(); // xóa bộ nhớ đệm
            switch(lc){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    System.out.println("Tim theo khoang gia:");
                    System.out.println("Nhap gia tu ? den ?");
                    timKiemTheoKhoangGia(sc.nextInt(), sc.nextInt());
                    break;
                }
                case 0:{
                    break;
                }
            }
            System.out.println("");
            if(lc == 0)
                break;
        }
    }
    
    public void timKiemTheoKhoangGia(int x, int y){
        ArrayList<PT> arr = new ArrayList<>();
        for(PT p : list){        
            if(((PTGT)p).getGiaBan() >= x && ((PTGT)p).getGiaBan() <= y) // phải ép kiểu p về kiểu PTGT đê gọi được các hàm get, set
                arr.add(p);
        }
        if(arr.size() == 0) System.out.println("Khong tim thay PT trong khoang gia ban muon !");
        else{
            System.out.println("");
            disPlay(arr); // hiển thị mảng arr có kiểu PT
        }
    }
    
// ============== case 5: Tìm một số trường ==================================== 
 
// ============== case 6: Sắp xếp ==============================================

    public void sapXep(){
        for (int i = 0; i < 20; i++) System.out.println(); 
        int lc;
        while(true){
            System.out.println("Sap xep theo:");
            System.out.println("1. Hang SX");
            System.out.println("2. Gia ban");
            System.out.println("3. Nam");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            lc = sc.nextInt();
            sc.nextLine(); // xóa bộ nhớ đệm
            switch(lc){
                case 1:{
                    sapXepTheoHang();
                    break;
                }
                
                case 2:{
                    sapXepTheoGia();
                    break;
                }
                
                case 3:{
                    break;
                }
                
                case 0:{
                    break;
                }
            }
            System.out.println("");
            if(lc == 0)
                break;
        }
    }    
    
    // Sắp xếp theo tên hãng SX
    public void sapXepTheoHang(){
        PTGT p = null;
        PTGT q = null;
        for(int i=0; i<list.size() - 1; i++){
            for (int j = i + 1; j< list.size(); j++){
                p = ((PTGT)list.get(i)); // từ kiểu lớn (PT) sang kiểu nhỏ (PTGT) thì phải ép kiểu PTGT
                q = ((PTGT)list.get(j)); // ta đang cần thao tác dữ liệu trên kiểu PTGT
                if(p.hangSX.compareToIgnoreCase(q.hangSX) > 0){ // chuỗi 1 lớn hơn chuỗi 2 (w > a) // compareToIgnoreCase: so sánh loại bỏ viết hoa, thường                                      
                    list.set(i, q);
                    list.set(j, p);
                    
                    // cách khác:
//                    PT temp = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, temp);
                }
            }
        }
        disPlay(list);
    }
    
    // Sắp xếp theo giá
    public void sapXepTheoGia(){
        PTGT p = null;
        PTGT q = null;
        for(int i=0; i<list.size() - 1; i++){
            for (int j = i + 1; j< list.size(); j++){
                p = ((PTGT)list.get(i)); // từ kiểu lớn (PT) sang kiểu nhỏ (PTGT) thì phải ép kiểu PTGT
                q = ((PTGT)list.get(j)); // ta đang cần thao tác dữ liệu trên kiểu PTGT
                if(p.giaBan > q.giaBan){               
                    list.set(i, q);
                    list.set(j, p);                  
                }
            }
        }
        disPlay(list);
    }
    
// ============== case 7: Tính toán theo 1 tiêu chí nào đó =====================
    // nhập vào 1 tìm kiếm theo hãng và tính tổng giá của các sản phẩm được list ra
    
    public void tinhGiaTheoHang(String h){
        double total = 0 ;
        ArrayList<PT> arr = new ArrayList<>(); // mảng ArrayList arr mới có kiểu PT sẽ chứa các phần tử mà tìm kiếm được để còn hiển thị ra ngoài màn hình
        for(PT p : list){ // mảng list có kiểu PT (interface) gồm Oto, XeMay, XeTai
      
            if(((PTGT)p).hangSX.toLowerCase().matches(".*" + h.toLowerCase() + ".*")){ // . Khớp (match) với bất kỳ ký tự nào            
                total += ((PTGT)p).giaBan;                                           // * xuất hiện 0 hoặc nhiều lần {0,}
                arr.add(p);
            }
            // public boolean matches(String regex): trả về true nếu chuỗi này so khớp với regular expression đã cung cấp
            // String Str = new String("Welcome to Tutorialspoint.com");
            // System.out.println(Str.matches("(.*)Tutorials(.*)")); // true
            // sử dụng (.*) 2 lần để kiểm tra chỉ cần chuỗi kiểm tra có chứa các ký tự đó thì sẽ trả về true
            // sử dụng (.*) 1 lần thì bắt buộc chuỗi kiểm tra phải chứ từ đó thì mới true và vị trí để (.*) về phía chuỗi ban đầu mà còn từ, còn không thì false
        }
        System.out.println("");
        disPlay(arr);
        System.out.println("Tong gia ban cua hang " + h + " = " + total +"\n");
    }
    
// ============== case 8: Ghi thông tin ra file kiểu text ======================
    
    public void ghiFileText(){
        try(PrintWriter pw = new PrintWriter("data.txt")){
            pw.println("Hang\t Nam SX\t Mau\t Gia\tC.Suat\tT.Tai\t S.Cho\t Kieu DC");
            for(PT p : list){
                pw.println(p); // ghi đối tượng p (hiển thị theo toString) vào pw
            }
            System.out.println("Write to file success !\n");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

// ============== case 9: Ghi thông tin ra file kiểu Object ====================
    
    public void ghiFileObject(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.data"))){
            oos.writeObject(list);
            System.out.println("Write to file success !\n");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

// ============== case 10: Đọc thông tin từ file kiểu text =====================
    
    public void docFileText(){
       try(Scanner read = new Scanner(new File("data.txt"))){
            String str;
            while(read.hasNext()){
                str = read.nextLine();
                System.out.println(str);
            }
            System.out.println("\nRead from file success !\n");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

// ============== case 11: Đọc thông tin từ file kiểu Object ===================
    
    public void docFileObject() throws ClassNotFoundException{
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.data"))){
            list = (ArrayList<PT>) ois.readObject();            
            disPlay(list);
            System.out.println("\nRead from file success !\n");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }        
    }
    
}
