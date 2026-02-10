package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartCheck: ImageVector? = null

val Icons.Ts.ShoppingCartCheck: ImageVector
    get() = _ShoppingCartCheck ?: UXIcon(name = "ShoppingCartCheck") {
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
                moveTo(22.78f, 5f)
                horizontalLineToRelative(1.02f)
                lineToRelative(-2.04f, 10f)
                lineTo(6.02f, 15f)
                lineToRelative(0.24f, 1.71f)
                curveToRelative(0.1f, 0.74f, 0.74f, 1.29f, 1.49f, 1.29f)
                horizontalLineToRelative(12.26f)
                verticalLineToRelative(1f)
                lineTo(7.74f, 19f)
                curveToRelative(-1.24f, 0f, -2.31f, -0.93f, -2.48f, -2.16f)
                lineTo(3.25f, 2.29f)
                curveToRelative(-0.1f, -0.74f, -0.74f, -1.29f, -1.49f, -1.29f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                horizontalLineToRelative(1.76f)
                curveToRelative(1.24f, 0f, 2.31f, 0.93f, 2.48f, 2.16f)
                lineToRelative(0.26f, 1.84f)
                horizontalLineToRelative(6.02f)
                lineToRelative(1.05f, 1f)
                horizontalLineToRelative(-6.93f)
                lineToRelative(1.25f, 9f)
                horizontalLineToRelative(15.06f)
                lineToRelative(1.84f, -9f)
                close()
                moveTo(15.82f, 6.31f)
                lineToRelative(-2.69f, -2.57f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(2.69f, 2.57f)
                curveToRelative(0.58f, 0.55f, 1.51f, 0.54f, 2.08f, -0.02f)
                lineToRelative(4.55f, -4.55f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.55f, 4.55f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.76f, 0.72f)
                curveToRelative(-0.62f, 0f, -1.24f, -0.23f, -1.72f, -0.68f)
                close()
            }
        }.also { _ShoppingCartCheck = it}
