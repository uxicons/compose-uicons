package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Br.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 12.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 14f)
            horizontalLineTo(18.63f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -1.7f)
            lineToRelative(-1.23f, -2.03f)
            lineToRelative(-1.79f, 4.36f)
            lineToRelative(2.61f, 1.49f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19.16f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineTo(19.16f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.43f)
            lineTo(9.67f, 16.41f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, -4.32f)
            lineTo(9.5f, 9f)
            horizontalLineTo(7.74f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, 0.28f)
            lineTo(5.84f, 12.17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.68f, -1.34f)
            lineTo(4.61f, 7.93f)
            arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.74f, 6f)
            horizontalLineTo(13.36f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1.7f)
            lineTo(18.2f, 10.76f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.63f, 11f)
            horizontalLineTo(21.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12.5f)
            close()
            moveTo(8.06f, 16.85f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.95f, 0.84f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.64f, 18f)
            horizontalLineTo(3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(5.64f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, -2.2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 16.85f)
            close()
            moveTo(14.5f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 5f)
            close()
        }
    }.also { _Running = it }
