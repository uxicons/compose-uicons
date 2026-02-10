package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aubergine: ImageVector? = null

val Icons.Rs.Aubergine: ImageVector
    get() = _Aubergine ?: UXIcon(name = "Aubergine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.37f, 3.93f)
                lineToRelative(-0.74f, -1.86f)
                arcTo(15.47f, 15.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 2.95f)
                verticalLineTo(0f)
                horizontalLineTo(17f)
                verticalLineTo(2.95f)
                arcToRelative(15.47f, 15.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.63f, -0.88f)
                lineToRelative(-0.74f, 1.86f)
                arcToRelative(16.25f, 16.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, 0.57f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.39f, 2.87f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.57f, 1.32f)
                curveToRelative(-1.1f, 1.27f, -2.34f, 1.33f, -4.82f, 1.31f)
                lineTo(7f, 10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 24f)
                curveToRelative(10.02f, 0f, 16f, -5.98f, 16f, -16f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, -3.5f)
                arcTo(16.41f, 16.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.37f, 3.93f)
                close()
                moveTo(7f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                lineToRelative(0.64f, 0f)
                curveToRelative(2.47f, 0.01f, 4.6f, 0.02f, 6.34f, -2f)
                arcToRelative(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.04f, -2.38f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 5.17f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(5.17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8f)
                curveTo(21f, 16.9f, 15.9f, 22f, 7f, 22f)
                close()
            }
        }.also { _Aubergine = it}
