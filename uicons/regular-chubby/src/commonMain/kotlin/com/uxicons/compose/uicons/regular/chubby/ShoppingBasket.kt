package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Rc.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(6f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(23f, 10f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 10f, -4.85f, 10f, -11f, 10f)
                reflectiveCurveToRelative(-11f, 0f, -11f, -10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.48f, 0.34f, -0.89f, 0.8f, -0.98f)
                curveToRelative(0.1f, -0.02f, 1.35f, -0.27f, 3.2f, -0.51f)
                verticalLineToRelative(-0.51f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(0.51f)
                curveToRelative(1.84f, 0.25f, 3.09f, 0.49f, 3.2f, 0.51f)
                curveToRelative(0.47f, 0.09f, 0.8f, 0.5f, 0.8f, 0.98f)
                close()
                moveTo(7f, 8.27f)
                curveToRelative(1.53f, -0.15f, 3.26f, -0.27f, 5f, -0.27f)
                reflectiveCurveToRelative(3.47f, 0.12f, 5f, 0.27f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                close()
                moveTo(21f, 10.84f)
                curveToRelative(-1.59f, -0.27f, -5.32f, -0.83f, -9f, -0.83f)
                reflectiveCurveToRelative(-7.41f, 0.56f, -9f, 0.83f)
                verticalLineToRelative(2.17f)
                curveToRelative(0f, 8f, 2.82f, 8f, 9f, 8f)
                reflectiveCurveToRelative(9f, 0f, 9f, -8f)
                close()
            }
        }.also { _ShoppingBasket = it}
