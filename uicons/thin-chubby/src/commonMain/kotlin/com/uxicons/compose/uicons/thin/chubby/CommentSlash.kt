package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Tc.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.8f, 20.84f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-6.2f, -0.04f, -9.27f, -3.12f, -9.39f, -9.4f)
                curveToRelative(0.02f, -1.04f, 0.12f, -2.02f, 0.31f, -2.89f)
                curveToRelative(0.06f, -0.27f, -0.11f, -0.54f, -0.38f, -0.59f)
                curveToRelative(-0.27f, -0.06f, -0.54f, 0.11f, -0.59f, 0.38f)
                curveToRelative(-0.2f, 0.94f, -0.31f, 1.97f, -0.33f, 3.1f)
                curveToRelative(0.13f, 6.86f, 3.62f, 10.37f, 10.38f, 10.4f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 22.13f)
                lineToRelative(-1.09f, -1.08f)
                verticalLineTo(11.42f)
                curveToRelative(-0.12f, -6.67f, -3.8f, -10.36f, -10.39f, -10.4f)
                curveToRelative(-3.15f, 0.02f, -5.63f, 0.82f, -7.36f, 2.39f)
                lineToRelative(-1.54f, -1.53f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.19f, -0.71f, 0.0f)
                reflectiveCurveToRelative(-0.19f, 0.51f, 0.0f, 0.71f)
                lineTo(22.15f, 22.84f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                close()
                moveTo(11.38f, 2.02f)
                curveToRelative(4.21f, 0.03f, 9.25f, 1.69f, 9.39f, 9.41f)
                verticalLineToRelative(8.62f)
                lineTo(4.73f, 4.11f)
                curveToRelative(1.55f, -1.37f, 3.79f, -2.07f, 6.65f, -2.09f)
                close()
            }
        }.also { _CommentSlash = it}
