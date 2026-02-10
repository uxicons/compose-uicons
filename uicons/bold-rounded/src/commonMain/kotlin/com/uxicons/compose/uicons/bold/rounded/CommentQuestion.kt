package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Br.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(13.4f, 13.02f)
            curveToRelative(0.01f, -0.01f, 0.13f, -0.28f, 0.57f, -0.54f)
            curveToRelative(1.49f, -0.88f, 2.26f, -2.53f, 1.97f, -4.19f)
            curveToRelative(-0.28f, -1.62f, -1.61f, -2.94f, -3.23f, -3.23f)
            curveToRelative(-2.17f, -0.37f, -4.2f, 1f, -4.63f, 3.14f)
            curveToRelative(-0.17f, 0.81f, 0.36f, 1.6f, 1.17f, 1.77f)
            curveToRelative(0.81f, 0.17f, 1.6f, -0.36f, 1.77f, -1.17f)
            curveToRelative(0.1f, -0.47f, 0.56f, -0.89f, 1.18f, -0.78f)
            curveToRelative(0.38f, 0.07f, 0.72f, 0.41f, 0.79f, 0.79f)
            curveToRelative(0.11f, 0.65f, -0.39f, 1.0f, -0.54f, 1.09f)
            curveToRelative(-1.4f, 0.83f, -1.8f, 1.93f, -1.87f, 2.15f)
            curveToRelative(-0.25f, 0.79f, 0.17f, 1.67f, 0.96f, 1.92f)
            curveToRelative(0.16f, 0.05f, 0.32f, 0.07f, 0.47f, 0.07f)
            curveToRelative(0.62f, 0f, 1.2f, -0.38f, 1.4f, -1.02f)
            close()
            moveTo(24f, 18.5f)
            verticalLineToRelative(-6.18f)
            curveToRelative(0f, -3.71f, -1.62f, -7.2f, -4.44f, -9.57f)
            curveTo(16.85f, 0.48f, 13.43f, -0.43f, 9.91f, 0.19f)
            curveTo(4.61f, 1.12f, 0.56f, 5.52f, 0.06f, 10.88f)
            curveToRelative(-0.31f, 3.31f, 0.73f, 6.47f, 2.95f, 8.9f)
            curveToRelative(2.44f, 2.68f, 6.09f, 4.21f, 10.03f, 4.21f)
            horizontalLineToRelative(5.47f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
            moveTo(17.63f, 5.05f)
            curveToRelative(2.14f, 1.8f, 3.37f, 4.45f, 3.37f, 7.27f)
            verticalLineToRelative(6.18f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5.47f)
            curveToRelative(-3.1f, 0f, -5.95f, -1.18f, -7.81f, -3.23f)
            curveToRelative(-1.64f, -1.8f, -2.41f, -4.14f, -2.18f, -6.6f)
            curveToRelative(0.38f, -3.96f, 3.48f, -7.34f, 7.38f, -8.02f)
            curveToRelative(0.54f, -0.1f, 1.07f, -0.14f, 1.6f, -0.14f)
            curveToRelative(2.05f, 0f, 4.0f, 0.7f, 5.6f, 2.05f)
            close()
        }
    }.also { _CommentQuestion = it }
