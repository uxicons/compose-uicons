package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartBuyer: ImageVector? = null

val Icons.Bs.ShoppingCartBuyer: ImageVector
    get() = _ShoppingCartBuyer ?: UXIcon(name = "ShoppingCartBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.01f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 15f)
                horizontalLineToRelative(-6.58f)
                curveToRelative(-0.25f, 0f, -0.46f, -0.19f, -0.5f, -0.43f)
                lineToRelative(-0.88f, -6.57f)
                horizontalLineToRelative(13.99f)
                lineToRelative(-0.57f, 2.05f)
                curveToRelative(1.06f, 0.1f, 2.02f, 0.53f, 2.78f, 1.19f)
                lineToRelative(1.73f, -6.24f)
                lineTo(5.65f, 5f)
                lineToRelative(-0.26f, -1.96f)
                curveToRelative(-0.23f, -1.73f, -1.72f, -3.04f, -3.47f, -3.04f)
                lineTo(0.01f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.25f, 0f, 0.46f, 0.19f, 0.5f, 0.43f)
                lineToRelative(1.54f, 11.53f)
                curveToRelative(0.23f, 1.73f, 1.72f, 3.04f, 3.47f, 3.04f)
                horizontalLineToRelative(7.6f)
                curveToRelative(-0.63f, -0.84f, -1.02f, -1.87f, -1.02f, -3f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _ShoppingCartBuyer = it}
