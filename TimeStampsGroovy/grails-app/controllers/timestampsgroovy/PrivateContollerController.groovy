package timestampsgroovy


@Secured(['ROLE_ADMIN'])
class PrivateContollerController {

    def index() {
    	render "hello from private.index"
    }
}
