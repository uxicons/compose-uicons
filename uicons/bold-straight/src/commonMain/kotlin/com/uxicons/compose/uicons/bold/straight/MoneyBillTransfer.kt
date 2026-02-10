package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyBillTransfer: ImageVector? = null

val Icons.Bs.MoneyBillTransfer: ImageVector
    get() = _MoneyBillTransfer ?: UXIcon(name = "MoneyBillTransfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(4f, 8.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(18.5f, 14f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21f, 18f)
                lineTo(4f, 18f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-3.65f, 3.16f)
                curveToRelative(-0.49f, 0.44f, -0.49f, 1.22f, 0f, 1.66f)
                lineToRelative(3.65f, 3.18f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(20f)
                lineTo(24f, 7.67f)
                lineToRelative(-3f, 2.6f)
                verticalLineToRelative(7.74f)
                close()
                moveTo(3f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(16.48f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.65f, -3.16f)
                curveToRelative(0.49f, -0.44f, 0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(-3.65f, -3.18f)
                verticalLineToRelative(2.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9.83f)
                lineToRelative(3f, -2.6f)
                verticalLineToRelative(-7.24f)
                close()
            }
        }.also { _MoneyBillTransfer = it}
