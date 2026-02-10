package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oval: ImageVector? = null

val Icons.Bs.Oval: ImageVector
    get() = _Oval ?: UXIcon(name = "Oval") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(-6.73f, 0f, -12f, -3.51f, -12f, -8f)
                reflectiveCurveTo(5.27f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, 3.51f, 12f, 8f)
                reflectiveCurveToRelative(-5.27f, 8f, -12f, 8f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-4.88f, 0f, -9f, 2.29f, -9f, 5f)
                reflectiveCurveToRelative(4.12f, 5f, 9f, 5f)
                reflectiveCurveToRelative(9f, -2.29f, 9f, -5f)
                reflectiveCurveToRelative(-4.12f, -5f, -9f, -5f)
                close()
            }
        }.also { _Oval = it}
