package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Rs.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 23f)
                horizontalLineTo(5.5f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 12.67f)
                arcTo(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.79f, 7.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 23f)
                close()
                moveTo(10f, 3f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, 3.56f)
                lineToRelative(0.88f, 1.19f)
                lineToRelative(-1.44f, 0.37f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
                horizontalLineTo(16f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -11.94f)
                lineToRelative(-0.76f, -0.1f)
                lineToRelative(-0.1f, -0.76f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3f)
                close()
            }
        }.also { _Cloud = it}
