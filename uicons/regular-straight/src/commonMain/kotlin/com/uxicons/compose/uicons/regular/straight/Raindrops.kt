package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Rs.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, -1.76f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8.49f)
                lineTo(14f, 9.25f)
                lineToRelative(4.26f, 4.52f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.02f, 8.47f)
                horizontalLineToRelative(0f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                close()
                moveTo(14f, 12.17f)
                lineTo(11.19f, 15.15f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, 5.68f)
                arcToRelative(4.09f, 4.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.66f)
                close()
                moveTo(5f, 12.0f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, -1.47f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.07f)
                lineTo(5f, 0f)
                lineTo(8.53f, 3.45f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 7.08f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11.99f)
                close()
                moveTo(5f, 2.8f)
                lineTo(2.87f, 4.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 9.11f)
                horizontalLineToRelative(0f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                close()
                moveTo(20f, 10.0f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.17f, 8.82f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.66f)
                lineTo(19.98f, 0.04f)
                lineTo(22.86f, 3.2f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 5.62f)
                horizontalLineToRelative(0f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9.99f)
                close()
                moveTo(19.99f, 3.02f)
                lineTo(18.62f, 4.54f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, 2.87f)
                horizontalLineToRelative(0f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.83f)
                close()
            }
        }.also { _Raindrops = it}
