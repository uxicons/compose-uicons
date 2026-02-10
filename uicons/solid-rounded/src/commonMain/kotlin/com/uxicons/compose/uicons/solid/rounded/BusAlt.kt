package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusAlt: ImageVector? = null

val Icons.Sr.BusAlt: ImageVector
    get() = _BusAlt ?: UXIcon(name = "BusAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 3.98f)
                verticalLineTo(21.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.95f, 0.5f)
                horizontalLineToRelative(-6.1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 21.5f)
                verticalLineToRelative(-0.53f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                horizontalLineToRelative(5.48f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.4f, 0.58f)
                arcToRelative(25.37f, 25.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.8f, 0f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.52f, 4f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                close()
                moveTo(22f, 9f)
                verticalLineTo(6.42f)
                curveToRelative(0f, -0.14f, -0.03f, -0.28f, -0.04f, -0.42f)
                horizontalLineTo(2.04f)
                curveTo(2.03f, 6.14f, 2f, 6.28f, 2f, 6.42f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 9f)
                close()
            }
        }.also { _BusAlt = it}
