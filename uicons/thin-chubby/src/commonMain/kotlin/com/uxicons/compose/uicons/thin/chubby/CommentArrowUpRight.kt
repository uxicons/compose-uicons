package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentArrowUpRight: ImageVector? = null

val Icons.Tc.CommentArrowUpRight: ImageVector
    get() = _CommentArrowUpRight ?: UXIcon(name = "CommentArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                curveToRelative(0f, 7.71f, 3.29f, 11f, 11f, 11f)
                curveToRelative(3.89f, 0f, 7.27f, -0.67f, 9.42f, -1.22f)
                curveToRelative(0.17f, -0.04f, 0.31f, -0.18f, 0.36f, -0.36f)
                curveToRelative(0.81f, -3.12f, 1.22f, -6.29f, 1.22f, -9.42f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(20.88f, 20.88f)
                curveToRelative(-2.1f, 0.53f, -5.26f, 1.12f, -8.88f, 1.12f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                reflectiveCurveToRelative(2.9f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10f)
                curveToRelative(0f, 2.95f, -0.38f, 5.93f, -1.12f, 8.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.56f, 9.36f)
                curveToRelative(-0.08f, -0.06f, -1.97f, -1.53f, -5.33f, -0.46f)
                curveToRelative(-0.26f, 0.08f, -0.41f, 0.36f, -0.33f, 0.63f)
                curveToRelative(0.08f, 0.26f, 0.36f, 0.41f, 0.63f, 0.33f)
                curveToRelative(1.92f, -0.6f, 3.23f, -0.28f, 3.9f, 0.01f)
                lineToRelative(-4.78f, 4.78f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(4.78f, -4.78f)
                curveToRelative(0.29f, 0.67f, 0.62f, 1.99f, 0.01f, 3.9f)
                curveToRelative(-0.08f, 0.26f, 0.06f, 0.54f, 0.33f, 0.63f)
                curveToRelative(0.05f, 0.02f, 0.1f, 0.02f, 0.15f, 0.02f)
                curveToRelative(0.21f, 0f, 0.41f, -0.14f, 0.48f, -0.35f)
                curveToRelative(1.06f, -3.36f, -0.4f, -5.25f, -0.47f, -5.33f)
                curveToRelative(-0.02f, -0.03f, -0.05f, -0.06f, -0.08f, -0.08f)
                close()
            }
        }.also { _CommentArrowUpRight = it}
