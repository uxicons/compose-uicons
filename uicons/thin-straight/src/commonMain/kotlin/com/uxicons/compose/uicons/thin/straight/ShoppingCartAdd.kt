package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartAdd: ImageVector? = null

val Icons.Ts.ShoppingCartAdd: ImageVector
    get() = _ShoppingCartAdd ?: UXIcon(name = "ShoppingCartAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(7f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(22.33f, 7f)
                horizontalLineToRelative(1.02f)
                lineToRelative(-1.6f, 8f)
                lineTo(6.02f, 15f)
                lineToRelative(0.24f, 1.71f)
                curveToRelative(0.1f, 0.74f, 0.74f, 1.29f, 1.49f, 1.29f)
                horizontalLineToRelative(12.26f)
                verticalLineToRelative(1f)
                lineTo(7.74f, 19f)
                curveToRelative(-1.24f, 0f, -2.31f, -0.93f, -2.48f, -2.16f)
                lineTo(3.24f, 2.29f)
                curveToRelative(-0.1f, -0.74f, -0.74f, -1.29f, -1.49f, -1.29f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                horizontalLineToRelative(1.76f)
                curveToRelative(1.24f, 0f, 2.31f, 0.93f, 2.48f, 2.16f)
                lineToRelative(0.26f, 1.84f)
                horizontalLineToRelative(8.51f)
                verticalLineToRelative(1f)
                lineTo(4.63f, 5f)
                lineToRelative(1.25f, 9f)
                horizontalLineToRelative(15.06f)
                lineToRelative(1.4f, -7f)
                close()
            }
        }.also { _ShoppingCartAdd = it}
