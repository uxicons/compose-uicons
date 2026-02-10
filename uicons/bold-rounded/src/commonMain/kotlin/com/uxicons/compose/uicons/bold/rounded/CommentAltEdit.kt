package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltEdit: ImageVector? = null

val Icons.Br.CommentAltEdit: ImageVector
    get() = _CommentAltEdit ?: UXIcon(name = "CommentAltEdit") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.24f)
            lineToRelative(3.6f, 3.03f)
            curveToRelative(0.48f, 0.42f, 1.08f, 0.64f, 1.67f, 0.64f)
            curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
            lineToRelative(3.71f, -3.07f)
            horizontalLineToRelative(1.17f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1.71f)
            curveToRelative(-0.35f, 0f, -0.69f, 0.12f, -0.96f, 0.34f)
            lineToRelative(-3.83f, 3.17f)
            lineToRelative(-3.75f, -3.16f)
            curveToRelative(-0.27f, -0.23f, -0.61f, -0.35f, -0.97f, -0.35f)
            horizontalLineToRelative(-1.79f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(16.51f, 5.85f)
            curveToRelative(0.76f, 0.93f, 0.6f, 2.32f, -0.25f, 3.17f)
            lineToRelative(-4.73f, 4.73f)
            curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
            lineToRelative(4.82f, -4.82f)
            curveToRelative(0.95f, -0.95f, 2.53f, -0.89f, 3.41f, 0.18f)
            close()
        }
    }.also { _CommentAltEdit = it }
