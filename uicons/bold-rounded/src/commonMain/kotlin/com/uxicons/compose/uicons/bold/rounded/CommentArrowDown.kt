package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowDown: ImageVector? = null

val Icons.Br.CommentArrowDown: ImageVector
    get() = _CommentArrowDown ?: UXIcon(name = "CommentArrowDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.56f, 2.76f)
            curveTo(16.85f, 0.48f, 13.42f, -0.43f, 9.91f, 0.19f)
            curveTo(4.61f, 1.12f, 0.56f, 5.52f, 0.06f, 10.88f)
            curveToRelative(-0.31f, 3.31f, 0.73f, 6.47f, 2.95f, 8.9f)
            curveToRelative(2.44f, 2.68f, 6.09f, 4.21f, 10.03f, 4.21f)
            horizontalLineToRelative(5.47f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.17f)
            curveToRelative(0f, -3.71f, -1.62f, -7.2f, -4.44f, -9.57f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5.47f)
            curveToRelative(-3.1f, 0f, -5.95f, -1.18f, -7.81f, -3.23f)
            curveToRelative(-1.64f, -1.8f, -2.41f, -4.14f, -2.18f, -6.6f)
            curveToRelative(0.38f, -3.96f, 3.48f, -7.34f, 7.38f, -8.02f)
            curveToRelative(0.54f, -0.1f, 1.07f, -0.14f, 1.6f, -0.14f)
            curveToRelative(2.05f, 0f, 4.0f, 0.7f, 5.6f, 2.05f)
            curveToRelative(2.14f, 1.8f, 3.37f, 4.45f, 3.37f, 7.27f)
            verticalLineToRelative(6.17f)
            close()
            moveTo(15.83f, 14.54f)
            lineToRelative(-3.16f, 3.16f)
            curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
            lineToRelative(-3.16f, -3.16f)
            curveToRelative(-0.63f, -0.63f, -0.18f, -1.71f, 0.71f, -1.71f)
            horizontalLineToRelative(1.66f)
            lineTo(10.46f, 7.34f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(1.66f)
            curveToRelative(0.89f, 0f, 1.34f, 1.08f, 0.71f, 1.71f)
            close()
        }
    }.also { _CommentArrowDown = it }
