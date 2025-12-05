enum UserRole {
    ADMIN, USER, GUEST
}
public class Main {
    public static void main(String[] args) {
        UserRole role1 = UserRole.ADMIN;
        UserRole role2 = UserRole.USER;
        UserRole role3 = UserRole.GUEST;
        printPermission(role1);
        printPermission(role2);
        printPermission(role3);
    }
    public static void printPermission(UserRole role) {
        switch (role) {
            case ADMIN:
                System.out.println("ADMIN：拥有所有权限");
                break;
            case USER:
                System.out.println("USER：可以查看和编辑自己的数据");
                break;
            case GUEST:
                System.out.println("GUEST：只能查看公共信息");
                break;
        }
    }
}
