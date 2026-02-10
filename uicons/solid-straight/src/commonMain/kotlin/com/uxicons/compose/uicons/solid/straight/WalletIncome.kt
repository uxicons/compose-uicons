package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Ss.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 9.38f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.78f, 1.78f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineTo(20f, 7.03f)
                lineToRelative(1.76f, -1.76f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.71f, 2.71f)
                curveToRelative(-0.41f, 0.41f, -0.95f, 0.61f, -1.49f, 0.61f)
                reflectiveCurveToRelative(-1.08f, -0.2f, -1.49f, -0.61f)
                close()
                moveTo(24f, 8.68f)
                verticalLineToRelative(15.32f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 6.5f)
                lineTo(0.05f, 6.5f)
                curveToRelative(0.24f, -1.42f, 1.47f, -2.5f, 2.95f, -2.5f)
                lineTo(13f, 4f)
                verticalLineToRelative(2f)
                lineTo(3f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(13.29f, 8f)
                lineToRelative(2.81f, 2.81f)
                curveToRelative(1.59f, 1.59f, 4.18f, 1.59f, 5.78f, 0f)
                lineToRelative(2.13f, -2.13f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _WalletIncome = it}
