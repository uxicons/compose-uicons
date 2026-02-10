package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketballHoop: ImageVector? = null

val Icons.Br.BasketballHoop: ImageVector
    get() = _BasketballHoop ?: UXIcon(name = "BasketballHoop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            lineTo(0f, 13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(0.14f)
            lineTo(6f, 20.63f)
            lineTo(6f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(9f, 22f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(13.5f, 22f)
            lineTo(15f, 22f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(18f, 20.77f)
            lineToRelative(0f, -0.03f)
            lineToRelative(0.37f, -2.25f)
            lineTo(18.5f, 18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13f)
            lineTo(24f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            close()
            moveTo(16f, 14.5f)
            lineTo(15.26f, 19f)
            lineTo(8.77f, 19f)
            lineTo(8f, 14.56f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 14f)
            horizontalLineToRelative(7f)
            arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.37f, 0.17f)
            arcTo(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.0f, 14.5f)
            close()
            moveTo(21f, 13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.47f)
            lineToRelative(0.09f, -0.55f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 11f)
            horizontalLineToRelative(-7f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.46f, 4f)
            lineToRelative(0.08f, 0.47f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
            lineTo(3f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
            close()
            moveTo(18f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
            horizontalLineToRelative(-5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 5f)
            horizontalLineToRelative(5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8.5f)
            close()
        }
    }.also { _BasketballHoop = it }
