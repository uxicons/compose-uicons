package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagShoppingMinus: ImageVector? = null

val Icons.Bs.BagShoppingMinus: ImageVector
    get() = _BagShoppingMinus ?: UXIcon(name = "BagShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(13f, 24f)
                verticalLineToRelative(-3f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(3f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(9f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                lineTo(15f, 21f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _BagShoppingMinus = it}
