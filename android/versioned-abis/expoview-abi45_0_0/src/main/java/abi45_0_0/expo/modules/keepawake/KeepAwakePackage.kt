package abi45_0_0.expo.modules.keepawake

import android.content.Context

import abi45_0_0.expo.modules.core.ExportedModule
import abi45_0_0.expo.modules.core.interfaces.InternalModule
import abi45_0_0.expo.modules.core.interfaces.Package

class KeepAwakePackage : Package {
  override fun createExportedModules(context: Context): List<ExportedModule> {
    return listOf(KeepAwakeModule(context))
  }

  override fun createInternalModules(context: Context): List<InternalModule> {
    return listOf(ExpoKeepAwakeManager())
  }
}
