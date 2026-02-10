package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Bs.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.21f, 7.67f)
                lineTo(7.54f, 4f)
                horizontalLineTo(10.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(2.96f)
                lineTo(12.79f, 7.67f)
                arcTo(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.21f, 7.67f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                horizontalLineTo(4.06f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.13f, -3.19f)
                lineTo(2.24f, 14.86f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.85f, 2.85f)
                arcTo(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 14.14f)
                verticalLineTo(10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.14f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.29f, 1.45f)
                lineToRelative(2.85f, -2.85f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.95f, 2.95f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.94f, 21f)
                close()
                moveTo(7.1f, 21f)
                horizontalLineToRelative(9.8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.8f, 0f)
                close()
            }
        }.also { _Sunset = it}
