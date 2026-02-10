package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallMissed: ImageVector? = null

val Icons.Ss.CallMissed: ImageVector
    get() = _CallMissed ?: UXIcon(name = "CallMissed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20.25f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(19.25f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.06f, -0.76f)
                arcTo(10.94f, 10.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19.24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(20.25f)
                arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, -3.79f)
                curveTo(3.74f, 14.31f, 7.63f, 13.02f, 12f, 13f)
                curveToRelative(4.36f, 0.01f, 8.19f, 1.24f, 10.41f, 3.46f)
                arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 20.25f)
                close()
                moveTo(5f, 4.39f)
                lineToRelative(5.93f, 5.95f)
                arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, 0.65f)
                horizontalLineToRelative(0f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, -0.65f)
                lineToRelative(6.88f, -6.88f)
                lineTo(19.54f, 2.04f)
                lineTo(12.66f, 8.93f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, 0.06f)
                horizontalLineToRelative(0f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, -0.07f)
                lineTo(6.44f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineTo(5.5f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.47f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _CallMissed = it}
