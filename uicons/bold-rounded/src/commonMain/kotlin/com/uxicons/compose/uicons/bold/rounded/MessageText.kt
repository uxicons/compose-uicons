package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageText: ImageVector? = null

val Icons.Br.MessageText: ImageVector
    get() = _MessageText ?: UXIcon(name = "MessageText") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1.17f)
            lineToRelative(-3.71f, 3.06f)
            curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
            curveToRelative(-0.59f, 0f, -1.2f, -0.21f, -1.68f, -0.64f)
            lineToRelative(-3.6f, -3.03f)
            horizontalLineToRelative(-1.24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(-0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
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
            lineTo(21.0f, 5.5f)
            close()
        }
    }.also { _MessageText = it }
