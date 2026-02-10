package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wallet: ImageVector? = null

val Icons.Br.Wallet: ImageVector
    get() = _Wallet ?: UXIcon(name = "Wallet") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 6f)
            lineTo(5.5f, 6f)
            curveToRelative(-0.79f, 0f, -1.53f, -0.38f, -2f, -1.0f)
            curveToRelative(0.46f, -0.61f, 1.18f, -1.0f, 2f, -1.0f)
            lineTo(22.5f, 4f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            lineTo(5.5f, 1f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(15f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            lineTo(24f, 9.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(21f, 19.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            lineTo(5.5f, 20f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 8.4f)
            curveToRelative(0.76f, 0.39f, 1.62f, 0.6f, 2.5f, 0.6f)
            horizontalLineToRelative(15f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(10f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            close()
        }
    }.also { _Wallet = it }
