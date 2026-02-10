package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentDots: ImageVector? = null

val Icons.Br.CommentDots: ImageVector
    get() = _CommentDots ?: UXIcon(name = "CommentDots") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(17f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(7f, 10.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 12.32f)
            verticalLineToRelative(6.36f)
            curveToRelative(0f, 2.93f, -2.39f, 5.32f, -5.32f, 5.32f)
            horizontalLineToRelative(-5.65f)
            curveTo(6.06f, 24f, 0.47f, 19.21f, 0.03f, 12.85f)
            curveToRelative(-0.24f, -3.48f, 1.03f, -6.88f, 3.48f, -9.33f)
            curveTo(5.96f, 1.06f, 9.36f, -0.21f, 12.84f, 0.03f)
            curveToRelative(6.26f, 0.43f, 11.16f, 5.83f, 11.16f, 12.3f)
            close()
            moveTo(21f, 12.32f)
            curveToRelative(0f, -4.9f, -3.68f, -8.98f, -8.37f, -9.3f)
            curveToRelative(-0.21f, -0.01f, -0.41f, -0.02f, -0.62f, -0.02f)
            curveToRelative(-2.39f, 0f, -4.69f, 0.94f, -6.38f, 2.64f)
            curveToRelative(-1.84f, 1.84f, -2.79f, 4.39f, -2.61f, 7.0f)
            curveToRelative(0.34f, 4.84f, 4.55f, 8.36f, 10.01f, 8.36f)
            horizontalLineToRelative(5.65f)
            curveToRelative(1.28f, 0f, 2.32f, -1.04f, 2.32f, -2.32f)
            verticalLineToRelative(-6.36f)
            close()
        }
    }.also { _CommentDots = it }
