package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarMechanic: ImageVector? = null

val Icons.Sr.CarMechanic: ImageVector
    get() = _CarMechanic ?: UXIcon(name = "CarMechanic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 14f)
                horizontalLineTo(1.5f)
                arcToRelative(7.11f, 7.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.42f, -0.88f)
                lineTo(3.98f, 9.52f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.32f, 7f)
                horizontalLineToRelative(7.36f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.02f, 9.52f)
                lineToRelative(2.06f, 3.6f)
                arcTo(7.12f, 7.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 14f)
                close()
                moveTo(19f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(16f)
                horizontalLineTo(1.03f)
                quadTo(1f, 16.3f, 1f, 16.59f)
                verticalLineTo(18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.46f)
                verticalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineToRelative(-0.54f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                verticalLineTo(16.59f)
                quadToRelative(0f, -0.3f, -0.03f, -0.59f)
                close()
                moveTo(23f, 4f)
                horizontalLineTo(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.67f, 0f, 0.62f, -0.45f, 0.49f, -0.65f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.17f, 2f)
                horizontalLineTo(5.84f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.52f, 1.35f)
                curveTo(0f, 2.28f, 1.93f, 1.94f, 2.01f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.67f, 0f, -0.62f, 0.45f, -0.49f, 0.65f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.84f, 4f)
                horizontalLineTo(18.17f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.33f, 0.65f)
                curveTo(23.62f, 4.45f, 23.67f, 4f, 23f, 4f)
                close()
            }
        }.also { _CarMechanic = it}
