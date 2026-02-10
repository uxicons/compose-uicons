package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTilt: ImageVector? = null

val Icons.Rs.CarTilt: ImageVector
    get() = _CarTilt ?: UXIcon(name = "CarTilt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.27f, 22f)
                lineToRelative(3.9f, -2.48f)
                lineToRelative(-1.07f, -1.69f)
                lineToRelative(6.75f, -4.3f)
                lineToRelative(1.07f, 1.69f)
                lineToRelative(4.22f, -2.69f)
                lineToRelative(-1.07f, -1.69f)
                lineToRelative(1.69f, -1.07f)
                lineTo(21.91f, 6.9f)
                arcToRelative(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.95f, -3.85f)
                lineTo(13.58f, 0.43f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.43f, 0.47f)
                lineTo(2.39f, 5.59f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.37f, 2.84f)
                lineToRelative(0.53f, 5.08f)
                arcToRelative(12.08f, 12.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.81f, 5.21f)
                lineToRelative(1.83f, 2.87f)
                lineToRelative(1.69f, -1.07f)
                lineTo(7.82f, 22f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                close()
                moveTo(3.46f, 7.27f)
                lineTo(11.5f, 2.16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, -0.01f)
                lineTo(16.82f, 4.7f)
                lineToRelative(-13.3f, 8.47f)
                lineTo(3.01f, 8.22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.46f, 7.27f)
                close()
                moveTo(5.04f, 17.64f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, -2.38f)
                lineToRelative(1.4f, -0.89f)
                lineToRelative(0.54f, 0.84f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -1.07f)
                lineToRelative(-0.54f, -0.84f)
                lineToRelative(8.43f, -5.37f)
                lineTo(16f, 8.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.68f, 7.7f)
                lineToRelative(-0.54f, -0.84f)
                lineToRelative(1.4f, -0.89f)
                arcToRelative(10.09f, 10.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.69f, 2.01f)
                lineToRelative(0.75f, 1.18f)
                lineToRelative(-3.17f, 2.02f)
                lineToRelative(-1.04f, 0.66f)
                horizontalLineToRelative(0f)
                lineToRelative(-6.75f, 4.3f)
                horizontalLineToRelative(0f)
                lineTo(5.8f, 18.83f)
                close()
            }
        }.also { _CarTilt = it}
