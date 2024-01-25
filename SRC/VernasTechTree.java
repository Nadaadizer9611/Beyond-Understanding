package BV.content;
import mindustry.content.*;
import mindustry.game.Objectives.*;

import static arc.struct.Seq.*;
import static mindustry.content.TechTree.*;
import static bv.content.BVBlocks.*;
import static bv.content.BVItems.*;
import static bv.content.BVLiquids.*;
import static bv.content.BVSectorPresets.*;
import static bv.content.BVUnitTypes.*;
import static bv.content.blocks.BVForce.*;
import static bv.content.blocks.BVVibration.*;



public class BVTechTree {
  public static TechNode root;

  
  public static void load() {
    root = nodeRoot("Vernas", exploration-core, () -> {
      // region items

      nodeProduce(aluminum, () -> {
        nodeProduce(steam, () -> nodeProduce(fungi, () -> {}));
        nodeProduce(lithium, () -> nodeProduce(platinum, () -> nodeProduce(cobalt, () -> {})));
        nodeProduce(cooper, () -> nodeProduce(titanium, () -> {}));
      });
      // endregion

      
    });

    BVPlanets.mangle.techTree = root;

  }

}
