package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleUp: ImageVector? = null

val Icons.Bs.AngleCircleUp: ImageVector
    get() = _AngleCircleUp ?: UXIcon(name = "AngleCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, -9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                close()
                moveTo(10.23f, 8.73f)
                lineToRelative(-4.25f, 4.25f)
                lineTo(8.1f, 15.1f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(3.9f, 3.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.25f, -4.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                close()
            }
        }.also { _AngleCircleUp = it}
