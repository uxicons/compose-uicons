package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Sc.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15f)
                curveToRelative(-0.88f, 0f, -1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                close()
                moveTo(15.07f, 1.31f)
                curveToRelative(-0.83f, 0.86f, -2.13f, 2.18f, -2.58f, 2.68f)
                lineToRelative(7.57f, 7.57f)
                curveToRelative(0.48f, -0.45f, 1.79f, -1.72f, 2.64f, -2.53f)
                curveToRelative(0.4f, -0.39f, 0.41f, -1.02f, 0.02f, -1.42f)
                lineToRelative(-6.21f, -6.3f)
                curveToRelative(-0.39f, -0.4f, -1.04f, -0.4f, -1.43f, 0.01f)
                close()
                moveTo(10.57f, 4.89f)
                curveToRelative(-3.24f, 0.27f, -3.54f, 0.56f, -3.77f, 0.79f)
                curveToRelative(-6.17f, 6.17f, -5.75f, 15.27f, -5.73f, 15.36f)
                curveToRelative(0.02f, 0.15f, 0.06f, 0.29f, 0.11f, 0.43f)
                lineToRelative(6.05f, -6.05f)
                curveToRelative(-0.15f, -0.4f, -0.23f, -0.86f, -0.23f, -1.41f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                curveToRelative(-0.51f, 0f, -0.95f, -0.07f, -1.33f, -0.2f)
                lineToRelative(-6.07f, 6.07f)
                curveToRelative(0.13f, 0.05f, 0.27f, 0.08f, 0.41f, 0.1f)
                curveToRelative(3.06f, 0.09f, 9.89f, -0.51f, 15.36f, -5.73f)
                curveToRelative(0.23f, -0.23f, 0.63f, -0.64f, 0.9f, -3.65f)
                close()
            }
        }.also { _PenNib = it}
