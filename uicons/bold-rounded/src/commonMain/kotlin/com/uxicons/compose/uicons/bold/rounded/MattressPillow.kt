package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MattressPillow: ImageVector? = null

val Icons.Br.MattressPillow: ImageVector
    get() = _MattressPillow ?: UXIcon(name = "MattressPillow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 3f)
            lineTo(5.5f, 3f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(3.05f, 16f)
            horizontalLineToRelative(1.95f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.95f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            close()
            moveTo(21f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-6.5f)
            lineTo(12f, 6f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            close()
        }
    }.also { _MattressPillow = it }
