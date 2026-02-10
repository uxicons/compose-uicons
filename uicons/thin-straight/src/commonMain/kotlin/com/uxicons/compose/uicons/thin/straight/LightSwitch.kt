package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightSwitch: ImageVector? = null

val Icons.Ts.LightSwitch: ImageVector
    get() = _LightSwitch ?: UXIcon(name = "LightSwitch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21f, 23f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 20f)
                close()
                moveTo(8f, 19f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.5f)
                lineTo(8f, 19f)
                close()
                moveTo(16f, 5f)
                verticalLineToRelative(6.5f)
                lineTo(8f, 11.5f)
                lineTo(8f, 5f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _LightSwitch = it}
