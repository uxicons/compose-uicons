package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plane: ImageVector? = null

val Icons.Rs.Plane: ImageVector
    get() = _Plane ?: UXIcon(name = "Plane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                horizontalLineTo(17.69f)
                lineTo(13.45f, 1.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.81f, 0f)
                horizontalLineTo(7.13f)
                lineToRelative(2.9f, 10f)
                horizontalLineTo(6.4f)
                lineToRelative(-2.3f, -2.29f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.33f, 8.2f)
                arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.01f, 2.4f)
                lineTo(3.41f, 16f)
                horizontalLineToRelative(6.61f)
                lineToRelative(-3f, 8f)
                horizontalLineToRelative(3.79f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -1.51f)
                lineTo(17.46f, 16f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 10f)
                close()
                moveTo(9.79f, 2f)
                horizontalLineToRelative(1.02f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.86f, 0.49f)
                lineTo(15.46f, 10f)
                horizontalLineTo(12.11f)
                close()
                moveTo(22f, 14f)
                horizontalLineTo(16.35f)
                lineTo(11.69f, 21.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 0.52f)
                horizontalLineTo(9.9f)
                lineToRelative(3f, -8f)
                horizontalLineTo(4.57f)
                lineTo(2.06f, 9.6f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.41f, 9f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.28f, 0.12f)
                lineTo(5.57f, 12f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _Plane = it}
