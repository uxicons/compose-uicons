package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageSlash: ImageVector? = null

val Icons.Br.MessageSlash: ImageVector
    get() = _MessageSlash ?: UXIcon(name = "MessageSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-2.11f, -2.11f)
            curveToRelative(0.98f, -1.01f, 1.55f, -2.38f, 1.55f, -3.83f)
            lineTo(23f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(6.5f, 1f)
            curveToRelative(-0.94f, 0f, -1.87f, 0.24f, -2.68f, 0.7f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(6.5f, 4f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.64f, -0.25f, 1.25f, -0.67f, 1.71f)
            lineTo(6.15f, 4.03f)
            curveToRelative(0.12f, -0.02f, 0.23f, -0.03f, 0.35f, -0.03f)
            close()
            moveTo(15.16f, 20.14f)
            curveToRelative(0.53f, 0.64f, 0.44f, 1.58f, -0.2f, 2.11f)
            lineToRelative(-1.46f, 1.2f)
            curveToRelative(-0.41f, 0.37f, -0.94f, 0.56f, -1.48f, 0.56f)
            curveToRelative(-0.55f, 0f, -1.11f, -0.2f, -1.56f, -0.59f)
            lineToRelative(-2.86f, -2.41f)
            horizontalLineToRelative(-1.09f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1.64f)
            curveToRelative(0.35f, 0f, 0.7f, 0.12f, 0.97f, 0.35f)
            lineToRelative(2.9f, 2.44f)
            lineToRelative(1.04f, -0.86f)
            curveToRelative(0.64f, -0.53f, 1.58f, -0.44f, 2.11f, 0.2f)
            close()
        }
    }.also { _MessageSlash = it }
