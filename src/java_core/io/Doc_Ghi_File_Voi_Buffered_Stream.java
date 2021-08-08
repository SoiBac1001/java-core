/**
 * Lớp wrapper cho byte stream:
 *  1. BufferedInputStream
 *  2. BufferedOutputStream
 
 * Lớp wrapper cho character stream
 *  1. BufferedReader
 *  2. BufferedWriter
 */
package java_core.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author os_baonv
 */
public class Doc_Ghi_File_Voi_Buffered_Stream {
    public static void main(String[] args) throws IOException {
        separateDuplicatedList();
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("migOa8love");
        mylist.add("tylkrt57");
        mylist.add("yjing9");

        System.out.println("Original List : \n" + mylist);

        Collections.shuffle(mylist);

        System.out.println("\nShuffled List : \n" + mylist);

        // Ví dụ: Sử dụng Wrapper cho byte stream
        /*
        BufferedInputStream bfIn = null;
        BufferedOutputStream bfOut = null;
        try {
            InputStream is = new FileInputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\input.txt");
            OutputStream os = new FileOutputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\output.txt");
            bfIn = new BufferedInputStream(is);
            bfOut = new BufferedOutputStream(os);
            int c;
            while((c = bfIn.read()) != -1) // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
                bfOut.write(c); // Ghi ký tự c được biểu diễn bằng số nguyên
        } finally {
            if(bfIn != null)
                bfIn.close();
            if(bfOut != null)
                bfOut.close();
        }
        */       

        // Ví dụ: Sử dụng Wrapper cho character stream
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try{
            Path fileStorageLocation = Paths.get("E:\\Project\\work\\Fresher Java\\Java Core + Thread\\Java_Core\\src\\java_core\\io\\source2\\input.txt").toAbsolutePath().normalize();
            System.out.println(Files.isReadable(fileStorageLocation));
            if(!fileStorageLocation.toFile().exists()){
                Files.createDirectories(fileStorageLocation);
            }
            FileReader r = new FileReader("E:\\Project\\work\\Fresher Java\\Java Core + Thread\\Java_Core\\src\\java_core\\io\\source\\input.txt");
//            FileWriter w = new FileWriter(fileStorageLocation + "\\output 2", true);
            FileWriter w = new FileWriter("E:\\Project\\work\\Fresher Java\\Java Core + Thread\\Java_Core\\src\\java_core\\io\\source\\input.txt", true);
            bfr = new BufferedReader(r);
            bfw = new BufferedWriter(w);
            int c;
            /*while((c = bfr.read()) != -1) { // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
                System.out.println(c);
                bfw.write(c); // Ghi ký tự c được biểu diễn bằng số nguyên
                break;
            }*/

            String line;
            while((line = bfr.readLine()) != null) { // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
                System.out.println(line);
                bfw.write("\n\t" + line); // Ghi ký tự c được biểu diễn bằng số nguyên
            }
        } finally{
            if(bfr != null)
                bfr.close();
            if(bfw != null)
                bfw.close();
        }
        
    }

    private static void separateDuplicatedList(){
        List<Integer> originalList = new ArrayList<>();
        originalList.add(26); // 0
        originalList.add(26); // 1
        originalList.add(26); // 2
        originalList.add(81); // 3
        originalList.add(81); // 4
        originalList.add(18); // 5
        originalList.add(18); // 6
        originalList.add(18); // 7
        originalList.add(62); // 8
        originalList.add(26); // 9
        originalList.add(81); // 10
        originalList.add(81); // 11
        originalList.add(18); // 12
        originalList.add(99); // 13
        originalList.add(62); // 14

        /*originalList.add(26); // 0
        originalList.add(81); // 1
        originalList.add(18); // 2
        originalList.add(62); // 3*/

        List<Integer> separatedList1 = new ArrayList<>();
        List<Integer> separatedList2 = new ArrayList<>();
        int size = originalList.size();
        Map<Integer, Integer> soMap = new HashMap<>();
        OUT_LOOP:
        for(int i = 0; i < size; i++){
            Integer number = originalList.get(i);
            for(int j = i+1; j < size; j++){
                Integer number2 = originalList.get(j);
                if(number.equals(number2)){
                    /*separatedList2.add(number);*/
                    putValueToMap(soMap, number);
//                    putValueSameKeyToMap(soMap, number);
                    Integer numberOfSo = soMap.get(number);
                    if(numberOfSo % 2 == 0){
                        separatedList2.add(number);
                    } else {
                        separatedList1.add(number);
                    }
                    continue OUT_LOOP;
                }
            }

            separatedList2.add(number);

            /*if(!isDuplicated){
                separatedList1.add(number);
            }*/
        }

        if((separatedList1.size() + separatedList2.size()) == size){
            System.out.println(originalList);
            System.out.println(separatedList1);
            System.out.println(separatedList2);
        } else {
//            throw Exception;
        }
    }

    public static void putValueToMap(Map<Integer, Integer> map, Integer key){
//        CommonUtils.requireNonNullObjects(values);
        map.computeIfPresent(key, (k, value) -> value + 1);
        map.putIfAbsent(key, 1);
    }

    public static void putValueSameKeyToMap(Map<Integer, Integer> map, Integer key){
        if (map.containsKey(key)) {
            Integer newValue = map.get(key) + 1;
            map.put(key, newValue);
        } else {
            map.put(key, 1);
        }
    }
}
