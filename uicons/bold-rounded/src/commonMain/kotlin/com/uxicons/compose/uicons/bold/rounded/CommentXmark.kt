package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentXmark: ImageVector? = null

val Icons.Br.CommentXmark: ImageVector
    get() = _CommentXmark ?: UXIcon(name = "CommentXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.06f, 10.06f)
            lineToRelative(-1.94f, 1.94f)
            lineToRelative(1.94f, 1.94f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.94f, -1.94f)
            lineToRelative(-1.94f, 1.94f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(1.94f, -1.94f)
            lineToRelative(-1.94f, -1.94f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(1.94f, 1.94f)
            lineToRelative(1.94f, -1.94f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(24f, 12.32f)
            verticalLineToRelative(6.18f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5.47f)
            curveToRelative(-3.94f, 0f, -7.6f, -1.53f, -10.03f, -4.21f)
            curveTo(0.79f, 17.36f, -0.26f, 14.2f, 0.06f, 10.88f)
            curveTo(0.56f, 5.52f, 4.61f, 1.12f, 9.91f, 0.19f)
            curveToRelative(3.52f, -0.62f, 6.95f, 0.29f, 9.65f, 2.57f)
            curveToRelative(2.82f, 2.37f, 4.44f, 5.85f, 4.44f, 9.57f)
            close()
            moveTo(21f, 12.32f)
            curveToRelative(0f, -2.82f, -1.23f, -5.47f, -3.37f, -7.27f)
            curveToRelative(-1.6f, -1.35f, -3.55f, -2.05f, -5.6f, -2.05f)
            curveToRelative(-0.53f, 0f, -1.06f, 0.05f, -1.6f, 0.14f)
            curveToRelative(-3.9f, 0.69f, -7.01f, 4.06f, -7.39f, 8.02f)
            curveToRelative(-0.23f, 2.46f, 0.54f, 4.8f, 2.18f, 6.6f)
            curveToRelative(1.87f, 2.05f, 4.71f, 3.23f, 7.81f, 3.23f)
            horizontalLineToRelative(5.47f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6.18f)
            close()
        }
    }.also { _CommentXmark = it }
