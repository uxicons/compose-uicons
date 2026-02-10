package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crown: ImageVector? = null

val Icons.Br.Crown: ImageVector
    get() = _Crown ?: UXIcon(name = "Crown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.07f, 3.84f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, 0.33f)
            lineTo(17.73f, 7.88f)
            lineTo(13.06f, 3.21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
            lineTo(6.27f, 7.88f)
            lineTo(2.56f, 4.17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.23f)
            verticalLineTo(16.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 22f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.5f)
            verticalLineTo(5.23f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.07f, 3.84f)
            close()
            moveTo(21f, 16.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 19f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
            verticalLineTo(8.85f)
            lineToRelative(2.21f, 2.21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 0f)
            lineTo(12f, 6.39f)
            lineToRelative(4.67f, 4.67f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 0f)
            lineTo(21f, 8.85f)
            close()
        }
    }.also { _Crown = it }
