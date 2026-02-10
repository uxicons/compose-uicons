package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Br.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(163.87f, 436.93f)
            curveToRelative(-14.41f, 0.01f, -28.22f, -5.72f, -38.4f, -15.91f)
            lineTo(9.37f, 304.97f)
            curveToRelative(-12.49f, -12.5f, -12.49f, -32.75f, 0f, -45.25f)
            lineToRelative(0f, 0f)
            curveToRelative(12.5f, -12.49f, 32.75f, -12.49f, 45.25f, 0f)
            lineToRelative(109.25f, 109.25f)
            lineTo(452.89f, 79.94f)
            curveToRelative(12.5f, -12.49f, 32.75f, -12.49f, 45.25f, 0f)
            lineToRelative(0f, 0f)
            curveToRelative(12.49f, 12.5f, 12.49f, 32.75f, 0f, 45.25f)
            lineTo(202.26f, 421.02f)
            curveTo(192.09f, 431.21f, 178.27f, 436.94f, 163.87f, 436.93f)
            close()
        }
    }.also { _Check = it }
