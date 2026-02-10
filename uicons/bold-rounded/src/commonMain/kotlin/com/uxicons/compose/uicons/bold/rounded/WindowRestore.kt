package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowRestore: ImageVector? = null

val Icons.Br.WindowRestore: ImageVector
    get() = _WindowRestore ?: UXIcon(name = "WindowRestore") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 6f)
            lineTo(5f, 6f)
            curveTo(2.24f, 6f, 0f, 8.24f, 0f, 11f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            lineTo(13f, 24f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            lineTo(18f, 11f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(15f, 19f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            lineTo(5f, 21f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(3f, 11f)
            lineTo(15f, 11f)
            verticalLineToRelative(8f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(7.35f)
            curveToRelative(0f, 1.34f, -0.49f, 2.63f, -1.38f, 3.64f)
            curveToRelative(-0.3f, 0.34f, -0.71f, 0.51f, -1.13f, 0.51f)
            curveToRelative(-0.35f, 0f, -0.71f, -0.12f, -0.99f, -0.38f)
            curveToRelative(-0.62f, -0.55f, -0.68f, -1.5f, -0.13f, -2.12f)
            curveToRelative(0.4f, -0.46f, 0.62f, -1.04f, 0.62f, -1.65f)
            lineTo(20.99f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-7.35f)
            curveToRelative(-0.61f, 0f, -1.2f, 0.22f, -1.65f, 0.62f)
            curveToRelative(-0.62f, 0.55f, -1.57f, 0.49f, -2.12f, -0.13f)
            curveToRelative(-0.55f, -0.62f, -0.49f, -1.57f, 0.13f, -2.12f)
            curveToRelative(1f, -0.89f, 2.3f, -1.38f, 3.64f, -1.38f)
            horizontalLineToRelative(7.35f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
        }
    }.also { _WindowRestore = it }
