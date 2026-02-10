package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Tr.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.14f, 9.07f)
                lineTo(3.36f, 0.24f)
                curveTo(2.49f, -0.18f, 1.5f, -0.04f, 0.78f, 0.61f)
                curveTo(0.05f, 1.26f, -0.19f, 2.23f, 0.18f, 3.21f)
                lineToRelative(4.69f, 8.79f)
                lineTo(0.23f, 20.86f)
                curveToRelative(-0.33f, 0.91f, -0.09f, 1.89f, 0.64f, 2.54f)
                curveToRelative(0.45f, 0.4f, 0.99f, 0.6f, 1.55f, 0.6f)
                curveToRelative(0.35f, 0f, 0.7f, -0.08f, 1.03f, -0.24f)
                lineToRelative(18.69f, -8.82f)
                curveToRelative(1.15f, -0.54f, 1.86f, -1.66f, 1.86f, -2.94f)
                curveToRelative(0f, -1.27f, -0.72f, -2.39f, -1.86f, -2.93f)
                close()
                moveTo(1.09f, 2.8f)
                curveToRelative(-0.23f, -0.62f, 0.04f, -1.16f, 0.36f, -1.45f)
                curveToRelative(0.21f, -0.19f, 0.53f, -0.35f, 0.89f, -0.35f)
                curveToRelative(0.19f, 0f, 0.39f, 0.04f, 0.59f, 0.14f)
                curveToRelative(0.0f, 0f, 0.01f, 0.0f, 0.01f, 0.0f)
                lineToRelative(18.77f, 8.83f)
                curveToRelative(0.65f, 0.3f, 1.09f, 0.85f, 1.24f, 1.52f)
                lineTo(5.73f, 11.5f)
                lineTo(1.09f, 2.8f)
                close()
                moveTo(21.71f, 14.03f)
                lineTo(3.02f, 22.86f)
                curveToRelative(-0.6f, 0.29f, -1.16f, 0.09f, -1.48f, -0.2f)
                reflectiveCurveToRelative(-0.59f, -0.82f, -0.39f, -1.39f)
                lineToRelative(4.58f, -8.76f)
                horizontalLineToRelative(17.22f)
                curveToRelative(-0.14f, 0.67f, -0.58f, 1.23f, -1.24f, 1.53f)
                close()
            }
        }.also { _PaperPlaneTop = it}
