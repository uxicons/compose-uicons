package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Br.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 10.5f)
            horizontalLineTo(19.35f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, -2.63f)
            lineToRelative(2.23f, -2.23f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(16.13f, 5.75f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.63f, -1.1f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(4.65f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.63f, 1.1f)
            lineTo(5.64f, 3.52f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.52f, 5.64f)
            lineTo(5.75f, 7.87f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.1f, 2.63f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(4.65f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, 2.63f)
            lineTo(3.52f, 18.36f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(2.23f, -2.23f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, 1.1f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(19.35f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, -1.1f)
            lineToRelative(2.23f, 2.23f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            lineToRelative(-2.23f, -2.23f)
            arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, -2.63f)
            horizontalLineTo(22.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 10.5f)
            close()
            moveTo(12f, 16.5f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.5f)
            close()
        }
    }.also { _Sun = it }
