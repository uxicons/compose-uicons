package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Music: ImageVector? = null

val Icons.Br.Music: ImageVector
    get() = _Music ?: UXIcon(name = "Music") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 1f)
            horizontalLineToRelative(-5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6.5f)
            verticalLineToRelative(6.11f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.97f, 18f)
            lineTo(11f, 18f)
            lineTo(11f, 6.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 4f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.5f)
            verticalLineToRelative(6.11f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 23.98f, 18f)
            lineTo(24f, 18f)
            lineTo(24f, 6.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 1f)
            close()
            moveTo(5.5f, 20f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 17.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 20f)
            close()
            moveTo(18.5f, 20f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 17.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 20f)
            close()
        }
    }.also { _Music = it }
