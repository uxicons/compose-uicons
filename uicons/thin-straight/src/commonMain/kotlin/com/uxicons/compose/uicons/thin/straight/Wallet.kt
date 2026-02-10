package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wallet: ImageVector? = null

val Icons.Ts.Wallet: ImageVector
    get() = _Wallet ?: UXIcon(name = "Wallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 3f)
                lineTo(24f, 3f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(24f, 22f)
                lineTo(24f, 6f)
                lineTo(2.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(2.5f, 7f)
                lineTo(23f, 7f)
                verticalLineToRelative(14f)
                lineTo(2.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0.42f, 0.31f, 0.94f, 0.5f, 1.5f, 0.5f)
                close()
                moveTo(19f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _Wallet = it}
