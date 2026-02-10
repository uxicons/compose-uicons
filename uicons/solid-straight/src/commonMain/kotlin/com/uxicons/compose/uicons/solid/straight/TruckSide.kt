package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Ss.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                lineTo(0f, 18f)
                lineTo(0f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1f)
                horizontalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(7f)
                lineTo(24f, 13f)
                lineTo(17f, 13f)
                close()
                moveTo(19f, 5f)
                lineTo(17f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                lineTo(24f, 10f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 5f)
                close()
                moveTo(3.06f, 20f)
                arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                close()
                moveTo(17.06f, 20f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -0.5f)
                close()
            }
        }.also { _TruckSide = it}
