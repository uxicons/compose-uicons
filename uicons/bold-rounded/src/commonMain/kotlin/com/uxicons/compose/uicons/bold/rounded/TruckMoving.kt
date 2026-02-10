package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMoving: ImageVector? = null

val Icons.Br.TruckMoving: ImageVector
    get() = _TruckMoving ?: UXIcon(name = "TruckMoving") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.61f, 10.6f)
            lineToRelative(-0.84f, -2.52f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
            horizontalLineTo(16.79f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 1f)
            horizontalLineToRelative(-6f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.5f)
            verticalLineTo(20.58f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(20f)
            horizontalLineTo(6f)
            verticalLineToRelative(0.58f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(20f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(0.58f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineToRelative(-0.92f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.5f)
            verticalLineTo(12.97f)
            arcTo(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.61f, 10.6f)
            close()
            moveTo(19.93f, 9.03f)
            lineToRelative(0.84f, 2.53f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.97f)
            verticalLineTo(13f)
            horizontalLineTo(17f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.93f, 9.03f)
            close()
            moveTo(3f, 6.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
            horizontalLineToRelative(6f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6.5f)
            verticalLineTo(17f)
            horizontalLineTo(3f)
            close()
        }
    }.also { _TruckMoving = it }
