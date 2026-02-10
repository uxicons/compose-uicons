package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentImage: ImageVector? = null

val Icons.Sc.CommentImage: ImageVector
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
                moveTo(6.96f, 6.51f)
                curveToRelative(0.82f, 0f, 1.49f, 0.67f, 1.49f, 1.49f)
                reflectiveCurveToRelative(-0.67f, 1.49f, -1.49f, 1.49f)
                reflectiveCurveToRelative(-1.49f, -0.67f, -1.49f, -1.49f)
                reflectiveCurveToRelative(0.67f, -1.49f, 1.49f, -1.49f)
                close()
                moveTo(18.81f, 10.6f)
                curveToRelative(-0.8f, 0.86f, -2.0f, 2.17f, -2.4f, 2.58f)
                curveToRelative(-0.66f, 0.67f, -1.53f, 1.03f, -2.46f, 1.0f)
                curveToRelative(-0.95f, -0.03f, -1.86f, -0.46f, -2.49f, -1.19f)
                curveToRelative(-0.29f, -0.33f, -0.71f, -0.53f, -1.13f, -0.53f)
                curveToRelative(-0.25f, 0.02f, -0.58f, 0.07f, -0.85f, 0.38f)
                curveToRelative(-0.59f, 0.69f, -2.11f, 2.92f, -2.64f, 3.72f)
                curveToRelative(-0.19f, 0.29f, -0.77f, 0.66f, -1.39f, 0.28f)
                curveToRelative(-0.47f, -0.29f, -0.58f, -0.93f, -0.28f, -1.39f)
                curveToRelative(0.08f, -0.12f, 2.0f, -2.99f, 2.79f, -3.91f)
                curveToRelative(0.59f, -0.69f, 1.43f, -1.07f, 2.35f, -1.07f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.0f, 0f, 1.96f, 0.44f, 2.64f, 1.21f)
                curveToRelative(0.27f, 0.31f, 0.65f, 0.49f, 1.04f, 0.5f)
                curveToRelative(0.38f, 0.02f, 0.72f, -0.13f, 0.98f, -0.4f)
                curveToRelative(0.45f, -0.46f, 1.52f, -1.63f, 2.36f, -2.54f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.43f, 1.41f, -0.06f)
                curveToRelative(0.41f, 0.37f, 0.43f, 1.01f, 0.06f, 1.41f)
                close()
            }
        }.also { _CommentImage = it}
