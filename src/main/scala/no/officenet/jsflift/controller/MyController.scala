package no.officenet.jsflift.controller

import reflect.BeanProperty
import org.springframework.stereotype.Controller
import org.springframework.context.annotation.Scope

@Controller
@Scope("view")
class MyController {

	@BeanProperty
	var userName: String = "Nissemann"

}