package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Magnet: ImageVector? = null

val Icons.Ss.Magnet: ImageVector
    get() = _Magnet ?: UXIcon(name = "Magnet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5.0f)
                curveToRelative(0f, 3.25f, -1.28f, 6.29f, -3.59f, 8.56f)
                curveToRelative(-2.26f, 2.22f, -5.24f, 3.44f, -8.4f, 3.44f)
                curveToRelative(-0.07f, 0f, -0.15f, 0f, -0.23f, -0.0f)
                curveToRelative(-6.49f, -0.12f, -11.78f, -5.67f, -11.78f, -12.36f)
                verticalLineToRelative(-4.64f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(7f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                lineTo(7f, 0f)
                close()
                moveTo(17f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Magnet = it}
