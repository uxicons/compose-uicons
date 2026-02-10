package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioWaves: ImageVector? = null

val Icons.Sr.RadioWaves: ImageVector
    get() = _RadioWaves ?: UXIcon(name = "RadioWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 13f)
                lineTo(23f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6.34f)
                curveTo(15.64f, 3.21f, 14.28f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-3.64f, 3.21f, -4.66f, 11f)
                lineTo(1f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.01f, 0f, 1.45f, 0.11f, 2.64f, 9f)
                horizontalLineToRelative(-5.29f)
                curveToRelative(1.19f, -8.89f, 2.63f, -9f, 2.64f, -9f)
                close()
                moveTo(23.98f, 16.17f)
                curveToRelative(-0.97f, 5.49f, -2.22f, 7.83f, -4.18f, 7.83f)
                reflectiveCurveToRelative(-3.22f, -2.34f, -4.18f, -7.83f)
                curveToRelative(-0.1f, -0.54f, 0.27f, -1.06f, 0.81f, -1.16f)
                curveToRelative(0.55f, -0.1f, 1.06f, 0.27f, 1.16f, 0.81f)
                curveToRelative(1.06f, 6.01f, 2.2f, 6.17f, 2.21f, 6.17f)
                reflectiveCurveToRelative(1.15f, -0.17f, 2.21f, -6.17f)
                curveToRelative(0.1f, -0.54f, 0.61f, -0.91f, 1.16f, -0.81f)
                curveToRelative(0.54f, 0.1f, 0.91f, 0.61f, 0.81f, 1.16f)
                close()
                moveTo(8.38f, 16.17f)
                curveToRelative(-0.97f, 5.49f, -2.22f, 7.83f, -4.18f, 7.83f)
                reflectiveCurveTo(0.98f, 21.66f, 0.01f, 16.17f)
                curveToRelative(-0.1f, -0.54f, 0.27f, -1.06f, 0.81f, -1.16f)
                curveToRelative(0.55f, -0.1f, 1.06f, 0.27f, 1.16f, 0.81f)
                curveToRelative(1.06f, 6.01f, 2.2f, 6.17f, 2.21f, 6.17f)
                reflectiveCurveToRelative(1.15f, -0.17f, 2.21f, -6.17f)
                curveToRelative(0.1f, -0.54f, 0.61f, -0.91f, 1.16f, -0.81f)
                curveToRelative(0.54f, 0.1f, 0.91f, 0.61f, 0.81f, 1.16f)
                close()
            }
        }.also { _RadioWaves = it}
