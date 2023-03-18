public class course {

    teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    public course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
    }

    public void addTeacher(teacher T){
        if(this.prefix.equals(T.branch())){
            this.courseTeacher = T;
            System.out.println("İşlem Başarılı");
        }
        else{
            System.out.println(T.name+" Öğretmeni  bu derse verilemez");
        }

    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    
}
