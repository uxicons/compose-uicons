package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChoirSinging: ImageVector? = null

val Icons.Sr.ChoirSinging: ImageVector
    get() = _ChoirSinging ?: UXIcon(name = "ChoirSinging") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.4f, 11.3f)
                curveToRelative(0.1f, -0.4f, 0.1f, -0.7f, 0.2f, -0.8f)
                curveTo(7.3f, 7.6f, 9.3f, 6f, 12f, 6f)
                reflectiveCurveToRelative(4.7f, 1.6f, 5.4f, 4.4f)
                curveToRelative(0f, 0.2f, 0.1f, 0.5f, 0.2f, 0.8f)
                lineTo(15f, 13f)
                verticalLineTo(9.9f)
                curveToRelative(0f, -0.6f, -0.7f, -1f, -1.2f, -0.6f)
                lineTo(12f, 10.5f)
                lineToRelative(-1.8f, -1.2f)
                curveTo(9.7f, 8.9f, 9f, 9.3f, 9f, 9.9f)
                verticalLineTo(13f)
                lineTo(6.4f, 11.3f)
                lineTo(6.4f, 11.3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                curveToRelative(0.2f, 1f, -0.1f, 2f, -0.8f, 2.8f)
                curveToRelative(-0.7f, 0.8f, -1.6f, 1.2f, -2.7f, 1.2f)
                horizontalLineTo(8.5f)
                curveToRelative(-1f, 0f, -2f, -0.4f, -2.7f, -1.2f)
                curveTo(5.2f, 22f, 4.9f, 21f, 5f, 20f)
                curveToRelative(0.3f, -2.1f, 0.7f, -4.6f, 1f, -6.5f)
                lineToRelative(4.3f, 2.8f)
                curveToRelative(0.5f, 0.3f, 1.1f, 0.5f, 1.7f, 0.5f)
                reflectiveCurveToRelative(1.2f, -0.2f, 1.7f, -0.5f)
                lineToRelative(4.3f, -2.8f)
                curveTo(18.3f, 15.4f, 18.7f, 17.8f, 19f, 20f)
                lineTo(19f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.2f, 22.8f)
                curveToRelative(-0.7f, 0.8f, -1.6f, 1.2f, -2.7f, 1.2f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(1f, -1.2f, 1.4f, -2.8f, 1.2f, -4.3f)
                curveToRelative(-0.3f, -2.2f, -1.6f, -9.7f, -1.6f, -9.7f)
                curveTo(18.9f, 8.3f, 18.1f, 7f, 17.1f, 6f)
                curveToRelative(2.6f, 0f, 4.6f, 1.7f, 5.3f, 4.4f)
                curveToRelative(0.3f, 1.2f, 1f, 5.8f, 1.6f, 9.5f)
                curveTo(24.1f, 21f, 23.9f, 22f, 23.2f, 22.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.2f, 24f)
                horizontalLineTo(3.5f)
                curveToRelative(-1f, 0f, -2f, -0.4f, -2.7f, -1.2f)
                curveTo(0.2f, 22f, -0.1f, 21f, 0f, 20f)
                curveToRelative(0.6f, -3.7f, 1.3f, -8.3f, 1.6f, -9.5f)
                curveTo(2.3f, 7.7f, 4.2f, 6.1f, 6.9f, 6f)
                curveToRelative(-1f, 1f, -1.8f, 2.3f, -2.2f, 3.9f)
                curveToRelative(0f, 0f, -1.3f, 7.6f, -1.6f, 9.7f)
                curveTo(2.8f, 21.2f, 3.2f, 22.8f, 4.2f, 24f)
                close()
            }
        }.also { _ChoirSinging = it}
