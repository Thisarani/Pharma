<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>supplier_details.xsl</title>
            </head>
            <body>
             <h2>
                <u>Supplier Details</u>
             </h2>
                <table border="1">
                   <tr style="font-weight:bold; background-color:#AED6F1">
                      <th>sup_id</th>
                      <th>sup_fname</th>
                      <th>sup_lname</th>
                      <th>sup_address</th>
                   </tr>
                   
                   <xsl:for-each select="pharmacy/supplier_details">
                   <tr  style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
                      <td>
                         <xsl:value-of select="sup_id"/>
                      </td>
                      <td>
                         <xsl:value-of select="sup_fname"/>
                      </td>
                      <td>
                          <xsl:value-of select="sup_lname"/>
                      </td>
                      <td>
                         <xsl:value-of select="sup_address"/>
                      </td>
                   </tr>
                   </xsl:for-each>
                </table>
         </body>
      </html>
   </xsl:template>

</xsl:stylesheet>
