package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Rs.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                lineTo(21f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(18f, 16.27f)
                lineTo(0.05f, 22.05f)
                lineToRelative(0.61f, 1.9f)
                lineToRelative(15.47f, -4.98f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 24f)
                curveToRelative(5.27f, -0.14f, 5.27f, -7.86f, 0f, -8f)
                lineTo(20f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 2f)
                close()
                moveTo(22f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 20f)
                close()
            }
        }.also { _TruckRamp = it}
