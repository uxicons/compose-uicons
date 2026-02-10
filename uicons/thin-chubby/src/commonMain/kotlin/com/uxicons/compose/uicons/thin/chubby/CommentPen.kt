package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Tc.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
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
                moveToRelative(13.02f, 7.36f)
                lineToRelative(-5.07f, 4.94f)
                curveToRelative(-0.82f, 0.82f, -1.3f, 1.92f, -1.35f, 3.08f)
                lineToRelative(-0.07f, 1.51f)
                curveToRelative(0.01f, 0.52f, 0.52f, 0.52f, 0.52f, 0.52f)
                lineToRelative(1.51f, -0.07f)
                curveToRelative(1.16f, -0.05f, 2.25f, -0.53f, 3.06f, -1.35f)
                lineToRelative(5.07f, -4.94f)
                curveToRelative(1.01f, -1.02f, 1.01f, -2.67f, 0f, -3.69f)
                curveToRelative(-0.98f, -0.99f, -2.71f, -0.98f, -3.67f, -0.01f)
                close()
                moveTo(16.0f, 10.34f)
                lineTo(10.93f, 15.28f)
                curveToRelative(-0.64f, 0.65f, -1.5f, 1.02f, -2.4f, 1.06f)
                lineToRelative(-0.96f, 0.04f)
                lineToRelative(0.04f, -0.97f)
                curveToRelative(0.04f, -0.91f, 0.41f, -1.77f, 1.05f, -2.41f)
                lineToRelative(5.07f, -4.94f)
                curveToRelative(0.3f, -0.3f, 1.32f, -0.89f, 2.26f, 0f)
                curveToRelative(0.64f, 0.61f, 0.62f, 1.65f, 0.01f, 2.27f)
                close()
            }
        }.also { _CommentPen = it}
