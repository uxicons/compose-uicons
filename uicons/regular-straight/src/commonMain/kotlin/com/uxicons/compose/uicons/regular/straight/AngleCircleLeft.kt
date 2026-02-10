package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleLeft: ImageVector? = null

val Icons.Rs.AngleCircleLeft: ImageVector
    get() = _AngleCircleLeft ?: UXIcon(name = "AngleCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(8.59f, 13.41f)
                lineTo(13.3f, 18.13f)
                lineToRelative(1.41f, -1.41f)
                lineTo(10f, 12f)
                lineToRelative(4.67f, -4.67f)
                lineTo(13.26f, 5.91f)
                lineTo(8.59f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.83f)
                close()
            }
        }.also { _AngleCircleLeft = it}
