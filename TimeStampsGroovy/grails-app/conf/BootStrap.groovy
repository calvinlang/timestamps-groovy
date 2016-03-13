import com.timestamps.auth.*
class BootStrap {

    def init = { servletContext ->
    	def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
    	def user = User.findOrSaveWhere(username: 'calvin', password: 'password', email: 'langcalvin@gmail.com')

    	if(!user.authorities.contains(adminRole)) {
    		UserRole.create(user, adminRole, true)
    	}
    }
    def destroy = {
    }
}
