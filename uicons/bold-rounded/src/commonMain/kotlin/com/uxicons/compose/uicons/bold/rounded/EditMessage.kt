package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditMessage: ImageVector? = null

val Icons.Br.EditMessage: ImageVector
    get() = _EditMessage ?: UXIcon(name = "EditMessage") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.29f, 7.48f)
            lineTo(20.1f, 0.67f)
            curveToRelative(0.95f, -0.95f, 2.53f, -0.89f, 3.41f, 0.18f)
            curveToRelative(0.76f, 0.93f, 0.6f, 2.32f, -0.25f, 3.17f)
            lineToRelative(-6.71f, 6.71f)
            curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
            close()
            moveTo(22.5f, 8.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4.5f)
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
            lineTo(14.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            lineTo(0f, 14.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.24f)
            lineToRelative(3.6f, 3.03f)
            curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
            curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
            lineToRelative(3.71f, -3.06f)
            horizontalLineToRelative(1.17f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _EditMessage = it }
