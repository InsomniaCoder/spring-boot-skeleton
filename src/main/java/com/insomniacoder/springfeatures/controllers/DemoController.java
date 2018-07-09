import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
class DemoController{

	@GetMapping
	@ResponseStatus(code= HttpStatus.OK)
	public String requestParamExample(@RequestParam(value="name",required=false,defaultValue="Por")String name){
		return "Hello " + name;
	}

	@GetMapping("path/{name}")
	@ResponseStatus(code= HttpStatus.OK)
	public String pathVariableExample(@PathVariable String name){
		return "Hello " + name;
	}
}