package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBuilding: ImageVector? = null

val Icons.Ss.CarBuilding: ImageVector
    get() = _CarBuilding ?: UXIcon(name = "CarBuilding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.35f, 16f)
                lineTo(9.65f, 16f)
                lineToRelative(1.43f, -4.01f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.91f, 10f)
                horizontalLineToRelative(5.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.82f, 1.99f)
                close()
                moveTo(24f, 19.73f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.86f, 18f)
                lineTo(21f, 18f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(19f, 18f)
                lineTo(14f, 18f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(12f, 18f)
                lineTo(9.14f, 18f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19.73f)
                lineTo(9f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(14f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 3f)
                lineTo(16f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 9.9f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 1.42f)
                lineTo(7.77f, 15.33f)
                arcToRelative(24.24f, 24.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 2.35f)
                curveToRelative(-0.02f, 0.11f, -0.02f, 0.21f, -0.04f, 0.32f)
                lineTo(4f, 18f)
                verticalLineToRelative(3f)
                lineTo(7f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(13f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3f)
                close()
                moveTo(7f, 13f)
                lineTo(4f, 13f)
                verticalLineToRelative(3f)
                lineTo(7f, 16f)
                close()
                moveTo(7f, 8f)
                lineTo(4f, 8f)
                verticalLineToRelative(3f)
                lineTo(7f, 11f)
                close()
                moveTo(7f, 3f)
                lineTo(4f, 3f)
                lineTo(4f, 6f)
                lineTo(7f, 6f)
                close()
                moveTo(12f, 3f)
                lineTo(9f, 3f)
                lineTo(9f, 6f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _CarBuilding = it}
