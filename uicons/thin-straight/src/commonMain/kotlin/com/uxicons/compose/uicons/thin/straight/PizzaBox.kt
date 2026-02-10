package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaBox: ImageVector? = null

val Icons.Ts.PizzaBox: ImageVector
    get() = _PizzaBox ?: UXIcon(name = "PizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(1.13f)
                lineToRelative(2.48f, 4.46f)
                lineToRelative(-2.47f, 15.83f)
                lineToRelative(-0.01f, 2.58f)
                horizontalLineToRelative(24f)
                lineToRelative(-0.01f, -2.58f)
                lineToRelative(-2.47f, -15.83f)
                lineToRelative(2.48f, -4.46f)
                verticalLineToRelative(-1.13f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(22f)
                close()
                moveTo(22.92f, 21f)
                horizontalLineToRelative(-21.84f)
                lineToRelative(2.34f, -15f)
                horizontalLineToRelative(17.14f)
                lineToRelative(2.35f, 15f)
                close()
                moveTo(20.71f, 5f)
                horizontalLineToRelative(-17.41f)
                lineToRelative(-2.22f, -4f)
                horizontalLineToRelative(21.86f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-4.41f, 0f, -8f, 2.92f, -8f, 6.5f)
                reflectiveCurveToRelative(3.59f, 6.5f, 8f, 6.5f)
                reflectiveCurveToRelative(8f, -2.92f, 8f, -6.5f)
                reflectiveCurveToRelative(-3.59f, -6.5f, -8f, -6.5f)
                close()
                moveTo(19f, 13.5f)
                curveToRelative(0f, 0.92f, -0.29f, 1.78f, -0.8f, 2.54f)
                lineToRelative(-5.08f, -2.54f)
                lineToRelative(5.08f, -2.54f)
                curveToRelative(0.51f, 0.76f, 0.8f, 1.62f, 0.8f, 2.54f)
                close()
                moveTo(17.55f, 10.16f)
                lineTo(12.5f, 12.69f)
                verticalLineToRelative(-4.67f)
                curveToRelative(2.06f, 0.12f, 3.87f, 0.93f, 5.05f, 2.15f)
                close()
                moveTo(11.5f, 8.02f)
                verticalLineToRelative(4.67f)
                lineToRelative(-5.05f, -2.53f)
                curveToRelative(1.19f, -1.22f, 3.0f, -2.03f, 5.05f, -2.15f)
                close()
                moveTo(5.8f, 10.96f)
                lineTo(10.88f, 13.5f)
                lineTo(5.8f, 16.04f)
                curveToRelative(-0.51f, -0.76f, -0.8f, -1.62f, -0.8f, -2.54f)
                reflectiveCurveToRelative(0.29f, -1.78f, 0.8f, -2.54f)
                close()
                moveTo(6.45f, 16.83f)
                lineTo(11.5f, 14.31f)
                verticalLineToRelative(4.67f)
                curveToRelative(-2.06f, -0.12f, -3.87f, -0.93f, -5.05f, -2.15f)
                close()
                moveTo(12.5f, 18.98f)
                verticalLineToRelative(-4.67f)
                lineToRelative(5.05f, 2.53f)
                curveToRelative(-1.19f, 1.22f, -3.0f, 2.03f, -5.05f, 2.15f)
                close()
            }
        }.also { _PizzaBox = it}
