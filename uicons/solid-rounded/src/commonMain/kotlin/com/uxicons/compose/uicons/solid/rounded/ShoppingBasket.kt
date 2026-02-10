package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Sr.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.3f, 9.03f)
                curveToRelative(-0.57f, -0.66f, -1.4f, -1.03f, -2.27f, -1.03f)
                horizontalLineToRelative(-0.09f)
                curveTo(20.45f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.87f, 0f, -1.7f, 0.38f, -2.27f, 1.03f)
                reflectiveCurveTo(-0.09f, 10.56f, 0.03f, 11.43f)
                lineToRelative(1.06f, 7.42f)
                curveToRelative(0.42f, 2.94f, 2.97f, 5.15f, 5.94f, 5.15f)
                horizontalLineToRelative(9.97f)
                curveToRelative(2.97f, 0f, 5.52f, -2.21f, 5.94f, -5.15f)
                lineToRelative(1.06f, -7.42f)
                curveToRelative(0.12f, -0.86f, -0.13f, -1.73f, -0.7f, -2.39f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.52f, 0f, 6.44f, 2.61f, 6.93f, 6f)
                lineTo(5.07f, 8f)
                curveToRelative(0.49f, -3.39f, 3.41f, -6f, 6.93f, -6f)
                close()
                moveTo(8f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ShoppingBasket = it}
