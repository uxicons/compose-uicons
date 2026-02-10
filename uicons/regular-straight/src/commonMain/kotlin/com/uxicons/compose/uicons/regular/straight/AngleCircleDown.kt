package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleDown: ImageVector? = null

val Icons.Rs.AngleCircleDown: ImageVector
    get() = _AngleCircleDown ?: UXIcon(name = "AngleCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
                moveTo(13.41f, 15.41f)
                lineTo(18.13f, 10.7f)
                lineTo(16.71f, 9.29f)
                lineTo(12f, 14f)
                lineTo(7.33f, 9.33f)
                lineTo(5.91f, 10.74f)
                lineToRelative(4.67f, 4.67f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 0f)
                close()
            }
        }.also { _AngleCircleDown = it}
