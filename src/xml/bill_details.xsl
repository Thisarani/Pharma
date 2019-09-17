<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
        <head>
        <title>bill_details.xsl</title>
        </head>
        <body>
          <h2><u>Bill_Details</u></h2>
            <table  border = "1" >
               <tr   style="font-weight:bold; background-color:#AED6F1">
                  <th>bill_id</th>
                  <th>tot_amount</th>
                  <th>tot_qty</th>
                  <th>tot_discount</th>
                  <th>bill_date</th>
               </tr>

               <xsl:for-each select ="pharmacy/bill_details">
                  <tr style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
                     <td> 
                        <xsl:value-of select ="bill_id"/>
                     </td>
                     <td>
                        <xsl:value-of select ="tot_amount"/>
                     </td>
                     <td>
                        <xsl:value-of select ="tot_qty"/>
                     </td>
                     <td>
                        <xsl:value-of select ="tot_discount"/>
                     </td>
                     <td>
                        <xsl:value-of select ="bill_date"/>
                     </td>
                  </tr>
               </xsl:for-each>
            </table>
         </body>
      </html>
   </xsl:template>

</xsl:stylesheet>
