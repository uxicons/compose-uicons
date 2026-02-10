package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pound: ImageVector? = null

val Icons.Br.Pound: ImageVector
    get() = _Pound ?: UXIcon(name = "Pound") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 21f)
            horizontalLineToRelative(-12.01f)
            arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.51f, -3f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-3f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            curveToRelative(0f, -4.0f, -3.74f, -7.5f, -8f, -7.5f)
            arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.58f, -0.74f, 3f, -2.5f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _Pound = it }
