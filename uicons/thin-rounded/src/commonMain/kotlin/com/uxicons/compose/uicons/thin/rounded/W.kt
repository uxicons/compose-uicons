package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _W: ImageVector? = null

val Icons.Tr.W: ImageVector
    get() = _W ?: UXIcon(name = "W") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.16f, 24.01f)
                curveToRelative(-1.32f, 0f, -2.45f, -0.81f, -2.88f, -2.08f)
                lineToRelative(-2.28f, -6.85f)
                lineToRelative(-2.28f, 6.85f)
                curveToRelative(-0.45f, 1.35f, -1.71f, 2.19f, -3.13f, 2.07f)
                curveToRelative(-1.42f, -0.11f, -2.53f, -1.13f, -2.77f, -2.54f)
                lineTo(0.01f, 0.59f)
                curveTo(-0.04f, 0.32f, 0.14f, 0.06f, 0.41f, 0.01f)
                curveToRelative(0.27f, -0.04f, 0.53f, 0.13f, 0.58f, 0.4f)
                lineToRelative(3.81f, 20.88f)
                curveToRelative(0.2f, 1.17f, 1.12f, 1.65f, 1.86f, 1.71f)
                curveToRelative(0.74f, 0.05f, 1.73f, -0.27f, 2.1f, -1.39f)
                lineToRelative(2.76f, -8.27f)
                curveToRelative(0.14f, -0.41f, 0.81f, -0.41f, 0.95f, 0f)
                lineToRelative(2.76f, 8.27f)
                curveToRelative(0.37f, 1.12f, 1.36f, 1.45f, 2.1f, 1.39f)
                curveToRelative(0.73f, -0.06f, 1.66f, -0.54f, 1.86f, -1.7f)
                lineTo(23.01f, 0.41f)
                curveToRelative(0.05f, -0.27f, 0.31f, -0.45f, 0.58f, -0.4f)
                curveToRelative(0.27f, 0.05f, 0.45f, 0.31f, 0.4f, 0.58f)
                lineToRelative(-3.81f, 20.88f)
                curveToRelative(-0.23f, 1.4f, -1.34f, 2.42f, -2.77f, 2.53f)
                curveToRelative(-0.09f, 0.01f, -0.17f, 0.01f, -0.25f, 0.01f)
                close()
            }
        }.also { _W = it}
