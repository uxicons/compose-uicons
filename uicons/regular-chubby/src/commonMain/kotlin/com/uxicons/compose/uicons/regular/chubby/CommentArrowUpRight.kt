package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUpRight: ImageVector? = null

val Icons.Rc.CommentArrowUpRight: ImageVector
    get() = _CommentArrowUpRight ?: UXIcon(name = "CommentArrowUpRight") {
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
                moveToRelative(15.04f, 8.62f)
                curveToRelative(-0.1f, -0.06f, -2.43f, -1.43f, -6.0f, -0.3f)
                curveToRelative(-0.53f, 0.17f, -0.82f, 0.73f, -0.65f, 1.25f)
                curveToRelative(0.17f, 0.53f, 0.73f, 0.82f, 1.25f, 0.65f)
                curveToRelative(1.25f, -0.4f, 2.28f, -0.4f, 3.02f, -0.3f)
                lineToRelative(-4.37f, 4.37f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.36f, -4.36f)
                curveToRelative(0.11f, 0.74f, 0.1f, 1.77f, -0.29f, 3.02f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.25f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.3f, 0.05f)
                curveToRelative(0.42f, 0f, 0.82f, -0.27f, 0.95f, -0.7f)
                curveToRelative(1.13f, -3.57f, -0.24f, -5.91f, -0.3f, -6.0f)
                curveToRelative(-0.08f, -0.14f, -0.2f, -0.26f, -0.34f, -0.34f)
                close()
            }
        }.also { _CommentArrowUpRight = it}
