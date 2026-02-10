package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuestion: ImageVector? = null

val Icons.Rr.CommentQuestion: ImageVector
    get() = _CommentQuestion ?: UXIcon(name = "CommentQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.9f, 16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.9f, 14f)
                curveToRelative(0f, -0.56f, 0.41f, -1.23f, 0.93f, -1.51f)
                curveToRelative(1.5f, -0.83f, 2.31f, -2.52f, 2.01f, -4.22f)
                curveToRelative(-0.28f, -1.61f, -1.61f, -2.94f, -3.22f, -3.22f)
                curveToRelative(-1.18f, -0.2f, -2.38f, 0.11f, -3.29f, 0.87f)
                curveToRelative(-0.91f, 0.76f, -1.43f, 1.88f, -1.43f, 3.06f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.59f, 0.26f, -1.15f, 0.71f, -1.53f)
                curveToRelative(0.46f, -0.39f, 1.05f, -0.54f, 1.66f, -0.43f)
                curveToRelative(0.79f, 0.14f, 1.46f, 0.81f, 1.6f, 1.6f)
                curveToRelative(0.15f, 0.87f, -0.24f, 1.71f, -1.0f, 2.12f)
                curveToRelative(-1.16f, 0.64f, -1.96f, 1.98f, -1.96f, 3.26f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(-6.66f)
                curveTo(24f, 5.86f, 19.1f, 0.45f, 12.84f, 0.03f)
                curveTo(9.36f, -0.2f, 5.96f, 1.07f, 3.51f, 3.52f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.05f, 11.15f, 13.05f, 11.15f)
                horizontalLineToRelative(5.92f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(12.7f, 2.02f)
                curveToRelative(5.21f, 0.35f, 9.3f, 4.88f, 9.3f, 10.31f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5.92f)
                curveToRelative(-6.04f, 0f, -10.69f, -3.9f, -11.06f, -9.28f)
                curveToRelative(-0.2f, -2.9f, 0.85f, -5.74f, 2.9f, -7.78f)
                curveToRelative(1.88f, -1.89f, 4.43f, -2.93f, 7.09f, -2.93f)
                curveToRelative(0.23f, 0f, 0.46f, 0.01f, 0.69f, 0.02f)
                close()
            }
        }.also { _CommentQuestion = it}
