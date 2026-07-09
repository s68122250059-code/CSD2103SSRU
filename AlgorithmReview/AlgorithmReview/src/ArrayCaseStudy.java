public class ArrayCaseStudy {
    public static void main(String[] args) {
        // ประกาศ Array เก็บข้อมูลคะแนนสอบ
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};
        
        int totalScore = 0;
        int maxScore = scores[0];
        int minScore = scores[0];
        int countPass = 0;
        
        System.out.println("=== ผลการวิเคราะห์คะแนนสอบ (Array) ===");
        
        // ประมวลผลข้อมูลใน Array
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i]; // หาคะแนนรวมทั้งหมด
            
            if (scores[i] > maxScore) maxScore = scores[i]; // หาคะแนนสูงสุด
            if (scores[i] < minScore) minScore = scores[i]; // หาคะแนนต่ำสุด
            if (scores[i] >= 7) countPass++; // นับจำนวนนักศึกษาที่ได้ 7 คะแนนขึ้นไป
        }
        
        double averageScore = (double) totalScore / scores.length; // หาคะแนนเฉลี่ย
        
        // แสดงผลลัพธ์
        System.out.println("1. คะแนนรวมของนักศึกษาทั้งหมด: " + totalScore);
        System.out.println("2. คะแนนเฉลี่ย: " + averageScore);
        System.out.println("3. คะแนนสูงสุด: " + maxScore);
        System.out.println("4. คะแนนต่ำสุด: " + minScore);
        System.out.println("5. จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป: " + countPass + " คน");
        
        System.out.print("6. ลำดับนักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม (คะแนน < 5): ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                // สมมติให้ลำดับนักศึกษาคือ Index + 1 (คนที่ 1-10)
                System.out.print("คนที่ " + (i + 1) + " (ได้ " + scores[i] + " คะแนน) "); 
            }
        }
        System.out.println();
    }
}