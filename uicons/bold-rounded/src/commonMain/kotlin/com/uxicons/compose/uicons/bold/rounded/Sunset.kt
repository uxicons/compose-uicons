package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Br.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(19.23f)
            arcToRelative(7.41f, 7.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, -2.12f)
            lineToRelative(2.24f, -2.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(16.11f, 16.77f)
            arcToRelative(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -1.1f)
            verticalLineTo(12.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(3.17f)
            arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, 1.1f)
            lineTo(5.64f, 14.52f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(2.24f, 2.24f)
            arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.78f, 21f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(5.17f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, -1.96f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.79f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.83f, 24f)
            horizontalLineTo(22.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 1.5f)
            verticalLineTo(3.84f)
            horizontalLineTo(8.84f)
            arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.13f, 5.54f)
            lineToRelative(3.16f, 3.16f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
            lineTo(15.87f, 5.54f)
            arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, -1.71f)
            horizontalLineTo(13.5f)
            verticalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 1.5f)
            close()
        }
    }.also { _Sunset = it }
