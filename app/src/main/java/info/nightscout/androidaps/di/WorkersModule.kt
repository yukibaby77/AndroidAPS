package info.nightscout.androidaps.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.androidaps.plugins.general.food.FoodPlugin
import info.nightscout.androidaps.plugins.general.maintenance.ImportExportPrefsImpl
import info.nightscout.androidaps.plugins.general.nsclient.NSClientAddAckWorker
import info.nightscout.androidaps.plugins.general.nsclient.NSClientAddUpdateWorker
import info.nightscout.androidaps.plugins.general.nsclient.NSClientMbgWorker
import info.nightscout.androidaps.plugins.general.nsclient.NSClientUpdateRemoveAckWorker
import info.nightscout.androidaps.plugins.profile.local.LocalProfilePlugin
import info.nightscout.androidaps.plugins.source.AidexPlugin
import info.nightscout.androidaps.plugins.source.DexcomPlugin
import info.nightscout.androidaps.plugins.source.EversensePlugin
import info.nightscout.androidaps.plugins.source.GlimpPlugin
import info.nightscout.androidaps.plugins.source.MM640gPlugin
import info.nightscout.androidaps.plugins.source.NSClientSourcePlugin
import info.nightscout.androidaps.plugins.source.PoctechPlugin
import info.nightscout.androidaps.plugins.source.TomatoPlugin
import info.nightscout.androidaps.plugins.source.XdripPlugin

@Module
@Suppress("unused")
abstract class WorkersModule {

    @ContributesAndroidInjector abstract fun contributesXdripWorker(): XdripPlugin.XdripWorker
    @ContributesAndroidInjector abstract fun contributesDexcomWorker(): DexcomPlugin.DexcomWorker
    @ContributesAndroidInjector abstract fun contributesMM640gWorker(): MM640gPlugin.MM640gWorker
    @ContributesAndroidInjector abstract fun contributesGlimpWorker(): GlimpPlugin.GlimpWorker
    @ContributesAndroidInjector abstract fun contributesPoctechWorker(): PoctechPlugin.PoctechWorker
    @ContributesAndroidInjector abstract fun contributesTomatoWorker(): TomatoPlugin.TomatoWorker
    @ContributesAndroidInjector abstract fun contributesEversenseWorker(): EversensePlugin.EversenseWorker
    @ContributesAndroidInjector abstract fun contributesNSClientSourceWorker(): NSClientSourcePlugin.NSClientSourceWorker
    @ContributesAndroidInjector abstract fun contributesNSProfileWorker(): LocalProfilePlugin.NSProfileWorker
    @ContributesAndroidInjector abstract fun contributesNSClientWorker(): NSClientAddUpdateWorker
    @ContributesAndroidInjector abstract fun contributesNSClientAddAckWorker(): NSClientAddAckWorker
    @ContributesAndroidInjector abstract fun contributesNSClientUpdateRemoveAckWorker(): NSClientUpdateRemoveAckWorker
    @ContributesAndroidInjector abstract fun contributesNSClientMbgWorker(): NSClientMbgWorker
    @ContributesAndroidInjector abstract fun contributesFoodWorker(): FoodPlugin.FoodWorker
    @ContributesAndroidInjector abstract fun contributesCsvExportWorker(): ImportExportPrefsImpl.CsvExportWorker
    @ContributesAndroidInjector abstract fun contributesAidexWorker(): AidexPlugin.AidexWorker
}