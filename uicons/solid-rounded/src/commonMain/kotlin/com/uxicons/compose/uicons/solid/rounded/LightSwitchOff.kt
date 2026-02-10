package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitchOff: ImageVector? = null

val Icons.Sr.LightSwitchOff: ImageVector
    get() = _LightSwitchOff ?: UXIcon(name = "LightSwitchOff") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.0f, 11f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.0f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17f, 7f)
                curveToRelative(0f, -0.02f, 0f, -0.04f, -0.0f, -0.05f)
                curveToRelative(-0.03f, -1.63f, -1.36f, -2.95f, -3.0f, -2.95f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.64f, 0f, -2.97f, 1.32f, -3.0f, 2.95f)
                curveToRelative(0f, 0.02f, -0.0f, 0.03f, -0.0f, 0.05f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(17f, 7f)
                close()
            }
        }.also { _LightSwitchOff = it}
