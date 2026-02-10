package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceShuttle: ImageVector? = null

val Icons.Rs.SpaceShuttle: ImageVector
    get() = _SpaceShuttle ?: UXIcon(name = "SpaceShuttle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 9.05f)
                arcTo(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.61f, 8f)
                lineTo(13.57f, 8f)
                lineTo(9.98f, 1.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.35f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 6f)
                lineTo(4f, 6f)
                lineTo(4f, 2f)
                lineTo(7.35f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.88f, 0.53f)
                lineTo(11.28f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(8f)
                lineTo(11.28f, 16f)
                lineTo(8.23f, 21.48f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.35f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 18f)
                lineTo(2f, 18f)
                verticalLineToRelative(6f)
                lineTo(7.35f, 24f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.98f, 22.44f)
                lineTo(13.57f, 16f)
                horizontalLineToRelative(4.04f)
                arcToRelative(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -1.05f)
                curveTo(24.77f, 13.2f, 24.77f, 10.8f, 21.82f, 9.05f)
                close()
                moveTo(16.73f, 14f)
                lineTo(6f, 14f)
                lineTo(6f, 10f)
                lineTo(16.73f, 10f)
                arcTo(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.73f, 14f)
                close()
                moveTo(2f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(4f)
                lineTo(2f, 14f)
                close()
                moveTo(20.84f, 13.2f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, 0.52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.44f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.24f, 0.52f)
                curveTo(22.37f, 11.68f, 22.37f, 12.32f, 20.84f, 13.2f)
                close()
            }
        }.also { _SpaceShuttle = it}
