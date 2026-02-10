package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Ss.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, -1.76f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8.48f)
                lineTo(14f, 9.26f)
                lineToRelative(4.26f, 4.52f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, 8.46f)
                horizontalLineToRelative(0f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                close()
                moveTo(5f, 12f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, -1.47f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.07f)
                lineTo(5f, 0.01f)
                lineToRelative(3.53f, 3.45f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 7.08f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                close()
                moveTo(20f, 10f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, -1.17f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.66f)
                lineTo(19.98f, 0.05f)
                lineTo(22.86f, 3.21f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 5.62f)
                horizontalLineToRelative(0f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                close()
            }
        }.also { _Raindrops = it}
