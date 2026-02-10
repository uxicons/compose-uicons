package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RestaurantSign: ImageVector? = null

val Icons.Ss.RestaurantSign: ImageVector
    get() = _RestaurantSign ?: UXIcon(name = "RestaurantSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                verticalLineToRelative(-2.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.41f, 1.72f, -4.43f, 4f, -4.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.6f)
                curveToRelative(2.28f, 0.47f, 4f, 2.48f, 4f, 4.9f)
                horizontalLineToRelative(1f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _RestaurantSign = it}
