package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Br.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.3f, -2.91f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            lineTo(5.5f, 0f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, 2.09f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, 5.75f)
            lineTo(3.54f, 19.4f)
            arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.75f, 24f)
            horizontalLineToRelative(6.5f)
            arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.21f, -4.6f)
            lineTo(21.91f, 7.84f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 5f)
            close()
            moveTo(18.24f, 13f)
            lineTo(14.82f, 13f)
            curveToRelative(-0.9f, -3.96f, -4.73f, -3.96f, -5.63f, 0f)
            lineTo(5.76f, 13f)
            lineTo(5.14f, 8f)
            lineTo(18.86f, 8f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(13f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            lineTo(19f, 5f)
            lineTo(5f, 5f)
            lineTo(5f, 3.5f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            close()
            moveTo(15.25f, 21f)
            horizontalLineToRelative(-6.5f)
            arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.23f, -1.97f)
            lineTo(6.14f, 16f)
            lineTo(9.18f, 16f)
            curveToRelative(0.9f, 3.96f, 4.73f, 3.96f, 5.63f, 0f)
            horizontalLineToRelative(3.05f)
            lineToRelative(-0.38f, 3.03f)
            arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.25f, 21f)
            close()
        }
    }.also { _Coffee = it }
