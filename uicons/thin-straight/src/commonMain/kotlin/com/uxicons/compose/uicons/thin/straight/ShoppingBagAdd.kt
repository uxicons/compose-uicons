package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBagAdd: ImageVector? = null

val Icons.Ts.ShoppingBagAdd: ImageVector
    get() = _ShoppingBagAdd ?: UXIcon(name = "ShoppingBagAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                lineTo(7f, 6f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _ShoppingBagAdd = it}
