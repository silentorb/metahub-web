import react.*
import react.dom.h1
import react.dom.p
import react.dom.render
import kotlin.browser.document

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1 {
            +"MetaHub"
        }
        p {
            +"This is an app"
        }
    }
}

fun main() {
    document.bgColor = "blue"
    render(document.getElementById("root")) {
        child(App::class) {}
    }
}
