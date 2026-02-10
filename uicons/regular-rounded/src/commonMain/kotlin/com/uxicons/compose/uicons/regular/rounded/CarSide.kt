package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Rr.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.74f, 10.31f)
                lineToRelative(-4.3f, -6.17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.34f, 2f)
                lineTo(8.5f, 2f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, 5.23f)
                lineTo(1.75f, 10.69f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.45f)
                verticalLineToRelative(0.55f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(9f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                verticalLineToRelative(-0.55f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2.45f)
                lineTo(24f, 15f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.74f, 10.31f)
                close()
                moveTo(14.8f, 5.28f)
                lineTo(18.08f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 4f)
                horizontalLineToRelative(1.34f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.8f, 5.28f)
                close()
                moveTo(5.7f, 5.94f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                lineTo(9f, 4f)
                verticalLineToRelative(6f)
                lineTo(4.15f, 10f)
                close()
                moveTo(7f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(4f, 18f)
                lineTo(7f, 18f)
                close()
                moveTo(18.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18.5f)
                lineTo(17f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 20f)
                close()
                moveTo(22f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(2.5f, 16f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                lineTo(2f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                lineTo(19f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _CarSide = it}
