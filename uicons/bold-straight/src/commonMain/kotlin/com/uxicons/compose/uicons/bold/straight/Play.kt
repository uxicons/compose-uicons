package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Bs.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 23.76f)
                verticalLineTo(0.28f)
                lineTo(19.03f, 9.23f)
                arcToRelative(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 5.54f)
                close()
                moveTo(8f, 5.75f)
                verticalLineTo(18.27f)
                lineToRelative(9.41f, -6.03f)
                arcToRelative(0.26f, 0.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, -0.24f)
                arcToRelative(0.26f, 0.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, -0.23f)
                close()
            }
        }.also { _Play = it}
