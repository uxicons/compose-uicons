package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EiffelTower: ImageVector? = null

val Icons.Ss.EiffelTower: ImageVector
    get() = _EiffelTower ?: UXIcon(name = "EiffelTower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.66f, 13f)
                curveToRelative(0.6f, -1.04f, 1.04f, -2.03f, 1.38f, -3f)
                horizontalLineToRelative(-1.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.28f, -1.33f, 0.39f, -2.65f, 0.39f, -4f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1f)
                lineTo(10.0f, 1.5f)
                horizontalLineToRelative(1f)
                lineTo(11.0f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13.0f, 1.5f)
                horizontalLineToRelative(1f)
                lineTo(14.0f, 3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.35f, 0.11f, 2.67f, 0.39f, 4f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.04f)
                curveToRelative(0.34f, 0.97f, 0.78f, 1.96f, 1.38f, 3f)
                horizontalLineToRelative(-6.67f)
                close()
                moveTo(18f, 16.78f)
                verticalLineToRelative(-1.78f)
                lineTo(6f, 15f)
                verticalLineToRelative(1.78f)
                curveToRelative(-1.24f, 1.51f, -3.09f, 3.44f, -5f, 5.22f)
                verticalLineToRelative(2f)
                lineTo(7f, 24f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.91f, -1.79f, -3.76f, -3.71f, -5f, -5.22f)
                close()
            }
        }.also { _EiffelTower = it}
