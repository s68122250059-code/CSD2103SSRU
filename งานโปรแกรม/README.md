# ใบงานทบทวนภาษา java
## ตอนที่ 1: ทบทวนคำสั่งพื้นฐาน java

1.1 คำสั่งแสดงผลข้อความในภาษา Java คืออะไร
- ตอบ System.out.println();

1.2 คำสั่งรับค่าจากแป้นพิมพ์โดยใช้ Scanner ต้อง import อะไร
- ตอบ import java.util.Scanner;

1.3 คำสั่งใดใช้ตรวจสอบเงื่อนไข
- ตอบ: ใช้คำสั่ง if, if-else หรือ switch-case

1.4 คำสั่งใดใช้วนซ้ำเมื่อทราบจำนวนรอบแน่นอน
- ตอบ: ใช้คำสั่ง for เพื่อวนซ้ำ

1.5 คำสั่งใดใช้วนซ้ำเมื่อยังไม่ทราบจำนวนรอบแน่นอน
- ตอบ: ใช้คำสั่ง while loop หรือ do-while

## ตอนที่ 2: วิเคราะห์โค้ด Java
```text
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
        sum = sum + i;
    }
    System.out.println(sum);
```
2.1 โปรแกรมนี้วนซ้ำทั้งหมดกี่รอบ
- ตอบ: 5 รอบ

2.2 ค่าของตัวแปร sum หลังจบการทำงานคือเท่าใด
- ตอบ: 15

2.3 ผลลัพธ์ที่แสดงออกหน้าจอคืออะไร
- ตอบ: 15

2.4 โปรแกรมนี้ทำหน้าที่อะไร
- ตอบ: คำนวณผลรวมของตัวเลขตั้งแต่ 1 ถึง 5 แล้วแสดงผล

## ตอนที่ 3: เขียนโปรแกรมตรวจสอบเลขคู่หรือเลขคี่

**Pseudocode**
```text
START
    DISPLAY "Enter number: "
    INPUT number
    
    IF number MOD 2 == 0 THEN
        DISPLAY "Even number"
    ELSE
        DISPLAY "Odd number"
    ENDIF
END
```

**Java Code**
```text
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        sc.close();
    }
}
```
## ตอนที่ 4: เขียนโปรแกรมคำนวณคะแนนรวมและตัดสินผลผ่าน/ไม่ผ่าน
**Pseudocode**
```text
START
    DISPLAY "Enter midterm score: "
    INPUT midterm_score
    
    DISPLAY "Enter final score: "
    INPUT final_score
    
    total_score = midterm_score + final_score
    DISPLAY "Total score = ", total_score
    
    IF total_score >= 50 THEN
        DISPLAY "Pass"
    ELSE
        DISPLAY "Fail"
    ENDIF
END
```
**Java Code**
```text
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter midterm score: ");
        int mid = sc.nextInt();

        System.out.print("Enter final score: ");
        int fin = sc.nextInt();

        int total = mid + fin;

        System.out.println("Total score = " + total);

        if (total >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
```



