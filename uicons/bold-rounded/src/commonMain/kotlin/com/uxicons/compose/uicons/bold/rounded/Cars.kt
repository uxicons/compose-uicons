package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cars: ImageVector? = null

val Icons.Br.Cars: ImageVector
    get() = _Cars ?: UXIcon(name = "Cars") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 17.5f)
            arcToRelative(10.75f, 10.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.55f, -3.4f)
            lineToRelative(-1.11f, -3.34f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.12f, 7f)
            lineTo(14f, 7f)
            arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.22f, 3.76f)
            lineTo(7.67f, 14.1f)
            curveTo(6.85f, 16.45f, 6.72f, 19.65f, 9f, 21.16f)
            lineTo(9f, 22f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            horizontalLineToRelative(5f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            verticalLineToRelative(-0.76f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17.5f)
            close()
            moveTo(14f, 10f)
            horizontalLineToRelative(3.12f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.37f, 1.71f)
            lineTo(20.59f, 15f)
            lineTo(10.53f, 15f)
            lineToRelative(1.1f, -3.29f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 10f)
            close()
            moveTo(6.91f, 10.05f)
            curveTo(6.9f, 10.07f, 6f, 12.78f, 6f, 12.78f)
            lineTo(6f, 15f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            verticalLineToRelative(-0.76f)
            curveTo(-0.38f, 12.77f, -0.29f, 9.5f, 0.55f, 7.1f)
            lineTo(1.67f, 3.76f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.88f, 0f)
            lineTo(10f, 0f)
            arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.76f, 2.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, 1.5f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3f)
            lineTo(6.88f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.51f, 4.71f)
            lineTo(3.41f, 8f)
            lineTo(5.5f, 8f)
            arcTo(1.52f, 1.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.91f, 10.05f)
            close()
        }
    }.also { _Cars = it }
