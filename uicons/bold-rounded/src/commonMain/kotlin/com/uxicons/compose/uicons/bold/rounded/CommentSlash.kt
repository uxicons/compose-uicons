package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Br.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 21.44f)
            lineToRelative(-1.21f, -1.21f)
            curveToRelative(0.42f, -0.77f, 0.65f, -1.64f, 0.65f, -2.53f)
            verticalLineToRelative(-5.41f)
            curveToRelative(0f, -3.42f, -1.5f, -6.63f, -4.11f, -8.8f)
            curveTo(16.38f, 1.4f, 13.21f, 0.59f, 9.96f, 1.19f)
            curveToRelative(-1.68f, 0.31f, -3.24f, 1.01f, -4.6f, 2.05f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.15f, 1.98f, 0.44f, 2.56f)
            lineTo(21.44f, 23.56f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(10.51f, 4.14f)
            curveToRelative(2.35f, -0.44f, 4.65f, 0.15f, 6.46f, 1.65f)
            curveToRelative(1.9f, 1.57f, 3.03f, 4.0f, 3.03f, 6.5f)
            verticalLineToRelative(5.41f)
            curveToRelative(0f, 0.06f, -0.0f, 0.12f, -0.01f, 0.17f)
            lineTo(7.51f, 5.39f)
            curveToRelative(0.91f, -0.62f, 1.92f, -1.05f, 3.0f, -1.25f)
            close()
            moveTo(16f, 21.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-3.75f, 0f, -7.19f, -1.5f, -9.42f, -4.13f)
            curveTo(1.47f, 16.48f, 0.63f, 13.4f, 1.15f, 10.22f)
            curveToRelative(0.06f, -0.38f, 0.14f, -0.75f, 0.24f, -1.11f)
            curveToRelative(0.22f, -0.8f, 1.04f, -1.27f, 1.84f, -1.05f)
            curveToRelative(0.8f, 0.22f, 1.27f, 1.04f, 1.05f, 1.84f)
            curveToRelative(-0.07f, 0.26f, -0.13f, 0.53f, -0.17f, 0.8f)
            curveToRelative(-0.37f, 2.3f, 0.23f, 4.52f, 1.69f, 6.24f)
            curveToRelative(1.66f, 1.95f, 4.26f, 3.07f, 7.14f, 3.07f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _CommentSlash = it }
