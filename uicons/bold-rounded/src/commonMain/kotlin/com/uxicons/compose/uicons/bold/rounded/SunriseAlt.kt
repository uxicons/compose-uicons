package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunriseAlt: ImageVector? = null

val Icons.Br.SunriseAlt: ImageVector
    get() = _SunriseAlt ?: UXIcon(name = "SunriseAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.49f, 21f)
            horizontalLineTo(19.21f)
            arcToRelative(7.38f, 7.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, -2.12f)
            lineToRelative(2.24f, -2.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(16.1f, 16.77f)
            arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -1.1f)
            verticalLineTo(12.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(3.17f)
            arcToRelative(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, 1.1f)
            lineTo(5.62f, 14.52f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 16.64f)
            lineToRelative(2.24f, 2.24f)
            arcTo(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.76f, 21f)
            horizontalLineTo(1.49f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(5.16f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, -1.96f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.79f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.81f, 24f)
            horizontalLineToRelative(3.67f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.49f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 7.5f)
            verticalLineTo(5.16f)
            horizontalLineToRelative(1.66f)
            arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
            lineTo(12.71f, 0.29f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
            lineTo(8.13f, 3.46f)
            arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
            horizontalLineTo(10.5f)
            verticalLineTo(7.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7.5f)
            close()
        }
    }.also { _SunriseAlt = it }
