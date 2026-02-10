package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Package: ImageVector? = null

val Icons.Br.Package: ImageVector
    get() = _Package ?: UXIcon(name = "Package") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 7f)
            horizontalLineToRelative(-4f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3.5f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.51f, -5.12f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.97f, 0f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.51f, 5.12f)
            verticalLineToRelative(11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-12f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
            close()
            moveTo(5.5f, 9f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 2.5f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-3.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
            close()
            moveTo(16f, 15f)
            verticalLineToRelative(-4.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(0.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
            verticalLineToRelative(4.5f)
            close()
        }
    }.also { _Package = it }
