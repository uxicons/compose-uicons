package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barefoot: ImageVector? = null

val Icons.Sr.Barefoot: ImageVector
    get() = _Barefoot ?: UXIcon(name = "Barefoot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineToRelative(-6.15f)
                curveToRelative(-1.74f, 0f, -3.4f, -0.76f, -4.56f, -2.1f)
                curveToRelative(-3.16f, -3.63f, -5.98f, -6.04f, -7.56f, -6.43f)
                curveToRelative(-2.34f, -0.58f, -3.74f, -2.18f, -3.74f, -4.26f)
                curveToRelative(0f, -1.77f, 1.03f, -2.63f, 1.85f, -3.31f)
                curveToRelative(0.49f, -0.4f, 0.95f, -0.79f, 1.24f, -1.35f)
                lineTo(5.99f, 0.55f)
                curveTo(6.16f, 0.21f, 6.5f, -0.01f, 6.89f, -0.01f)
                horizontalLineToRelative(0.0f)
                lineToRelative(9.11f, 0.01f)
                curveToRelative(0.34f, 0f, 0.66f, 0.18f, 0.84f, 0.47f)
                reflectiveCurveToRelative(0.21f, 0.65f, 0.06f, 0.96f)
                lineToRelative(-3.24f, 6.89f)
                curveToRelative(-0.29f, 0.62f, -0.22f, 1.36f, 0.18f, 1.98f)
                curveToRelative(0.73f, 1.12f, 1.34f, 2.35f, 1.98f, 3.65f)
                curveToRelative(0.93f, 1.9f, 1.89f, 3.85f, 3.36f, 5.71f)
                curveToRelative(0.17f, 0.22f, 0.45f, 0.34f, 0.76f, 0.34f)
                horizontalLineToRelative(2.06f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Barefoot = it}
