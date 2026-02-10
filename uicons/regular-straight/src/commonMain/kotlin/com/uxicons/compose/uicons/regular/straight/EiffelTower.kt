package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EiffelTower: ImageVector? = null

val Icons.Rs.EiffelTower: ImageVector
    get() = _EiffelTower ?: UXIcon(name = "EiffelTower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16.41f)
                verticalLineToRelative(-2.41f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(-0.97f, -1.42f, -1.66f, -2.73f, -2.15f, -4f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(-0.29f, -1.32f, -0.4f, -2.62f, -0.4f, -4f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                lineTo(14.0f, 1.5f)
                horizontalLineToRelative(-1f)
                lineTo(13.0f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11.0f, 1.5f)
                horizontalLineToRelative(-1f)
                lineTo(10.0f, 3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -0.11f, 2.68f, -0.4f, 4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.0f)
                curveToRelative(-0.48f, 1.27f, -1.17f, 2.58f, -2.15f, 4f)
                horizontalLineToRelative(-1.85f)
                verticalLineToRelative(2.41f)
                curveToRelative(-1.28f, 1.53f, -3.06f, 3.37f, -5f, 5.16f)
                verticalLineToRelative(2.43f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.43f)
                curveToRelative(-1.91f, -1.79f, -3.75f, -3.68f, -5f, -5.16f)
                close()
                moveTo(12f, 10.35f)
                curveToRelative(0.42f, 1.23f, 0.99f, 2.43f, 1.74f, 3.65f)
                horizontalLineToRelative(-3.47f)
                curveToRelative(0.74f, -1.22f, 1.31f, -2.43f, 1.74f, -3.65f)
                close()
                moveTo(17.65f, 22f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                reflectiveCurveToRelative(-4.82f, 1.67f, -5.65f, 4f)
                lineTo(3.45f, 22f)
                curveToRelative(2.27f, -2.18f, 4.06f, -4.13f, 5.45f, -6f)
                horizontalLineToRelative(6.19f)
                curveToRelative(1.39f, 1.87f, 3.18f, 3.82f, 5.45f, 6f)
                horizontalLineToRelative(-2.9f)
                close()
            }
        }.also { _EiffelTower = it}
