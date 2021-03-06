/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.13
 * Generated at: 2022-02-21 17:13:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import org.apache.jasper.tagplugins.jstl.core.If;

public final class AddCard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

public class Personatge {
		//atributs
		protected String nom;
		protected String imatge;
		protected String classe;

		protected String color1;
		protected String color2;
		protected String color3;

		protected int[] punts;

		protected int VIDA;
		protected int MANA;

		protected int finalFUE;
		protected int finalDES;
		protected int finalCON;
		protected int finalINT;
		protected int finalSAB;
		protected int finalCAR;

		//constructor
		public Personatge() {
			this.punts = new int[6];
			int tria = (int) Math.floor(Math.random() * (6 - 1 + 1)) + 1;
			if (tria == 1) {
				this.crearElf();
			} else if (tria == 2) {
				this.crearNan();
			} else if (tria == 3) {
				this.crearGnom();
			} else if (tria == 4) {
				this.crearMitja();
			} else if (tria == 5) {
				this.crearSemiOrc();
			} else if (tria == 6) {
				this.crearHuma();
			}
		}
		public Personatge(int tria) {
			this.punts = new int[7];
			if (tria == 1) {
				this.crearElf();
			} else if (tria == 2) {
				this.crearNan();
			} else if (tria == 3) {
				this.crearGnom();
			} else if (tria == 4) {
				this.crearMitja();
			} else if (tria == 5) {
				this.crearSemiOrc();
			} else if (tria == 6) {
				this.crearHuma();
			}
		}
		//mètodes
		private int tirarDaus(int daus) {
			int mesPetit = 0;
			int cares = 6;
			int suma = 0;
			for (int i = 0; i < daus; i++) {
				int actual = (int) Math.floor(Math.random() * (cares - 1 + 1)) + 1;
				if (mesPetit == 0 || mesPetit > actual)
					mesPetit = actual;
				suma += actual;
			}
			suma -= mesPetit;
			return suma;
		}
		private int tirarDaus(int daus, int cares) {
			int suma = 0;
			for (int i = 0; i < daus; i++) {
				int actual = (int) Math.floor(Math.random() * (cares - 1 + 1)) + 1;
				suma += actual;
			}
			return suma;
		}
		public void crearElf() {
			this.imatge = "0.png";
			this.classe = "Elf";

			this.color1 = "#99bfcd";
			this.color2 = "#fcf3b0";
			this.color3 = "#d3ecec";

		}
		public void crearNan() {
			this.imatge = "1.png";
			this.classe = "Nan";

			this.color1 = "#a67b4f";
			this.color2 = "#f9b78f";
			this.color3 = "#62412e";
		}
		public void crearGnom() {
			this.imatge = "2.png";
			this.classe = "Gnom";

			this.color1 = "#4a8da8";
			this.color2 = "#FFBBF0";
			this.color3 = "#b8ae95";
		}
		public void crearMitja() {
			this.imatge = "3.png";
			this.classe = "Mitjà";

			this.color1 = "#c2724c";
			this.color2 = "#d45a76";
			this.color3 = "#f0d4ba";
		}
		public void crearSemiOrc() {
			this.imatge = "4.png";
			this.classe = "SemiOrc";

			this.color1 = "#66747b";
			this.color2 = "#a4a095";
			this.color3 = "#bda67c";
		}
		public void crearHuma() {
			this.imatge = "5.png";
			this.classe = "Humà";

			this.color1 = "#cab69a";
			this.color2 = "#a9a6ad";
			this.color3 = "#7D8093";
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public void setVida() {
			this.VIDA = tirarDaus(1, 8) * this.finalCON;
		}

		public void setMana() {
			int mana = (this.finalINT + this.finalSAB) / 2;
			mana = (int) Math.floor(mana);
			this.MANA = tirarDaus(1, 4) * mana;
		}

		public void setArray() {
			for (int i = 0; i < 6; i++) {
				this.punts[i] = this.tirarDaus(4);
			}
		}

		//Aquest mètode fa l'insert a la base de dades
		public boolean guardar() {
			return true;
		}

	}
  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.jasper.tagplugins.jstl.core.If");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"img/orco.ico\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Custom Card - Yamuza Game</title>\n");
      out.write("<script src=\"script/modificadores.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"Estilos/estilosAddCard.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"Estilos/estilosCartaRandom.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

Personatge pers;
if (request.getParameter("clase") == null) {
	pers = new Personatge();
	pers.setArray();
} else {
	int clase = Integer.parseInt(request.getParameter("clase"));
	if (clase > 0 && clase <= 6) {
		pers = new Personatge(clase);
		pers.setArray();
	} else {
		pers = new Personatge();
		pers.setArray();
	}
}
pers.setArray();

      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<div class=\"titulo-cabecera\">\n");
      out.write("		<h2>Carta Custom</h2>\n");
      out.write("		<img src=\"img/titulo-img.png\">\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div class=\"botones-control\">\n");
      out.write("		<a href='AddCard.jsp'>\n");
      out.write("			<button class=\"button-29\" role=\"button\">Cambiar personaje</button>\n");
      out.write("		</a> <a href='index.jsp'>\n");
      out.write("			<button class=\"button-29\" role=\"button\">Volver</button>\n");
      out.write("		</a>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<form action=\"insert_bd.jsp\" method=\"post\">\n");
      out.write("		<div class=\"fondo-form\">\n");
      out.write("			<h1 style=\"text-align: center;\">\n");
      out.write("				");

				out.println(pers.classe);
				
      out.write("\n");
      out.write("			</h1>\n");
      out.write("			<input type=\"hidden\" name=\"race\" value=");
      out.print(pers.classe);
      out.write(">\n");
      out.write("			<input type=\"hidden\" name=\"picture\" value=");
      out.print(pers.imatge);
      out.write(">\n");
      out.write("\n");
      out.write("			<table style=\"width: 100%; height: 10%; opacity: 1; %&gt;\" class=\"tg\">\n");
      out.write("				</tbody>\n");
      out.write("				<tr>\n");
      out.write("					<td id=\"imatge\" style=\"width: 40%;\" class=\"tg-0lax\" rowspan=\"8\">\n");
      out.write("						<img style=\"width: 100%; height: 390px;\"\n");
      out.write("						src=\"img/");
out.println(pers.imatge);
      out.write("\" alt=\"Caràcter\">\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-ucee\">Característiques</td>\n");
      out.write("					<td class=\"tg-ucee\">Valor Base</td>\n");
      out.write("					<td class=\"tg-ucee\">Modificadors</td>\n");
      out.write("					<td class=\"tg-ucee\">Valor final</td>\n");
      out.write("				</tr>\n");
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">FUE:</td>\n");
      out.write("					<td class=\"tg-fgy3\"><select name=\"fue\" id=\"select1\">\n");
      out.write("\n");
      out.write("					</select></td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"f\">\n");
      out.write("						");

						if (pers.classe == "SemiOrc")
							out.print("+2");
						else if (pers.classe == "Gnom" || pers.classe == "Mitjà")
							out.print("-2");
						else
							out.print("+0");
						
      out.write("\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"fFinal\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">DES:</td>\n");
      out.write("					<td class=\"tg-fgy3\"><select name=\"des\" id=\"select2\">\n");
      out.write("\n");
      out.write("					</select></td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"h\">\n");
      out.write("						");

						if (pers.classe == "Elf" || pers.classe == "Mitjà")
							out.print("+2");
						else
							out.print("+0");
						
      out.write("\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"hFinal\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">CON:</td>\n");
      out.write("					<td class=\"tg-fgy3\">\n");
      out.write("					<select name=\"con\" id=\"select3\">\n");
      out.write("					</select>\n");
      out.write("					\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"c\">\n");
      out.write("						");

						if (pers.classe == "Nan" || pers.classe == "Gnom")
							out.print("+2");
						else if (pers.classe == "Elf")
							out.print("-2");
						else
							out.print("+0");
						
      out.write("\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"cFinal\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">INT:</td>\n");
      out.write("					<td class=\"tg-fgy3\"><select name=\"int\" id=\"select4\">\n");
      out.write("\n");
      out.write("					</select></td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"i\">\n");
      out.write("						");

						if (pers.classe == "Elf")
							out.print("+2");
						else if (pers.classe == "SemiOrc")
							out.print("-2");
						else
							out.print("+0");
						
      out.write("\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"iFinal\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">SAB:</td>\n");
      out.write("					<td class=\"tg-fgy3\"><select name=\"sab\" id=\"select5\">\n");
      out.write("\n");
      out.write("					</select></td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"s\">\n");
      out.write("						");

						if (pers.classe == "Nan")
							out.print("+2");
						else
							out.print("+0");
						
      out.write("\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"sFinal\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">CAR:</td>\n");
      out.write("					<td class=\"tg-fgy3\"><select name=\"car\" id=\"select6\">\n");
      out.write("\n");
      out.write("					</select></td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"ca\">\n");
      out.write("						");

						if (pers.classe == "Gnom")
							out.print("+2");
						else if (pers.classe == "SemiOrc" || pers.classe == "Nan")
							out.print("-2");
						else
							out.print("+0");
						
      out.write("\n");
      out.write("					</td>\n");
      out.write("					<td class=\"tg-fgy3\" id=\"caFinal\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"tg-fgy3\">Vida:</td>\n");
      out.write("					<td class=\"tg-0lax\" colspan=\"3\">\n");
      out.write("						<div syle=\"width:100%;\" class=\"progress\">\n");
      out.write("							<progress class=\"vida\" id=\"vida\" max=\"100\" value=\"1\" name=\"pv\"></progress>\n");
      out.write("							<input type=\"hidden\" name=\"pv\" value=\"\" id=\"vidaInsert\">\n");
      out.write("						</div>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td>Nom: <input type=\"text\" id=\"nom\" name=\"nom\"></td>\n");
      out.write("					<td class=\"tg-fgy3\">Maná:</td>\n");
      out.write("					<td class=\"tg-0lax\" colspan=\"3\">\n");
      out.write("						<div syle=\"width:100%;\" class=\"progress\">\n");
      out.write("							<progress class=\"mana\" id=\"mana\" max=\"80\" value=\"1\" name=\"pm\"></progress>\n");
      out.write("							<input type=\"hidden\" name=\"pm\" value=\"\" id=\"manaInsert\">\n");
      out.write("						</div>\n");
      out.write("					</td>\n");
      out.write("				</tr>\n");
      out.write("				<td><input type=\"submit\" name=\"submitRegistro\"\n");
      out.write("					value=\"Crear Carta ✅\" class=\"button-29\"></td>\n");
      out.write("				</tbody>\n");
      out.write("			</table>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("	</form>\n");
      out.write("	<script>\n");
      out.write("		var punts = [\n");
      out.write("	");
out.print(pers.punts[0]);
      out.write("\n");
      out.write("		,\n");
      out.write("	");
out.print(pers.punts[1]);
      out.write("\n");
      out.write("		,\n");
      out.write("	");
out.print(pers.punts[2]);
      out.write("\n");
      out.write("		,\n");
      out.write("	");
out.print(pers.punts[3]);
      out.write("\n");
      out.write("		,\n");
      out.write("	");
out.print(pers.punts[4]);
      out.write("\n");
      out.write("		,\n");
      out.write("	");
out.print(pers.punts[5]);
      out.write("\n");
      out.write("		];\n");
      out.write("\n");
      out.write("		function cambiaValores() {\n");
      out.write("			var inputNombre = document.getElementById(\"fuerzaPost\");\n");
      out.write("			inputNombre.value = finals.s1;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		var finals = {\n");
      out.write("			\"s1\" : null,\n");
      out.write("			\"s2\" : null,\n");
      out.write("			\"s3\" : null,\n");
      out.write("			\"s4\" : null,\n");
      out.write("			\"s5\" : null,\n");
      out.write("			\"s6\" : null\n");
      out.write("		};\n");
      out.write("\n");
      out.write("		//elements\n");
      out.write("		var select1 = document.getElementById(\"select1\");\n");
      out.write("		var select2 = document.getElementById(\"select2\");\n");
      out.write("		var select3 = document.getElementById(\"select3\");\n");
      out.write("		var select4 = document.getElementById(\"select4\");\n");
      out.write("		var select5 = document.getElementById(\"select5\");\n");
      out.write("		var select6 = document.getElementById(\"select6\");\n");
      out.write("\n");
      out.write("		//Elemento 1\n");
      out.write("		for (let i = 0, n = punts.length; i < n; i++) {\n");
      out.write("			var option = new Option(punts[i], punts[i]);\n");
      out.write("			select1.appendChild(option);\n");
      out.write("		}\n");
      out.write("		//Elemento 2\n");
      out.write("		for (let i = 0, n = punts.length; i < n; i++) {\n");
      out.write("			var option = new Option(punts[i], punts[i]);\n");
      out.write("			select2.appendChild(option);\n");
      out.write("		}\n");
      out.write("		//Elemento 3\n");
      out.write("		for (let i = 0, n = punts.length; i < n; i++) {\n");
      out.write("			var option = new Option(punts[i], punts[i]);\n");
      out.write("			select3.appendChild(option);\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//Elemento 4\n");
      out.write("		for (let i = 0, n = punts.length; i < n; i++) {\n");
      out.write("			var option = new Option(punts[i], punts[i]);\n");
      out.write("			select4.appendChild(option);\n");
      out.write("		}\n");
      out.write("		//Elemento 5\n");
      out.write("		for (let i = 0, n = punts.length; i < n; i++) {\n");
      out.write("			var option = new Option(punts[i], punts[i]);\n");
      out.write("			select5.appendChild(option);\n");
      out.write("		}\n");
      out.write("		//Elemento 6\n");
      out.write("		for (let i = 0, n = punts.length; i < n; i++) {\n");
      out.write("			var option = new Option(punts[i], punts[i]);\n");
      out.write("			select6.appendChild(option);\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//ONCHANGE\n");
      out.write("		//1\n");
      out.write("		select1.onchange = function() {\n");
      out.write("			var aux = punts[select1.selectedIndex];\n");
      out.write("			var index = punts.indexOf(aux);\n");
      out.write("\n");
      out.write("			if (finals[\"s1\"] != null) {\n");
      out.write("				console.log(finals[\"s1\"]);\n");
      out.write("				var auxo = punts.indexOf(finals[\"s1\"]);\n");
      out.write("\n");
      out.write("				select2.options[auxo].disabled = false;\n");
      out.write("				select3.options[auxo].disabled = false;\n");
      out.write("				select4.options[auxo].disabled = false;\n");
      out.write("				select5.options[auxo].disabled = false;\n");
      out.write("				select6.options[auxo].disabled = false;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			finals[\"s1\"] = aux;\n");
      out.write("			console.log(finals);\n");
      out.write("\n");
      out.write("			select2.options[index].disabled = true;\n");
      out.write("			select3.options[index].disabled = true;\n");
      out.write("			select4.options[index].disabled = true;\n");
      out.write("			select5.options[index].disabled = true;\n");
      out.write("			select6.options[index].disabled = true;\n");
      out.write("\n");
      out.write("			//valor final Update\n");
      out.write("			let mod = document.getElementById(\"f\").innerHTML;\n");
      out.write("			console.log(mod);\n");
      out.write("\n");
      out.write("			let result = eval(aux + mod);\n");
      out.write("\n");
      out.write("			let finalFuer = document.getElementById('fFinal').innerHTML = result;\n");
      out.write("		}\n");
      out.write("		//2\n");
      out.write("		select2.onchange = function() {\n");
      out.write("			var aux = punts[select2.selectedIndex];\n");
      out.write("			var index = punts.indexOf(aux);\n");
      out.write("\n");
      out.write("			if (finals[\"s2\"] != null) {\n");
      out.write("				console.log(finals[\"s2\"]);\n");
      out.write("				var auxo = punts.indexOf(finals[\"s2\"]);\n");
      out.write("\n");
      out.write("				select1.options[auxo].disabled = false;\n");
      out.write("				select3.options[auxo].disabled = false;\n");
      out.write("				select4.options[auxo].disabled = false;\n");
      out.write("				select5.options[auxo].disabled = false;\n");
      out.write("				select6.options[auxo].disabled = false;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			finals[\"s2\"] = aux;\n");
      out.write("			console.log(finals);\n");
      out.write("\n");
      out.write("			select1.options[index].disabled = true;\n");
      out.write("			select3.options[index].disabled = true;\n");
      out.write("			select4.options[index].disabled = true;\n");
      out.write("			select5.options[index].disabled = true;\n");
      out.write("			select6.options[index].disabled = true;\n");
      out.write("\n");
      out.write("			//valor final Update\n");
      out.write("			let mod = document.getElementById(\"h\").innerHTML;\n");
      out.write("			console.log(mod);\n");
      out.write("\n");
      out.write("			let result = eval(aux + mod);\n");
      out.write("\n");
      out.write("			let finalFuer = document.getElementById('hFinal').innerHTML = result;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//3\n");
      out.write("		select3.onchange = function() {\n");
      out.write("			var aux = punts[select3.selectedIndex];\n");
      out.write("			var index = punts.indexOf(aux);\n");
      out.write("\n");
      out.write("			if (finals[\"s3\"] != null) {\n");
      out.write("				console.log(finals[\"s3\"]);\n");
      out.write("				var auxo = punts.indexOf(finals[\"s3\"]);\n");
      out.write("\n");
      out.write("				select1.options[auxo].disabled = false;\n");
      out.write("				select2.options[auxo].disabled = false;\n");
      out.write("				select4.options[auxo].disabled = false;\n");
      out.write("				select5.options[auxo].disabled = false;\n");
      out.write("				select6.options[auxo].disabled = false;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			finals[\"s3\"] = aux;\n");
      out.write("			console.log(finals);\n");
      out.write("\n");
      out.write("			select1.options[index].disabled = true;\n");
      out.write("			select2.options[index].disabled = true;\n");
      out.write("			select4.options[index].disabled = true;\n");
      out.write("			select5.options[index].disabled = true;\n");
      out.write("			select6.options[index].disabled = true;\n");
      out.write("\n");
      out.write("			//valor final Update\n");
      out.write("			let mod = document.getElementById(\"c\").innerHTML;\n");
      out.write("			console.log(mod);\n");
      out.write("\n");
      out.write("			let result = eval(aux + mod);\n");
      out.write("\n");
      out.write("			let finalFuer = document.getElementById('cFinal').innerHTML = result;\n");
      out.write("			\n");
      out.write("			//vida\n");
      out.write("			var vida =\n");
      out.write("	");
out.print(pers.tirarDaus(1, 8));
      out.write("\n");
      out.write("		* finals[\"s3\"];\n");
      out.write("			let vidafinal = document.getElementById('vida').value = vida;\n");
      out.write("			let vidaPer = document.getElementById('vidaInsert').value = vida;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//4\n");
      out.write("		select4.onchange = function() {\n");
      out.write("			var aux = punts[select4.selectedIndex];\n");
      out.write("			var index = punts.indexOf(aux);\n");
      out.write("\n");
      out.write("			if (finals[\"s4\"] != null) {\n");
      out.write("				console.log(finals[\"s4\"]);\n");
      out.write("				var auxo = punts.indexOf(finals[\"s4\"]);\n");
      out.write("\n");
      out.write("				select1.options[auxo].disabled = false;\n");
      out.write("				select2.options[auxo].disabled = false;\n");
      out.write("				select3.options[auxo].disabled = false;\n");
      out.write("				select5.options[auxo].disabled = false;\n");
      out.write("				select6.options[auxo].disabled = false;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			finals[\"s4\"] = aux;\n");
      out.write("			console.log(finals);\n");
      out.write("\n");
      out.write("			select1.options[index].disabled = true;\n");
      out.write("			select2.options[index].disabled = true;\n");
      out.write("			select3.options[index].disabled = true;\n");
      out.write("			select5.options[index].disabled = true;\n");
      out.write("			select6.options[index].disabled = true;\n");
      out.write("\n");
      out.write("			//valor final Update\n");
      out.write("			let mod = document.getElementById(\"i\").innerHTML;\n");
      out.write("			console.log(mod);\n");
      out.write("\n");
      out.write("			let result = eval(aux + mod);\n");
      out.write("\n");
      out.write("			let finalFuer = document.getElementById('iFinal').innerHTML = result;\n");
      out.write("\n");
      out.write("			//mana\n");
      out.write("			if (finals[\"s5\"] != null) {\n");
      out.write("				var mana = Math.floor((finals[\"s4\"] + finals[\"s5\"]) / 2)\n");
      out.write("						*\n");
      out.write("	");
out.print(pers.tirarDaus(1, 4));
      out.write("\n");
      out.write("		;\n");
      out.write("				console.log(mana);\n");
      out.write("				let manafinal = document.getElementById('mana').value = mana;\n");
      out.write("				let manadb = document.getElementById('manaInsert').value = mana;\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//5\n");
      out.write("		select5.onchange = function() {\n");
      out.write("			var aux = punts[select5.selectedIndex];\n");
      out.write("			var index = punts.indexOf(aux);\n");
      out.write("\n");
      out.write("			if (finals[\"s5\"] != null) {\n");
      out.write("				console.log(finals[\"s5\"]);\n");
      out.write("				var auxo = punts.indexOf(finals[\"s5\"]);\n");
      out.write("\n");
      out.write("				select1.options[auxo].disabled = false;\n");
      out.write("				select2.options[auxo].disabled = false;\n");
      out.write("				select3.options[auxo].disabled = false;\n");
      out.write("				select4.options[auxo].disabled = false;\n");
      out.write("				select6.options[auxo].disabled = false;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			finals[\"s5\"] = aux;\n");
      out.write("			console.log(finals);\n");
      out.write("\n");
      out.write("			select1.options[index].disabled = true;\n");
      out.write("			select2.options[index].disabled = true;\n");
      out.write("			select3.options[index].disabled = true;\n");
      out.write("			select4.options[index].disabled = true;\n");
      out.write("			select6.options[index].disabled = true;\n");
      out.write("\n");
      out.write("			//valor final Update\n");
      out.write("			let mod = document.getElementById(\"s\").innerHTML;\n");
      out.write("			console.log(mod);\n");
      out.write("\n");
      out.write("			let result = eval(aux + mod);\n");
      out.write("\n");
      out.write("			let finalFuer = document.getElementById('sFinal').innerHTML = result;\n");
      out.write("\n");
      out.write("			//mana\n");
      out.write("			if (finals[\"s4\"] != null) {\n");
      out.write("				var mana = Math.floor((finals[\"s4\"] + finals[\"s5\"]) / 2)\n");
      out.write("						*\n");
      out.write("	");
out.print(pers.tirarDaus(1, 4));
      out.write("\n");
      out.write("		;\n");
      out.write("				console.log(mana);\n");
      out.write("				let manafinal = document.getElementById('mana').value = mana;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		//6\n");
      out.write("		select6.onchange = function() {\n");
      out.write("			var aux = punts[select6.selectedIndex];\n");
      out.write("			var index = punts.indexOf(aux);\n");
      out.write("\n");
      out.write("			if (finals[\"s6\"] != null) {\n");
      out.write("				console.log(finals[\"s6\"]);\n");
      out.write("				var auxo = punts.indexOf(finals[\"s6\"]);\n");
      out.write("\n");
      out.write("				select1.options[auxo].disabled = false;\n");
      out.write("				select2.options[auxo].disabled = false;\n");
      out.write("				select3.options[auxo].disabled = false;\n");
      out.write("				select5.options[auxo].disabled = false;\n");
      out.write("				select4.options[auxo].disabled = false;\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			finals[\"s6\"] = aux;\n");
      out.write("			console.log(finals);\n");
      out.write("\n");
      out.write("			select1.options[index].disabled = true;\n");
      out.write("			select2.options[index].disabled = true;\n");
      out.write("			select3.options[index].disabled = true;\n");
      out.write("			select4.options[index].disabled = true;\n");
      out.write("			select5.options[index].disabled = true;\n");
      out.write("\n");
      out.write("			//valor final Update\n");
      out.write("			let mod = document.getElementById(\"ca\").innerHTML;\n");
      out.write("			console.log(mod);\n");
      out.write("\n");
      out.write("			let result = eval(aux + mod);\n");
      out.write("\n");
      out.write("			let finalFuer = document.getElementById('caFinal').innerHTML = result;\n");
      out.write("\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
