package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunriseAlt: ImageVector? = null

val Icons.Bs.SunriseAlt: ImageVector
    get() = _SunriseAlt ?: UXIcon(name = "SunriseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.94f, 21f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, -3.19f)
                lineToRelative(2.95f, -2.95f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.85f, 2.85f)
                arcTo(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 14.14f)
                verticalLineTo(10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.14f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.29f, 1.45f)
                lineTo(4.36f, 12.74f)
                lineTo(2.24f, 14.86f)
                lineTo(5.19f, 17.81f)
                arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 21f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                close()
                moveTo(12f, 17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, 4f)
                horizontalLineTo(7.1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                close()
                moveTo(10.5f, 4f)
                horizontalLineTo(7.54f)
                lineTo(11.21f, 0.33f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.58f, 0f)
                lineTo(16.46f, 4f)
                horizontalLineTo(13.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _SunriseAlt = it}
