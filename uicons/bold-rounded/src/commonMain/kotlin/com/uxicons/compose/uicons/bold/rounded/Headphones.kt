package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headphones: ImageVector? = null

val Icons.Br.Headphones: ImageVector
    get() = _Headphones ?: UXIcon(name = "Headphones") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 11.55f)
            lineTo(21f, 9.99f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18f, 0f)
            verticalLineToRelative(1.56f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 4.76f)
            verticalLineToRelative(0.36f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 22f)
            lineTo(5.5f, 22f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19.5f)
            verticalLineToRelative(-6f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.45f)
            lineTo(6f, 9.99f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            verticalLineToRelative(1.06f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13.5f)
            verticalLineToRelative(6f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 22f)
            horizontalLineToRelative(0.18f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.68f)
            verticalLineToRelative(-0.36f)
            arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11.55f)
            close()
            moveTo(5f, 18.98f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2.3f)
            verticalLineToRelative(-0.36f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2.3f)
            close()
            moveTo(21f, 16.68f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.3f)
            lineTo(19f, 14.02f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2.3f)
            close()
        }
    }.also { _Headphones = it }
