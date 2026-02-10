package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Ss.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 13f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.43f, 1.61f)
                lineToRelative(4.38f, 2.55f)
                lineToRelative(-1f, 1.73f)
                lineToRelative(-4.39f, -2.56f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.12f, 1.13f)
                lineToRelative(2.56f, 4.4f)
                lineTo(17.19f, 22.87f)
                lineTo(14.64f, 18.48f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.92f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(18.92f)
                arcToRelative(6.89f, 6.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -0.43f)
                lineToRelative(-2.55f, 4.39f)
                lineTo(5.1f, 21.86f)
                lineToRelative(2.55f, -4.39f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, -1.13f)
                lineTo(2.15f, 18.89f)
                lineTo(1.14f, 17.16f)
                lineToRelative(4.37f, -2.55f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.08f, 13f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                horizontalLineTo(5.08f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -1.63f)
                lineTo(1.13f, 6.82f)
                lineTo(2.14f, 5.09f)
                lineTo(6.53f, 7.65f)
                arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, -1.14f)
                lineTo(5.13f, 2.13f)
                lineTo(6.85f, 1.12f)
                lineTo(9.4f, 5.5f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5.08f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(5.08f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 0.43f)
                lineToRelative(2.55f, -4.39f)
                lineTo(18.89f, 2.13f)
                lineToRelative(-2.55f, 4.39f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, 1.14f)
                lineToRelative(4.4f, -2.56f)
                lineToRelative(1.01f, 1.73f)
                lineToRelative(-4.4f, 2.56f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.92f, 11f)
                horizontalLineTo(24f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Sun = it}
