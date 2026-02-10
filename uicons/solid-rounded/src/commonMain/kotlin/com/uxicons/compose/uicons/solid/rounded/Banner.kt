package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Sr.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.82f, 17.5f)
                curveToRelative(-0.07f, 0f, -0.14f, -0.01f, -0.21f, -0.01f)
                curveToRelative(-2.38f, -0.3f, -6.6f, -0.54f, -9.6f, -0.54f)
                reflectiveCurveToRelative(-7.22f, 0.24f, -9.6f, 0.54f)
                curveToRelative(-0.67f, 0.08f, -1.3f, -0.23f, -1.65f, -0.81f)
                curveToRelative(-0.36f, -0.6f, -0.34f, -1.37f, 0.06f, -1.94f)
                curveToRelative(0.03f, -0.05f, 0.07f, -0.09f, 0.11f, -0.13f)
                lineToRelative(2.72f, -2.72f)
                lineToRelative(-3.03f, -2.15f)
                curveToRelative(-0.06f, -0.04f, -0.12f, -0.1f, -0.17f, -0.16f)
                curveToRelative(-0.43f, -0.49f, -0.56f, -1.18f, -0.32f, -1.8f)
                curveToRelative(0.22f, -0.59f, 0.74f, -1.01f, 1.35f, -1.1f)
                curveToRelative(2.31f, -0.32f, 7.21f, -0.67f, 10.53f, -0.67f)
                reflectiveCurveToRelative(8.22f, 0.35f, 10.53f, 0.67f)
                curveToRelative(0.61f, 0.09f, 1.13f, 0.51f, 1.35f, 1.1f)
                curveToRelative(0.23f, 0.62f, 0.11f, 1.31f, -0.32f, 1.8f)
                curveToRelative(-0.05f, 0.06f, -0.11f, 0.11f, -0.17f, 0.16f)
                lineToRelative(-3.03f, 2.15f)
                lineToRelative(2.72f, 2.72f)
                curveToRelative(0.04f, 0.04f, 0.08f, 0.09f, 0.11f, 0.13f)
                curveToRelative(0.4f, 0.58f, 0.43f, 1.34f, 0.06f, 1.94f)
                curveToRelative(-0.31f, 0.52f, -0.85f, 0.82f, -1.43f, 0.82f)
                close()
            }
        }.also { _Banner = it}
