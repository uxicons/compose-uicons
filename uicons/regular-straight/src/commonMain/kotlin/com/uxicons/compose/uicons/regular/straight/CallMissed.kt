package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallMissed: ImageVector? = null

val Icons.Rs.CallMissed: ImageVector
    get() = _CallMissed ?: UXIcon(name = "CallMissed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.41f, 16.46f)
                curveTo(20.19f, 14.24f, 16.36f, 13.01f, 12f, 13f)
                curveToRelative(-4.37f, 0.02f, -8.25f, 1.31f, -10.4f, 3.46f)
                arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 20.25f)
                verticalLineTo(24f)
                horizontalLineTo(8f)
                verticalLineTo(19.74f)
                arcTo(10.94f, 10.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, 19f)
                horizontalLineTo(12f)
                arcTo(11.65f, 11.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 19.75f)
                verticalLineTo(24f)
                horizontalLineToRelative(8f)
                verticalLineTo(20.25f)
                arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.41f, 16.46f)
                close()
                moveTo(22f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(18.42f)
                lineToRelative(-0.61f, -0.26f)
                arcTo(13.87f, 13.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 17f)
                arcToRelative(13.07f, 13.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.41f, 1.16f)
                lineTo(6f, 18.43f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(20.25f)
                arcToRelative(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.01f, -2.37f)
                curveToRelative(1.76f, -1.76f, 5.21f, -2.86f, 9f, -2.88f)
                reflectiveCurveToRelative(7.17f, 1.06f, 8.99f, 2.88f)
                arcTo(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 20.25f)
                close()
                moveTo(5f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(3.47f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 1f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(6.44f)
                lineToRelative(5.91f, 5.93f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, 0.07f)
                horizontalLineToRelative(0f)
                arcToRelative(0.22f, 0.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, -0.06f)
                lineToRelative(6.88f, -6.88f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.88f, 6.88f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, 0.65f)
                horizontalLineToRelative(0f)
                arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -0.65f)
                lineTo(5f, 4.39f)
                close()
            }
        }.also { _CallMissed = it}
