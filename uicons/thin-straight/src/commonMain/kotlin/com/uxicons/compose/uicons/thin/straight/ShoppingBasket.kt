package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Ts.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 12f)
                close()
                moveTo(17f, 20f)
                horizontalLineToRelative(1f)
                lineTo(18f, 12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(1f)
                lineTo(7f, 12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                close()
                moveTo(23.98f, 8f)
                lineToRelative(-1.84f, 13.83f)
                curveToRelative(-0.17f, 1.24f, -1.23f, 2.17f, -2.48f, 2.17f)
                lineTo(4.34f, 24f)
                curveToRelative(-1.25f, 0f, -2.31f, -0.93f, -2.48f, -2.17f)
                lineTo(0.02f, 8f)
                lineTo(3.06f, 8f)
                curveTo(3.56f, 3.51f, 7.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8.44f, 3.51f, 8.94f, 8f)
                horizontalLineToRelative(3.04f)
                close()
                moveTo(4.07f, 8f)
                horizontalLineToRelative(15.86f)
                curveToRelative(-0.49f, -3.94f, -3.86f, -7f, -7.93f, -7f)
                reflectiveCurveToRelative(-7.44f, 3.06f, -7.93f, 7f)
                close()
                moveTo(22.83f, 9f)
                lineTo(1.16f, 9f)
                lineToRelative(1.69f, 12.7f)
                curveToRelative(0.1f, 0.74f, 0.74f, 1.3f, 1.49f, 1.3f)
                horizontalLineToRelative(15.31f)
                curveToRelative(0.75f, 0f, 1.39f, -0.56f, 1.49f, -1.3f)
                lineToRelative(1.69f, -12.7f)
                close()
            }
        }.also { _ShoppingBasket = it}
