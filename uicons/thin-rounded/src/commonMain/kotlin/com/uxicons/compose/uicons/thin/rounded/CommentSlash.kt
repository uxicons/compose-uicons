package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Tr.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 23.15f)
                lineToRelative(-1.74f, -1.74f)
                curveToRelative(0.57f, -0.73f, 0.88f, -1.62f, 0.88f, -2.56f)
                verticalLineToRelative(-6.52f)
                curveToRelative(0f, -3.11f, -1.27f, -6.13f, -3.5f, -8.28f)
                curveToRelative(-2.13f, -2.06f, -4.91f, -3.13f, -7.84f, -3.04f)
                curveToRelative(-2.6f, 0.09f, -5.08f, 1.12f, -7.04f, 2.91f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineTo(23.15f, 23.85f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(11.69f, 2.01f)
                curveToRelative(2.65f, -0.09f, 5.18f, 0.89f, 7.11f, 2.76f)
                curveToRelative(2.03f, 1.96f, 3.19f, 4.72f, 3.19f, 7.56f)
                verticalLineToRelative(6.52f)
                curveToRelative(0f, 0.67f, -0.21f, 1.31f, -0.6f, 1.85f)
                lineTo(5.33f, 4.62f)
                curveToRelative(1.77f, -1.61f, 4.02f, -2.54f, 6.36f, -2.62f)
                close()
                moveTo(19f, 22.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5.47f)
                curveToRelative(-3.53f, 0f, -6.72f, -1.27f, -8.99f, -3.57f)
                curveToRelative(-2.0f, -2.03f, -3.08f, -4.71f, -3.04f, -7.56f)
                curveToRelative(0.03f, -1.77f, 0.5f, -3.54f, 1.38f, -5.12f)
                curveToRelative(0.13f, -0.24f, 0.44f, -0.33f, 0.68f, -0.19f)
                curveToRelative(0.24f, 0.14f, 0.33f, 0.44f, 0.19f, 0.68f)
                curveToRelative(-0.79f, 1.43f, -1.23f, 3.04f, -1.25f, 4.64f)
                curveToRelative(-0.04f, 2.58f, 0.94f, 5.01f, 2.75f, 6.84f)
                curveToRelative(2.08f, 2.11f, 5.02f, 3.27f, 8.28f, 3.27f)
                horizontalLineToRelative(5.47f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _CommentSlash = it}
