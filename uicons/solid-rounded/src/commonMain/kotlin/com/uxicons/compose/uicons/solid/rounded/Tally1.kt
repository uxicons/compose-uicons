package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally1: ImageVector? = null

val Icons.Sr.Tally1: ImageVector
    get() = _Tally1 ?: UXIcon(name = "Tally1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(1f)
                curveTo(0f, 0.45f, 0.45f, 0f, 1f, 0f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Tally1 = it}
