package latmod.core.mod;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class LCConfig extends LMConfig
{
	public General general;
	
	public LCConfig(FMLPreInitializationEvent e)
	{
		super(e, "/LatMod/LatCoreMC.cfg");
		
		add(general = new General());
	}
	
	public class General extends Category
	{
		public boolean addOreNames;
		public boolean addRegistryNames;
		public boolean checkTeamLatMod;
		public boolean checkUpdates;
		public boolean notifyUpdates;
		public boolean notifyTeamLatMod;
		
		public General()
		{
			super("general");
			
			addOreNames = getBool("addOreNames", true);
			addRegistryNames = getBool("addRegistryNames", true);
			checkTeamLatMod = getBool("checkTeamLatMod", true);
			checkUpdates = getBool("checkUpdates", true);
			notifyUpdates = getBool("notifyUpdates", true);
			notifyTeamLatMod = getBool("notifyTeamLatMod", true);
		}
	}
}