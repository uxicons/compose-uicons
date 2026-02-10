package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Sr.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 8.71f)
                lineToRelative(-2.29f, 2.29f)
                lineTo(13f, 2.59f)
                lineTo(15.29f, 0.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(7f, 7f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(11.19f, 3.6f)
                lineToRelative(-4.61f, 1.7f)
                curveToRelative(-1.49f, 0.55f, -2.64f, 1.79f, -3.07f, 3.32f)
                lineTo(0.11f, 20.55f)
                curveToRelative(-0.18f, 0.61f, -0.13f, 1.25f, 0.11f, 1.82f)
                lineToRelative(7.85f, -7.85f)
                curveToRelative(-0.04f, -0.17f, -0.07f, -0.34f, -0.07f, -0.52f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.02f, -0.52f, -0.07f)
                lineToRelative(-7.85f, 7.85f)
                curveToRelative(0.34f, 0.14f, 0.7f, 0.22f, 1.06f, 0.22f)
                curveToRelative(0.25f, 0f, 0.5f, -0.04f, 0.75f, -0.11f)
                lineToRelative(11.88f, -3.38f)
                curveToRelative(1.52f, -0.43f, 2.76f, -1.57f, 3.31f, -3.05f)
                lineToRelative(1.75f, -4.66f)
                lineTo(11.19f, 3.6f)
                close()
            }
        }.also { _PenNib = it}
