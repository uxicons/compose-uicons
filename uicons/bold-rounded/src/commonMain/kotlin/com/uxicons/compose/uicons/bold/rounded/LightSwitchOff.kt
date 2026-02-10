package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitchOff: ImageVector? = null

val Icons.Br.LightSwitchOff: ImageVector
    get() = _LightSwitchOff ?: UXIcon(name = "LightSwitchOff") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 0f)
            lineTo(7.5f, 0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(14f, 5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(17f, 8f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            close()
            moveTo(10f, 16f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.also { _LightSwitchOff = it }
