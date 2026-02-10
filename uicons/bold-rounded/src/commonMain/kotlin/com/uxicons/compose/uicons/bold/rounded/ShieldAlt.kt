package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Br.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.38f, 2.04f)
            lineTo(12.47f, 0.08f)
            curveToRelative(-0.31f, -0.1f, -0.64f, -0.1f, -0.94f, 0f)
            lineToRelative(-5.91f, 1.96f)
            curveToRelative(-2.16f, 0.72f, -3.62f, 2.73f, -3.62f, 5.01f)
            verticalLineToRelative(5.11f)
            curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
            lineToRelative(0.38f, 0.19f)
            curveToRelative(0.21f, 0.1f, 0.44f, 0.16f, 0.67f, 0.16f)
            curveToRelative(0.19f, 0f, 0.38f, -0.04f, 0.56f, -0.11f)
            lineToRelative(0.39f, -0.16f)
            curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
            verticalLineToRelative(-5.11f)
            curveToRelative(0f, -2.28f, -1.45f, -4.29f, -3.62f, -5.01f)
            close()
            moveTo(5f, 12.15f)
            verticalLineToRelative(-5.11f)
            curveToRelative(0f, -0.98f, 0.63f, -1.85f, 1.56f, -2.16f)
            lineToRelative(3.94f, -1.31f)
            verticalLineToRelative(16.37f)
            curveToRelative(-2.3f, -1.47f, -5.5f, -4.16f, -5.5f, -7.8f)
            close()
            moveTo(19f, 12.15f)
            curveToRelative(0f, 4.22f, -3.24f, 6.75f, -5.5f, 8.0f)
            lineTo(13.5f, 3.58f)
            lineToRelative(3.94f, 1.31f)
            curveToRelative(0.94f, 0.31f, 1.56f, 1.18f, 1.56f, 2.16f)
            verticalLineToRelative(5.11f)
            close()
        }
    }.also { _ShieldAlt = it }
