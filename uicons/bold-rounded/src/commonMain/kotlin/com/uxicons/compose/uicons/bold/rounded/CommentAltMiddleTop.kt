package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltMiddleTop: ImageVector? = null

val Icons.Br.CommentAltMiddleTop: ImageVector
    get() = _CommentAltMiddleTop ?: UXIcon(name = "CommentAltMiddleTop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            lineTo(5.5f, 24f)
            curveTo(2.47f, 24f, 0f, 21.53f, 0f, 18.5f)
            lineTo(0f, 9.5f)
            curveTo(0f, 6.47f, 2.47f, 4f, 5.5f, 4f)
            horizontalLineToRelative(1.24f)
            lineTo(10.37f, 0.94f)
            curveToRelative(0.92f, -0.82f, 2.35f, -0.82f, 3.29f, 0.03f)
            lineToRelative(3.67f, 3.03f)
            horizontalLineToRelative(1.17f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 7f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 9.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-1.71f)
            curveToRelative(-0.35f, 0f, -0.69f, -0.12f, -0.96f, -0.34f)
            lineToRelative(-3.83f, -3.17f)
            lineToRelative(-3.75f, 3.16f)
            curveToRelative(-0.27f, 0.23f, -0.61f, 0.35f, -0.97f, 0.35f)
            horizontalLineToRelative(-1.79f)
            close()
            moveTo(11.71f, 3.25f)
            lineToRelative(0.02f, 0.02f)
            lineToRelative(-0.02f, -0.02f)
            close()
            moveTo(12.33f, 3.21f)
            lineToRelative(-0.02f, 0.02f)
            lineToRelative(0.02f, -0.02f)
            close()
        }
    }.also { _CommentAltMiddleTop = it }
