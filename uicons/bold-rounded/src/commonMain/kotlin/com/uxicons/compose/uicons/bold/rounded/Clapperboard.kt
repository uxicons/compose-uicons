package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clapperboard: ImageVector? = null

val Icons.Br.Clapperboard: ImageVector
    get() = _Clapperboard ?: UXIcon(name = "Clapperboard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 1f)
            lineTo(5.5f, 1f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 7f)
            horizontalLineToRelative(-3.88f)
            lineToRelative(2.65f, -2.65f)
            curveToRelative(0.73f, 0.44f, 1.23f, 1.24f, 1.23f, 2.15f)
            verticalLineToRelative(0.5f)
            close()
            moveTo(9.12f, 7f)
            lineToRelative(3f, -3f)
            horizontalLineToRelative(3.76f)
            lineToRelative(-3f, 3f)
            horizontalLineToRelative(-3.76f)
            close()
            moveTo(5.5f, 4f)
            horizontalLineToRelative(2.38f)
            lineToRelative(-3f, 3f)
            horizontalLineToRelative(-1.88f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(18.5f, 20f)
            lineTo(5.5f, 20f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _Clapperboard = it }
