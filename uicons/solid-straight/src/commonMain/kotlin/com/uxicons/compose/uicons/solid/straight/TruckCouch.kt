package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCouch: ImageVector? = null

val Icons.Ss.TruckCouch: ImageVector
    get() = _TruckCouch ?: UXIcon(name = "TruckCouch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                verticalLineTo(17.05f)
                curveToRelative(4.92f, -0.56f, 5.45f, 6.76f, 0.5f, 6.95f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.85f, -5.51f)
                lineTo(0.67f, 23.95f)
                lineToRelative(-0.61f, -1.9f)
                lineToRelative(1.38f, -0.44f)
                lineTo(0.15f, 17.72f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.86f, -3.77f)
                lineToRelative(1.53f, 4.74f)
                lineTo(16f, 14.44f)
                verticalLineToRelative(2.47f)
                lineToRelative(2f, -0.64f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 3f)
                close()
                moveTo(4.82f, 16.13f)
                lineToRelative(10.7f, -3.62f)
                lineToRelative(-1.8f, -5.44f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.81f, -1.9f)
                lineTo(5.01f, 6.84f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.1f, 10.62f)
                close()
            }
        }.also { _TruckCouch = it}
