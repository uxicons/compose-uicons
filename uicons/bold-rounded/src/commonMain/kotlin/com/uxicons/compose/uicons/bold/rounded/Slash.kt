package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Br.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 24f)
            curveToRelative(-0.38f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.03f, -0.15f, 1.97f, -0.15f, 2.56f, 0.44f)
            lineTo(23.56f, 21.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            close()
        }
    }.also { _Slash = it }
