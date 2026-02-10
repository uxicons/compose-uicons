package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EiffelTower: ImageVector? = null

val Icons.Bs.EiffelTower: ImageVector
    get() = _EiffelTower ?: UXIcon(name = "EiffelTower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.54f, 14f)
                horizontalLineToRelative(1.46f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.12f)
                curveToRelative(-0.83f, -1.76f, -1.39f, -3.5f, -1.39f, -5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                lineTo(14.5f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.5f, -0.55f, 3.24f, -1.39f, 5f)
                horizontalLineToRelative(-3.11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.46f)
                curveToRelative(-2.05f, 3.28f, -5.08f, 6.7f, -6.46f, 8f)
                verticalLineToRelative(2f)
                lineTo(7f, 24f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.37f, -1.3f, -4.41f, -4.72f, -6.46f, -8f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.0f, 0f, -1.95f, 0.19f, -2.83f, 0.53f)
                curveToRelative(0.57f, -0.8f, 1.13f, -1.65f, 1.64f, -2.53f)
                horizontalLineToRelative(2.37f)
                curveToRelative(0.52f, 0.88f, 1.07f, 1.72f, 1.64f, 2.53f)
                curveToRelative(-0.88f, -0.34f, -1.83f, -0.53f, -2.83f, -0.53f)
                close()
            }
        }.also { _EiffelTower = it}
