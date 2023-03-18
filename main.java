public class main {
    public static void main(String[] args) {

        course mat = new course("Matematik", "MAT101", "MAT");
        course fizik = new course("Fizik", "FZK101", "FZK");
        course kimya = new course("Kimya", "KMY101", "KMY");

        teacher t1 = new teacher("Mahmut Hoca", "90550000000", "MAT");
        teacher t2 = new teacher("Fatma Ayşe", "90550000001", "FZK");
        teacher t3 = new teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        studenInfo s1 = new studenInfo("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addSozluNot(100,100,100);
        s1.isPass();

        studenInfo s2 = new studenInfo("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s1.addSozluNot(100,100,100);
        s2.isPass();

        studenInfo s3 = new studenInfo("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s1.addSozluNot(100,100,100);
        s3.isPass();

    }
}
