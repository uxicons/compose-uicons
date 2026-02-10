package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitchOff: ImageVector? = null

val Icons.Rr.LightSwitchOff: ImageVector
    get() = _LightSwitchOff ?: UXIcon(name = "LightSwitchOff") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.64f, 0f, -2.97f, 1.32f, -3.0f, 2.95f)
                curveToRelative(0f, 0.02f, -0.0f, 11.05f, -0.0f, 11.05f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, 0f, 0f, -11.04f, -0.0f, -11.05f)
                curveToRelative(-0.03f, -1.63f, -1.36f, -2.95f, -3.0f, -2.95f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 18f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }.also { _LightSwitchOff = it}
