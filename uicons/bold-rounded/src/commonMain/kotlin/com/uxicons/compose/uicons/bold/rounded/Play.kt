package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Br.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.46f, 7.71f)
            lineToRelative(-9.1f, -6.68f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.9f, 5.32f)
            lineTo(2.9f, 18.68f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.46f, 4.29f)
            lineToRelative(9.11f, -6.68f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8.57f)
            close()
            moveTo(18.69f, 13.87f)
            lineTo(9.59f, 20.55f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.9f, 18.68f)
            lineTo(5.9f, 5.32f)
            arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.27f, -2.07f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.22f, 3f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.36f, 0.46f)
            lineToRelative(9.1f, 6.68f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.74f)
            close()
        }
    }.also { _Play = it }
