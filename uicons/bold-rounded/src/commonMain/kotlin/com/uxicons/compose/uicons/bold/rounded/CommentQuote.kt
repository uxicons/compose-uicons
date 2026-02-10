package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentQuote: ImageVector? = null

val Icons.Br.CommentQuote: ImageVector
    get() = _CommentQuote ?: UXIcon(name = "CommentQuote") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 9.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.92f, -1.35f, 3.59f, -3.2f, 3.97f)
            curveToRelative(-0.1f, 0.02f, -0.2f, 0.03f, -0.3f, 0.03f)
            curveToRelative(-0.7f, 0f, -1.32f, -0.49f, -1.47f, -1.2f)
            curveToRelative(-0.17f, -0.81f, 0.36f, -1.6f, 1.17f, -1.77f)
            curveToRelative(0.45f, -0.09f, 0.8f, -0.54f, 0.8f, -1.03f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(16.5f, 8f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0f, 0.49f, -0.35f, 0.94f, -0.8f, 1.03f)
            curveToRelative(-0.81f, 0.16f, -1.34f, 0.96f, -1.17f, 1.77f)
            curveToRelative(0.14f, 0.71f, 0.77f, 1.2f, 1.47f, 1.2f)
            curveToRelative(0.1f, 0f, 0.2f, -0.01f, 0.3f, -0.03f)
            curveToRelative(1.85f, -0.38f, 3.2f, -2.05f, 3.2f, -3.97f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 12.32f)
            verticalLineToRelative(6.36f)
            curveToRelative(0f, 2.93f, -2.39f, 5.32f, -5.32f, 5.32f)
            horizontalLineToRelative(-5.65f)
            curveTo(6.06f, 24f, 0.47f, 19.21f, 0.03f, 12.85f)
            curveTo(-0.21f, 9.38f, 1.06f, 5.98f, 3.51f, 3.52f)
            curveTo(5.96f, 1.07f, 9.37f, -0.22f, 12.84f, 0.03f)
            curveToRelative(6.26f, 0.42f, 11.16f, 5.83f, 11.16f, 12.29f)
            close()
            moveTo(21f, 12.32f)
            curveToRelative(0f, -4.9f, -3.68f, -8.98f, -8.37f, -9.3f)
            curveToRelative(-0.21f, -0.01f, -0.41f, -0.02f, -0.62f, -0.02f)
            curveToRelative(-2.39f, 0f, -4.69f, 0.94f, -6.38f, 2.64f)
            curveToRelative(-1.84f, 1.84f, -2.79f, 4.39f, -2.61f, 7.0f)
            curveToRelative(0.34f, 4.84f, 4.55f, 8.35f, 10.01f, 8.35f)
            horizontalLineToRelative(5.65f)
            curveToRelative(1.28f, 0f, 2.32f, -1.04f, 2.32f, -2.32f)
            verticalLineToRelative(-6.36f)
            close()
        }
    }.also { _CommentQuote = it }
