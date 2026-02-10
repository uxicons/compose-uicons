package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Tc.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 12.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(6f, 12f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(23f, 9.5f)
                verticalLineToRelative(3.23f)
                curveToRelative(0f, 10.27f, -4.61f, 10.27f, -11f, 10.27f)
                reflectiveCurveToRelative(-11f, 0f, -11f, -10.27f)
                verticalLineToRelative(-3.23f)
                curveToRelative(0f, -0.24f, 0.17f, -0.45f, 0.4f, -0.49f)
                curveToRelative(0.03f, -0.01f, 1.47f, -0.28f, 3.6f, -0.55f)
                verticalLineToRelative(-0.47f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(0.47f)
                curveToRelative(2.13f, 0.26f, 3.57f, 0.54f, 3.6f, 0.55f)
                curveToRelative(0.23f, 0.04f, 0.4f, 0.25f, 0.4f, 0.49f)
                close()
                moveTo(6f, 8.35f)
                curveToRelative(1.76f, -0.19f, 3.86f, -0.35f, 6f, -0.35f)
                reflectiveCurveToRelative(4.24f, 0.16f, 6f, 0.35f)
                verticalLineToRelative(-0.35f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                close()
                moveTo(22f, 9.92f)
                curveToRelative(-1.31f, -0.23f, -5.59f, -0.92f, -10f, -0.92f)
                reflectiveCurveToRelative(-8.69f, 0.69f, -10f, 0.92f)
                verticalLineToRelative(2.81f)
                curveToRelative(0f, 9.27f, 3.55f, 9.27f, 10f, 9.27f)
                reflectiveCurveToRelative(10f, 0f, 10f, -9.27f)
                close()
            }
        }.also { _ShoppingBasket = it}
