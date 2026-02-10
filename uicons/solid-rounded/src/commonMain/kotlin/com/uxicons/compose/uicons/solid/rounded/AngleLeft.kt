package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleLeft: ImageVector? = null

val Icons.Sr.AngleLeft: ImageVector
    get() = _AngleLeft ?: UXIcon(name = "AngleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.92f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, 1.06f)
                lineTo(9.81f, 10.24f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(7.66f, 7.66f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
                lineTo(7.69f, 15.9f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.78f)
                lineTo(15.36f, 0.44f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.56f, 1.06f)
                close()
            }
        }.also { _AngleLeft = it}
