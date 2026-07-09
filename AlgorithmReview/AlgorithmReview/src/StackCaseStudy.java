import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {
        Stack<String> actionStack = new Stack<>();
        
        System.out.println("=== ระบบ Undo (Stack) ===");
        
        // 1. เพิ่มคำสั่งทั้งหมดลงใน Stack
        actionStack.push("Type Data");
        actionStack.push("Type Structure");
        actionStack.push("Delete Structure");
        actionStack.push("Type Algorithm");
        actionStack.push("Type Java");
        
        // 2. แสดงคำสั่งทั้งหมดใน Stack
        System.out.println("คำสั่งทั้งหมดใน Stack ปัจจุบัน: " + actionStack);
        
        // 3 & 4. Undo คำสั่งล่าสุด 2 ครั้ง และแสดงคำสั่งที่ถูก Undo
        System.out.println("\nดำเนินการ Undo 2 ครั้ง...");
        for (int i = 1; i <= 2; i++) {
            // ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
            if (!actionStack.isEmpty()) {
                String undoneAction = actionStack.pop();
                System.out.println("Undo ครั้งที่ " + i + ": ยกเลิกคำสั่ง [" + undoneAction + "]");
            } else {
                System.out.println("Stack ว่างเปล่า ไม่สามารถ Undo ได้");
            }
        }
        
        // 5. แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("\nสถานะของ Stack หลังจาก Undo: " + actionStack);
        
        // อธิบายหลักการ LIFO
        System.out.println("\nคำอธิบาย LIFO (Last-In, First-Out):");
        System.out.println("Stack ทำงานแบบ 'เข้าหลัง ออกก่อน' คำสั่ง 'Type Java' เป็นคำสั่งสุดท้ายที่ถูกใส่เข้าไป (Push)");
        System.out.println("ดังนั้นเมื่อทำการ Undo (Pop) คำสั่ง 'Type Java' จึงถูกนำออกไปเป็นอันดับแรกสุด ตามหลักการ LIFO");
    }
}