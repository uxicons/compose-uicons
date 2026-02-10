package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Sr.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.93f, 22.63f)
                lineTo(16.14f, 2.81f)
                curveTo(15.46f, 1.07f, 13.87f, -0.01f, 12f, -0.01f)
                reflectiveCurveToRelative(-3.46f, 1.08f, -4.14f, 2.82f)
                lineTo(0.07f, 22.63f)
                curveToRelative(-0.2f, 0.51f, 0.05f, 1.09f, 0.56f, 1.3f)
                curveToRelative(0.52f, 0.2f, 1.09f, -0.05f, 1.3f, -0.56f)
                lineToRelative(2.5f, -6.37f)
                horizontalLineToRelative(15.14f)
                lineToRelative(2.5f, 6.37f)
                curveToRelative(0.15f, 0.39f, 0.53f, 0.64f, 0.93f, 0.64f)
                curveToRelative(0.12f, 0f, 0.24f, -0.02f, 0.36f, -0.07f)
                curveToRelative(0.51f, -0.2f, 0.77f, -0.78f, 0.56f, -1.3f)
                close()
                moveTo(5.22f, 15f)
                lineTo(9.72f, 3.54f)
                curveToRelative(0.45f, -1.15f, 1.48f, -1.56f, 2.28f, -1.56f)
                reflectiveCurveToRelative(1.83f, 0.41f, 2.28f, 1.56f)
                lineToRelative(4.5f, 11.46f)
                horizontalLineTo(5.22f)
                close()
            }
        }.also { _A = it}
