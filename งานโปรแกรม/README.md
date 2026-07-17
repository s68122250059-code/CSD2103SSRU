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

## ตอนที่ 5: เขียนโปรแกรมหาค่ามากที่สุดจากตัวเลข 3 จำนวน

**Pseudocode**
```text
START
    DISPLAY "Enter number 1: "
    INPUT num1
    
    DISPLAY "Enter number 2: "
    INPUT num2
    
    DISPLAY "Enter number 3: "
    INPUT num3
    
    max = num1
    
    IF num2 > max THEN
        max = num2
    ENDIF
    
    IF num3 > max THEN
        max = num3
    ENDIF
    
    DISPLAY "Maximum number = ", max
END
```
**Java Code**
```text
import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("Maximum number = " + max);

        sc.close();
    }
}
```
## ตอนที่ 6: ทบทวน Array
**Pseudocode**
```text
START
    CREATE array scores[5]
    total_score = 0
    
    FOR i = 0 TO 4 DO
        DISPLAY "Enter score ", i + 1, ": "
        INPUT scores[i]
        total_score = total_score + scores[i]
    ENDFOR
    
    average_score = total_score / 5
    
    DISPLAY "Total score = ", total_score
    DISPLAY "Average score = ", average_score
END
```
**Java Code**
```text
import java.util.Scanner;

public class ArrayScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
            total += score[i];
        }

        double average = total / 5.0;

        System.out.println("Total score = " + total);
        System.out.println("Average score = " + average);

        sc.close();
    }
}
```
## ตอนที่ 7: ค้นหาข้อมูลใน Array
**Pseudocode**
```text
START
    // 1. กำหนดรายชื่อนักศึกษา 5 คนไว้ใน Array
    CREATE array names[5] = ["Somchai", "Somsri", "Somsak", "Somporn", "Somjai"]
    found = FALSE
    
    // 2. รับชื่อที่ต้องการค้นหาจากผู้ใช้
    DISPLAY "Enter name to search: "
    INPUT search_name
    
    // 3. ตรวจสอบว่าชื่อนั้นมีอยู่ใน Array หรือไม่
    FOR i = 0 TO 4 DO
        IF names[i] == search_name THEN
            found = TRUE
            BREAK
        ENDIF
    ENDFOR
    
    // 4 & 5. แสดงผลการค้นหาตามเงื่อนไข
    IF found == TRUE THEN
        DISPLAY "Found"
    ELSE
        DISPLAY "Not Found"
    ENDIF
END
```
**Java Code**
```text
import java.util.Scanner;

public class SearchName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Somchai", "Suda", "Anan", "Nida", "Kanya"};

        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        sc.close();
    }
}
```
## ตอนที่ 8: เขียน Method เพื่อหาค่ามากที่สุด
```text
import java.util.Scanner;

public class ReviewMethod {

    public static int findMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int max = findMax(a, b);

        System.out.println("Maximum number = " + max);

        sc.close();
    }
}
```

## ตอนที่ 9: Debug โปรแกรม
โปรแกรมต่อไปนี้มีข้อผิดพลาด ให้นักศึกษาหาข้อผิดพลาดและแก้ไขให้ถูกต้อง
```text
public class DebugExample {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0;i <= numbers.lenght; i++){
            System.out.println(numbers[i])
        }
    }
}
```
9.1 โปรแกรมนี้ผิดพลาดที่บรรทัดใด
- ตอบ: for (int i = 0; i <= numbers.length; i++)

9.2 เพราะเหตุใดจึงเกิดข้อผิดพลาด
- ตอบ: เพราะ i มีค่าเท่ากับ numbers.length ทำให้เรียกสมาชิกที่ไม่มีอยู่ใน Array จึงเกิด ArrayIndexOutOfBoundsException

9.3 ควรแก้ไขอย่างไร
- ตอบ: เปลี่ยน <= เป็น <

โค้ดที่แก้ไขแล้ว
```text
public class DebugExample {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
```
## ตอนที่ 10: Mini Challenge
**ตัวเลือกที่ 1: โปรแกรมนับจำนวนเลขคู่และเลขคี่**
```text

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
```
## ตอนที่ 11:ใช้ AIgen ช่วยตรวจข้อ
**Prompt ที่ใช้ถาม AI**
- จากโค้ท java ข้างต้น ช่วยตรวจสอบข้อผิดพลาด หรือข้อเสนอแนะให้โปรแกรมทำงานได้อย่างถูกต้องและมีประสิทธภาพขอเป็นคำตอบสั้นกระชับ เข้าใจง่าย

11.1 Ai พบข้อผิดพลาดอะไรหรือไม่
- ตอบ: ไม่พบ

11.2 คำแนะนำของ AI ถูกต้องหรือไม่ เพราะเหตุใด
- ตอบ: เข้าใจง่าย

11.3 นักศึกษาแก้ไขโค้ดตาม AI หรือไม่
- ตอบ: ไม่ได้แก้ไขครับเพราะว่าเป็นโค้ทที่เข้าใจง่ายเหมาะแก่การอ่านทบทวน

11.4 นักศึกษาได้เรียนรู้อะไรจากการใช้ AI ตรวจโค้ด
- ตอบ: ให้ข้อเสนอแนะในการปรับปรุง และอธิบายการทำงานของโปรแกรมได้ ทำให้เข้าใจหลักการเขียนโปรแกรมมากขึ้น และสามารถพัฒนาโค้ดให้ถูกต้อง อ่านง่าย และมีประสิทธิภาพยิ่งขึ้น

11.5 มีข้อควรระวังอะไรในการใช้ AI ช่วยเขียนโปรแกรม
- ตอบ: ไม่ควรเชื่อ AI ทุกอย่างบางอย่างเราต้องตรวจสอบก่อน เพราะบางที AI ก็ทำผิดพลาดได้เช่นกัน

## ชื่อโปรแกรม CountEvenOdd
**Input**
- รับค่าตัวเลขจำนวนเต็มจากผู้ใช้ 10 จำนวน ผ่านแป้นพิมพ์

**Process**
1.สร้างอาร์เรย์สำหรับเก็บตัวเลข 10 จำนวน

2.รับค่าตัวเลขจากผู้ใช้และเก็บลงในอาร์เรย์

3.วนลูปตรวจสอบตัวเลขแต่ละตัว

4.ถ้าตัวเลขหาร 2 ลงตัว (number % 2 == 0) ให้นับเป็นเลขคู่

5.หากหาร 2 ไม่ลงตัว ให้นับเป็นเลขคี่

**Output**
- แสดงจำนวนเลขคู่ (Even numbers count)
- แสดงจำนวนเลขคี่ (Odd numbers count)

**วิธีรันโปรแกรม**
- 1.เปิดไฟล์ CountEvenOdd.java ในโปรแกรมที่รองรับ Java (เช่น IntelliJ IDEA, Eclipse หรือ VS Code)
- 2.Compile โปรแกรม
- 3.Run Program
- 4.ป้อนตัวเลขจำนวนเต็ม 10 จำนวน แล้วกด Enter
- 5.โปรแกรมจะแสดงจำนวนเลขคู่และเลขคี่ที่รับเข้ามา
