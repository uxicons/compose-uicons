package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleUp: ImageVector? = null

val Icons.Sr.AngleUp: ImageVector
    get() = _AngleUp ?: UXIcon(name = "AngleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 18f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
                lineTo(13.77f, 9.89f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineTo(2.57f, 17.55f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, 15.43f)
                lineTo(8.11f, 7.77f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.78f, 0f)
                lineToRelative(7.67f, 7.67f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 18f)
                close()
            }
        }.also { _AngleUp = it}
