package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyWindow: ImageVector? = null

val Icons.Bs.HouseChimneyWindow: ImageVector
    get() = _HouseChimneyWindow ?: UXIcon(name = "HouseChimneyWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.66f, 7.39f)
                lineToRelative(-0.66f, -0.51f)
                lineTo(22f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.53f)
                lineTo(14.16f, 0.74f)
                curveToRelative(-1.27f, -0.99f, -3.04f, -0.99f, -4.31f, 0f)
                lineTo(1.34f, 7.4f)
                curveToRelative(-0.85f, 0.67f, -1.34f, 1.67f, -1.34f, 2.76f)
                verticalLineToRelative(13.85f)
                lineTo(24f, 24.0f)
                lineTo(24f, 10.15f)
                curveToRelative(0f, -1.08f, -0.49f, -2.09f, -1.34f, -2.76f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 10.15f)
                curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f)
                lineTo(11.69f, 3.11f)
                curveToRelative(0.18f, -0.14f, 0.43f, -0.14f, 0.62f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.12f, 0.1f, 0.19f, 0.24f, 0.19f, 0.4f)
                verticalLineToRelative(10.85f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(8f)
                lineTo(16f, 10f)
                lineTo(8f, 10f)
                verticalLineToRelative(8f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _HouseChimneyWindow = it}
