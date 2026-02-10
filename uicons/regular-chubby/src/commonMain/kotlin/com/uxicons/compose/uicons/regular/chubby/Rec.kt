package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rec: ImageVector? = null

val Icons.Rc.Rec: ImageVector
    get() = _Rec ?: UXIcon(name = "Rec") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveTo(6.6f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
        }.also { _Rec = it}
