package kodlamaIoInheritance;

public class UserManager {
	public void add(User user) {
		System.out.println(user.id+"-"+user.firstName+" "+user.lastName+ ": Üye Eklendi");	
	}

	public void delete(User user) {
		System.out.println(user.id+"-"+user.firstName+" "+user.lastName+ ": Üye Silindi");		}
	
	public void upragate(User user) {
		System.out.println(user.id+"-"+user.firstName+" "+user.lastName+ ": Üye Güncellendi");	
	}
}
