package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentImage: ImageVector? = null

val Icons.Rr.CommentImage: ImageVector
    get() = _CommentImage ?: UXIcon(name = "CommentImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(-6.66f)
                curveTo(24f, 5.86f, 19.1f, 0.45f, 12.84f, 0.03f)
                curveTo(9.36f, -0.21f, 5.96f, 1.06f, 3.51f, 3.52f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.05f, 11.15f, 13.05f, 11.15f)
                horizontalLineToRelative(5.92f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(12.7f, 2.02f)
                curveToRelative(5.21f, 0.35f, 9.3f, 4.89f, 9.3f, 10.32f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5.92f)
                curveToRelative(-6.04f, 0f, -10.69f, -3.9f, -11.06f, -9.29f)
                curveToRelative(-0.2f, -2.9f, 0.85f, -5.74f, 2.9f, -7.78f)
                curveToRelative(1.88f, -1.88f, 4.43f, -2.93f, 7.09f, -2.93f)
                curveToRelative(0.23f, 0f, 0.46f, 0.01f, 0.69f, 0.02f)
                close()
                moveTo(6.71f, 16.21f)
                lineToRelative(4.29f, -4.29f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(-2.59f, -2.59f)
                curveToRelative(-0.76f, -0.76f, -2.07f, -0.76f, -2.83f, 0f)
                lineToRelative(-4.29f, 4.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                close()
            }
        }.also { _CommentImage = it}
