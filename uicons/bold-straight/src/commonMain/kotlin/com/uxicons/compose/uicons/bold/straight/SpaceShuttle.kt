package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceShuttle: ImageVector? = null

val Icons.Bs.SpaceShuttle: ImageVector
    get() = _SpaceShuttle ?: UXIcon(name = "SpaceShuttle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.85f, 8.96f)
                arcTo(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.01f, 8f)
                horizontalLineTo(13.86f)
                lineTo(10.42f, 1.82f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.35f, 0f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(7.35f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, 0.27f)
                lineTo(10.43f, 8f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                horizontalLineTo(10.43f)
                lineTo(7.79f, 20.74f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.35f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(7.35f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.07f, -1.81f)
                lineTo(13.86f, 16f)
                horizontalLineToRelative(4.14f)
                arcToRelative(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.84f, -0.96f)
                curveToRelative(1.78f, -1f, 2.15f, -2.2f, 2.15f, -3.04f)
                reflectiveCurveTo(23.63f, 9.97f, 21.85f, 8.96f)
                close()
                moveTo(18f, 12f)
                arcToRelative(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, 1f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineToRelative(9.4f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                close()
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _SpaceShuttle = it}
