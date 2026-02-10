package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H3: ImageVector? = null

val Icons.Bs.H3: ImageVector
    get() = _H3 ?: UXIcon(name = "H3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                lineTo(3f, 13f)
                verticalLineToRelative(7f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(22.15f, 11.12f)
                curveToRelative(0.53f, -0.74f, 0.85f, -1.65f, 0.85f, -2.62f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.56f, -0.72f, -2.96f, -1.85f, -3.88f)
                close()
            }
        }.also { _H3 = it}
