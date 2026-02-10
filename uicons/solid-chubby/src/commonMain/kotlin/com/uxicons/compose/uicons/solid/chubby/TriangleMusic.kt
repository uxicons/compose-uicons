package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleMusic: ImageVector? = null

val Icons.Sc.TriangleMusic: ImageVector
    get() = _TriangleMusic ?: UXIcon(name = "TriangleMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.04f, 12.04f)
                lineToRelative(6.21f, -9.37f)
                curveToRelative(0.46f, -0.69f, 1.39f, -0.88f, 2.08f, -0.42f)
                curveToRelative(0.69f, 0.46f, 0.88f, 1.39f, 0.42f, 2.08f)
                lineToRelative(-6.15f, 9.26f)
                curveToRelative(0.26f, 0.52f, 0.4f, 1.15f, 0.4f, 1.91f)
                curveToRelative(0f, 2.32f, -1.18f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.18f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.18f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.19f, 0f, 0.36f, 0.02f, 0.54f, 0.04f)
                close()
                moveTo(22.8f, 21.2f)
                curveToRelative(0.18f, -0.32f, 0.23f, -0.69f, 0.17f, -1.05f)
                curveToRelative(-0.03f, -0.14f, -0.72f, -3.28f, -3.71f, -8.46f)
                lineToRelative(-1.86f, 2.81f)
                curveToRelative(1.15f, 2.15f, 1.82f, 3.79f, 2.2f, 4.87f)
                curveToRelative(-1.45f, 0.28f, -3.99f, 0.63f, -7.6f, 0.63f)
                reflectiveCurveToRelative(-6.15f, -0.35f, -7.6f, -0.63f)
                curveToRelative(0.48f, -1.37f, 1.45f, -3.68f, 3.25f, -6.71f)
                curveToRelative(1.83f, -3.08f, 3.4f, -5.04f, 4.35f, -6.11f)
                curveToRelative(0.35f, 0.39f, 0.77f, 0.89f, 1.26f, 1.52f)
                lineToRelative(1.74f, -2.62f)
                curveToRelative(-0.64f, -0.78f, -1.15f, -1.33f, -1.51f, -1.69f)
                verticalLineToRelative(-1.26f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.26f)
                curveToRelative(-0.93f, 0.94f, -2.99f, 3.24f, -5.44f, 7.37f)
                curveToRelative(-3.27f, 5.52f, -4.0f, 8.88f, -4.03f, 9.02f)
                curveToRelative(-0.16f, 0.75f, 0.27f, 1.5f, 1.0f, 1.74f)
                curveToRelative(0.14f, 0.04f, 3.47f, 1.11f, 9.97f, 1.11f)
                reflectiveCurveToRelative(9.83f, -1.06f, 9.97f, -1.11f)
                curveToRelative(0.35f, -0.13f, 0.66f, -0.36f, 0.83f, -0.69f)
                close()
            }
        }.also { _TriangleMusic = it}
