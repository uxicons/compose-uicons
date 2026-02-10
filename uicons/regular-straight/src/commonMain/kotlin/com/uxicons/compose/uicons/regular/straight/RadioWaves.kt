package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioWaves: ImageVector? = null

val Icons.Rs.RadioWaves: ImageVector
    get() = _RadioWaves ?: UXIcon(name = "RadioWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.66f, 11f)
                curveTo(15.64f, 3.21f, 14.28f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-3.64f, 3.21f, -4.66f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(24f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.34f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.01f, 0f, 1.45f, 0.11f, 2.64f, 9f)
                horizontalLineToRelative(-5.29f)
                curveToRelative(1.19f, -8.89f, 2.63f, -9f, 2.64f, -9f)
                close()
                moveTo(22.0f, 15f)
                horizontalLineToRelative(2.0f)
                curveToRelative(-0.38f, 5.76f, -1.57f, 9f, -4f, 9f)
                curveToRelative(-2.07f, 0f, -3.83f, -2.65f, -4.82f, -9f)
                horizontalLineToRelative(2.03f)
                curveToRelative(1.12f, 6.91f, 2.77f, 7f, 2.79f, 7f)
                curveToRelative(0.68f, 0f, 1.63f, -1.79f, 2.0f, -7f)
                close()
                moveTo(6.79f, 15f)
                horizontalLineToRelative(2.03f)
                curveToRelative(-0.99f, 6.35f, -2.74f, 9f, -4.82f, 9f)
                curveToRelative(-2.43f, 0f, -3.62f, -3.24f, -4f, -9f)
                lineTo(2.0f, 15f)
                curveToRelative(0.37f, 5.21f, 1.32f, 7f, 2.0f, 7f)
                curveToRelative(0.01f, 0f, 1.66f, -0.1f, 2.79f, -7f)
                close()
            }
        }.also { _RadioWaves = it}
