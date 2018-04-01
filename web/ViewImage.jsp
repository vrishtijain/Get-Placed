<%@page import="java.sql.*,java.io.*"%>
<%
try{
    InputStream sImage;
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("SELECT images FROM image");
      if(rs.last()) {
      byte[] bytearray = new byte[1048576];
      int size=0;
      sImage = rs.getBinaryStream(1);
      response.reset();
      response.setContentType("image/jpeg");
      while((size=sImage.read(bytearray))!= -1 ){
      response.getOutputStream().write(bytearray,0,size);
   }
}
 con.close();
}     
catch(Exception ex){
out.println("error :"+ex);
}
%>