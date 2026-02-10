package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Rs.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-0.48f)
                lineTo(15.84f, 3.29f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.38f, 2f)
                horizontalLineToRelative(-7f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 3.94f)
                lineToRelative(-2.6f, 6.85f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13f)
                verticalLineToRelative(5f)
                lineTo(2f, 18f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(9f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(22f, 18f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14.2f, 4.43f)
                lineTo(18.08f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2.38f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.2f, 4.43f)
                close()
                moveTo(5.45f, 4.64f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.38f, 4f)
                lineTo(9f, 4f)
                verticalLineToRelative(6f)
                lineTo(3.42f, 10f)
                close()
                moveTo(7f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(4f, 18f)
                lineTo(7f, 18f)
                close()
                moveTo(20f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(17f, 18f)
                horizontalLineToRelative(3f)
                close()
                moveTo(22f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(21f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _CarSide = it}
