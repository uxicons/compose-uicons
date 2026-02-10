package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarGarage: ImageVector? = null

val Icons.Sr.CarGarage: ImageVector
    get() = _CarGarage ?: UXIcon(name = "CarGarage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.89f, 6.45f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.35f, 0.44f)
                lineTo(13.75f, 2.4f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.52f, 0.01f)
                lineToRelative(-8.78f, 4.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.91f, -1.78f)
                lineTo(9.34f, 0.62f)
                arcTo(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.65f, 0.62f)
                lineToRelative(8.81f, 4.49f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.89f, 6.45f)
                close()
                moveTo(22.08f, 13.12f)
                lineTo(20.02f, 9.52f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.68f, 7f)
                horizontalLineTo(8.32f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.98f, 9.52f)
                lineToRelative(-2.06f, 3.6f)
                arcTo(7.11f, 7.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 14f)
                horizontalLineToRelative(21f)
                arcTo(7.11f, 7.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.08f, 13.12f)
                close()
                moveTo(19f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(16f)
                horizontalLineTo(1.03f)
                quadTo(1f, 16.3f, 1f, 16.59f)
                verticalLineTo(18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.46f)
                verticalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineToRelative(-0.54f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                verticalLineTo(16.59f)
                quadToRelative(0f, -0.3f, -0.03f, -0.59f)
                close()
            }
        }.also { _CarGarage = it}
