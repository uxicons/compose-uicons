package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyBillTransfer: ImageVector? = null

val Icons.Ts.MoneyBillTransfer: ImageVector
    get() = _MoneyBillTransfer ?: UXIcon(name = "MoneyBillTransfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(4f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(21f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(1f, 15.1f)
                lineToRelative(-1f, 1f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(20.16f)
                lineToRelative(-2.58f, -2.58f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.78f, 2.78f)
                curveToRelative(0.55f, 0.55f, 0.55f, 1.45f, 0f, 2.0f)
                lineToRelative(-2.78f, 2.78f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.58f, -2.58f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.6f)
                close()
                moveTo(24f, 7.9f)
                verticalLineToRelative(12.1f)
                lineTo(1.34f, 20.0f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.78f, -2.78f)
                curveToRelative(-0.55f, -0.55f, -0.55f, -1.45f, 0f, -2.0f)
                lineToRelative(2.78f, -2.78f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.58f, 2.58f)
                horizontalLineToRelative(21.66f)
                verticalLineToRelative(-10.1f)
                lineToRelative(1f, -1f)
                close()
            }
        }.also { _MoneyBillTransfer = it}
