package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShipSide: ImageVector? = null

val Icons.Sr.ShipSide: ImageVector
    get() = _ShipSide ?: UXIcon(name = "ShipSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.98f, 12f)
                lineToRelative(-5.35f, 0f)
                arcToRelative(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.72f, 0.52f)
                lineToRelative(-1.96f, 1.31f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, 0.17f)
                lineTo(1f, 13.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(12.54f, 23.99f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, -8.11f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.98f, 12f)
                close()
                moveTo(4f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                close()
                moveTo(8f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                close()
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(1f, 12f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 0.18f)
                lineTo(0f, 9f)
                lineTo(10f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(0f, 7f)
                lineTo(0f, 4.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(3.39f, 3.86f)
                lineTo(3.07f, 2.64f)
                arcTo(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.11f, 0f)
                horizontalLineToRelative(0f)
                arcTo(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.14f, 1.57f)
                lineToRelative(0.6f, 2.29f)
                lineTo(10f, 3.86f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.18f, 5f)
                arcToRelative(25.49f, 25.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.44f, 5f)
                lineToRelative(-1.97f, 0f)
                arcToRelative(5.22f, 5.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.82f, 0.84f)
                lineTo(11.09f, 12f)
                close()
            }
        }.also { _ShipSide = it}
