package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Bs.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 14f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.68f, 9.65f)
                curveToRelative(0.44f, 0.49f, 1.22f, 0.49f, 1.66f, 0f)
                lineToRelative(3.16f, -3.65f)
                horizontalLineToRelative(-2.48f)
                lineTo(20.02f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(17.02f, 6f)
                horizontalLineToRelative(-2.52f)
                lineToRelative(3.18f, 3.65f)
                close()
                moveTo(21f, 10.35f)
                verticalLineToRelative(10.65f)
                lineTo(4f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(3f, 9.86f)
                curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1f, 0.14f)
                lineTo(15.59f, 10f)
                lineToRelative(-2.62f, -3f)
                lineTo(4f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(13f, 5f)
                lineTo(13f, 2f)
                lineTo(4f, 2f)
                curveTo(1.79f, 2f, 0f, 3.79f, 0f, 6f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(24f, 24f)
                lineTo(24f, 7.03f)
                lineToRelative(-3f, 3.32f)
                close()
            }
        }.also { _WalletIncome = it}
