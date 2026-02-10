package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryBolt: ImageVector? = null

val Icons.Br.BatteryBolt: ImageVector
    get() = _BatteryBolt ?: UXIcon(name = "BatteryBolt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 18.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12.59f, 10.5f)
            horizontalLineToRelative(-2.14f)
            lineToRelative(2.33f, -4.28f)
            curveToRelative(0.4f, -0.73f, 0.13f, -1.64f, -0.6f, -2.04f)
            curveToRelative(-0.73f, -0.4f, -1.64f, -0.13f, -2.04f, 0.6f)
            curveToRelative(0f, 0f, -3.01f, 5.56f, -3.04f, 5.66f)
            curveToRelative(-0.22f, 0.73f, -0.09f, 1.49f, 0.35f, 2.09f)
            curveToRelative(0.45f, 0.61f, 1.19f, 0.97f, 1.96f, 0.97f)
            horizontalLineToRelative(2.23f)
            lineToRelative(-2.15f, 4.33f)
            curveToRelative(-0.37f, 0.74f, -0.07f, 1.64f, 0.68f, 2.01f)
            curveToRelative(0.21f, 0.11f, 0.44f, 0.16f, 0.67f, 0.16f)
            curveToRelative(0.55f, 0f, 1.08f, -0.31f, 1.34f, -0.83f)
            lineToRelative(2.46f, -4.97f)
            curveToRelative(0.44f, -0.73f, 0.46f, -1.65f, 0.04f, -2.42f)
            curveToRelative(-0.42f, -0.79f, -1.23f, -1.28f, -2.11f, -1.28f)
            close()
            moveTo(23f, 8f)
            horizontalLineToRelative(-1.21f)
            curveToRelative(-0.66f, -2.31f, -2.78f, -4f, -5.29f, -4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(2.51f, 0f, 4.64f, -1.69f, 5.29f, -4f)
            horizontalLineToRelative(1.21f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
        }
    }.also { _BatteryBolt = it }
