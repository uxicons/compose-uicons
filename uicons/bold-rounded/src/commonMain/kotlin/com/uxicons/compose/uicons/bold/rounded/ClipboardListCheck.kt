package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardListCheck: ImageVector? = null

val Icons.Br.ClipboardListCheck: ImageVector
    get() = _ClipboardListCheck ?: UXIcon(name = "ClipboardListCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 18f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            close()
            moveTo(8.5f, 15f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            close()
            moveTo(15.5f, 10f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            close()
            moveTo(10.68f, 12.38f)
            lineToRelative(1.86f, -1.8f)
            curveToRelative(0.59f, -0.58f, 0.61f, -1.53f, 0.03f, -2.12f)
            curveToRelative(-0.58f, -0.6f, -1.53f, -0.61f, -2.12f, -0.03f)
            lineToRelative(-1.3f, 1.26f)
            lineToRelative(-0.46f, -0.44f)
            curveToRelative(-0.6f, -0.57f, -1.55f, -0.54f, -2.12f, 0.06f)
            curveToRelative(-0.57f, 0.6f, -0.54f, 1.55f, 0.06f, 2.12f)
            lineToRelative(1.0f, 0.94f)
            curveToRelative(0.42f, 0.42f, 0.98f, 0.64f, 1.54f, 0.64f)
            curveToRelative(0.55f, 0f, 1.1f, -0.21f, 1.51f, -0.62f)
            close()
            moveTo(22f, 18.5f)
            lineTo(22f, 7.5f)
            curveToRelative(0f, -2.98f, -2.38f, -5.41f, -5.34f, -5.5f)
            curveToRelative(-0.56f, -1.18f, -1.77f, -2.0f, -3.16f, -2.0f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.4f, 0f, -2.6f, 0.82f, -3.16f, 2.0f)
            curveToRelative(-2.96f, 0.09f, -5.34f, 2.52f, -5.34f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
            moveTo(8.5f, 5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1f)
            close()
        }
    }.also { _ClipboardListCheck = it }
