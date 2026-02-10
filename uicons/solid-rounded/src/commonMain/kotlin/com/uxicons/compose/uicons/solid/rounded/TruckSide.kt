package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Sr.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                lineTo(4f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(0f, 6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                close()
                moveTo(24f, 11f)
                lineTo(24f, 10f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                lineTo(17f, 5f)
                verticalLineToRelative(6f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(24f, 13f)
                close()
                moveTo(4.06f, 20f)
                arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                close()
                moveTo(15.06f, 20f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                close()
            }
        }.also { _TruckSide = it}
