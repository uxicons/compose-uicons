package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyBillsSimple: ImageVector? = null

val Icons.Rr.MoneyBillsSimple: ImageVector
    get() = _MoneyBillsSimple ?: UXIcon(name = "MoneyBillsSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                lineTo(8f, 3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(12f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(8f, 15f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(6f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                close()
                moveTo(19f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 21f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(14f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MoneyBillsSimple = it}
