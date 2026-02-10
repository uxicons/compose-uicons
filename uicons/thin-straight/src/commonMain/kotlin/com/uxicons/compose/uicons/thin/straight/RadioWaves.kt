package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioWaves: ImageVector? = null

val Icons.Ts.RadioWaves: ImageVector
    get() = _RadioWaves ?: UXIcon(name = "RadioWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.52f, 11f)
                curveTo(15.52f, 3.4f, 14.12f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-3.52f, 3.4f, -4.52f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(1f)
                lineTo(24f, 12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.48f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.82f, 0f, 2.35f, 1.33f, 3.51f, 10f)
                horizontalLineToRelative(-7.01f)
                curveTo(9.65f, 2.33f, 11.18f, 1f, 12f, 1f)
                close()
                moveTo(22.99f, 14f)
                horizontalLineToRelative(1.01f)
                curveToRelative(-0.88f, 6.89f, -2.17f, 10f, -4f, 10f)
                reflectiveCurveToRelative(-3.24f, -3.11f, -4.12f, -10f)
                horizontalLineToRelative(1.01f)
                curveToRelative(1.05f, 8.06f, 2.56f, 9f, 3.12f, 9f)
                reflectiveCurveToRelative(1.94f, -0.94f, 2.99f, -9f)
                close()
                moveTo(7.12f, 14f)
                horizontalLineToRelative(1.01f)
                curveToRelative(-0.88f, 6.89f, -2.29f, 10f, -4.12f, 10f)
                reflectiveCurveTo(0.88f, 20.89f, 0f, 14f)
                lineTo(1.01f, 14f)
                curveToRelative(1.05f, 8.06f, 2.44f, 9f, 2.99f, 9f)
                reflectiveCurveToRelative(2.06f, -0.94f, 3.12f, -9f)
                close()
            }
        }.also { _RadioWaves = it}
