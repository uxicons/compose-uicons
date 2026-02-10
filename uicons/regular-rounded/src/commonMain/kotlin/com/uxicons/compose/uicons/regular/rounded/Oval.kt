package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oval: ImageVector? = null

val Icons.Rr.Oval: ImageVector
    get() = _Oval ?: UXIcon(name = "Oval") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(-6.73f, 0f, -12f, -3.51f, -12f, -8f)
                reflectiveCurveTo(5.27f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, 3.51f, 12f, 8f)
                reflectiveCurveToRelative(-5.27f, 8f, -12f, 8f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-5.42f, 0f, -10f, 2.75f, -10f, 6f)
                reflectiveCurveToRelative(4.58f, 6f, 10f, 6f)
                reflectiveCurveToRelative(10f, -2.75f, 10f, -6f)
                reflectiveCurveToRelative(-4.58f, -6f, -10f, -6f)
                close()
            }
        }.also { _Oval = it}
