package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Rs.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 22f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, -1.62f)
                lineToRelative(4.4f, -2.56f)
                lineToRelative(-1.01f, -1.73f)
                lineToRelative(-4.4f, 2.56f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, -1.14f)
                lineToRelative(2.55f, -4.39f)
                lineToRelative(-1.73f, -1.0f)
                lineTo(14.61f, 16.51f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.08f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineToRelative(5.08f)
                arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 0.42f)
                lineToRelative(-2.55f, -4.38f)
                lineTo(5.13f, 13.13f)
                lineToRelative(2.55f, 4.38f)
                arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 1.14f)
                lineTo(2.14f, 16.09f)
                lineTo(1.13f, 17.82f)
                lineToRelative(4.38f, 2.55f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.08f, 22f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                close()
                moveTo(7.1f, 22f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.8f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.71f, 3.71f)
                lineTo(7.29f, 5.12f)
                lineToRelative(3.29f, 3.29f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 0f)
                lineToRelative(3.29f, -3.29f)
                lineTo(15.29f, 3.71f)
                lineTo(13f, 6f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                close()
            }
        }.also { _Sunset = it}
