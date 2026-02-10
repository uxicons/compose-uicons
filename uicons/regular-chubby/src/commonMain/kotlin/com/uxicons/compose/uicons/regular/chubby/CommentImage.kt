package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentImage: ImageVector? = null

val Icons.Rc.CommentImage: ImageVector
    get() = _CommentImage ?: UXIcon(name = "CommentImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                curveToRelative(3.76f, 0f, 7.03f, -0.64f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(-0.0f, -9.75f, -5.88f, -11f, -11.0f, -11f)
                close()
                moveTo(20.02f, 20.02f)
                curveToRelative(-1.96f, 0.47f, -4.8f, 0.97f, -8.03f, 0.97f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveToRelative(3.6f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 2.66f, -0.33f, 5.36f, -0.97f, 8.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.34f, 9.24f)
                curveToRelative(-0.84f, 0.91f, -1.92f, 2.08f, -2.36f, 2.54f)
                curveToRelative(-0.26f, 0.27f, -0.6f, 0.42f, -0.98f, 0.4f)
                curveToRelative(-0.39f, -0.01f, -0.77f, -0.2f, -1.04f, -0.5f)
                curveToRelative(-0.67f, -0.77f, -1.63f, -1.21f, -2.64f, -1.21f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.92f, 0.0f, -1.76f, 0.38f, -2.35f, 1.07f)
                curveToRelative(-0.79f, 0.92f, -2.71f, 3.79f, -2.79f, 3.91f)
                curveToRelative(-0.31f, 0.46f, -0.19f, 1.09f, 0.28f, 1.39f)
                curveToRelative(0.61f, 0.39f, 1.19f, 0.01f, 1.39f, -0.28f)
                curveToRelative(0.53f, -0.8f, 2.05f, -3.03f, 2.64f, -3.72f)
                curveToRelative(0.27f, -0.31f, 0.59f, -0.36f, 0.85f, -0.38f)
                curveToRelative(0.42f, 0f, 0.84f, 0.2f, 1.13f, 0.53f)
                curveToRelative(0.64f, 0.73f, 1.54f, 1.16f, 2.49f, 1.19f)
                curveToRelative(0.93f, 0.04f, 1.81f, -0.33f, 2.46f, -1.0f)
                curveToRelative(0.4f, -0.41f, 1.61f, -1.72f, 2.4f, -2.58f)
                curveToRelative(0.38f, -0.41f, 0.35f, -1.04f, -0.06f, -1.41f)
                curveToRelative(-0.41f, -0.38f, -1.04f, -0.35f, -1.41f, 0.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
        }.also { _CommentImage = it}
