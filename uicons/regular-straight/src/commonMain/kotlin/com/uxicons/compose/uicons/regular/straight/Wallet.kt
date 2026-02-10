package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wallet: ImageVector? = null

val Icons.Rs.Wallet: ImageVector
    get() = _Wallet ?: UXIcon(name = "Wallet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                lineTo(24f, 4f)
                lineTo(24f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(24f, 22f)
                lineTo(24f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(3f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(12f)
                lineTo(3f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 7.83f)
                curveToRelative(0.31f, 0.11f, 0.65f, 0.17f, 1f, 0.17f)
                close()
                moveTo(18f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _Wallet = it}
