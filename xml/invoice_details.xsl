<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>invoice_details.xsl</title>
            </head>
        <body>
         <h2><u>Invoice_Details</u></h2>
            <table  border = "1" >
               <tr   style="font-weight:bold; background-color:#AED6F1">
                  <th>invoice_id</th>
                  <th>total_qty</th>
                  <th>total_invoice</th>
               </tr>

               <xsl:for-each select ="pharmacy/invoice_details">
                  <tr style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
                     <td> 
                        <xsl:value-of select ="invoice_id"/>
                     </td>
                     <td>
                        <xsl:value-of select ="total_qty"/>
                     </td>
                     <td>
                        <xsl:value-of select ="total_invoice"/>
                     </td>
                  </tr>
               </xsl:for-each>
            </table>
         </body>
      </html>
   </xsl:template>

</xsl:stylesheet>
