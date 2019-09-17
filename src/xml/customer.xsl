<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
        <head>
        <title>customer.xsl</title>
        </head>
      <body>
      <h2><u>Customer</u></h2>
      <table border="1">
         <tr style="font-weight:bold; background-color:#AED6F1">
            <th> cust_nic</th>
            <th>cust_fname</th>
            <th>cust_lname</th>
            <th>cust_address</th>
            <th>cust_dob</th>
         </tr>
         
         <xsl:for-each select="pharmacy/customer">
         <tr  style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
            <td>
               <xsl:value-of select="cust_nic"/>
            </td>
            <td>
               <xsl:value-of select="cust_fname"/>
            </td>
            <td>
                <xsl:value-of select="cust_lname"/>
            </td>
            <td>
               <xsl:value-of select="cust_address"/>
            </td>
            <td>
               <xsl:value-of select="cust_dob"/>
            </td>
         </tr>
         </xsl:for-each>
      </table>
   </body>
        </html>
    </xsl:template>

</xsl:stylesheet>