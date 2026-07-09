import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();
        
        System.out.println("=== ระบบคิวผู้ป่วย (Queue) ===");
        
        // 1. เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        patientQueue.add("P001");
        patientQueue.add("P002");
        patientQueue.add("P003");
        patientQueue.add("P004");
        patientQueue.add("P005");
        System.out.println("คิวเริ่มต้น: " + patientQueue);
        
        // 2. เรียกผู้ป่วยออกจากคิว 2 คน (P001 และ P002 ได้รับบริการแล้ว)
        System.out.println("\nเรียกผู้ป่วยเข้ารับบริการ 2 ท่าน...");
        for (int i = 0; i < 2; i++) {
            // ตรวจสอบก่อน remove() ว่า Queue ว่างหรือไม่
            if (!patientQueue.isEmpty()) {
                String servedPatient = patientQueue.remove(); // หรือใช้ poll()
                System.out.println("ผู้ป่วยที่ได้รับบริการแล้ว: " + servedPatient);
            }
        }
        
        // 3. เพิ่มผู้ป่วย P006 และ P007 เข้า Queue
        System.out.println("\nมีผู้ป่วยใหม่ P006 และ P007 มาลงทะเบียนเพิ่ม...");
        patientQueue.add("P006");
        patientQueue.add("P007");
        
        // 4. แสดงผู้ป่วยคนถัดไปด้วย peek()
        if (!patientQueue.isEmpty()) {
            System.out.println("ผู้ป่วยคนถัดไปที่ต้องเรียก: " + patientQueue.peek());
        }
        
        // 5. แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()
        System.out.println("จำนวนผู้ป่วยที่ยังรอคิวอยู่: " + patientQueue.size() + " คน");
        
        // 6. แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด
        System.out.println("สถานะของ Queue ปัจจุบัน: " + patientQueue);
        
        // อธิบายหลักการ FIFO
        System.out.println("\nคำอธิบาย FIFO (First-In, First-Out):");
        System.out.println("Queue ทำงานแบบ 'มาก่อน ได้ก่อน' ผู้ป่วย P001 และ P002 เข้าคิวเป็นคนแรกๆ");
        System.out.println("ดังนั้นเมื่อเรียกคิว (Remove/Dequeue) ทั้งสองคนจึงได้รับบริการก่อน และผู้ป่วยใหม่จะไปต่อท้ายคิวเสมอ ตามหลักการ FIFO");
    }
}