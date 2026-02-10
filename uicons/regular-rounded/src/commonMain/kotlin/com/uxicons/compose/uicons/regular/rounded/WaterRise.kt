package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterRise: ImageVector? = null

val Icons.Rr.WaterRise: ImageVector
    get() = _WaterRise ?: UXIcon(name = "WaterRise") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -1.23f)
                arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.18f, 4.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, 0.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, -1.49f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.39f, -0.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 0f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 0f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 0f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.39f, 0.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.33f, 1.49f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -1.23f)
                arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.18f, 4.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, 0.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, -1.49f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.39f, -0.82f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 0f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 0f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 0f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.39f, 0.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.33f, 1.49f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.71f, 3.29f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineToRelative(-3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.71f, 4.71f)
                lineTo(11f, 3.42f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(3.42f)
                lineToRelative(1.3f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.42f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _WaterRise = it}
