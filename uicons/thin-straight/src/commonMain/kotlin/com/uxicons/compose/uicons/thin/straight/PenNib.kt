package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Ts.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 8.07f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.03f, 3.03f)
                lineToRelative(-6.62f, -6.62f)
                lineToRelative(3.03f, -3.03f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.31f, 3.31f)
                lineToRelative(-8.51f, 3.16f)
                lineTo(0.02f, 23.98f)
                lineToRelative(17.48f, -4.1f)
                lineToRelative(3.16f, -8.51f)
                lineToRelative(3.31f, -3.31f)
                close()
                moveTo(16.75f, 19.03f)
                lineToRelative(-14.47f, 3.39f)
                lineToRelative(5.84f, -5.84f)
                curveToRelative(0.4f, 0.26f, 0.87f, 0.42f, 1.38f, 0.42f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.51f, 0.15f, 0.98f, 0.42f, 1.38f)
                lineToRelative(-5.84f, 5.84f)
                lineToRelative(3.39f, -14.47f)
                lineToRelative(7.81f, -2.9f)
                lineToRelative(6.88f, 6.88f)
                lineToRelative(-2.9f, 7.81f)
                close()
                moveTo(8.0f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _PenNib = it}
