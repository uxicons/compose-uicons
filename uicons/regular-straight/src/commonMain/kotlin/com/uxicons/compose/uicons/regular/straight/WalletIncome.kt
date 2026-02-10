package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Rs.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 14.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.98f, 10.0f)
                curveToRelative(0.54f, 0f, 1.08f, -0.2f, 1.49f, -0.61f)
                lineToRelative(2.71f, -2.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.76f, 1.76f)
                lineTo(20.0f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(18.0f, 7.06f)
                lineToRelative(-1.78f, -1.78f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.69f, 2.69f)
                curveToRelative(0.41f, 0.41f, 0.95f, 0.61f, 1.49f, 0.61f)
                close()
                moveTo(22f, 10.68f)
                verticalLineToRelative(11.32f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(2f, 9.82f)
                curveToRelative(0.31f, 0.11f, 0.65f, 0.18f, 1f, 0.18f)
                lineTo(15.28f, 10f)
                lineToRelative(-2.0f, -2f)
                lineTo(3f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(13f, 6f)
                verticalLineToRelative(-2f)
                lineTo(3f, 4f)
                curveTo(1.52f, 4f, 0.29f, 5.08f, 0.05f, 6.5f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(24f, 24f)
                lineTo(24f, 8.68f)
                lineToRelative(-2f, 2f)
                close()
            }
        }.also { _WalletIncome = it}
