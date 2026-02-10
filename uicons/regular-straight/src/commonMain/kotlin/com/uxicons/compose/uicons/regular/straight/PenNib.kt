package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Rs.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 8.46f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.52f, 2.52f)
                lineToRelative(-5.59f, -5.59f)
                lineToRelative(2.52f, -2.52f)
                lineTo(15.54f, 0.05f)
                lineToRelative(-3.08f, 3.08f)
                lineToRelative(-8.28f, 3.07f)
                lineTo(0.01f, 23.99f)
                lineToRelative(17.79f, -4.17f)
                lineToRelative(3.07f, -8.28f)
                lineToRelative(3.08f, -3.08f)
                close()
                moveTo(16.3f, 18.12f)
                lineToRelative(-11.76f, 2.76f)
                lineToRelative(4.94f, -4.94f)
                curveToRelative(0.17f, 0.04f, 0.34f, 0.07f, 0.52f, 0.07f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.18f, 0.02f, 0.35f, 0.07f, 0.52f)
                lineToRelative(-4.94f, 4.94f)
                lineToRelative(2.76f, -11.76f)
                lineToRelative(6.88f, -2.55f)
                lineToRelative(6.09f, 6.09f)
                lineToRelative(-2.55f, 6.88f)
                close()
            }
        }.also { _PenNib = it}
