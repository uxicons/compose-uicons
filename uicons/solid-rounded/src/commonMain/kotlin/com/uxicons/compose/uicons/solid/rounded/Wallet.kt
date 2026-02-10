package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wallet: ImageVector? = null

val Icons.Sr.Wallet: ImageVector
    get() = _Wallet ?: UXIcon(name = "Wallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                lineTo(5f, 6f)
                curveToRelative(-0.86f, 0f, -1.67f, -0.37f, -2.23f, -1.0f)
                curveToRelative(0.55f, -0.61f, 1.35f, -1.0f, 2.23f, -1.0f)
                lineTo(23f, 4f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(21f, 22f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(24f, 9f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(20f, 15f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
            }
        }.also { _Wallet = it}
