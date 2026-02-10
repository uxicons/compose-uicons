package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckLoading: ImageVector? = null

val Icons.Rs.TruckLoading: ImageVector
    get() = _TruckLoading ?: UXIcon(name = "TruckLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.97f, 2f)
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
                lineToRelative(15.47f, -4.98f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.97f, 24f)
                curveToRelative(5.27f, -0.14f, 5.27f, -7.86f, 0f, -8f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.97f, 2f)
                close()
                moveTo(2.55f, 13.55f)
                lineToRelative(8.59f, -2.73f)
                lineToRelative(2.21f, 6.94f)
                lineTo(4.67f, 20.55f)
                close()
                moveTo(21.97f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.97f, 20f)
                close()
                moveTo(9.09f, 13.27f)
                lineToRelative(0.6f, 1.91f)
                lineToRelative(-3.47f, 1.1f)
                lineToRelative(-0.61f, -1.91f)
                close()
            }
        }.also { _TruckLoading = it}
