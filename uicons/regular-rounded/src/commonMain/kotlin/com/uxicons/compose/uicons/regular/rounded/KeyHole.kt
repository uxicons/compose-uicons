package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Rr.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.52f, 12.35f)
                curveToRelative(1.56f, -1.32f, 2.48f, -3.27f, 2.48f, -5.35f)
                curveToRelative(0f, -2.12f, -0.94f, -4.1f, -2.59f, -5.44f)
                curveTo(14.76f, 0.23f, 12.6f, -0.29f, 10.49f, 0.16f)
                curveToRelative(-2.61f, 0.55f, -4.75f, 2.67f, -5.32f, 5.28f)
                curveToRelative(-0.57f, 2.6f, 0.34f, 5.24f, 2.31f, 6.91f)
                lineToRelative(-2.39f, 8.05f)
                curveToRelative(-0.44f, 1.79f, 1.07f, 3.65f, 2.9f, 3.6f)
                horizontalLineToRelative(8.03f)
                curveToRelative(1.88f, 0.03f, 3.35f, -1.81f, 2.88f, -3.68f)
                lineToRelative(-2.39f, -7.98f)
                close()
                moveTo(16.79f, 21.64f)
                curveToRelative(-0.19f, 0.23f, -0.46f, 0.36f, -0.76f, 0.36f)
                lineTo(8f, 22f)
                curveToRelative(-0.56f, 0.04f, -1.08f, -0.6f, -0.97f, -1.1f)
                lineToRelative(2.56f, -8.64f)
                curveToRelative(0.12f, -0.42f, -0.04f, -0.87f, -0.4f, -1.11f)
                curveToRelative(-1.71f, -1.16f, -2.52f, -3.23f, -2.08f, -5.28f)
                curveToRelative(0.4f, -1.85f, 1.92f, -3.36f, 3.78f, -3.75f)
                curveToRelative(0.36f, -0.08f, 0.72f, -0.11f, 1.08f, -0.11f)
                curveToRelative(1.15f, 0f, 2.27f, 0.39f, 3.16f, 1.11f)
                curveToRelative(1.18f, 0.95f, 1.85f, 2.37f, 1.85f, 3.88f)
                curveToRelative(0f, 1.66f, -0.82f, 3.21f, -2.2f, 4.14f)
                curveToRelative(-0.36f, 0.24f, -0.52f, 0.7f, -0.4f, 1.11f)
                lineToRelative(2.57f, 8.57f)
                curveToRelative(0.06f, 0.29f, -0.01f, 0.58f, -0.19f, 0.81f)
                close()
            }
        }.also { _KeyHole = it}
