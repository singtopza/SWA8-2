class UserManager {
	private IUser user;
	public UserManager(IUser user) {
		this.user = user;
	}
	public String getName() {
		return this.user.getName();
}
}