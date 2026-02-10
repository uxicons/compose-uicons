package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleMusic: ImageVector? = null

val Icons.Rr.TriangleMusic: ImageVector
    get() = _TriangleMusic ?: UXIcon(name = "TriangleMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.83f, -0.29f, -1.59f, -0.78f, -2.19f)
                lineToRelative(6.63f, -10.78f)
                curveToRelative(0.29f, -0.47f, 0.14f, -1.09f, -0.33f, -1.38f)
                curveToRelative(-0.47f, -0.29f, -1.09f, -0.14f, -1.38f, 0.33f)
                lineToRelative(-6.57f, 10.69f)
                curveToRelative(-0.34f, -0.11f, -0.7f, -0.17f, -1.08f, -0.17f)
                close()
                moveTo(12.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.3f, 17.02f)
                lineToRelative(-2.93f, -4.56f)
                curveToRelative(-0.3f, -0.47f, -0.92f, -0.6f, -1.38f, -0.3f)
                curveToRelative(-0.47f, 0.3f, -0.6f, 0.92f, -0.3f, 1.38f)
                lineToRelative(2.92f, 4.55f)
                curveToRelative(0.5f, 0.8f, 0.52f, 1.77f, 0.06f, 2.6f)
                curveToRelative(-0.46f, 0.82f, -1.29f, 1.32f, -2.24f, 1.32f)
                lineTo(4.57f, 22.0f)
                curveToRelative(-0.94f, 0f, -1.78f, -0.49f, -2.24f, -1.32f)
                curveToRelative(-0.46f, -0.82f, -0.43f, -1.79f, 0.06f, -2.58f)
                lineToRelative(7.77f, -12.11f)
                curveToRelative(0.41f, -0.62f, 1.1f, -0.98f, 1.84f, -0.99f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.74f, 0.01f, 1.43f, 0.37f, 1.84f, 0.99f)
                curveToRelative(0.3f, 0.46f, 0.93f, 0.59f, 1.39f, 0.28f)
                curveToRelative(0.46f, -0.3f, 0.59f, -0.93f, 0.28f, -1.39f)
                curveToRelative(-0.59f, -0.9f, -1.49f, -1.52f, -2.51f, -1.77f)
                lineTo(13.0f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.12f)
                curveToRelative(-1.02f, 0.25f, -1.92f, 0.87f, -2.52f, 1.78f)
                lineTo(0.69f, 17.04f)
                curveToRelative(-0.89f, 1.43f, -0.93f, 3.15f, -0.11f, 4.62f)
                curveToRelative(0.82f, 1.47f, 2.31f, 2.34f, 3.98f, 2.34f)
                horizontalLineToRelative(14.87f)
                curveToRelative(1.68f, 0f, 3.17f, -0.88f, 3.98f, -2.34f)
                curveToRelative(0.82f, -1.47f, 0.77f, -3.2f, -0.12f, -4.64f)
                close()
                moveTo(12f, 5f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                curveToRelative(0f, 0f, 0f, 0f, -0.0f, 0f)
                reflectiveCurveToRelative(-0.0f, 0f, -0.0f, 0f)
                curveToRelative(-0.0f, 0f, -0.0f, 0f, 0.0f, 0f)
                close()
            }
        }.also { _TriangleMusic = it}
