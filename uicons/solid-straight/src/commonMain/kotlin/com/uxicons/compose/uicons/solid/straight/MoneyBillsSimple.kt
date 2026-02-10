package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoneyBillsSimple: ImageVector? = null

val Icons.Ss.MoneyBillsSimple: ImageVector
    get() = _MoneyBillsSimple ?: UXIcon(name = "MoneyBillsSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                verticalLineToRelative(2f)
                lineTo(0f, 21f)
                lineTo(0f, 10f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(11.82f)
                lineTo(20f, 19f)
                close()
                moveTo(14f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(11f)
                lineTo(4f, 17f)
                lineTo(4f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _MoneyBillsSimple = it}
