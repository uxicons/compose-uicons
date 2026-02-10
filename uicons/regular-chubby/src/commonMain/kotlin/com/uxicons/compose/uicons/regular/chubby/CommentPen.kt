package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentPen: ImageVector? = null

val Icons.Rc.CommentPen: ImageVector
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
                moveTo(20.02f, 20.02f)
                curveToRelative(-1.96f, 0.47f, -4.8f, 0.97f, -8.03f, 0.97f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveToRelative(3.6f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 2.66f, -0.33f, 5.36f, -0.97f, 8.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.61f, 7.2f)
                lineToRelative(-4.83f, 4.71f)
                curveToRelative(-0.87f, 0.88f, -1.39f, 2.04f, -1.44f, 3.28f)
                lineToRelative(-0.06f, 1.44f)
                curveToRelative(0.04f, 1.09f, 1.03f, 1.04f, 1.04f, 1.04f)
                lineToRelative(1.44f, -0.06f)
                curveToRelative(1.23f, -0.05f, 2.4f, -0.57f, 3.26f, -1.43f)
                lineToRelative(4.83f, -4.71f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.08f, 0f, -4.25f)
                curveToRelative(-1.13f, -1.14f, -3.12f, -1.13f, -4.24f, -0.01f)
                close()
                moveTo(15.44f, 10.04f)
                lineTo(10.61f, 14.75f)
                curveToRelative(-0.52f, 0.52f, -1.21f, 0.82f, -1.94f, 0.86f)
                lineToRelative(-0.34f, 0.01f)
                lineToRelative(0.02f, -0.35f)
                curveToRelative(0.03f, -0.74f, 0.34f, -1.43f, 0.85f, -1.94f)
                lineToRelative(4.83f, -4.71f)
                curveToRelative(0.19f, -0.19f, 0.8f, -0.55f, 1.41f, 0f)
                curveToRelative(0.41f, 0.37f, 0.39f, 1.03f, 0.01f, 1.42f)
                close()
            }
        }.also { _CommentPen = it}
