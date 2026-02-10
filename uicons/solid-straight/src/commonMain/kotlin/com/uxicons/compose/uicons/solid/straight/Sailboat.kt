package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sailboat: ImageVector? = null

val Icons.Ss.Sailboat: ImageVector
    get() = _Sailboat ?: UXIcon(name = "Sailboat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.74f, 24f)
                horizontalLineToRelative(-3.53f)
                curveTo(1.27f, 24f, 0.15f, 16.21f, 0.14f, 16.13f)
                lineTo(-0.0f, 15f)
                horizontalLineToRelative(24.03f)
                lineToRelative(-0.16f, 1.14f)
                curveToRelative(-0.01f, 0.08f, -1.19f, 7.86f, -10.12f, 7.86f)
                close()
                moveTo(23.97f, 13f)
                horizontalLineToRelative(-11.97f)
                lineToRelative(0.01f, -12.98f)
                lineToRelative(11.97f, 12.98f)
                close()
                moveTo(10.0f, 13f)
                lineTo(0.13f, 13f)
                lineTo(10f, 1.86f)
                verticalLineToRelative(11.13f)
                close()
            }
        }.also { _Sailboat = it}
