package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBump: ImageVector? = null

val Icons.Bs.CarBump: ImageVector
    get() = _CarBump ?: UXIcon(name = "CarBump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(14f, 24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                close()
                moveTo(8.74f, 18.39f)
                lineToRelative(0.73f, 1.86f)
                lineTo(4.82f, 22.08f)
                lineToRelative(-0.73f, -1.86f)
                lineToRelative(-1.86f, 0.73f)
                lineTo(0.86f, 17.47f)
                arcToRelative(12.57f, 12.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, -5.51f)
                lineTo(0.36f, 7.69f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.57f, 4.7f)
                lineTo(11.4f, 1.23f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.66f, 0.69f)
                lineTo(18.2f, 4.83f)
                arcToRelative(12.59f, 12.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.14f, 4.6f)
                lineToRelative(1.36f, 3.48f)
                lineToRelative(-1.86f, 0.73f)
                lineToRelative(0.73f, 1.86f)
                lineToRelative(-4.65f, 1.83f)
                lineToRelative(-0.73f, -1.86f)
                close()
                moveTo(16.32f, 8.96f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, 1.95f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.95f, 0.85f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, -1.95f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.32f, 8.96f)
                close()
                moveTo(3.12f, 10.93f)
                lineTo(15.23f, 6.17f)
                lineToRelative(-2.21f, -2.05f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.52f, -0.1f)
                lineTo(3.67f, 7.49f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.32f, 0.43f)
                close()
                moveTo(6.17f, 14.57f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, -0.85f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, 1.94f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, 0.85f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.17f, 14.57f)
                close()
            }
        }.also { _CarBump = it}
