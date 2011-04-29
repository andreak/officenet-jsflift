package no.officenet.jsflift.snippet

import net.liftweb._
import http._
import common._
import js.JsCmd
import js.JsCmd._
import js.JsCmds.Alert
import util.Helpers._
import java.util.Date

class MySnippet {

	var firstname = "default name"
	def render = {
		".date" #> new Date().toString
	}

	def renderDocumentForm = {
		".firstname" #> SHtml.text(firstname, firstname = _) &
		":submit" #> SHtml.ajaxSubmit("Send lift-from",
									  () => process())
	}

	def process():JsCmd = {
		Alert("Form submitted, recieved name '"+firstname+"' at "+new Date().toString)
	}
}