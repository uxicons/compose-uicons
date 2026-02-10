package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _V: ImageVector? = null

val Icons.Rr.V: ImageVector
    get() = _V ?: UXIcon(name = "V") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24.01f)
                curveToRelative(-1.87f, 0f, -3.46f, -1.08f, -4.14f, -2.83f)
                lineTo(0.07f, 1.36f)
                curveTo(-0.13f, 0.85f, 0.12f, 0.27f, 0.63f, 0.07f)
                curveToRelative(0.51f, -0.2f, 1.09f, 0.05f, 1.3f, 0.56f)
                lineToRelative(7.79f, 19.82f)
                curveToRelative(0.92f, 2.1f, 3.64f, 2.1f, 4.57f, 0f)
                lineTo(22.07f, 0.64f)
                curveToRelative(0.2f, -0.52f, 0.78f, -0.77f, 1.3f, -0.56f)
                curveToRelative(0.51f, 0.2f, 0.77f, 0.78f, 0.56f, 1.3f)
                lineToRelative(-7.79f, 19.82f)
                curveToRelative(-0.68f, 1.74f, -2.27f, 2.83f, -4.14f, 2.83f)
                close()
            }
        }.also { _V = it}
