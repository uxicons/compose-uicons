package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltH: ImageVector? = null

val Icons.Ss.ArrowsAltH: ImageVector
    get() = _ArrowsAltH ?: UXIcon(name = "ArrowsAltH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 10.92f)
                lineToRelative(-5.55f, -5.08f)
                verticalLineToRelative(5.16f)
                horizontalLineTo(6f)
                verticalLineTo(5.84f)
                lineTo(0.45f, 10.92f)
                curveToRelative(-0.59f, 0.53f, -0.59f, 1.46f, 0f, 1.99f)
                lineToRelative(5.55f, 5.08f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                lineToRelative(5.55f, -5.08f)
                curveToRelative(0.59f, -0.53f, 0.59f, -1.46f, 0f, -1.99f)
                close()
            }
        }.also { _ArrowsAltH = it}
