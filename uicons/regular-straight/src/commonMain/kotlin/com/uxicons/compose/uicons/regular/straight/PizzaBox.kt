package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaBox: ImageVector? = null

val Icons.Rs.PizzaBox: ImageVector
    get() = _PizzaBox ?: UXIcon(name = "PizzaBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(2.29f)
                lineToRelative(2.45f, 3.92f)
                lineToRelative(-2.44f, 14.63f)
                lineToRelative(-0.01f, 3.17f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                lineToRelative(-2.45f, -14.79f)
                lineToRelative(2.45f, -3.92f)
                close()
                moveTo(22f, 21.08f)
                verticalLineToRelative(0.92f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-0.92f)
                lineToRelative(2.35f, -14.08f)
                horizontalLineToRelative(15.3f)
                lineToRelative(2.35f, 14.08f)
                close()
                moveTo(19.95f, 5f)
                horizontalLineToRelative(-15.89f)
                lineToRelative(-1.88f, -3f)
                horizontalLineToRelative(19.64f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-4.41f, 0f, -8f, 2.92f, -8f, 6.5f)
                reflectiveCurveToRelative(3.59f, 6.5f, 8f, 6.5f)
                reflectiveCurveToRelative(8f, -2.92f, 8f, -6.5f)
                reflectiveCurveToRelative(-3.59f, -6.5f, -8f, -6.5f)
                close()
                moveTo(6f, 14.5f)
                curveToRelative(0f, -0.62f, 0.17f, -1.22f, 0.48f, -1.76f)
                lineToRelative(3.37f, 1.76f)
                lineToRelative(-3.37f, 1.76f)
                curveToRelative(-0.31f, -0.54f, -0.48f, -1.14f, -0.48f, -1.76f)
                close()
                moveTo(13f, 10.07f)
                curveToRelative(1.19f, 0.15f, 2.26f, 0.56f, 3.1f, 1.16f)
                lineToRelative(-3.1f, 1.62f)
                close()
                moveTo(11f, 12.85f)
                lineTo(7.9f, 11.22f)
                curveToRelative(0.84f, -0.59f, 1.91f, -1.0f, 3.1f, -1.16f)
                close()
                moveTo(11f, 16.15f)
                verticalLineToRelative(2.78f)
                curveToRelative(-1.19f, -0.15f, -2.26f, -0.56f, -3.1f, -1.16f)
                close()
                moveTo(13f, 16.15f)
                lineTo(16.1f, 17.78f)
                curveToRelative(-0.84f, 0.59f, -1.91f, 1.0f, -3.1f, 1.16f)
                close()
                moveTo(14.15f, 14.5f)
                lineTo(17.52f, 12.74f)
                curveToRelative(0.31f, 0.54f, 0.48f, 1.14f, 0.48f, 1.76f)
                reflectiveCurveToRelative(-0.17f, 1.22f, -0.48f, 1.76f)
                close()
            }
        }.also { _PizzaBox = it}
