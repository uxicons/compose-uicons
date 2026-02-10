package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Rr.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, -1.55f)
                lineToRelative(4f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, 1.11f)
                lineToRelative(-4f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 17f)
                close()
                moveTo(19.78f, 20.78f)
                curveToRelative(6.86f, -7.34f, 1.52f, -14.52f, -4.57f, -19.6f)
                horizontalLineToRelative(0f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.43f, 0f)
                curveTo(2.71f, 6.23f, -2.63f, 13.49f, 4.22f, 20.78f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.56f, 0f)
                close()
                moveTo(13.92f, 2.7f)
                horizontalLineToRelative(0f)
                curveTo(18.7f, 6.78f, 24.43f, 12.97f, 18.36f, 19.36f)
                arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.73f, 0f)
                curveToRelative(-6.07f, -6.4f, -0.33f, -12.6f, 4.45f, -16.66f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, 0f)
                close()
                moveTo(8f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                close()
                moveTo(14f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16f)
                close()
            }
        }.also { _Humidity = it}
