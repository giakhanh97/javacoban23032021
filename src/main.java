
//1. Tạo thư mục .git
// git init

//2. xem su thay đổi
//git status

//3, lưu trữ sự thay đổi
//git add .

//4 lưu trữ vào local repo
//git commit -m "ten message"


//        git remote add origin https://github.com/giakhanh97/javacoban23032021.git
//        git branch -M main
//        git push -u origin main


public class main {

    public static void main(String [] args) throws Exception{
        System.out.println("Hello World");

//        1: comment code
//        System.out.print"Hello World"
//
//        2. Ki?u d? li?u
//                -NHÓM KI?U D? LI?U NGUYÊN TH?Y : Không h? tr? phương th?c x? l?
//                Viết thường chữ đầu	int , boolean , double , float , char , ....
//
//
//        -NHÓM KI?U D? LI?U Đ?I TƯ?NG :	 H? tr? các phương th?c x? ly
//        Viết hoa chữ đầu 	String , Int , Boolean , Double , Float , CharSequence .....



        //3. Khai báo  biến
//            String name = "Gia Khánh" ;
//            int age = 24;
//            float s1 = 1.5f;
//            double s2 = 1.5;
//            char s3 = 'a';

        //4 . Toán tử
        /*
        Toán hạng : 1 , 2 , 3
        Toán tử : + - * /
        Biểu thức : Phải có giá trị trả về
         */
        int a = 5;
        int b = 5;
        int c = a-- + --b - --b - --a + b-- - --a;
        /*
            5 + 4 - 3 -3 -3 + 3 - 2
         */
        System.out.println(c);

    }
}
