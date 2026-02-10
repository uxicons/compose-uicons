package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusAlt: ImageVector? = null

val Icons.Bs.BusAlt: ImageVector
    get() = _BusAlt ?: UXIcon(name = "BusAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                verticalLineTo(4.58f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.06f, -3.13f)
                arcTo(20.2f, 20.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(20.21f, 20.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.05f, 1.45f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.58f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(10f)
                close()
                moveTo(5f, 12.01f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6.01f)
                close()
                moveTo(5f, 19f)
                verticalLineTo(15.01f)
                horizontalLineTo(7f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 17f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 15.5f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(4f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 17f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15.5f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(2f)
                verticalLineTo(19f)
                close()
            }
        }.also { _BusAlt = it}
