package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Br.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.06f, 11.43f)
            lineToRelative(-3.56f, 3.56f)
            curveToRelative(-0.67f, 0.67f, -1.55f, 1.01f, -2.43f, 1.01f)
            curveToRelative(-0.83f, 0f, -1.66f, -0.3f, -2.32f, -0.9f)
            lineToRelative(-1.77f, -1.62f)
            curveToRelative(-0.61f, -0.56f, -0.65f, -1.51f, -0.09f, -2.12f)
            curveToRelative(0.56f, -0.61f, 1.51f, -0.65f, 2.12f, -0.09f)
            lineToRelative(1.77f, 1.62f)
            curveToRelative(0.17f, 0.16f, 0.43f, 0.15f, 0.59f, -0.01f)
            lineToRelative(3.56f, -3.56f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.66f, 2.0f)
            curveToRelative(-0.56f, -1.18f, -1.77f, -2.0f, -3.16f, -2.0f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.4f, 0f, -2.6f, 0.82f, -3.16f, 2.0f)
            curveToRelative(-2.96f, 0.09f, -5.34f, 2.52f, -5.34f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 7.5f)
            curveToRelative(0f, -2.98f, -2.38f, -5.41f, -5.34f, -5.5f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(11f)
            close()
        }
    }.also { _ClipboardCheck = it }
