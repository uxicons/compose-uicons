package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareUp: ImageVector? = null

val Icons.Br.AngleSquareUp: ImageVector
    get() = _AngleSquareUp ?: UXIcon(name = "AngleSquareUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 0f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            lineTo(5.5f, 24f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            lineTo(0f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            close()
            moveTo(18.5f, 21f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            lineTo(21f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            lineTo(5.5f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7.99f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, 0.99f)
            lineToRelative(3.1f, 3.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.1f, 2.14f)
            lineToRelative(-3.1f, -3.04f)
            arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, 0f)
            lineToRelative(-3.1f, 3.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.1f, -2.14f)
            lineToRelative(3.1f, -3.05f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.99f)
            close()
        }
    }.also { _AngleSquareUp = it }
