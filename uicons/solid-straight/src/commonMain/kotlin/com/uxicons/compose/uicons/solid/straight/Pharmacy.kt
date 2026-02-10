package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pharmacy: ImageVector? = null

val Icons.Ss.Pharmacy: ImageVector
    get() = _Pharmacy ?: UXIcon(name = "Pharmacy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 24f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _Pharmacy = it}
