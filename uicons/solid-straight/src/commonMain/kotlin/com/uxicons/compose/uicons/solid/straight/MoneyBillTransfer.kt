package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyBillTransfer: ImageVector? = null

val Icons.Ss.MoneyBillTransfer: ImageVector
    get() = _MoneyBillTransfer ?: UXIcon(name = "MoneyBillTransfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 8.61f)
                verticalLineToRelative(11.39f)
                lineTo(3.05f, 20f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.73f, -0.73f, -0.73f, -1.92f, 0f, -2.65f)
                lineToRelative(2.66f, -2.66f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.57f, 1.57f)
                horizontalLineToRelative(2.83f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(-3.21f, 3.21f)
                lineTo(0.0f, 7f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(17.95f)
                lineToRelative(-1.57f, -1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.73f, 0.73f, 0.73f, 1.92f, 0f, 2.65f)
                lineToRelative(-2.66f, 2.66f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.57f, -1.57f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(3.21f, -3.21f)
                close()
                moveTo(17f, 14.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(7f, 9.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _MoneyBillTransfer = it}
