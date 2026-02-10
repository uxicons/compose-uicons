package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Ss.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.23f, 3.65f)
                lineToRelative(9.12f, 9.12f)
                lineToRelative(-2.54f, 7.07f)
                lineTo(1.42f, 24f)
                lineToRelative(8.07f, -8.07f)
                curveToRelative(0.16f, 0.04f, 0.34f, 0.07f, 0.51f, 0.07f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.18f, 0.02f, 0.35f, 0.07f, 0.52f)
                lineTo(0.01f, 22.59f)
                lineTo(4.15f, 6.19f)
                lineToRelative(7.08f, -2.54f)
                close()
                moveTo(16f, 0.01f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(8f, 8f)
                lineToRelative(2.79f, -2.79f)
                lineTo(16f, 0.01f)
                close()
            }
        }.also { _PenNib = it}
