package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompressAlt: ImageVector? = null

val Icons.Br.CompressAlt: ImageVector
    get() = _CompressAlt ?: UXIcon(name = "CompressAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.29f, 2.09f)
            lineTo(5.75f, 3.63f)
            lineTo(2.56f, 0.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, 2.56f)
            lineTo(3.63f, 5.75f)
            lineTo(2.09f, 7.29f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 9f)
            horizontalLineTo(7.56f)
            arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7.56f)
            verticalLineTo(2.8f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.29f, 2.09f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.71f, 21.91f)
            lineToRelative(1.54f, -1.54f)
            lineToRelative(3.19f, 3.19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, -2.12f)
            lineToRelative(-3.19f, -3.19f)
            lineToRelative(1.54f, -1.54f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.2f, 15f)
            horizontalLineTo(16.44f)
            arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16.44f)
            verticalLineTo(21.2f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.71f, 21.91f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.09f, 16.71f)
            lineToRelative(1.54f, 1.54f)
            lineTo(0.44f, 21.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.56f, 23.56f)
            lineToRelative(3.19f, -3.19f)
            lineToRelative(1.54f, 1.54f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 21.2f)
            verticalLineTo(16.44f)
            arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.56f, 15f)
            horizontalLineTo(2.8f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.09f, 16.71f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.91f, 7.29f)
            lineToRelative(-1.54f, -1.54f)
            lineTo(23.56f, 2.56f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21.44f, 0.44f)
            lineTo(18.25f, 3.63f)
            lineToRelative(-1.54f, -1.54f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 2.8f)
            verticalLineTo(7.56f)
            arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.44f, 9f)
            horizontalLineTo(21.2f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.91f, 7.29f)
            close()
        }
    }.also { _CompressAlt = it }
