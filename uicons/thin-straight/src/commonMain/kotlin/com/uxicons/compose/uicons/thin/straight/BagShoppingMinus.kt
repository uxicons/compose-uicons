package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagShoppingMinus: ImageVector? = null

val Icons.Ts.BagShoppingMinus: ImageVector
    get() = _BagShoppingMinus ?: UXIcon(name = "BagShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(14f, 24f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                lineTo(7f, 6f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _BagShoppingMinus = it}
