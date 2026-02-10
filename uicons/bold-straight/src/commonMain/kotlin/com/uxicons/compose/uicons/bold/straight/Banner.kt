package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Bs.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.03f, 7.19f)
                lineToRelative(-2.85f, -0.4f)
                curveToRelative(-2.52f, -0.36f, -6.15f, -0.78f, -9.18f, -0.78f)
                reflectiveCurveToRelative(-6.66f, 0.42f, -9.18f, 0.78f)
                lineTo(-0.03f, 7.19f)
                lineToRelative(4.6f, 4.92f)
                lineTo(0.06f, 18.14f)
                lineToRelative(3.54f, -0.48f)
                curveToRelative(2.28f, -0.31f, 5.59f, -0.67f, 8.4f, -0.67f)
                reflectiveCurveToRelative(6.12f, 0.36f, 8.4f, 0.67f)
                lineToRelative(3.54f, 0.48f)
                lineToRelative(-4.52f, -6.03f)
                lineToRelative(4.6f, -4.92f)
                close()
                moveTo(17.31f, 14.29f)
                curveToRelative(-1.73f, -0.17f, -3.6f, -0.29f, -5.31f, -0.29f)
                reflectiveCurveToRelative(-3.58f, 0.12f, -5.31f, 0.29f)
                lineToRelative(1.79f, -2.39f)
                lineToRelative(-2.35f, -2.51f)
                curveToRelative(1.92f, -0.21f, 4.02f, -0.39f, 5.87f, -0.39f)
                reflectiveCurveToRelative(3.95f, 0.17f, 5.87f, 0.39f)
                lineToRelative(-2.35f, 2.51f)
                lineToRelative(1.79f, 2.39f)
                close()
            }
        }.also { _Banner = it}
