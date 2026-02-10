package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceShuttle: ImageVector? = null

val Icons.Br.SpaceShuttle: ImageVector
    get() = _SpaceShuttle ?: UXIcon(name = "SpaceShuttle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.85f, 8.96f)
            arcTo(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.01f, 8f)
            horizontalLineTo(14.36f)
            lineTo(11.45f, 2.81f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.66f, 0f)
            horizontalLineTo(5.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.5f)
            verticalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-1f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineTo(6.66f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.84f, 4.28f)
            lineTo(10.92f, 8f)
            horizontalLineTo(3f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
            verticalLineToRelative(2f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
            horizontalLineToRelative(7.92f)
            lineTo(8.84f, 19.72f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.66f, 21f)
            horizontalLineTo(5.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineTo(6.66f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.8f, -2.81f)
            lineTo(14.36f, 16f)
            horizontalLineToRelative(3.65f)
            arcToRelative(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.84f, -0.96f)
            curveTo(24.76f, 13.31f, 24.76f, 10.69f, 21.85f, 8.96f)
            close()
            moveTo(8f, 13f)
            verticalLineTo(11f)
            horizontalLineToRelative(9.4f)
            arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
            close()
            moveTo(3f, 11f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            horizontalLineTo(3f)
            close()
        }
    }.also { _SpaceShuttle = it }
