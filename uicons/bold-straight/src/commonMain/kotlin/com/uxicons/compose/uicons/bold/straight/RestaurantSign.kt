package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RestaurantSign: ImageVector? = null

val Icons.Bs.RestaurantSign: ImageVector
    get() = _RestaurantSign ?: UXIcon(name = "RestaurantSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7.05f)
                verticalLineToRelative(-2.47f)
                curveToRelative(1.76f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                close()
                moveTo(18f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(18.88f, 17f)
                horizontalLineToRelative(1.12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.38f, -1.68f, 1.7f, -3.0f, 3.38f, -3.38f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.62f)
                curveToRelative(1.68f, 0.38f, 3.0f, 1.7f, 3.38f, 3.38f)
                close()
            }
        }.also { _RestaurantSign = it}
