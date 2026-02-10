package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShipSide: ImageVector? = null

val Icons.Ss.ShipSide: ImageVector
    get() = _ShipSide ?: UXIcon(name = "ShipSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.7f, 14f)
                lineToRelative(-3f, 2f)
                lineTo(0f, 16f)
                verticalLineToRelative(8f)
                lineTo(14f, 24f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14f)
                close()
                moveTo(3f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 21f)
                close()
                moveTo(7f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21f)
                close()
                moveTo(11f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 21f)
                close()
                moveTo(10f, 11f)
                lineTo(10f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 6f)
                lineTo(11.78f, 6f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, 1.14f)
                arcTo(15.38f, 15.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.81f, 12f)
                lineTo(14.09f, 12f)
                lineToRelative(-3f, 2f)
                lineTo(0f, 14f)
                lineTo(0f, 11f)
                close()
                moveTo(2.08f, 4f)
                lineTo(1.03f, 0f)
                lineTo(7f, 0f)
                lineTo(8.06f, 4f)
                close()
            }
        }.also { _ShipSide = it}
