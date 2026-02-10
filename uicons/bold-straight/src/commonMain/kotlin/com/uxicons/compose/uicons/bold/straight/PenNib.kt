package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Bs.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 8.64f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.07f, 2.07f)
                lineToRelative(-4.38f, -4.38f)
                lineToRelative(2.07f, -2.07f)
                lineTo(15.36f, 0.02f)
                lineToRelative(-2.88f, 2.87f)
                lineToRelative(-8.25f, 2.7f)
                lineTo(0.0f, 24.0f)
                lineToRelative(18.41f, -4.23f)
                lineToRelative(2.7f, -8.26f)
                lineToRelative(2.87f, -2.87f)
                close()
                moveTo(6.75f, 19.37f)
                lineToRelative(3.4f, -3.4f)
                curveToRelative(0.12f, 0.02f, 0.23f, 0.03f, 0.35f, 0.03f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.12f, 0.01f, 0.24f, 0.03f, 0.35f)
                lineToRelative(-3.4f, 3.4f)
                lineToRelative(2.14f, -9.33f)
                lineToRelative(6.11f, -2.0f)
                lineToRelative(5.2f, 5.2f)
                lineToRelative(-2.0f, 6.11f)
                lineToRelative(-9.33f, 2.14f)
                close()
            }
        }.also { _PenNib = it}
