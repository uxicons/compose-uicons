package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Taxi: ImageVector? = null

val Icons.Sr.Taxi: ImageVector
    get() = _Taxi ?: UXIcon(name = "Taxi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.57f, 2f)
                horizontalLineTo(8.43f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.45f, -2f)
                horizontalLineToRelative(0.23f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.57f, 2f)
                close()
                moveTo(20.5f, 14f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20.95f)
                verticalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineTo(20.95f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.42f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 14f)
                close()
                moveTo(1.63f, 12.49f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                horizontalLineTo(20f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.37f, 0.49f)
                lineTo(20.83f, 7.52f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.05f, 4f)
                horizontalLineTo(7.95f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.17f, 7.52f)
                close()
            }
        }.also { _Taxi = it}
