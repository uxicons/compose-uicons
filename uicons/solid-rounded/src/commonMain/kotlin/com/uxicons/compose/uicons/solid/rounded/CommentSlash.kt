package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSlash: ImageVector? = null

val Icons.Sr.CommentSlash: ImageVector
    get() = _CommentSlash ?: UXIcon(name = "CommentSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-1.55f, -1.55f)
                curveToRelative(0.54f, -0.81f, 0.84f, -1.76f, 0.84f, -2.75f)
                verticalLineToRelative(-5.69f)
                curveToRelative(0f, -3.43f, -1.5f, -6.65f, -4.12f, -8.82f)
                curveTo(16.37f, 1.4f, 13.2f, 0.59f, 9.96f, 1.2f)
                curveToRelative(-1.84f, 0.34f, -3.54f, 1.16f, -4.99f, 2.36f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(18.73f, 22.97f)
                curveToRelative(-0.1f, 0.01f, -0.2f, 0.03f, -0.31f, 0.03f)
                horizontalLineToRelative(-5.42f)
                curveToRelative(-6.42f, 0f, -11.56f, -4.39f, -11.97f, -10.22f)
                curveToRelative(-0.15f, -2.16f, 0.35f, -4.28f, 1.38f, -6.13f)
                lineTo(18.73f, 22.97f)
                close()
            }
        }.also { _CommentSlash = it}
