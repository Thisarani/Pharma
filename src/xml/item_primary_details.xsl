<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>item_primary_details.xsl</title>
            </head>
            <body>  
            <h2><u>Item_primary_details</u></h2>
            <table  border = "1" >
               <tr  style="font-weight:bold; background-color:#AED6F1">
                  <th>item_name</th>
                  <th>exp_date</th>
                  <th>price</th>
                  <th>discount</th>
                  <th>available_qty</th>
               </tr>

               <xsl:for-each select ="pharmacy/item_primary_details">
                  <tr style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
                     <td> 
                        <xsl:value-of select ="item_name"/>
                     </td>
                     <td>
                        <xsl:value-of select ="exp_date"/>
                     </td>
                     <td>
                        <xsl:value-of select ="price"/>
                     </td>
                     <td>
                        <xsl:value-of select ="discount"/>
                     </td>
                     <td>
                        <xsl:value-of select ="available_qty"/>
                     </td>
                  </tr>
               </xsl:for-each>
            </table>     
         </body>
      </html>
   </xsl:template>

</xsl:stylesheet>
