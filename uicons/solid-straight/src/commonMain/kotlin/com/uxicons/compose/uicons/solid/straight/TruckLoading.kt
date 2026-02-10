package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLoading: ImageVector? = null

val Icons.Ss.TruckLoading: ImageVector
    get() = _TruckLoading ?: UXIcon(name = "TruckLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 17f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, 0.05f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(16.27f)
                lineToRelative(-2.72f, 0.88f)
                lineToRelative(-2.81f, -8.84f)
                lineTo(0.06f, 12.24f)
                lineToRelative(2.7f, 8.92f)
                lineToRelative(-2.74f, 0.88f)
                lineToRelative(0.61f, 1.9f)
                lineToRelative(17.02f, -5.48f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
                close()
                moveTo(5.84f, 15.06f)
                lineTo(5.23f, 13.15f)
                lineToRelative(3.47f, -1.1f)
                lineTo(9.3f, 13.95f)
                close()
            }
        }.also { _TruckLoading = it}
