package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _W: ImageVector? = null

val Icons.Sr.W: ImageVector
    get() = _W ?: UXIcon(name = "W") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.84f, 24.01f)
                curveToRelative(-0.1f, 0f, -0.2f, -0.0f, -0.29f, -0.01f)
                curveToRelative(-1.65f, -0.13f, -2.95f, -1.32f, -3.22f, -2.95f)
                lineTo(0.01f, 1.16f)
                curveTo(-0.08f, 0.62f, 0.29f, 0.1f, 0.83f, 0.01f)
                curveToRelative(0.55f, -0.1f, 1.06f, 0.28f, 1.15f, 0.82f)
                lineToRelative(3.31f, 19.88f)
                curveToRelative(0.15f, 0.88f, 0.82f, 1.24f, 1.41f, 1.29f)
                curveToRelative(0.58f, 0.04f, 1.31f, -0.21f, 1.59f, -1.05f)
                lineToRelative(2.76f, -8.27f)
                curveToRelative(0.14f, -0.41f, 0.52f, -0.68f, 0.95f, -0.68f)
                reflectiveCurveToRelative(0.81f, 0.28f, 0.95f, 0.68f)
                lineToRelative(2.76f, 8.27f)
                curveToRelative(0.28f, 0.85f, 1.0f, 1.09f, 1.59f, 1.05f)
                curveToRelative(0.58f, -0.05f, 1.26f, -0.41f, 1.41f, -1.29f)
                lineTo(22.01f, 0.84f)
                curveToRelative(0.09f, -0.55f, 0.6f, -0.92f, 1.15f, -0.82f)
                curveToRelative(0.55f, 0.09f, 0.91f, 0.61f, 0.82f, 1.15f)
                lineToRelative(-3.31f, 19.88f)
                curveToRelative(-0.27f, 1.64f, -1.57f, 2.82f, -3.22f, 2.95f)
                curveToRelative(-1.64f, 0.13f, -3.12f, -0.84f, -3.64f, -2.41f)
                lineToRelative(-1.81f, -5.42f)
                lineToRelative(-1.81f, 5.42f)
                curveToRelative(-0.49f, 1.48f, -1.82f, 2.43f, -3.35f, 2.43f)
                close()
            }
        }.also { _W = it}
