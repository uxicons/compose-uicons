package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Knife: ImageVector? = null

val Icons.Ss.Knife: ImageVector
    get() = _Knife ?: UXIcon(name = "Knife") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.67f, 0.14f)
                arcTo(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.23f, 0.7f)
                lineTo(-0.01f, 22.62f)
                lineToRelative(1.47f, 1.36f)
                lineToRelative(5.49f, -5.9f)
                curveToRelative(13f, -1.19f, 17.04f, -11.85f, 17.04f, -15.59f)
                verticalLineTo(2.13f)
                arcTo(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.67f, 0.14f)
                close()
            }
        }.also { _Knife = it}
