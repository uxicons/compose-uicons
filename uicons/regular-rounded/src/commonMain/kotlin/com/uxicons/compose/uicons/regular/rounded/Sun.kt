package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Rr.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                horizontalLineTo(18.92f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, -1.61f)
                lineToRelative(3.53f, -2.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, -1.73f)
                lineToRelative(-3.53f, 2.05f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, -1.15f)
                lineToRelative(2.05f, -3.53f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, -1f)
                lineTo(14.61f, 5.51f)
                arcTo(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.08f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(5.08f)
                arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.61f, 0.43f)
                lineTo(7.35f, 1.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 1f)
                lineTo(7.66f, 6.51f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 1.15f)
                lineTo(2.98f, 5.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1.73f)
                lineTo(5.51f, 9.39f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.08f, 11f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(5.08f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.43f, 1.61f)
                lineTo(1.98f, 16.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1.73f)
                lineToRelative(3.53f, -2.05f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, 1.15f)
                lineTo(5.62f, 21.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, 1f)
                lineToRelative(2.04f, -3.53f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.92f)
                verticalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(18.92f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, -0.43f)
                lineToRelative(2.04f, 3.53f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -1f)
                lineToRelative(-2.05f, -3.53f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, -1.15f)
                lineToRelative(3.53f, 2.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1.73f)
                lineToRelative(-3.53f, -2.04f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.92f, 13f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 11f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-6.61f, -0.21f, -6.61f, -9.79f, 0f, -10f)
                curveTo(18.61f, 7.21f, 18.61f, 16.79f, 12f, 17f)
                close()
            }
        }.also { _Sun = it}
