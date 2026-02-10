package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Sc.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 9.02f)
                curveToRelative(-0.09f, -0.02f, -1.13f, -0.22f, -2.7f, -0.45f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                reflectiveCurveToRelative(-7.5f, 3.36f, -7.5f, 7.5f)
                verticalLineToRelative(0.07f)
                curveToRelative(-1.56f, 0.22f, -2.6f, 0.43f, -2.7f, 0.45f)
                curveToRelative(-0.47f, 0.09f, -0.8f, 0.5f, -0.8f, 0.98f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 10f, 4.85f, 10f, 11f, 10f)
                reflectiveCurveToRelative(11f, 0f, 11f, -10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f)
                close()
                moveTo(7f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(7.53f, 8.22f)
                curveToRelative(0.15f, -2.35f, 2.09f, -4.22f, 4.47f, -4.22f)
                reflectiveCurveToRelative(4.32f, 1.87f, 4.47f, 4.22f)
                curveToRelative(-1.39f, -0.13f, -2.93f, -0.22f, -4.47f, -0.22f)
                reflectiveCurveToRelative(-3.08f, 0.09f, -4.47f, 0.22f)
                close()
                moveTo(15f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ShoppingBasket = it}
