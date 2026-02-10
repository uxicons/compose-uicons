package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentText: ImageVector? = null

val Icons.Br.CommentText: ImageVector
    get() = _CommentText ?: UXIcon(name = "CommentText") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 6f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.84f, 0.03f)
            curveTo(9.37f, -0.22f, 5.96f, 1.07f, 3.51f, 3.52f)
            curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
            curveToRelative(0.44f, 6.36f, 6.03f, 11.15f, 13.01f, 11.15f)
            horizontalLineToRelative(5.65f)
            curveToRelative(2.93f, 0f, 5.32f, -2.39f, 5.32f, -5.32f)
            verticalLineToRelative(-6.36f)
            curveTo(24f, 5.85f, 19.1f, 0.45f, 12.84f, 0.03f)
            close()
            moveTo(21f, 18.68f)
            curveToRelative(0f, 1.28f, -1.04f, 2.32f, -2.32f, 2.32f)
            horizontalLineToRelative(-5.65f)
            curveToRelative(-5.46f, 0f, -9.68f, -3.51f, -10.01f, -8.35f)
            curveToRelative(-0.18f, -2.61f, 0.77f, -5.16f, 2.61f, -7.0f)
            curveToRelative(1.69f, -1.7f, 3.99f, -2.64f, 6.38f, -2.64f)
            curveToRelative(0.2f, 0f, 0.41f, 0.01f, 0.62f, 0.02f)
            curveToRelative(4.69f, 0.32f, 8.37f, 4.4f, 8.37f, 9.3f)
            verticalLineToRelative(6.36f)
            close()
        }
    }.also { _CommentText = it }
