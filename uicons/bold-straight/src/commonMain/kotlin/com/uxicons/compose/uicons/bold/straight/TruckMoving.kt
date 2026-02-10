package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMoving: ImageVector? = null

val Icons.Bs.TruckMoving: ImageVector
    get() = _TruckMoving ?: UXIcon(name = "TruckMoving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.15f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -1.74f)
                lineTo(22.38f, 7.39f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.06f, 5f)
                lineTo(17f, 5f)
                lineTo(17f, 4.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 1f)
                lineTo(3.5f, 1f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
                verticalLineToRelative(16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.95f, 20f)
                horizontalLineToRelative(1.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineToRelative(6.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                lineTo(24f, 20f)
                close()
                moveTo(14f, 17f)
                lineTo(3f, 17f)
                lineTo(3f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 4f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(19.06f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.47f, 0.34f)
                lineToRelative(1.34f, 4.02f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13f)
                lineTo(17f, 13f)
                lineTo(17f, 8f)
                close()
            }
        }.also { _TruckMoving = it}
