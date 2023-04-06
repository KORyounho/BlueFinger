package chosun.our.myapplication;


public class Member {
    String member_id; String name; String password; String email; String age; String gender; String phone_num; String User_Type;

    String Car_Type; String Car_Option; String Car_Number; boolean Car_register; int Finger_Info;


    public String getCar_Type() {
        return Car_Type;
    }

    public void setCar_Type(String car_Type) {
        Car_Type = car_Type;
    }

    public String getCar_Option() {
        return Car_Option;
    }

    public void setCar_Option(String car_Option) {
        Car_Option = car_Option;
    }

    public String getCar_Number() {
        return Car_Number;
    }

    public void setCar_Number(String car_Number) {
        Car_Number = car_Number;
    }

    public boolean isCar_register() {
        return Car_register;
    }

    public void setCar_register(boolean car_register) {
        Car_register = car_register;
    }

    public int getFinger_Info() {
        return Finger_Info;
    }

    public void setFinger_Info(int finger_Info) {
        Finger_Info = finger_Info;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
    }
    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public Member() {
    }

    public Member(String member_id, String email, String password, String name, String age, String gender, String User_Type, String phone_num) {
        this.member_id = member_id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.User_Type = User_Type;
        this.phone_num = phone_num;
    }

    public void Add_Member(String member_id, String email, String password, String name, String age, String gender, String User_Type, String phone_num){
        Member member = new Member(member_id, email, password, name, age, gender, User_Type, phone_num);
    }

    public void add_carlicense(){
    }
}

