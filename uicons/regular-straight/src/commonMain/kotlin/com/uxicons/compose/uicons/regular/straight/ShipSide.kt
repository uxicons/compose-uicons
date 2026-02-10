package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShipSide: ImageVector? = null

val Icons.Rs.ShipSide: ImageVector
    get() = _ShipSide ?: UXIcon(name = "ShipSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.96f, 6.14f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.78f, 5f)
                lineTo(8.77f, 5f)
                lineTo(7.45f, 0f)
                lineTo(1.03f, 0f)
                lineTo(2.35f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 7f)
                lineTo(11.78f, 7f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.91f, 0.69f)
                arcTo(13.42f, 13.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.08f, 12f)
                lineTo(14.7f, 12f)
                lineToRelative(-3f, 2f)
                lineTo(0f, 14f)
                verticalLineToRelative(2f)
                lineTo(12.3f, 16f)
                lineToRelative(3f, -2f)
                horizontalLineToRelative(6.64f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(13f, 24f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13f)
                lineTo(24f, 12f)
                lineTo(19.29f, 12f)
                arcTo(15.73f, 15.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.96f, 6.14f)
                close()
                moveTo(3.62f, 2f)
                lineTo(5.91f, 2f)
                lineTo(6.7f, 5f)
                lineTo(4.42f, 5f)
                close()
                moveTo(12f, 11f)
                lineTo(0f, 11f)
                lineTo(0f, 9f)
                lineTo(12f, 9f)
                close()
                moveTo(3f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                close()
                moveTo(7f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                close()
                moveTo(11f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20f)
                close()
            }
        }.also { _ShipSide = it}
