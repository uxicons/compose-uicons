package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCart: ImageVector? = null

val Icons.Ts.ShoppingCart: ImageVector
    get() = _ShoppingCart ?: UXIcon(name = "ShoppingCart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.92f, 4f)
                lineTo(4.49f, 4f)
                lineToRelative(-0.26f, -1.84f)
                curveToRelative(-0.17f, -1.23f, -1.23f, -2.16f, -2.48f, -2.16f)
                lineTo(0f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.74f, 0f, 1.38f, 0.56f, 1.49f, 1.29f)
                lineToRelative(2.02f, 14.55f)
                curveToRelative(0.17f, 1.23f, 1.23f, 2.16f, 2.48f, 2.16f)
                horizontalLineToRelative(12.26f)
                verticalLineToRelative(-1f)
                lineTo(7.74f, 18f)
                curveToRelative(-0.74f, 0f, -1.38f, -0.56f, -1.49f, -1.29f)
                lineToRelative(-0.24f, -1.71f)
                horizontalLineToRelative(15.7f)
                lineToRelative(2.2f, -11f)
                close()
                moveTo(5.88f, 14f)
                lineToRelative(-1.25f, -9f)
                horizontalLineToRelative(18.07f)
                lineToRelative(-1.8f, 9f)
                lineTo(5.88f, 14f)
                close()
                moveTo(7f, 20f)
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
            }
        }.also { _ShoppingCart = it}
