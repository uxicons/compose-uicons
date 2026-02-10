package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally1: ImageVector? = null

val Icons.Br.Tally1: ImageVector
    get() = _Tally1 ?: UXIcon(name = "Tally1") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Tally1 = it }
