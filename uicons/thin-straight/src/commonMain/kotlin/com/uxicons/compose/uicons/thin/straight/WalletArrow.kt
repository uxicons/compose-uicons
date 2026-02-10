package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Ts.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                lineTo(3f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-12.51f)
                curveToRelative(0.42f, 0.32f, 0.94f, 0.51f, 1.5f, 0.51f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 4f)
                curveTo(1.29f, 4f, 0.28f, 4.86f, 0.05f, 6f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19f, 1.28f)
                verticalLineToRelative(7.72f)
                horizontalLineToRelative(1f)
                lineTo(20f, 1.32f)
                lineToRelative(3.02f, 3.02f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.18f, -3.18f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-3.18f, 3.18f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.06f, -3.06f)
                close()
            }
        }.also { _WalletArrow = it}
