package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNib: ImageVector? = null

val Icons.Br.PenNib: ImageVector
    get() = _PenNib ?: UXIcon(name = "PenNib") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 7.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(-4.88f, -4.88f)
            lineToRelative(1.44f, -1.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-2.28f, 2.28f)
            lineToRelative(-5.33f, 2.13f)
            curveToRelative(-1.63f, 0.65f, -2.84f, 1.99f, -3.33f, 3.67f)
            lineTo(0.13f, 19.98f)
            curveToRelative(-0.32f, 1.1f, -0.02f, 2.29f, 0.79f, 3.1f)
            curveToRelative(0.6f, 0.6f, 1.4f, 0.92f, 2.22f, 0.92f)
            curveToRelative(0.29f, 0f, 0.59f, -0.04f, 0.88f, -0.13f)
            lineToRelative(11.46f, -3.36f)
            curveToRelative(1.68f, -0.49f, 3.02f, -1.71f, 3.67f, -3.33f)
            lineToRelative(2.13f, -5.33f)
            lineToRelative(2.28f, -2.28f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(16.36f, 16.06f)
            curveToRelative(-0.31f, 0.77f, -0.94f, 1.34f, -1.73f, 1.57f)
            lineToRelative(-8.69f, 2.55f)
            lineToRelative(4.22f, -4.22f)
            curveToRelative(0.11f, 0.02f, 0.23f, 0.04f, 0.34f, 0.04f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            curveToRelative(0f, 0.12f, 0.02f, 0.23f, 0.04f, 0.34f)
            lineToRelative(-4.22f, 4.22f)
            lineToRelative(2.55f, -8.69f)
            curveToRelative(0.23f, -0.79f, 0.8f, -1.42f, 1.57f, -1.73f)
            lineToRelative(4.7f, -1.88f)
            lineToRelative(5.6f, 5.6f)
            lineToRelative(-1.88f, 4.7f)
            close()
        }
    }.also { _PenNib = it }
