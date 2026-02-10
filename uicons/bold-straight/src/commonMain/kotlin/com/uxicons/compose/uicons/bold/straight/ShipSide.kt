package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShipSide: ImageVector? = null

val Icons.Bs.ShipSide: ImageVector
    get() = _ShipSide ?: UXIcon(name = "ShipSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.98f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.5f)
                arcTo(11.51f, 11.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.48f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 21f)
                lineTo(12.48f, 21f)
                arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.37f, -7f)
                lineTo(15.31f, 14f)
                lineToRelative(-2.86f, 2f)
                lineTo(0f, 16f)
                lineTo(0f, 13f)
                lineTo(11.51f, 13f)
                lineToRelative(2.86f, -2f)
                lineTo(16.6f, 11f)
                arcToRelative(19.73f, 19.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.48f, -4.35f)
                arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.44f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 3f)
                lineTo(2.89f, 3f)
                lineTo(1.98f, 0f)
                lineTo(6.13f, 0f)
                lineToRelative(0.92f, 3f)
                horizontalLineToRelative(4.39f)
                arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.73f, 1.46f)
                arcTo(21.81f, 21.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.98f, 11f)
                close()
                moveTo(10f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(3f)
                lineTo(10f, 11f)
                close()
                moveTo(3f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18.5f)
                close()
                moveTo(8f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18.5f)
                close()
                moveTo(13f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.5f)
                close()
            }
        }.also { _ShipSide = it}
