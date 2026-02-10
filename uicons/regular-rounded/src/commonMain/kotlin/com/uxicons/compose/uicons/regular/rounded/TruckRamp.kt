package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Rr.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                lineTo(20f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                lineTo(18f, 16.28f)
                lineTo(0.68f, 22.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 1.9f)
                lineToRelative(14.81f, -4.94f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 24f)
                curveTo(25.27f, 23.86f, 25.27f, 16.14f, 20f, 16f)
                close()
                moveTo(20f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                close()
            }
        }.also { _TruckRamp = it}
