package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RestaurantSign: ImageVector? = null

val Icons.Ts.RestaurantSign: ImageVector
    get() = _RestaurantSign ?: UXIcon(name = "RestaurantSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8f, 3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-19f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(19f, 17.5f)
                curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.47f)
                verticalLineToRelative(-1.02f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.02f)
                curveToRelative(-2.8f, 0.25f, -5f, 2.61f, -5f, 5.47f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(9f, 17.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _RestaurantSign = it}
