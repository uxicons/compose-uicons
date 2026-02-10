package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleOverlap: ImageVector? = null

val Icons.Ss.CircleOverlap: ImageVector
    get() = _CircleOverlap ?: UXIcon(name = "CircleOverlap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 15.5f)
                curveToRelative(0f, 0.47f, 0.05f, 0.93f, 0.12f, 1.38f)
                curveTo(3.09f, 16.22f, 0f, 12.72f, 0f, 8.5f)
                curveTo(0f, 3.81f, 3.81f, 0f, 8.5f, 0f)
                curveToRelative(4.22f, 0f, 7.72f, 3.09f, 8.38f, 7.12f)
                curveToRelative(-0.45f, -0.07f, -0.91f, -0.12f, -1.38f, -0.12f)
                curveToRelative(-4.69f, 0f, -8.5f, 3.81f, -8.5f, 8.5f)
                close()
                moveTo(16.88f, 7.12f)
                curveToRelative(0.07f, 0.45f, 0.12f, 0.91f, 0.12f, 1.38f)
                curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
                curveToRelative(-0.47f, 0f, -0.93f, -0.05f, -1.38f, -0.12f)
                curveToRelative(0.66f, 4.03f, 4.16f, 7.12f, 8.38f, 7.12f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -4.22f, -3.09f, -7.72f, -7.12f, -8.38f)
                close()
            }
        }.also { _CircleOverlap = it}
