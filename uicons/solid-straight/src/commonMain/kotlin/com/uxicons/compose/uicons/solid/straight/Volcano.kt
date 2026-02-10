package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volcano: ImageVector? = null

val Icons.Ss.Volcano: ImageVector
    get() = _Volcano ?: UXIcon(name = "Volcano") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.16f, 14f)
                lineToRelative(2.87f, -4f)
                horizontalLineToRelative(5.94f)
                lineToRelative(2.87f, 4f)
                horizontalLineTo(16f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0.77f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14f)
                close()
                moveTo(16f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(4.73f)
                lineTo(0f, 22.68f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(22.59f)
                lineTo(19.27f, 16f)
                close()
                moveTo(19.66f, 3.02f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.68f, -1.66f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.97f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.34f, 3.02f)
                curveToRelative(-4.18f, 0.57f, -2.13f, 6.63f, 1.54f, 4.57f)
                curveTo(6.89f, 8.29f, 10.4f, 7.91f, 11f, 8f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                curveToRelative(0.62f, -0.09f, 4.09f, 0.29f, 5.12f, -0.42f)
                curveTo(21.79f, 9.65f, 23.84f, 3.58f, 19.66f, 3.02f)
                close()
            }
        }.also { _Volcano = it}
