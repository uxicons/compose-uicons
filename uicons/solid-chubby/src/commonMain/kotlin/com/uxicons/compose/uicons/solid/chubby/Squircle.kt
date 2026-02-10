package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Squircle: ImageVector? = null

val Icons.Sc.Squircle: ImageVector
    get() = _Squircle ?: UXIcon(name = "Squircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-11f, 0f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 0f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = true, -22f, 0f)
            }
        }.also { _Squircle = it}
