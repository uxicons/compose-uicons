package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Bs.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                horizontalLineTo(24f)
                verticalLineTo(0f)
                horizontalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3.5f)
                verticalLineTo(16.36f)
                lineTo(0.1f, 21.05f)
                lineToRelative(0.8f, 2.89f)
                lineToRelative(16.27f, -4.52f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.04f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 3f)
                close()
            }
        }.also { _TruckRamp = it}
