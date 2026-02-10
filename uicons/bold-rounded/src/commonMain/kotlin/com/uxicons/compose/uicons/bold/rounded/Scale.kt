package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Br.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 2f)
            horizontalLineToRelative(-2.02f)
            arcToRelative(5.92f, 5.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, -1.89f)
            arcToRelative(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.21f, 1.89f)
            horizontalLineToRelative(-2.6f)
            curveToRelative(-2.9f, 0f, -5f, 2.31f, -5f, 5.5f)
            verticalLineToRelative(11f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, -5.5f)
            verticalLineToRelative(-11f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -2.5f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -0.42f, 0.1f, -2.5f, 2f, -2.5f)
            horizontalLineToRelative(1.14f)
            arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, 1.21f)
            arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 2.78f)
            lineToRelative(2.54f, -4.32f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 1.66f)
            lineToRelative(-1.43f, 2.67f)
            horizontalLineToRelative(2.91f)
            arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, -3f)
            curveToRelative(0f, 0.02f, -0.04f, -0.66f, -0.09f, -1f)
            horizontalLineToRelative(0.58f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 2.5f)
            close()
        }
    }.also { _Scale = it }
