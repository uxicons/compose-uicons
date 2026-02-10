package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oval: ImageVector? = null

val Icons.Sr.Oval: ImageVector
    get() = _Oval ?: UXIcon(name = "Oval") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(-6.73f, 0f, -12f, -3.51f, -12f, -8f)
                reflectiveCurveTo(5.27f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, 3.51f, 12f, 8f)
                reflectiveCurveToRelative(-5.27f, 8f, -12f, 8f)
                close()
            }
        }.also { _Oval = it}
