package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _C: ImageVector? = null

val Icons.Br.C: ImageVector
    get() = _C ?: UXIcon(name = "C") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.96f, 24f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-5.51f, 0f, -10.0f, -4.53f, -10.0f, -10.09f)
            verticalLineToRelative(-3.82f)
            curveTo(2f, 4.53f, 6.49f, 0f, 12.0f, 0f)
            horizontalLineToRelative(0.95f)
            curveToRelative(3.76f, 0f, 7.17f, 2.15f, 8.89f, 5.6f)
            curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.68f, 2.01f)
            curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.68f)
            curveToRelative(-1.23f, -2.47f, -3.54f, -3.94f, -6.2f, -3.94f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-3.86f, 0f, -7.0f, 3.18f, -7.0f, 7.09f)
            verticalLineToRelative(3.82f)
            curveToRelative(0f, 3.91f, 3.14f, 7.09f, 7.0f, 7.09f)
            horizontalLineToRelative(0.95f)
            curveToRelative(2.65f, 0f, 4.97f, -1.44f, 6.21f, -3.84f)
            curveToRelative(0.38f, -0.74f, 1.29f, -1.02f, 2.02f, -0.64f)
            curveToRelative(0.74f, 0.38f, 1.02f, 1.28f, 0.65f, 2.02f)
            curveToRelative(-1.74f, 3.37f, -5.14f, 5.46f, -8.88f, 5.46f)
            close()
        }
    }.also { _C = it }
