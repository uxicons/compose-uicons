package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Tr.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 19.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 20f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, 0.4f, -2.15f, 1.12f, -2.98f)
                curveToRelative(0.18f, -0.21f, 0.5f, -0.23f, 0.71f, -0.04f)
                curveToRelative(0.21f, 0.18f, 0.23f, 0.5f, 0.04f, 0.71f)
                curveToRelative(-0.56f, 0.64f, -0.88f, 1.46f, -0.88f, 2.31f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(15.5f, 19.0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(19.97f, 19.26f)
                lineToRelative(3.88f, 3.88f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.15f, 0.85f)
                curveTo(-0.05f, 0.66f, -0.05f, 0.34f, 0.15f, 0.15f)
                reflectiveCurveTo(0.66f, -0.05f, 0.85f, 0.15f)
                lineToRelative(3.85f, 3.85f)
                horizontalLineToRelative(12.79f)
                curveToRelative(2.31f, 0f, 4.22f, 1.75f, 4.47f, 4f)
                horizontalLineToRelative(0.53f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(-0.15f, 1.33f, -0.89f, 2.53f, -2.0f, 3.26f)
                close()
                moveTo(21f, 15.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.71f, 5f)
                lineToRelative(13.54f, 13.54f)
                curveToRelative(1.08f, -0.62f, 1.76f, -1.78f, 1.76f, -3.04f)
                close()
            }
        }.also { _BatterySlash = it}
