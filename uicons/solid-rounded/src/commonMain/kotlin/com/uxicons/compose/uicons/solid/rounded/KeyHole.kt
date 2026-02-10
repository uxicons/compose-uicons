package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyHole: ImageVector? = null

val Icons.Sr.KeyHole: ImageVector
    get() = _KeyHole ?: UXIcon(name = "KeyHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.03f, 24f)
                horizontalLineTo(8f)
                curveToRelative(-1.84f, 0.05f, -3.34f, -1.81f, -2.9f, -3.6f)
                lineToRelative(2.39f, -8.05f)
                curveToRelative(-1.98f, -1.67f, -2.88f, -4.3f, -2.31f, -6.91f)
                curveTo(5.74f, 2.83f, 7.88f, 0.71f, 10.49f, 0.16f)
                curveToRelative(2.11f, -0.45f, 4.27f, 0.07f, 5.92f, 1.4f)
                curveToRelative(1.65f, 1.34f, 2.59f, 3.32f, 2.59f, 5.44f)
                curveToRelative(0f, 2.07f, -0.92f, 4.02f, -2.48f, 5.35f)
                lineToRelative(2.39f, 7.98f)
                curveToRelative(0.47f, 1.87f, -1.01f, 3.7f, -2.88f, 3.68f)
                close()
            }
        }.also { _KeyHole = it}
