package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Br.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.31f, 7.55f)
            lineToRelative(-2.35f, -1.4f)
            lineToRelative(0.02f, -3.24f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
            horizontalLineToRelative(-7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 2.91f)
            verticalLineToRelative(3.22f)
            lineTo(5.65f, 7.55f)
            arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12.26f)
            lineTo(3f, 18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
            horizontalLineToRelative(7f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            lineTo(21f, 12.27f)
            arcTo(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.31f, 7.55f)
            close()
            moveTo(18f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 21f)
            horizontalLineToRelative(-7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
            lineTo(6f, 12.26f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.21f, -2.14f)
            lineToRelative(3.07f, -1.86f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6.97f)
            lineTo(11f, 3f)
            horizontalLineToRelative(1.99f)
            lineToRelative(-0.03f, 3.99f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.73f, 1.3f)
            lineToRelative(3.08f, 1.84f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12.27f)
            close()
            moveTo(16f, 15.5f)
            verticalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 18f)
            horizontalLineToRelative(-5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16.5f)
            verticalLineToRelative(-1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 14f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15.5f)
            close()
        }
    }.also { _Bottle = it }
