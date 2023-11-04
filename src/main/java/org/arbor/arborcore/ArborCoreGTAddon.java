package org.arbor.arborcore;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import org.arbor.arborcore.worldgen.ATagPrefix;

@GTAddon
public class ArborCoreGTAddon implements IGTAddon {
    @Override
    public void initializeAddon() {
        ArborCore.LOGGER.info("ArborCore ArborCoreGTAddon Loaded!");
    }

    @Override
    public String addonModId() {
        return ArborCore.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        IGTAddon.super.registerTagPrefixes();
        ATagPrefix.init();
    }
}