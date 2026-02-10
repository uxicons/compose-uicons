package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pump: ImageVector? = null

val Icons.Bs.Pump: ImageVector
    get() = _Pump ?: UXIcon(name = "Pump") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 6f)
                curveToRelative(-0.53f, 0f, -1.03f, 0.11f, -1.5f, 0.28f)
                verticalLineToRelative(-3.28f)
                horizontalLineToRelative(2f)
                lineTo(15f, 0f)
                lineTo(3f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(0f, 10f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.5f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(8f, 16f)
                lineTo(8f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }.also { _Pump = it}
