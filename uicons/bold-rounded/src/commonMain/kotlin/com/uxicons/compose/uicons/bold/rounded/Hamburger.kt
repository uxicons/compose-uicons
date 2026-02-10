package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Br.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 14f)
            arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1.72f)
            lineTo(23f, 10.5f)
            arcTo(10.51f, 10.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
            horizontalLineToRelative(-1f)
            arcTo(10.51f, 10.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 10.5f)
            verticalLineToRelative(1.78f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.45f)
            lineTo(1f, 16.5f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
            horizontalLineToRelative(7f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16.5f)
            verticalLineToRelative(-0.78f)
            arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14f)
            close()
            moveTo(11.5f, 3f)
            horizontalLineToRelative(1f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10.5f)
            lineTo(20f, 12f)
            lineTo(4f, 12f)
            lineTo(4f, 10.5f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 3f)
            close()
            moveTo(15.5f, 21f)
            horizontalLineToRelative(-7f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16.5f)
            verticalLineToRelative(-0.47f)
            curveToRelative(1.59f, 0.13f, 2.17f, 0.87f, 3.78f, 2.27f)
            arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.72f, 0f)
            curveTo(13.82f, 16.29f, 13.87f, 16f, 17f, 16f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 21f)
            close()
            moveTo(6f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8.5f)
            close()
            moveTo(10f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6.5f)
            close()
        }
    }.also { _Hamburger = it }
