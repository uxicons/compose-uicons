package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _D: ImageVector? = null

val Icons.Br.D: ImageVector
    get() = _D ?: UXIcon(name = "D") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 24f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineTo(5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(3f)
            curveToRelative(6.34f, 0f, 11.5f, 5.16f, 11.5f, 11.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 6.34f, -5.16f, 11.5f, -11.5f, 11.5f)
            close()
            moveTo(7.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.also { _D = it }
