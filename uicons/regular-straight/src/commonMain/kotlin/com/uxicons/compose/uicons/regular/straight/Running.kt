package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Rs.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                verticalLineToRelative(2f)
                horizontalLineTo(17.43f)
                lineTo(15.16f, 9.22f)
                lineToRelative(-1.95f, 4.74f)
                lineTo(11.49f, 12.87f)
                lineTo(13.5f, 8f)
                horizontalLineToRelative(-1.88f)
                lineTo(9.55f, 13.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.39f, 1.23f)
                lineToRelative(5.05f, 3.19f)
                verticalLineTo(24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(18.55f)
                lineToRelative(-4.12f, -2.6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.7f, 12.27f)
                lineTo(9.45f, 8f)
                horizontalLineTo(6.62f)
                lineTo(4.89f, 11.45f)
                lineToRelative(-1.79f, -0.89f)
                lineTo(5.38f, 6f)
                horizontalLineTo(13.86f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.57f, 1.45f)
                lineTo(18.57f, 11f)
                close()
                moveTo(15f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                close()
                moveTo(6.83f, 16.8f)
                lineTo(6.33f, 18f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(7.67f)
                lineToRelative(0.8f, -1.94f)
                lineToRelative(-0.67f, -0.42f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.83f, 16.8f)
                close()
            }
        }.also { _Running = it}
