package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner: ImageVector? = null

val Icons.Rr.Banner: ImageVector
    get() = _Banner ?: UXIcon(name = "Banner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.56f, 9.57f)
                curveToRelative(0.43f, -0.49f, 0.56f, -1.18f, 0.32f, -1.8f)
                curveToRelative(-0.22f, -0.59f, -0.74f, -1.01f, -1.35f, -1.1f)
                curveToRelative(-2.31f, -0.32f, -7.21f, -0.67f, -10.53f, -0.67f)
                reflectiveCurveToRelative(-8.22f, 0.35f, -10.53f, 0.67f)
                curveToRelative(-0.61f, 0.09f, -1.13f, 0.51f, -1.35f, 1.1f)
                curveToRelative(-0.23f, 0.62f, -0.11f, 1.31f, 0.32f, 1.8f)
                curveToRelative(0.05f, 0.06f, 3.21f, 2.31f, 3.21f, 2.31f)
                curveToRelative(0f, 0f, -2.8f, 2.81f, -2.83f, 2.85f)
                curveToRelative(-0.4f, 0.58f, -0.43f, 1.34f, -0.06f, 1.94f)
                curveToRelative(0.35f, 0.58f, 0.98f, 0.89f, 1.65f, 0.81f)
                curveToRelative(2.38f, -0.3f, 6.6f, -0.54f, 9.6f, -0.54f)
                reflectiveCurveToRelative(7.22f, 0.24f, 9.6f, 0.54f)
                curveToRelative(0.07f, 0.01f, 0.14f, 0.01f, 0.21f, 0.01f)
                curveToRelative(0.58f, 0f, 1.12f, -0.3f, 1.43f, -0.82f)
                curveToRelative(0.36f, -0.6f, 0.34f, -1.37f, -0.06f, -1.94f)
                curveToRelative(-0.03f, -0.05f, -2.83f, -2.85f, -2.83f, -2.85f)
                curveToRelative(0f, 0f, 3.16f, -2.25f, 3.21f, -2.31f)
                close()
                moveTo(18.23f, 10.93f)
                curveToRelative(-0.24f, 0.17f, -0.39f, 0.44f, -0.42f, 0.73f)
                curveToRelative(-0.03f, 0.29f, 0.08f, 0.58f, 0.29f, 0.79f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(-2.52f, -0.27f, -6.29f, -0.46f, -9.05f, -0.46f)
                reflectiveCurveToRelative(-6.54f, 0.2f, -9.05f, 0.46f)
                lineToRelative(2.95f, -2.95f)
                curveToRelative(0.21f, -0.21f, 0.31f, -0.5f, 0.29f, -0.79f)
                curveToRelative(-0.02f, -0.29f, -0.18f, -0.56f, -0.42f, -0.73f)
                lineToRelative(-3.34f, -2.37f)
                curveToRelative(2.43f, -0.28f, 6.63f, -0.57f, 9.57f, -0.57f)
                reflectiveCurveToRelative(7.14f, 0.28f, 9.57f, 0.57f)
                lineToRelative(-3.34f, 2.37f)
                close()
            }
        }.also { _Banner = it}
