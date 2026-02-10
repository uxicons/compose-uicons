package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Ss.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(16.27f)
                lineTo(0.05f, 22.05f)
                lineToRelative(0.61f, 1.9f)
                lineToRelative(16.98f, -5.47f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 24f)
                curveToRelative(4.95f, -0.19f, 4.42f, -7.51f, -0.5f, -6.95f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 2f)
                close()
            }
        }.also { _TruckRamp = it}
