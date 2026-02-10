package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightEmergency: ImageVector? = null

val Icons.Ss.LightEmergency: ImageVector
    get() = _LightEmergency ?: UXIcon(name = "LightEmergency") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                close()
                moveTo(12f, 0f)
                curveTo(7.04f, 0f, 3f, 4.04f, 3f, 9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-9f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LightEmergency = it}
