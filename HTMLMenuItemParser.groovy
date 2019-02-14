// POC to see whetner HTML tagged Jira Drop Down menu can be parsed
// Normally noe would have vlaues like 1,2,3 etc
// Now there can be string like:
// <span class="amb-tooltip" style="display:inline-block;padding:.25rem .5rem;" title="Cat - the fuzzy feline">1</span><script>AJS.$("#customfield_14548-val .amb-tooltip").tooltip({gravity: 's'});</script>
// where customfield_id is looked from Jira custom field config screen
// This POC fetches the drop down list value and returns it to Strinc Scripted Field
//Author: mika.nokka1@gmail.com 14.2.2019
//

import com.onresolve.scriptrunner.runner.util.UserMessageUtil
import org.apache.log4j.Logger
import org.apache.log4j.Level

// set logging to Jira log
def log = Logger.getLogger("HTMLParser") // change for customer system
log.setLevel(Level.DEBUG) // was DEBUG

def RiskScore = getCustomFieldValue("Risk Number") 


log.debug ("Read RiskScore value as:${RiskScore} ")
StringedScore=RiskScore.toString()
log.debug ("RiskSCore as .toStringed:${StringedScore}")
// apparentrly scripted field will get the full HTML content (works same way as with DropDownLists  
    
return (RiskScore.toString())

           

