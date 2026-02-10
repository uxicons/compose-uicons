package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyBillTransfer: ImageVector? = null

val Icons.Rs.MoneyBillTransfer: ImageVector
    get() = _MoneyBillTransfer ?: UXIcon(name = "MoneyBillTransfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(5.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.5f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(2f, 13.39f)
                lineToRelative(-2f, 2f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(17.95f)
                lineToRelative(-1.57f, -1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.73f, 0.73f, 0.73f, 1.92f, 0f, 2.65f)
                lineToRelative(-2.66f, 2.66f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.57f, -1.57f)
                lineTo(3f, 6.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6.39f)
                close()
                moveTo(24f, 8.6f)
                verticalLineToRelative(11.39f)
                lineTo(3.05f, 20.0f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.73f, -0.73f, -0.73f, -1.92f, 0f, -2.65f)
                lineToRelative(2.66f, -2.66f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.57f, 1.57f)
                horizontalLineToRelative(18.95f)
                verticalLineToRelative(-7.39f)
                lineToRelative(2f, -2f)
                close()
            }
        }.also { _MoneyBillTransfer = it}
