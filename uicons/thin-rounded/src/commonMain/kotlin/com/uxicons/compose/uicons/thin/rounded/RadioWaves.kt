package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioWaves: ImageVector? = null

val Icons.Tr.RadioWaves: ImageVector
    get() = _RadioWaves ?: UXIcon(name = "RadioWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.5f, 12f)
                lineTo(23.5f, 12f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.98f)
                curveTo(15.52f, 3.4f, 14.12f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-3.52f, 3.4f, -4.52f, 11f)
                lineTo(0.5f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.82f, 0f, 2.35f, 1.33f, 3.51f, 10f)
                horizontalLineToRelative(-7.01f)
                curveTo(9.65f, 2.33f, 11.18f, 1f, 12f, 1f)
                close()
                moveTo(24.0f, 14.57f)
                curveToRelative(-0.89f, 6.52f, -2.12f, 9.43f, -4.0f, 9.43f)
                reflectiveCurveToRelative(-3.1f, -2.91f, -4.0f, -9.43f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.43f, -0.56f)
                curveToRelative(0.27f, -0.04f, 0.53f, 0.15f, 0.56f, 0.43f)
                curveToRelative(1.02f, 7.46f, 2.32f, 8.57f, 3.0f, 8.57f)
                reflectiveCurveToRelative(1.99f, -1.11f, 3.0f, -8.57f)
                curveToRelative(0.04f, -0.27f, 0.29f, -0.46f, 0.56f, -0.43f)
                curveToRelative(0.27f, 0.04f, 0.47f, 0.29f, 0.43f, 0.56f)
                close()
                moveTo(8.0f, 14.57f)
                curveToRelative(-0.89f, 6.52f, -2.12f, 9.43f, -4.0f, 9.43f)
                reflectiveCurveTo(0.9f, 21.09f, 0.0f, 14.57f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.43f, -0.56f)
                curveToRelative(0.28f, -0.04f, 0.53f, 0.15f, 0.56f, 0.43f)
                curveToRelative(1.02f, 7.46f, 2.32f, 8.57f, 3.0f, 8.57f)
                reflectiveCurveToRelative(1.99f, -1.11f, 3.0f, -8.57f)
                curveToRelative(0.04f, -0.27f, 0.29f, -0.46f, 0.56f, -0.43f)
                curveToRelative(0.27f, 0.04f, 0.47f, 0.29f, 0.43f, 0.56f)
                close()
            }
        }.also { _RadioWaves = it}
