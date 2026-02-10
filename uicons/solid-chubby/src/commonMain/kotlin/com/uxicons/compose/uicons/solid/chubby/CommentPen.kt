package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Sc.CommentPen: ImageVector
    get() = _CommentPen ?: UXIcon(name = "CommentPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                curveToRelative(3.76f, 0f, 7.03f, -0.64f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(-0.0f, -9.75f, -5.88f, -11f, -11.0f, -11f)
                close()
                moveTo(16.85f, 11.46f)
                lineTo(12.01f, 16.17f)
                curveToRelative(-0.86f, 0.87f, -2.02f, 1.38f, -3.26f, 1.43f)
                lineToRelative(-1.44f, 0.06f)
                curveToRelative(-0.01f, 0f, -1f, 0.04f, -1.04f, -1.04f)
                lineToRelative(0.06f, -1.44f)
                curveToRelative(0.05f, -1.24f, 0.56f, -2.4f, 1.44f, -3.28f)
                lineToRelative(4.83f, -4.71f)
                curveToRelative(1.11f, -1.12f, 3.1f, -1.13f, 4.24f, 0.01f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.08f, 0f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.02f, 8.62f)
                lineToRelative(-4.83f, 4.71f)
                curveToRelative(-0.51f, 0.51f, -0.81f, 1.2f, -0.85f, 1.94f)
                lineToRelative(-0.02f, 0.35f)
                lineToRelative(0.34f, -0.01f)
                curveToRelative(0.73f, -0.03f, 1.42f, -0.34f, 1.94f, -0.86f)
                lineToRelative(4.83f, -4.71f)
                curveToRelative(0.38f, -0.38f, 0.4f, -1.05f, -0.01f, -1.42f)
                curveToRelative(-0.61f, -0.55f, -1.23f, -0.19f, -1.41f, 0f)
                close()
            }
        }.also { _CommentPen = it}
