package bootstrap.liftweb

import net.liftweb.common.Full._
import net.liftweb.http.js.JE.JsRaw._
import net.liftweb.http.js.jquery.JQuery14Artifacts
import net.liftweb.http.LiftRules
import net.liftweb.common.Full

class Boot {
	def boot() {
		LiftRules.addToPackages("no.officenet.jsflift")

		//Show the spinny image when an Ajax call starts
		LiftRules.ajaxStart = Full(() => LiftRules.jsArtifacts.show("ajax-loader").cmd)

		// Make the spinny image go away when it ends
		LiftRules.ajaxEnd = Full(() => LiftRules.jsArtifacts.hide("ajax-loader").cmd)

		// Force the request to be UTF-8
		LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

		LiftRules.jsArtifacts = JQuery14Artifacts
		LiftRules.ajaxPostTimeout = 60000

	}
}