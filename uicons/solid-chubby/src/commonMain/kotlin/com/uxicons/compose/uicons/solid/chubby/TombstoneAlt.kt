package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TombstoneAlt: ImageVector? = null

val Icons.Sc.TombstoneAlt: ImageVector
    get() = _TombstoneAlt ?: UXIcon(name = "TombstoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.19f, 21.02f)
                curveToRelative(-0.06f, -0.01f, -0.5f, -0.1f, -1.19f, -0.21f)
                verticalLineToRelative(-10.81f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                verticalLineToRelative(10.81f)
                curveToRelative(-0.7f, 0.12f, -1.14f, 0.2f, -1.19f, 0.21f)
                curveToRelative(-0.54f, 0.11f, -0.89f, 0.63f, -0.79f, 1.18f)
                curveToRelative(0.11f, 0.54f, 0.63f, 0.9f, 1.18f, 0.79f)
                curveToRelative(0.05f, -0.01f, 5.03f, -0.98f, 9.81f, -0.98f)
                reflectiveCurveToRelative(9.76f, 0.97f, 9.81f, 0.98f)
                curveToRelative(0.53f, 0.11f, 1.07f, -0.24f, 1.18f, -0.79f)
                curveToRelative(0.11f, -0.54f, -0.25f, -1.07f, -0.79f, -1.18f)
                close()
            }
        }.also { _TombstoneAlt = it}
