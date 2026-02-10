package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCouch: ImageVector? = null

val Icons.Sr.TruckCouch: ImageVector
    get() = _TruckCouch ?: UXIcon(name = "TruckCouch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.38f, -1.99f)
                lineTo(1.32f, 23.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.63f, -1.9f)
                lineToRelative(0.79f, -0.26f)
                lineTo(0.15f, 17.72f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.86f, -3.77f)
                lineToRelative(0.6f, 1.84f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.82f, 1.92f)
                lineTo(16f, 14.44f)
                verticalLineToRelative(2.5f)
                lineToRelative(2f, -0.67f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineTo(17f)
                curveToRelative(0f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 20.5f)
                close()
                moveTo(5.79f, 15.8f)
                lineToRelative(8.79f, -2.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, -1.26f)
                lineTo(13.76f, 7.21f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.91f, 5.16f)
                lineTo(5.01f, 6.84f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.1f, 10.62f)
                lineToRelative(1.42f, 4.53f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.79f, 15.8f)
                close()
            }
        }.also { _TruckCouch = it}
