package org.processmining.plugins.workshop.prominent;

import org.processmining.contexts.uitopia.annotations.UITopiaVariant;
import org.processmining.framework.plugin.PluginContext;
import org.processmining.framework.plugin.annotations.Plugin;

        
public class ProMinent {
	
	@Plugin(
            name = "ProMinent", 
            parameterLabels = {}, 
            returnLabels = { "ProMinent successful!" }, 
            returnTypes = { String.class }, 
            userAccessible = true, 
            help = "Produces the string: 'ProMinent successful!'"
    )
    @UITopiaVariant(
            affiliation = "RWTH Aachen University", 
            author = "Sanchit Alekh", 
            email = "sanchit.alekh@rwth-aachen.de"
    )
    public static String helloWorld(PluginContext context) {
            return "ProMinent Successful!";
    }


}
