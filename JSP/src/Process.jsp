<%
int p = Integer.parseInt(request.getParameter("principle"));
float r = Integer.parseInt(request.getParameter("rate"));
float time = Integer.parseInt(request.getParameter("time"));
 int SI = (p*t*r/100);
out.println("Simple Interest = " + SI);
%>