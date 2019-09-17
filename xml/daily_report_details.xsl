<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
        <head>
        <title>daily_report_details.xsl</title>
        </head>
        <body>
            <h2> <u>Daily Report Details</u></h2>
              <table border="1">
                <tr style="font-weight:bold; background-color:#AED6F1">
                    <th>report_id</th>
                    <th>total_income</th>
                    <th>total_outcome</th>
                </tr>       
                <xsl:for-each select="pharmacy/daily_report_details">
                <tr style="font-family:Arial;font-size:12pt;background-color:#DAF7A6">
                    <td><xsl:value-of select="report_id"/></td>
                    <td><xsl:value-of select="total_income"/></td>
                    <td><xsl:value-of select="total_outcome"/></td>
                </tr>
                </xsl:for-each>
              </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>

  

   
  