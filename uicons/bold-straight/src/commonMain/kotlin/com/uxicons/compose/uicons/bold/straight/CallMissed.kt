package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallMissed: ImageVector? = null

val Icons.Bs.CallMissed: ImageVector
    get() = _CallMissed ?: UXIcon(name = "CallMissed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.32f, 15.46f)
                curveToRelative(-4.63f, -4.63f, -16.01f, -4.63f, -20.64f, 0f)
                arcToRelative(5.63f, 5.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, 4f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(20.54f)
                arcTo(8.56f, 8.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.99f, 20f)
                arcTo(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20.55f)
                verticalLineTo(24f)
                horizontalLineToRelative(9f)
                verticalLineTo(19.47f)
                arcTo(5.63f, 5.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.32f, 15.46f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(18.54f)
                lineToRelative(-0.91f, -0.39f)
                arcTo(12.67f, 12.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 17f)
                arcToRelative(12.16f, 12.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 1.16f)
                lineToRelative(-0.89f, 0.4f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19.46f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -1.88f)
                curveToRelative(3.16f, -3.16f, 12.67f, -3.72f, 16.4f, 0f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 1.88f)
                close()
                moveTo(5.5f, 4.5f)
                lineTo(3f, 7f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                horizontalLineToRelative(6f)
                lineTo(7.63f, 2.37f)
                lineTo(12.5f, 6.89f)
                lineTo(19.19f, 0.2f)
                lineToRelative(2.12f, 2.12f)
                lineTo(14.43f, 9.2f)
                arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 10f)
                horizontalLineToRelative(0f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.93f, -0.8f)
                close()
            }
        }.also { _CallMissed = it}
