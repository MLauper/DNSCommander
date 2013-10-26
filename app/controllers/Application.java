package controllers;

import play.*;
import play.api.templates.Html;
import play.libs.Scala;
import play.mvc.*;

import scala.collection.mutable.*;
import scala.collection.mutable.StringBuilder;
import views.html.*;
import views.html.index;
import views.html.query;

public class Application extends Controller {

    public static String applicationName = "DNS Commander";



    public static Result index() {
        //return temporaryRedirect("http://www.google.com");
        StringBuilder htmlText;
        htmlText = new StringBuilder("<div id=\"container\" class=\"clear\">" +
                "<section id=\"slider\" class=\"clear\">" +
        "<figure>" +
        "<figcaption>" +
        "<h2>Eu justo augue estas</h2>" +
        "<p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat adipiscinia pellentum leo.</p>" +
        "<footer class=\"more\"><a href=\"#\">Read More &raquo;</a></footer>" +
        "</figcaption>"+
        "</figure>"+
        "</section>"+
        "</div>");
        Html outputHTML = new Html(htmlText);
        return ok(index.render("Your new application is ready.", outputHTML));
    }

    public static Result printSomething(String something) {
        return ok("You want me to print: " + something + "!");
    }

    public static Result printDadu() {
        return redirect(controllers.routes.Application.printSomething("dadu"));
    }

    public static Result ShowRequestBody() {
        Http.RequestBody body = request().body();
        return ok("Got body: " + body);
    }

    public static Result getDNSEntries(String zone){
        return ok("GetDNSEntries here");
    }

    public static Result showQueryDNS(){
         // TODO Define GUI for DNS Query Generator

        return ok(query.render());
    }
few




}
