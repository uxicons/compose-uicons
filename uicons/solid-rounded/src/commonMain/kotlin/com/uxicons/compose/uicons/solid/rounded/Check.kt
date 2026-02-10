package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Check: ImageVector? = null

val Icons.Sr.Check: ImageVector
    get() = _Check ?: UXIcon(name = "Check", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.99f, 289.98f)
                lineToRelative(88.88f, 88.88f)
                curveToRelative(24.99f, 24.98f, 65.5f, 24.98f, 90.5f, 0f)
                lineToRelative(274.48f, -274.48f)
                curveToRelative(8.19f, -8.48f, 7.95f, -21.98f, -0.52f, -30.17f)
                curveToRelative(-8.27f, -7.99f, -21.37f, -7.99f, -29.64f, 0f)
                lineTo(155.19f, 348.69f)
                curveToRelative(-8.33f, 8.33f, -21.83f, 8.33f, -30.17f, 0f)
                lineToRelative(-88.88f, -88.88f)
                curveToRelative(-8.48f, -8.19f, -21.98f, -7.95f, -30.17f, 0.52f)
                curveTo(-2f, 268.61f, -2f, 281.71f, 5.99f, 289.98f)
                lineTo(5.99f, 289.98f)
                close()
            }
        }.also { _Check = it}
