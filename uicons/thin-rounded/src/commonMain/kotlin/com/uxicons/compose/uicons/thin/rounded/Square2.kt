package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Tr.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.02f)
                curveToRelative(-0.28f, 0f, -0.39f, -0.19f, -0.43f, -0.27f)
                curveToRelative(-0.03f, -0.07f, -0.12f, -0.31f, 0.08f, -0.54f)
                curveToRelative(0.56f, -0.66f, 1.56f, -1.1f, 2.63f, -1.58f)
                curveToRelative(2.04f, -0.91f, 4.36f, -1.94f, 4.24f, -4.83f)
                curveToRelative(-0.09f, -2.12f, -1.85f, -3.77f, -4.0f, -3.77f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.61f, 0f, 2.93f, 1.24f, 3.0f, 2.82f)
                curveToRelative(0.09f, 2.21f, -1.72f, 3.02f, -3.65f, 3.88f)
                curveToRelative(-1.18f, 0.52f, -2.29f, 1.02f, -2.99f, 1.85f)
                curveToRelative(-0.38f, 0.45f, -0.47f, 1.07f, -0.22f, 1.6f)
                curveToRelative(0.24f, 0.53f, 0.76f, 0.85f, 1.34f, 0.85f)
                horizontalLineToRelative(6.02f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _Square2 = it}
