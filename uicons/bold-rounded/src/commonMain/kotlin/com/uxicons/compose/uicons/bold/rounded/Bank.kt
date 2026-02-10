package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bank: ImageVector? = null

val Icons.Br.Bank: ImageVector
    get() = _Bank ?: UXIcon(name = "Bank") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            horizontalLineToRelative(-21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            close()
            moveTo(0.37f, 9.34f)
            arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -3.11f)
            arcToRelative(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, -1.67f)
            lineToRelative(7.16f, -3.91f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.11f, 0f)
            lineToRelative(7.16f, 3.91f)
            arcToRelative(5.11f, 5.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, 1.67f)
            arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 3.12f)
            arcToRelative(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.63f, 1.65f)
            verticalLineToRelative(5.01f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-5.01f)
            arcToRelative(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.63f, -1.65f)
            close()
            moveTo(6f, 16f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(11f, 11f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-5f)
            close()
            moveTo(18f, 16f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(5f)
            close()
            moveTo(3f, 7.89f)
            arcToRelative(0.14f, 0.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, 0.11f)
            horizontalLineToRelative(17.74f)
            arcToRelative(0.14f, 0.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.13f, -0.12f)
            arcToRelative(2.15f, 2.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.72f, -0.69f)
            lineToRelative(-7.16f, -3.91f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.24f, 0f)
            lineToRelative(-7.16f, 3.91f)
            arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.72f, 0.69f)
            close()
        }
    }.also { _Bank = it }
