package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Rr.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-1.54f, -1.54f)
                curveToRelative(0.54f, -0.81f, 0.83f, -1.77f, 0.83f, -2.76f)
                verticalLineToRelative(-5.69f)
                curveToRelative(0f, -3.43f, -1.5f, -6.65f, -4.12f, -8.82f)
                curveTo(16.37f, 1.4f, 13.2f, 0.59f, 9.96f, 1.2f)
                curveToRelative(-1.84f, 0.34f, -3.55f, 1.15f, -4.99f, 2.36f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(10.33f, 3.16f)
                curveToRelative(2.65f, -0.5f, 5.23f, 0.17f, 7.28f, 1.86f)
                curveToRelative(2.13f, 1.77f, 3.4f, 4.49f, 3.4f, 7.28f)
                verticalLineToRelative(5.69f)
                curveToRelative(0f, 0.45f, -0.1f, 0.89f, -0.29f, 1.29f)
                lineTo(6.39f, 4.98f)
                curveToRelative(1.15f, -0.93f, 2.5f, -1.55f, 3.94f, -1.82f)
                close()
                moveTo(17f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.02f)
                curveToRelative(-3.78f, 0f, -7.23f, -1.51f, -9.47f, -4.14f)
                curveTo(1.47f, 16.47f, 0.64f, 13.4f, 1.15f, 10.21f)
                curveToRelative(0.12f, -0.78f, 0.34f, -1.54f, 0.63f, -2.27f)
                curveToRelative(0.2f, -0.51f, 0.79f, -0.76f, 1.3f, -0.56f)
                curveToRelative(0.51f, 0.21f, 0.76f, 0.79f, 0.56f, 1.3f)
                curveToRelative(-0.24f, 0.6f, -0.41f, 1.22f, -0.51f, 1.85f)
                curveToRelative(-0.42f, 2.6f, 0.26f, 5.09f, 1.91f, 7.03f)
                curveToRelative(1.86f, 2.18f, 4.76f, 3.44f, 7.95f, 3.44f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CommentSlash = it}
