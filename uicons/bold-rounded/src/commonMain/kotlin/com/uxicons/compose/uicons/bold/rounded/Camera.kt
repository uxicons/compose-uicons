package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camera: ImageVector? = null

val Icons.Br.Camera: ImageVector
    get() = _Camera ?: UXIcon(name = "Camera") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.74f, 4.01f)
            lineTo(16.25f, 0.78f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.66f, 0f)
            horizontalLineTo(9.34f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 0.78f)
            lineTo(5.26f, 4.01f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.5f)
            verticalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineToRelative(-9f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.74f, 4.01f)
            close()
            moveTo(21f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8.5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17.5f, 14f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8.5f)
            close()
            moveTo(12f, 16.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 14f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.5f)
            close()
        }
    }.also { _Camera = it }
