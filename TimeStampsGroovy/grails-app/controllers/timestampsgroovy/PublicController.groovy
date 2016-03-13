package timestampsgroovy

@Secured(['permitAll'])
class PublicController {

    def index() { 
    	render "hello from public.index"
    }
}
