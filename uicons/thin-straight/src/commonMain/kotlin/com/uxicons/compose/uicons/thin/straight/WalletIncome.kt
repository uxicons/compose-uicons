package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Ts.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(19.48f, 8.99f)
                curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(3.18f, -3.18f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.02f, 3.02f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 7.72f)
                lineToRelative(-3.06f, -3.06f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.18f, 3.18f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                close()
                moveTo(23.93f, 8.0f)
                lineToRelative(-0.93f, 0.93f)
                verticalLineToRelative(14.07f)
                lineTo(3f, 23.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(1f, 8.48f)
                curveToRelative(0.42f, 0.32f, 0.94f, 0.51f, 1.5f, 0.51f)
                horizontalLineToRelative(13.53f)
                lineToRelative(-1f, -1f)
                lineTo(2.5f, 8.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(13f, 5.0f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 4.0f)
                curveTo(1.29f, 4.0f, 0.28f, 4.86f, 0.05f, 6.0f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(24f, 24.0f)
                lineTo(24f, 8.0f)
                horizontalLineToRelative(-0.07f)
                close()
            }
        }.also { _WalletIncome = it}
