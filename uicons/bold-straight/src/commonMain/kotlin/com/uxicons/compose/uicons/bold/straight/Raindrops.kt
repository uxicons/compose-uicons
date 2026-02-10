package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Bs.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.41f, 24f)
                arcToRelative(6.59f, 6.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.66f, -11.25f)
                lineToRelative(4.66f, -4.94f)
                lineToRelative(4.69f, 4.97f)
                arcToRelative(6.58f, 6.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 9.29f)
                horizontalLineToRelative(0f)
                arcTo(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.41f, 24f)
                close()
                moveTo(17.41f, 12.19f)
                lineTo(14.9f, 14.84f)
                arcToRelative(3.59f, 3.59f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.04f, 0.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.62f, 13.5f)
                arcTo(5.62f, 5.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 3.9f)
                lineTo(5.62f, 0.01f)
                lineToRelative(3.97f, 3.88f)
                arcTo(5.65f, 5.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 11.85f)
                horizontalLineToRelative(0f)
                arcTo(5.59f, 5.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.62f, 13.5f)
                close()
                moveTo(5.62f, 4.2f)
                lineTo(3.76f, 6.03f)
                arcToRelative(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 3.7f)
                arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.71f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.71f)
                close()
            }
        }.also { _Raindrops = it}
