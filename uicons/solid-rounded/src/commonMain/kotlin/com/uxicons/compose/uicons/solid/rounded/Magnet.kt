package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Magnet: ImageVector? = null

val Icons.Sr.Magnet: ImageVector
    get() = _Magnet ?: UXIcon(name = "Magnet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 7.0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5.0f)
                curveToRelative(0f, 3.25f, -1.28f, 6.29f, -3.59f, 8.56f)
                curveToRelative(-2.26f, 2.22f, -5.24f, 3.44f, -8.4f, 3.44f)
                curveToRelative(-0.07f, 0f, -0.15f, 0f, -0.23f, -0.0f)
                curveTo(5.28f, 23.88f, 0f, 18.33f, 0f, 11.63f)
                verticalLineToRelative(-4.64f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(4.5f, -0.0f)
                horizontalLineToRelative(-2f)
                curveTo(1.12f, -0.0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                curveTo(7f, 1.12f, 5.88f, -0.0f, 4.5f, -0.0f)
                close()
                moveTo(17f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                curveTo(24f, 1.12f, 22.88f, -0.0f, 21.5f, -0.0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _Magnet = it}
