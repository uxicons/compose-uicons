package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUpRight: ImageVector? = null

val Icons.Br.CommentArrowUpRight: ImageVector
    get() = _CommentArrowUpRight ?: UXIcon(name = "CommentArrowUpRight") {
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
            curveToRelative(0.37f, -3.96f, 3.48f, -7.34f, 7.39f, -8.02f)
            curveToRelative(0.54f, -0.1f, 1.07f, -0.14f, 1.6f, -0.14f)
            curveToRelative(2.05f, 0f, 4.0f, 0.7f, 5.6f, 2.05f)
            curveToRelative(2.14f, 1.8f, 3.37f, 4.45f, 3.37f, 7.27f)
            verticalLineToRelative(6.17f)
            close()
            moveTo(17f, 8f)
            verticalLineToRelative(4.47f)
            curveToRelative(0f, 0.89f, -1.08f, 1.34f, -1.71f, 0.71f)
            lineToRelative(-1.18f, -1.18f)
            lineToRelative(-4.06f, 4.06f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(4.06f, -4.06f)
            lineToRelative(-1.18f, -1.18f)
            curveToRelative(-0.63f, -0.63f, -0.18f, -1.71f, 0.71f, -1.71f)
            horizontalLineToRelative(4.47f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            close()
        }
    }.also { _CommentArrowUpRight = it }
