package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenCover: ImageVector? = null

val Icons.Sc.BookOpenCover: ImageVector
    get() = _BookOpenCover ?: UXIcon(name = "BookOpenCover") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 5.73f)
                curveToRelative(-0.82f, 0f, -1.5f, 0.67f, -1.5f, 1.49f)
                curveToRelative(-0.01f, 2.31f, -0.1f, 5.11f, -0.23f, 5.77f)
                curveToRelative(-0.74f, 1.51f, -3.27f, 2.86f, -7.16f, 3.81f)
                lineToRelative(-0.61f, 0.15f)
                lineToRelative(-0.61f, -0.15f)
                curveToRelative(-3.88f, -0.95f, -6.42f, -2.3f, -7.16f, -3.81f)
                curveToRelative(-0.13f, -0.66f, -0.22f, -3.46f, -0.23f, -5.77f)
                curveToRelative(-0.0f, -0.83f, -0.69f, -1.48f, -1.51f, -1.49f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.49f, 1.51f)
                curveToRelative(0.03f, 5.96f, 0.34f, 6.64f, 0.45f, 6.9f)
                curveToRelative(1.12f, 2.51f, 4.14f, 4.33f, 9.22f, 5.58f)
                curveToRelative(0f, 0f, 1.01f, 0.28f, 1.33f, 0.28f)
                curveToRelative(0.32f, 0f, 1.33f, -0.28f, 1.33f, -0.28f)
                curveToRelative(5.08f, -1.24f, 8.1f, -3.07f, 9.22f, -5.58f)
                curveToRelative(0.12f, -0.26f, 0.42f, -0.94f, 0.45f, -6.9f)
                curveToRelative(0.0f, -0.83f, -0.66f, -1.51f, -1.5f, -1.51f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.77f, 15.03f)
                curveToRelative(0.08f, 0.02f, 0.15f, 0.03f, 0.23f, 0.03f)
                reflectiveCurveToRelative(0.15f, -0.01f, 0.23f, -0.03f)
                curveToRelative(1.21f, -0.3f, 5.19f, -1.4f, 5.91f, -3.03f)
                curveToRelative(0.08f, -0.18f, 0.29f, -0.66f, 0.07f, -6.71f)
                curveToRelative(-0.01f, -0.29f, -0.18f, -0.56f, -0.46f, -0.71f)
                curveToRelative(-0.07f, -0.04f, -1.64f, -0.86f, -3.38f, -0.47f)
                curveToRelative(-0.49f, 0.11f, -0.96f, 0.3f, -1.38f, 0.5f)
                verticalLineToRelative(7.47f)
                curveToRelative(0f, 0.52f, -0.45f, 0.94f, -1.0f, 0.94f)
                reflectiveCurveToRelative(-1.0f, -0.42f, -1.0f, -0.94f)
                verticalLineTo(4.61f)
                curveToRelative(-0.42f, -0.2f, -0.89f, -0.39f, -1.38f, -0.5f)
                curveToRelative(-1.74f, -0.39f, -3.31f, 0.43f, -3.38f, 0.47f)
                curveToRelative(-0.27f, 0.14f, -0.45f, 0.41f, -0.46f, 0.71f)
                curveToRelative(-0.22f, 6.05f, -0.01f, 6.53f, 0.07f, 6.71f)
                curveToRelative(0.72f, 1.63f, 4.71f, 2.73f, 5.91f, 3.03f)
                close()
            }
        }.also { _BookOpenCover = it}
