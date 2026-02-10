package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Br.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 16.04f)
            arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.58f)
            lineTo(6.5f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(1.95f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16.04f)
            close()
            moveTo(14f, 10.73f)
            curveToRelative(4.57f, 4.95f, 0.74f, 13.41f, -6f, 13.27f)
            curveToRelative(-6.74f, 0.14f, -10.57f, -8.32f, -6f, -13.27f)
            lineTo(2f, 6.04f)
            curveToRelative(0.25f, -7.93f, 11.75f, -7.93f, 12f, 0f)
            close()
            moveTo(13f, 16f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 11.33f)
            lineTo(11f, 6.04f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
            verticalLineToRelative(5.29f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 1.08f)
            arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 16f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 1.5f)
            verticalLineTo(7f)
            horizontalLineTo(16.34f)
            arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
            lineToRelative(3.16f, 3.16f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
            lineTo(23.37f, 8.71f)
            arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.66f, 7f)
            horizontalLineTo(21f)
            verticalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 1.5f)
            close()
        }
    }.also { _TemperatureDown = it }
