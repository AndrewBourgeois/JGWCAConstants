package be.demmel.fun.jgwcaconstants;

import be.demmel.fun.jgwcaconstants.bll.Attribute;
import be.demmel.fun.jgwcaconstants.bll.BagLocation;
import be.demmel.fun.jgwcaconstants.bll.Dye;
import be.demmel.fun.jgwcaconstants.bll.GWCAConnection;
import be.demmel.fun.jgwcaconstants.bll.GWCAOperations;
import be.demmel.fun.jgwcaconstants.bll.GWCAPacket;
import be.demmel.fun.jgwcaconstants.bll.HeroSlot;
import be.demmel.fun.jgwcaconstants.bll.NamedPipeGWCAConnection;
import be.demmel.fun.jgwcaconstants.bll.GWCAOperation;
import be.demmel.fun.jgwcaconstants.bll.Hero;
import be.demmel.fun.jgwcaconstants.bll.HeroMode;
import be.demmel.fun.jgwcaconstants.bll.Profession;
import be.demmel.fun.jgwcaconstants.bll.Rarity;
import be.demmel.fun.jgwcaconstants.bll.Region;
import be.demmel.fun.jgwcaconstants.bll.SkillBarSkillSlot;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTestingAllFunctions {

    private static final Logger LOG = LoggerFactory.getLogger(MainTestingAllFunctions.class);

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Startup");

        GWCAConnection gwcaConnection = null;
        try {
            LOG.info("The \"Java GWCAConstants\" (version {}) is starting", Version.getVersion());
            addShutdownHook();

            // Fill in the PID here
            //TODO: other ways to find the PID (in a Swing GUI every process with Guild Wars in its name could be listed)
            gwcaConnection = new NamedPipeGWCAConnection(new File("\\\\.\\pipe\\GWCA_" + 6500));
            gwcaConnection.open();

            GWCAOperations op = new GWCAOperations(gwcaConnection);
            // all operations below this point have been tested by comparing their actions (or return values) to the AutoIt GWCA commander's ones
            //LOG.debug("getCurrentTarget(): {}", op.getCurrentTarget());
            //LOG.debug("getMyId(): {}", op.getMyId());
            //LOG.debug("isCasting(): {}", op.isCasting());
            //LOG.debug("getSkillRecharge(): {}", op.getSkillRecharge(SkillBarSkillSlot.ONE));
            //LOG.debug("getSkillAdrenaline(): {}", op.getSkillAdrenaline(SkillBarSkillSlot.ONE));
            //LOG.debug("getAgentAndTargetPointer(): {{},{}}", op.getAgentAndTargetPointer()[0], op.getAgentAndTargetPointer()[1]);
            //LOG.debug("getSkillbarSkillId(): {}", op.getSkillbarSkillId(SkillBarSkillSlot.ONE));
            //LOG.debug("getMyMaxHp(): {{},{}}", op.getMyMaxHp()[0], op.getMyMaxHp()[1]);
            //LOG.debug("getMyMaxEnergy(): {{},{}}", op.getMyMaxEnergy()[0], op.getMyMaxEnergy()[1]);
            //LOG.debug("getBuildNumber(): {}", op.getBuildNumber());
            //op.setMaxZoom(5000);
            //LOG.debug("getLastDialogId(): {}", op.getLastDialogId());
            //op.setEngineHook(false);
            //TODO: test: LOG.debug("isHeroCasting(): {}", op.isHeroCasting(HeroSlot.ONE));
            //TODO: test: LOG.debug("getHeroSkillRecharge(): {}", op.getHeroSkillRecharge(HeroSlot.ONE, SkillSlot.ONE));
            //TODO: test: LOG.debug("getHeroSkillAdrenaline(): {}", op.getHeroSkillAdrenaline(HeroSlot.ONE, SkillSlot.ONE));
            //TODO: test: LOG.debug("getHeroSkillId(): {}", op.getHeroSkillId(HeroSlot.ONE, SkillSlot.ONE));
            //TODO: test: LOG.debug("getHeroAgentId(): {}", op.getHeroAgentId(HeroSlot.ONE, SkillSlot.ONE));
            //LOG.debug("getMapLoading(): {}", op.getMapLoading());
            //LOG.debug("getMapId(): {}", op.getMapId());
            //LOG.debug("getPing(): {}", op.getPing());
            //LOG.debug("isLoggedIn(): {}", op.isLoggedIn());
            //LOG.debug("isDead(): {}", op.isDead());
            //LOG.debug("getBalthazarFaction(): {}", op.getBalthazarFaction());
            //LOG.debug("getKurzickFaction(): {}", op.getKurzickFaction());
            //LOG.debug("getLuxonFaction(): {}", op.getLuxonFaction());
            //LOG.debug("getTitleTreasure(): {}", op.getTitleTreasure());
            //LOG.debug("getTitleLucky(): {}", op.getTitleLucky());
            //LOG.debug("getTitleUnlucky(): {}", op.getTitleUnlucky());
            //LOG.debug("getTitleGamer(): {}", op.getTitleGamer());
            //LOG.debug("getExperience(): {}", op.getExperience());
            //LOG.debug("getConnection(): {}", op.getConnection());
            //LOG.debug("getMatchStatus(): {}", op.getMatchStatus());
            //LOG.debug("getTitleSunspear(): {}", op.getTitleSunspear());
            //LOG.debug("getTitleLightbringer(): {}", op.getTitleLightbringer());
            //LOG.debug("getTitleVanguard(): {}", op.getTitleVanguard());
            //LOG.debug("getTitleAsura(): {}", op.getTitleAsura());
            //LOG.debug("getTitleNorn(): {}", op.getTitleNorn());
            //LOG.debug("getTitleDeldrimor(): {}", op.getTitleDeldrimor());
            //LOG.debug("getTitleNorthMastery(): {}", op.getTitleNorthMastery());
            //LOG.debug("getTitleDrunkard(): {}", op.getTitleDrunkard());
            //LOG.debug("getTitleSweet(): {}", op.getTitleSweet());
            //LOG.debug("getTitleParty(): {}", op.getTitleParty());
            //LOG.debug("getTitleCommander(): {}", op.getTitleCommander());
            //LOG.debug("getEquipmentModelId(): {{},{}}", op.getEquipmentModelId(-2, 4)[0], op.getEquipmentModelId(-2, 4)[1]);
            //LOG.debug("getEquipmentDyeInfo(): {{},{}}", op.getEquipmentDyeInfo(-2, 5)[0], op.getEquipmentDyeInfo(-2, 5)[1]);
            //LOG.debug("getEffectCount(): {}", op.getEffectCount());
            //LOG.debug("getEffect(): {}", op.getEffect(5));
            //LOG.debug("getEffectByIndex(): {}", op.getEffectByIndex(5));
            //LOG.debug("getEffectDuration(): {{},{}}", op.getEffectDuration(5)[0], op.getEffectDuration(5)[1]);
            //LOG.debug("getAgentExists(): {}", op.getAgentExists(135));
            //LOG.debug("getProfessions(): {{},{}}", op.getProfessions(390)[0], op.getProfessions(390)[1]);
            //LOG.debug("getPlayerNumber(): {}", op.getPlayerNumber(390));
            //LOG.debug("getHp(): {}", op.getHp(390));
            //LOG.debug("getRotation(): {}", op.getRotation(390));
            //LOG.debug("getSkill(): {}", op.getSkill(31));
            //LOG.debug("getCoords(): {{},{}}", op.getCoords(31)[0], op.getCoords(31)[1]);
            //LOG.debug("getWeaponSpeeds(): {{},{}}", op.getWeaponSpeeds(31)[0], op.getWeaponSpeeds(31)[1]);
            //LOG.debug("getTeamId(): {}", op.getTeamId(31));
            //LOG.debug("getHpPips(): {}", op.getHpPips(31));
            //LOG.debug("getHex(): {}", op.getHex(31));
            //LOG.debug("getModelAnimation(): {}", op.getModelAnimation(31));
            //LOG.debug("getType(): {}", op.getType(31));
            //LOG.debug("getLevel(): {}", op.getLevel(31));
            //LOG.debug("getMaxId(): {}", op.getMaxId());
            //LOG.debug("getMyNearestAgent(): {}", op.getMyNearestAgent());
            //LOG.debug("getMyDistanceToAgent(): {}", op.getMyDistanceToAgent(34));
            //LOG.debug("getNearestAgentToAgent(): {}", op.getNearestAgentToAgent(151));
            //LOG.debug("getDistanceFromAgentToAgent(): {}", op.getDistanceFromAgentToAgent(151, 44));
            //LOG.debug("getNearestAgentToAgentEx(): {{},{}}", op.getNearestAgentToAgentEx(151)[0], op.getNearestAgentToAgentEx(151)[1]);
            //LOG.debug("isAttacking(): {}", op.isAttacking(31));
            //TODO: test: LOG.debug("isKnockedDown(): {}", op.isKnockedDown(31));
            //LOG.debug("isMoving(): {}", op.isMoving(31));
            //LOG.debug("isDead(): {}", op.isDead(31));
            //LOG.debug("getFirstAgentByPlayerNumber(): {}", op.getFirstAgentByPlayerNumber(1));
            //LOG.debug("getAllegiance(): {}", op.getAllegiance(31));
            //LOG.debug("getNearestEnemyToAgentEx(): {{},{}}", op.getNearestEnemyToAgentEx(31)[0], op.getNearestEnemyToAgentEx(31)[1]);
            //LOG.debug("getNearestItemToAgentEx(): {{},{}}", op.getNearestItemToAgentEx(31)[0], op.getNearestItemToAgentEx(31)[1]);
            //LOG.debug("getNearestAgentByPlayerNumber(): {}", op.getNearestAgentByPlayerNumber(1));
            //LOG.debug("getSpeed(): {}", op.getSpeed(31));
            //LOG.debug("getNearestEnemyToAgentByAllegiance(): {{},{}}", op.getNearestEnemyToAgentByAllegiance(31)[0], op.getNearestEnemyToAgentByAllegiance(31)[1]);
            //LOG.debug("getNearestAliveEnemyToAgent(): {{},{}}", op.getNearestAliveEnemyToAgent(31)[0], op.getNearestAliveEnemyToAgent(31)[1]);
            //LOG.debug("getWeaponType(): {}", op.getWeaponType(31));
            //LOG.debug("getNearestSignpostToAgent(): {}", op.getNearestSignpostToAgent(31));
            //LOG.debug("getNearestNpcToAgentByAllegiance(): {}", op.getNearestNpcToAgentByAllegiance(31));
            //LOG.debug("getNearestAgentToCoords(): {}", op.getNearestAgentToCoords(5167f, 1216f));
            //LOG.debug("getNearestNpcToCoords(): {}", op.getNearestNpcToCoords(5167f, 1216f));
            //LOG.debug("getLoginNumber(): {}", op.getLoginNumber(31));
            //LOG.debug("getNumberOfAgentsByPlayerNumber(): {}", op.getNumberOfAgentsByPlayerNumber(1));
            //LOG.debug("getNumberOfAliveEnemyAgents(): {}", op.getNumberOfAliveEnemyAgents());
            //LOG.debug("getNextItem(): {}", op.getNextItem(0));
            //LOG.debug("getTarget(): {}", op.getTarget(31));
            //op.setAttribute(Attribute.TACTICS, 2);
            //BROKEN (also in AutoIt) op.resetAttributes();
            //BROKEN (also in AutoIt) LOG.debug("playerHasBuff(): {}", op.playerHasBuff(31));
            //TODO: test: LOG.debug("hero1HasBuff(): {}", op.hero1HasBuff(34));
            //TODO: test: LOG.debug("hero2HasBuff(): {}", op.hero2HasBuff(34));
            //TODO: test: LOG.debug("hero3HasBuff(): {}", op.hero3HasBuff(34));
            //LOG.debug("getAgentDanger(): {}", op.getAgentDanger(31));
            //LOG.debug("getTypeMap(): {}", op.getTypeMap(31));
            //LOG.debug("getAgentWeapons(): {{},{}}", op.getAgentWeapons(31)[0], op.getAgentWeapons(31)[1]);
            //LOG.debug("getNextAgent(): {}", op.getNextAgent(31));
            //LOG.debug("getNextAlly(): {}", op.getNextAlly(479));
            //LOG.debug("getNextFoe(): {}", op.getNextFoe(31));
            //LOG.debug("getExtraType(): {}", op.getExtraType(7));
            //op.prepareNearestPlayerNumberToCoords(1);
            //LOG.debug("getNearestPlayerNumberToCoords(): {}", op.getNearestPlayerNumberToCoords(5811f, 3397f));
            //TODO: test: LOG.debug("getFirstAgentByPlayerNumberByTeam(): {}", op.getFirstAgentByPlayerNumberByTeam(34, 1));
            //LOG.debug("getNearestAliveEnemyToCoords(): {{},{}}", op.getNearestAliveEnemyToCoords(5236f,-4234f)[0], op.getNearestAliveEnemyToCoords(5236f,-4234f)[1]);
            //BROKEN? op.prepareNearestPlayerNumberToCoordsByPlayerNumber(1);
            //BROKEN? LOG.debug("getNearestAliveEnemyToCoordsByPlayerNumber(): {{},{}}", op.getNearestAliveEnemyToCoordsByPlayerNumber(6435f,4263f)[0], op.getNearestAliveEnemyToCoordsByPlayerNumber(6435f,4263f)[1]);
            //BROKEN? LOG.debug("getNearestAliveEnemyToCoordsByPlayerNumber(): {{},{}}", op.getNearestAliveEnemyToCoordsByPlayerNumber(35,1f,1f)[0], op.getNearestAliveEnemyToCoordsByPlayerNumber(35,1f,1f)[1]);
            //LOG.debug("getNextAliveFoe(): {}", op.getNextAliveFoe(31));
            //LOG.debug("getNearestAliveAgentByPlayerNumber(): {{},{}}", op.getNearestAliveAgentByPlayerNumber(1)[0], op.getNearestAliveAgentByPlayerNumber(1)[1]);
            //LOG.debug("getGold(): {{},{}}", op.getGold()[0], op.getGold()[1]);
            //LOG.debug("getBagSize(): {{},{}}", op.getBagSize(BagLocation.BACKPACK)[0], op.getBagSize(BagLocation.BACKPACK)[1]);
            //op.setBag(BagLocation.BACKPACK);
            //LOG.debug("getItemId(): {{},{}}", op.getItemId(1)[0], op.getItemId(1)[1]);
            //LOG.debug("getIdKit(): {}", op.getIdKit());
            //op.identifyItem(BagLocation.BACKPACK, 1);
            //op.identifyItemById(4124);
            //TODO: test: op.depositGold(5);
            //TODO: test: op.withdrawGold(5);
            //op.sellItem(BagLocation.BACKPACK, 1);
            //op.sellItemById(5474);
            //op.buyIdKit();
            //op.buySuperiorIdKit();
            //LOG.debug("getItemInfo(): {{},{}}", op.getItemInfo(1, BagLocation.BACKPACK)[0], op.getItemInfo(1, BagLocation.BACKPACK)[1]);
            //LOG.debug("getItemInfo(): {{},{}}", op.getItemInfo(1)[0], op.getItemInfo(1)[1]);
            //TODO: test: op.useItem(BagLocation.BACKPACK, 2);
            //TODO: test: op.useItemById(20);
            //op.dropItem(BagLocation.BACKPACK, 1);
            //BROKEN? Disconnects me. op.dropItemById(494);
            //op.acceptAllItems();
            //LOG.debug("findItemByModelId(): {}", op.findItemByModelId(178));
            //LOG.debug("findEmptySlot(): {{},{}}", op.findEmptySlot(BagLocation.BACKPACK)[0], op.findEmptySlot(BagLocation.BACKPACK)[1]);
            //TODO: test: LOG.debug("findGoldItem(): {{},{}}", op.findGoldItem(BagLocation.BACKPACK)[0], op.findGoldItem(BagLocation.BACKPACK)[1]);
            //TODO: test: LOG.debug("findGoldItem(): {{},{}}", op.findGoldItem()[0], op.findGoldItem()[1]);
            //LOG.debug("getItemPositionByItemId(): {{},{}}", op.getItemPositionByItemId(3644)[0], op.getItemPositionByItemId(3644)[1]);
            //LOG.debug("getItemPositionByModelId(): {{},{}}", op.getItemPositionByModelId(609)[0], op.getItemPositionByModelId(609)[1]);
            //LOG.debug("getItemPositionByRarity(): {{},{}}", op.getItemPositionByRarity(Rarity.BLUE)[0], op.getItemPositionByRarity(Rarity.BLUE)[1]);
            //LOG.debug("getItemModelIdById(): {}", op.getItemModelIdById(3644));
            //LOG.debug("getItemInfoById(): {{},{}}", op.getItemInfoById(3644)[0], op.getItemInfoById(3644)[1]);
            //op.equipItem(BagLocation.BACKPACK, 20);
            //op.equipItemById(1841);
            // BROKEN (also using AutoIt): LOG.debug("getSalvageKit(): {}", op.getSalvageKit());
            //op.buyItem(4, 40);
            //LOG.debug("getItemIdByAgent(): {{},{}}", op.getItemIdByAgent(13)[0], op.getItemIdByAgent(13)[1]);
            //LOG.debug("getItemInfoByAgent(): {{},{}}", op.getItemInfoByAgent(13)[0], op.getItemInfoByAgent(13)[1]);
            //LOG.debug("getNearestItemByModelId(): {{},{}}", op.getNearestItemByModelId(424)[0], op.getNearestItemByModelId(424)[1]);
            //LOG.debug("getItemExtraId(): {}", op.getItemExtraId(BagLocation.BACKPACK, 20));
            //LOG.debug("getItemExtraIdById(): {}", op.getItemExtraIdById(178));
            //LOG.debug("getItemExtraIdByAgent(): {}", op.getItemExtraIdByAgent(178));
            //TODO: test: LOG.debug("getItemReq(): {}", op.getItemReq(BagLocation.BACKPACK, 1));
            //TODO: test: LOG.debug("getItemReqById(): {}", op.getItemReqById(178));
            //TODO: test: LOG.debug("getItemReqByAgent(): {}", op.getItemReqByAgent(178));
            //TODO: test: LOG.debug("getDyePositionByColor(): {}", op.getDyePositionByColor(Dye.BLUE, BagLocation.BACKPACK));
            //TODO: test: LOG.debug("getItemDmgMod(): {}", op.getItemDmgMod(20, BagLocation.BACKPACK));
            //TODO: test: LOG.debug("getItemDmgModById(): {}", op.getItemDmgModById(178));
            //TODO: test: LOG.debug("getItemDmgModByAgent(): {}", op.getItemDmgModByAgent(178));
            //TODO: test: op.submitOffer(200);
            //TODO: test: op.changeOffer();
            //TODO: test: op.offerItem(BagLocation.BACKPACK, 1);
            //TODO: test: op.offerItem(140);
            //TODO: test: op.cancelTrade();
            //TODO: test: op.acceptTrade();
            //op.attack(33);
            //op.move(250f, 250f);
            //op.useSkill(SkillBarSkillSlot.ONE,40);
            //op.changeWeaponSet(1);
            //op.zoneMap(148, 2);
            //op.travelTo(148, 2);
            //op.dropGold(4);
            //op.goNpc(38);
            // BROKEN (also using AutoIt): op.goPlayer(270);
            //op.goSignpost(6);
            //TODO: test: op.enterChallenge();
            //TODO: test: op.enterChallengeForeign();
            //TODO: test: op.openChest();
            //op.pickupItem(13);
            //op.dialog(8411649);
            //op.changeTarget(40);
            // BROKEN (also using AutoIt) (closes GW): op.targetNearestFoe();
            // BROKEN (also using AutoIt) (closes GW): op.targetNearestAlly();
            // BROKEN (also using AutoIt) (closes GW): op.targetNearestItem();
            // BROKEN (also using AutoIt) (closes GW): op.targetCalledTarget();
            //TODO: test: op.useHero1Skill(SkillBarSkillSlot.SIX, 2);
            //TODO: test: op.useHero2Skill(SkillBarSkillSlot.SIX, 2);
            //TODO: test: op.useHero3Skill(SkillBarSkillSlot.SIX, 2);
            //op.cancelAction();
            //TODO: test: .commandHero1(150f, 150f);
            //TODO: test: op.commandHero2(150f, 150f);
            //TODO: test: op.commandHero3(150f, 150f);
            //TODO: test: op.commandAll(150f, 150f);
            //op.changeDistrict(Region.EUROPE, (byte) 2);
            //op.resign();
            //op.returnToOutpost();
            //op.updateAgentPosition(31);
            // BROKEN (also using AutoIt): op.goAgent(39);
            //TODO: test: op.donateKurzickFaction();
            //TODO: test: op.donateLuxonFaction();
            // BROKEN (also using AutoIt) (crashes GW): op.setSkillbarSkill(SkillBarSkillSlot.SIX, 180);
            //TODO: test: op.changeSecondProfession(Profession.ASSASSIN);
            //TODO: test: op.targetNextPartyMember();
            // BROKEN (also using AutoIt) (closes GW): op.targetNextFoe();
            // BROKEN (also using AutoIt): op.skipCinematic();
            //TODO: test: op.dismissBuff(2, 33);
            // BROKEN (also using AutoIt) (does nothing): op.openStorage();
            //op.prepareZoneMapEx(148);
            //op.zoneMapEx(Region.EUROPE, 2);
            //TODO: test: op.addHero(Hero.KOSS);
            //TODO: test: op.kickHero(Hero.KOSS);
            //TODO: test: op.toggleHardMode();
            //TODO: test: op.toggleNormalMode();
            //op.addNpc(2);
            //op.kickNpc(2);
            //TODO: test: op.travelGH();
            //TODO: test: op.leaveGH();
            //op.initMapLoad();
            //op.isMapLoaded();
            //TODO: test: LOG.debug("getMapOverlayInfo(): {{},{}}", op.getMapOverlayInfo(2)[0], op.getMapOverlayInfo(2)[1]);
            //TODO: test: LOG.debug("getNearestMapOverlayToCoords(): {}", op.getNearestMapOverlayToCoords(150f,150f));
            //TODO: test: op.setHeroMode(1, HeroMode.FIGHT);
            //LOG.debug("questCheck(): {{},{}}", op.questCheck(73)[0], op.questCheck(73)[1]);
            //LOG.debug("questCoords(): {{},{}}", op.questCoords(73)[0], op.questCoords(73)[1]);
            //LOG.debug("questActive(): {}", op.questActive());
            //op.questAbandon(73);
            //TODO: test: op.setTeamSize(4);
            //LOG.debug("getRegionAndLanguage(): {}", op.getRegionAndLanguage());
            //op.traderRequest(7);
            //BROKEN (also in AutoIt) (does return 0,0 all the time) LOG.debug("traderCheck(): {{},{}}", op.traderCheck()[0], op.traderCheck()[1]);
            //BROKEN (also in AutoIt) (hangs, does nothing) LOG.debug("traderBuy(): {}", op.traderBuy());
            //op.traderRequestSell(BagLocation.BACKPACK, 6);
            //op.traderRequestSellById(255);
            //LOG.debug("traderSell(): {}", op.traderSell());
            //BROKEN (also in AutoIt) (returns error code 0x50 (CA_Error) LOG.debug("getNumberOfFoesInRangeOfAgent(): {}", op.getNumberOfFoesInRangeOfAgent(34, 100f));
            //BROKEN (also in AutoIt) (returns error code 0x50 (CA_Error) LOG.debug("getNumberOfAlliesInRangeOfAgent(): {}", op.getNumberOfAlliesInRangeOfAgent(19, 700f));
            //BROKEN (also in AutoIt) (returns error code 0x50 (CA_Error) LOG.debug("getNumberOfItemsInRangeOfAgent(): {}", op.getNumberOfItemsInRangeOfAgent(19, 100f));
            //op.tradePlayer(54);
            //op.getTimeStamp();
            //TODO: test: op.lockHero(1, 56);
            //TODO: test: op.cancelMaintainedEnchantment(25);
            //LOG.debug("getSkillType(): {}", op.getSkillType(180));
            //op.prepareMoveItem(BagLocation.BACKPACK, 3);
            //op.prepareMoveItem(594);
            //op.moveItem(BagLocation.BACKPACK, 17);
            //op.pickupItems(1, 500f);
            //TODO: test: LOG.debug("getItemLastModifier(): {{},{}}", op.getItemLastModifier(1, BagLocation.BACKPACK)[0], op.getItemLastModifier(1, BagLocation.BACKPACK)[1]);
            //TODO: test: LOG.debug("getItemLastModifierById(): {{},{}}", op.getItemLastModifierById(2)[0], op.getItemLastModifierById(2)[1]);
            //TODO: test: LOG.debug("getItemLastModifierByAgent(): {{},{}}", op.getItemLastModifierByAgent(2)[0], op.getItemLastModifierByAgent(2)[1]);
            //op.moveToEx(5004f, -1252, 50);
            //op.pingSleep(100);
            //op.useSkillEx(SkillBarSkillSlot.ONE, 35, 3000);
            //LOG.debug("getSkillRechargeTimeLeft(): {}", op.getSkillRechargeTimeLeft(SkillBarSkillSlot.THREE));
            //TODO: test: LOG.debug("getHeroSkillRechargeTimeLeft(): {}", op.getHeroSkillRechargeTimeLeft(HeroSlot.SIX, SkillBarSkillSlot.SIX));

            LOG.info("The \"Java GWCAConstants\" finished executing");
        } catch (Throwable throwable) {
            LOG.error("Initializing the \"Java GWCAConstants\" failed because: ", throwable);
        } finally {
            try {
                gwcaConnection.close();
            } catch (IOException ex) {
                LOG.error("IO closing", ex);
            }
        }

    }

    // Adds a shutdownHook to the JVM instance that will (in most cases) get called when the application is shutting down
    // it logs the event and does necessary cleanup (if any)
    private static void addShutdownHook() throws Throwable {
        LOG.info("Adding ShutdownHook");
        try { // adding shutdown hook
            Runtime.getRuntime().addShutdownHook(new Thread(new ShutdownHook()));
            LOG.info("ShutdownHook added");
        } catch (Throwable t) {
            LOG.error("Adding the ShutdownHook failed because: ", t);
            throw t;
        }
    }
}