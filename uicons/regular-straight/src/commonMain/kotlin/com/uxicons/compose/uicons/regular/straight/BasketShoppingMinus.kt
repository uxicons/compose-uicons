package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingMinus: ImageVector? = null

val Icons.Rs.BasketShoppingMinus: ImageVector
    get() = _BasketShoppingMinus ?: UXIcon(name = "BasketShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 8f)
                curveTo(20.44f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                lineTo(-0.02f, 8f)
                lineToRelative(1.92f, 13.42f)
                curveToRelative(0.21f, 1.47f, 1.49f, 2.58f, 2.97f, 2.58f)
                horizontalLineToRelative(14.27f)
                curveToRelative(1.48f, 0f, 2.76f, -1.11f, 2.97f, -2.58f)
                lineToRelative(1.92f, -13.42f)
                horizontalLineToRelative(-3.08f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.52f, 0f, 6.43f, 2.61f, 6.92f, 6f)
                lineTo(5.08f, 8f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                close()
                moveTo(20.12f, 21.14f)
                curveToRelative(-0.07f, 0.49f, -0.5f, 0.86f, -0.99f, 0.86f)
                lineTo(4.87f, 22f)
                curveToRelative(-0.49f, 0f, -0.92f, -0.37f, -0.99f, -0.86f)
                lineToRelative(-1.59f, -11.14f)
                lineTo(21.71f, 10f)
                lineToRelative(-1.59f, 11.14f)
                close()
                moveTo(16f, 17f)
                lineTo(8f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BasketShoppingMinus = it}
