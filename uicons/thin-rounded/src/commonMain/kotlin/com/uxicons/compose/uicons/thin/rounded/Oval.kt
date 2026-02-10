package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oval: ImageVector? = null

val Icons.Tr.Oval: ImageVector
    get() = _Oval ?: UXIcon(name = "Oval") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(-6.62f, 0f, -12f, -3.59f, -12f, -8f)
                reflectiveCurveTo(5.38f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, 3.59f, 12f, 8f)
                reflectiveCurveToRelative(-5.38f, 8f, -12f, 8f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-6.07f, 0f, -11f, 3.14f, -11f, 7f)
                reflectiveCurveToRelative(4.93f, 7f, 11f, 7f)
                reflectiveCurveToRelative(11f, -3.14f, 11f, -7f)
                reflectiveCurveToRelative(-4.93f, -7f, -11f, -7f)
                close()
            }
        }.also { _Oval = it}
