package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wallet: ImageVector? = null

val Icons.Bs.Wallet: ImageVector
    get() = _Wallet ?: UXIcon(name = "Wallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                lineTo(24f, 4f)
                lineTo(24f, 1f)
                lineTo(4f, 1f)
                curveTo(1.79f, 1f, 0f, 2.79f, 0f, 5f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(24f, 23f)
                lineTo(24f, 6f)
                lineTo(4f, 6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 9f)
                lineTo(21f, 9f)
                verticalLineToRelative(11f)
                lineTo(3.5f, 20f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(3f, 8.87f)
                curveToRelative(0.32f, 0.08f, 0.66f, 0.13f, 1f, 0.13f)
                close()
                moveTo(16f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Wallet = it}
