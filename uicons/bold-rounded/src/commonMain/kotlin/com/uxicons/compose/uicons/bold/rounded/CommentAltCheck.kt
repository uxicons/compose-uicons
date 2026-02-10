package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAltCheck: ImageVector? = null

val Icons.Br.CommentAltCheck: ImageVector
    get() = _CommentAltCheck ?: UXIcon(name = "CommentAltCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.07f, 6.45f)
            curveToRelative(0.58f, 0.59f, 0.57f, 1.54f, -0.02f, 2.12f)
            lineToRelative(-5.79f, 5.71f)
            curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.76f, 0.72f)
            reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
            lineToRelative(-2.78f, -2.69f)
            curveToRelative(-0.59f, -0.58f, -0.61f, -1.53f, -0.03f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.61f, 2.12f, -0.03f)
            lineToRelative(2.45f, 2.38f)
            lineToRelative(5.45f, -5.37f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.57f, 2.12f, 0.02f)
            close()
            moveTo(24f, 5.34f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1.17f)
            lineToRelative(-3.71f, 3.06f)
            curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
            curveToRelative(-0.59f, 0f, -1.2f, -0.21f, -1.67f, -0.64f)
            lineToRelative(-3.6f, -3.03f)
            horizontalLineToRelative(-1.24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(-0f, 5.34f)
            curveTo(0f, 2.31f, 2.47f, -0.16f, 5.5f, -0.16f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.34f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 2.84f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1.79f)
            curveToRelative(0.35f, 0f, 0.7f, 0.12f, 0.97f, 0.35f)
            lineToRelative(3.75f, 3.16f)
            lineToRelative(3.83f, -3.17f)
            curveToRelative(0.27f, -0.22f, 0.61f, -0.34f, 0.96f, -0.34f)
            horizontalLineToRelative(1.71f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21.0f, 5.34f)
            close()
        }
    }.also { _CommentAltCheck = it }
