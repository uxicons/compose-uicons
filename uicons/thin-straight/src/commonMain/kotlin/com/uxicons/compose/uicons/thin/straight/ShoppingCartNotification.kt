package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartNotification: ImageVector? = null

val Icons.Ts.ShoppingCartNotification: ImageVector
    get() = _ShoppingCartNotification ?: UXIcon(name = "ShoppingCartNotification") {
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
                moveTo(20f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(21.63f, 9.77f)
                curveToRelative(0.39f, -0.11f, 0.76f, -0.25f, 1.11f, -0.43f)
                lineToRelative(-1.13f, 5.66f)
                horizontalLineToRelative(-15.58f)
                lineToRelative(0.24f, 1.71f)
                curveToRelative(0.1f, 0.74f, 0.74f, 1.29f, 1.49f, 1.29f)
                horizontalLineToRelative(12.26f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-12.26f)
                curveToRelative(-1.24f, 0f, -2.31f, -0.93f, -2.48f, -2.16f)
                lineToRelative(-2.02f, -14.55f)
                curveToRelative(-0.1f, -0.74f, -0.74f, -1.29f, -1.49f, -1.29f)
                horizontalLineToRelative(-1.76f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.76f)
                curveToRelative(1.24f, 0f, 2.31f, 0.93f, 2.48f, 2.16f)
                lineToRelative(0.26f, 1.84f)
                horizontalLineToRelative(9.51f)
                curveToRelative(0f, 0.34f, 0.04f, 0.67f, 0.09f, 1f)
                horizontalLineToRelative(-9.46f)
                lineToRelative(1.25f, 9f)
                horizontalLineToRelative(14.9f)
                close()
            }
        }.also { _ShoppingCartNotification = it}
