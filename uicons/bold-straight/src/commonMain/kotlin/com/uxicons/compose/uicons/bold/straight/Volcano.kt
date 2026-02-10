package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volcano: ImageVector? = null

val Icons.Bs.Volcano: ImageVector
    get() = _Volcano ?: UXIcon(name = "Volcano") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.28f, 11f)
                horizontalLineTo(7.82f)
                lineTo(0f, 22.02f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(21.93f)
                close()
                moveTo(4.35f, 21f)
                lineToRelative(3.66f, -5.12f)
                curveToRelative(0f, 0.04f, -0.01f, 0.08f, -0.01f, 0.12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(16f)
                curveToRelative(0f, -0.08f, -0.02f, -0.15f, -0.02f, -0.22f)
                lineTo(19.67f, 21f)
                close()
                moveTo(2f, 6f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.52f, 3.04f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -1.91f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.96f, 0f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 1.91f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.16f)
                lineToRelative(-0.18f, -1.16f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, -0.66f)
                lineToRelative(-1.32f, 0.93f)
                lineToRelative(-0.83f, -1.38f)
                arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.56f, 0f)
                lineTo(9.89f, 5.12f)
                lineTo(8.57f, 4.18f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0.66f)
                lineTo(6.84f, 6f)
                lineTo(11f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6f)
                close()
            }
        }.also { _Volcano = it}
