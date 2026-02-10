package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Sc.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.46f, 9.82f)
                curveToRelative(-0.06f, -0.29f, -0.26f, -0.54f, -0.53f, -0.67f)
                curveToRelative(-0.27f, -0.13f, -0.59f, -0.12f, -0.86f, 0.01f)
                lineToRelative(-1.12f, 0.57f)
                curveToRelative(0.24f, 1.15f, 0.45f, 2.67f, 0.45f, 4.38f)
                reflectiveCurveToRelative(-0.21f, 3.22f, -0.45f, 4.38f)
                lineToRelative(1.12f, 0.57f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.44f, 0.1f)
                curveToRelative(0.14f, 0f, 0.29f, -0.03f, 0.42f, -0.09f)
                curveToRelative(0.27f, -0.13f, 0.47f, -0.38f, 0.53f, -0.67f)
                curveToRelative(0.72f, -3.45f, 0.72f, -5.13f, 0f, -8.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.76f, 7.51f)
                curveToRelative(-0.06f, -0.01f, -0.64f, -0.15f, -1.56f, -0.3f)
                lineToRelative(-1.85f, -3.6f)
                curveToRelative(-0.23f, -0.44f, -0.75f, -0.75f, -1.24f, -0.81f)
                curveToRelative(-2.91f, -0.35f, -5.87f, -0.35f, -8.78f, 0.01f)
                curveToRelative(-0.82f, 0.1f, -1.41f, 0.85f, -1.31f, 1.67f)
                curveToRelative(0.1f, 0.82f, 0.86f, 1.41f, 1.67f, 1.31f)
                curveToRelative(2.42f, -0.3f, 4.87f, -0.33f, 7.36f, -0.09f)
                lineToRelative(0.57f, 1.11f)
                curveToRelative(-0.62f, -0.04f, -1.27f, -0.06f, -1.93f, -0.06f)
                curveToRelative(-3.75f, 0f, -6.93f, 0.73f, -7.06f, 0.76f)
                curveToRelative(-0.32f, 0.07f, -0.58f, 0.3f, -0.69f, 0.6f)
                curveToRelative(-0.04f, 0.11f, -0.95f, 2.63f, -0.95f, 5.99f)
                curveToRelative(0f, 3.38f, 0.91f, 5.88f, 0.95f, 5.99f)
                curveToRelative(0.11f, 0.3f, 0.37f, 0.53f, 0.69f, 0.6f)
                curveToRelative(0.13f, 0.03f, 3.31f, 0.76f, 7.06f, 0.76f)
                reflectiveCurveToRelative(6.93f, -0.73f, 7.06f, -0.76f)
                curveToRelative(0.32f, -0.07f, 0.58f, -0.3f, 0.69f, -0.6f)
                curveToRelative(0.04f, -0.11f, 0.95f, -2.63f, 0.95f, -5.99f)
                curveToRelative(0f, -3.38f, -0.91f, -5.88f, -0.95f, -5.99f)
                curveToRelative(-0.11f, -0.3f, -0.37f, -0.53f, -0.69f, -0.6f)
                close()
            }
        }.also { _VideoCamera = it}
