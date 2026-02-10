package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Road: ImageVector? = null

val Icons.Br.Road: ImageVector
    get() = _Road ?: UXIcon(name = "Road") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.57f, 4.4f)
            arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.33f, 0f)
            lineTo(7.66f, 0f)
            arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.42f, 4.4f)
            lineTo(0.08f, 17.77f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 24f)
            lineTo(18.68f, 24f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.24f, -6.24f)
            close()
            moveTo(20.46f, 20.17f)
            arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.68f, 21f)
            lineTo(5.32f, 21f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.28f, -2.72f)
            lineTo(5.37f, 4.92f)
            arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.66f, 3f)
            lineTo(16.33f, 3f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.28f, 1.92f)
            lineTo(20.96f, 18.28f)
            arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.46f, 20.17f)
            close()
            moveTo(13.5f, 5.5f)
            verticalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
            moveTo(13.5f, 11.5f)
            verticalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
            moveTo(13.5f, 17.5f)
            verticalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
        }
    }.also { _Road = it }
