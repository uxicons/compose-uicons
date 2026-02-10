package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Bs.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 5f)
                lineTo(17f, 5f)
                lineTo(17f, 4.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 1f)
                lineTo(3.5f, 1f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
                lineTo(0f, 20f)
                lineTo(3.06f, 20f)
                arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                horizontalLineToRelative(8.12f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                lineTo(24f, 20f)
                lineTo(24f, 10.5f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
                close()
                moveTo(14f, 17f)
                lineTo(3f, 17f)
                lineTo(3f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 4f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(18.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.5f)
                lineTo(21f, 13f)
                lineTo(17f, 13f)
                lineTo(17f, 8f)
                close()
            }
        }.also { _TruckSide = it}
