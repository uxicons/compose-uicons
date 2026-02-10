package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snowflakes: ImageVector? = null

val Icons.Br.Snowflakes: ImageVector
    get() = _Snowflakes ?: UXIcon(name = "Snowflakes") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 7f)
            horizontalLineTo(21.09f)
            lineToRelative(0.7f, 1.22f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, 1.49f)
            lineToRelative(-0.69f, -1.2f)
            lineToRelative(-0.69f, 1.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, -1.49f)
            lineTo(15.91f, 7f)
            horizontalLineTo(14.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(1.41f)
            lineToRelative(-0.7f, -1.22f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, -1.49f)
            lineToRelative(0.69f, 1.2f)
            lineToRelative(0.69f, -1.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 1.49f)
            lineTo(21.09f, 4f)
            horizontalLineTo(22.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5.5f)
            close()
            moveTo(15.5f, 15f)
            horizontalLineTo(11.11f)
            lineToRelative(2.17f, -3.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, -1.51f)
            lineTo(8.5f, 13.51f)
            lineTo(6.32f, 9.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, 1.51f)
            lineTo(5.9f, 15f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(5.9f)
            lineTo(3.72f, 21.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 1.51f)
            lineTo(8.5f, 19.49f)
            lineToRelative(2.18f, 3.76f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -1.51f)
            lineTo(11.11f, 18f)
            horizontalLineTo(15.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 15f)
            close()
        }
    }.also { _Snowflakes = it }
