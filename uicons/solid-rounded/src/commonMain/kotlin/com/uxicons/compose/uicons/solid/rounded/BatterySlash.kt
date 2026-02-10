package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Sr.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.78f, 16f)
                horizontalLineToRelative(1.22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                lineTo(5.41f, 4f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.58f, -3.58f)
                curveToRelative(0.78f, -0.72f, 1.36f, -1.68f, 1.66f, -2.71f)
                close()
                moveTo(15.76f, 20f)
                lineTo(5f, 20f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.32f, 0.51f, -2.52f, 1.35f, -3.41f)
                lineToRelative(14.41f, 14.41f)
                close()
            }
        }.also { _BatterySlash = it}
