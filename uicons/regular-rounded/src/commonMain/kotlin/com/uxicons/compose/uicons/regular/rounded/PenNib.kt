package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Rr.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 7.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-5.59f, -5.59f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.85f, 2.85f)
                lineToRelative(-5.86f, 2.17f)
                curveToRelative(-1.49f, 0.55f, -2.64f, 1.79f, -3.07f, 3.32f)
                lineTo(0.11f, 20.55f)
                curveToRelative(-0.28f, 0.95f, -0.02f, 1.97f, 0.68f, 2.66f)
                curveToRelative(0.51f, 0.51f, 1.2f, 0.79f, 1.9f, 0.79f)
                curveToRelative(0.25f, 0f, 0.5f, -0.04f, 0.75f, -0.11f)
                lineToRelative(11.88f, -3.38f)
                curveToRelative(1.52f, -0.43f, 2.76f, -1.57f, 3.31f, -3.05f)
                lineToRelative(2.21f, -5.91f)
                lineToRelative(2.85f, -2.85f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(16.77f, 16.76f)
                curveToRelative(-0.33f, 0.89f, -1.08f, 1.57f, -1.99f, 1.83f)
                lineToRelative(-11.12f, 3.16f)
                lineToRelative(5.82f, -5.82f)
                curveToRelative(0.17f, 0.04f, 0.34f, 0.07f, 0.52f, 0.07f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.18f, 0.02f, 0.35f, 0.07f, 0.52f)
                lineToRelative(-5.82f, 5.82f)
                lineToRelative(3.18f, -11.16f)
                curveToRelative(0.26f, -0.92f, 0.95f, -1.66f, 1.84f, -1.99f)
                lineToRelative(5.47f, -2.02f)
                lineToRelative(6.09f, 6.09f)
                lineToRelative(-2.06f, 5.51f)
                close()
            }
        }.also { _PenNib = it}
