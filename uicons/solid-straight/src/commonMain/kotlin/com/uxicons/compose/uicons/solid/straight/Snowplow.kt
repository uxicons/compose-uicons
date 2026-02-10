package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snowplow: ImageVector? = null

val Icons.Ss.Snowplow: ImageVector
    get() = _Snowplow ?: UXIcon(name = "Snowplow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.2f, 8f)
                lineTo(6f, 8f)
                lineTo(6f, 1f)
                lineTo(9.12f, 1f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.74f, 1.77f)
                close()
                moveTo(22f, 16.72f)
                lineTo(22f, 8f)
                lineTo(20f, 8f)
                verticalLineToRelative(4f)
                lineTo(16.86f, 12f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.89f, -2f)
                lineTo(4f, 10f)
                lineTo(4f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 9f)
                lineToRelative(0.01f, 4.81f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13f)
                lineTo(14f, 13f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.31f, 1f)
                lineTo(20f, 14f)
                verticalLineToRelative(2.72f)
                arcToRelative(8.83f, 8.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 6.29f)
                lineTo(24.01f, 21.6f)
                arcTo(6.85f, 6.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 16.72f)
                close()
                moveTo(18f, 19f)
                arcToRelative(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(4f, 23f)
                curveToRelative(-5.28f, -0.14f, -5.27f, -7.86f, 0f, -8f)
                lineTo(14f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19f)
                close()
                moveTo(6f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                close()
                moveTo(10f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 19f)
                close()
                moveTo(14f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                close()
            }
        }.also { _Snowplow = it}
