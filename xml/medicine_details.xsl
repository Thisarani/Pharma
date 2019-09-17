<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>medicine_details.xsl</title>
            </head>
          <body>
            <h2><u>Medicine Details</u></h2>
            <table  border = "1" >
               <tr   style="font-weight:bold; background-color:#AED6F1">
                  <th>item_name_fk</th>
                  <th>exp_date</th>
                  <th>available_qty</th>
                  <th>price</th>
                  <th>discount</th>
               </tr>

               <xsl:for-each select ="pharmacy/medicine_details">
                  <tr style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
                     <td> 
                        <xsl:value-of select ="item_name_fk"/>
                     </td>
                     <td>
                        <xsl:value-of select ="exp_date"/>
                     </td>
                     <td>
                        <xsl:value-of select ="available_qty"/>
                     </td>
                     <td>
                        <xsl:value-of select ="price"/>
                     </td>
                     <td>
                        <xsl:value-of select ="discount"/>
                     </td>
                  </tr>
               </xsl:for-each>
            </table>     
         </body>
      </html>
   </xsl:template>

</xsl:stylesheet>
