package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartNotification: ImageVector? = null

val Icons.Bs.ShoppingCartNotification: ImageVector
    get() = _ShoppingCartNotification ?: UXIcon(name = "ShoppingCartNotification") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(20.5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(19.74f, 8.94f)
                lineTo(18.09f, 15f)
                horizontalLineToRelative(-10.69f)
                curveToRelative(-0.25f, 0f, -0.46f, -0.19f, -0.49f, -0.43f)
                lineToRelative(-0.88f, -6.57f)
                horizontalLineToRelative(11.31f)
                curveToRelative(-1.02f, -0.72f, -1.78f, -1.77f, -2.13f, -3f)
                horizontalLineToRelative(-9.58f)
                lineToRelative(-0.26f, -1.96f)
                curveToRelative(-0.23f, -1.73f, -1.72f, -3.04f, -3.47f, -3.04f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.25f, 0f, 0.46f, 0.19f, 0.5f, 0.43f)
                lineToRelative(1.54f, 11.53f)
                curveToRelative(0.23f, 1.73f, 1.72f, 3.04f, 3.47f, 3.04f)
                horizontalLineToRelative(12.97f)
                lineToRelative(2.63f, -9.61f)
                curveToRelative(-0.75f, 0.39f, -1.6f, 0.61f, -2.5f, 0.61f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.02f, -0.76f, -0.06f)
                close()
            }
        }.also { _ShoppingCartNotification = it}
