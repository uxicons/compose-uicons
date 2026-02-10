package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Sr.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 17f)
                arcToRelative(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, 0.05f)
                curveToRelative(0f, -0.02f, 0.01f, -0.03f, 0.01f, -0.05f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineTo(16.28f)
                lineTo(0.68f, 22.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 1.9f)
                lineToRelative(16.31f, -5.44f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
                close()
            }
        }.also { _TruckRamp = it}
