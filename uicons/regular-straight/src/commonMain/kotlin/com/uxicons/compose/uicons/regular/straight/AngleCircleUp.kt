package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleUp: ImageVector? = null

val Icons.Rs.AngleCircleUp: ImageVector
    get() = _AngleCircleUp ?: UXIcon(name = "AngleCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                close()
                moveTo(10.59f, 8.59f)
                lineTo(5.87f, 13.3f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12f, 10f)
                lineToRelative(4.67f, 4.67f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 8.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                close()
            }
        }.also { _AngleCircleUp = it}
