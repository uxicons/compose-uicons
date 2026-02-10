package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransporterEmpty: ImageVector? = null

val Icons.Rc.TransporterEmpty: ImageVector
    get() = _TransporterEmpty ?: UXIcon(name = "TransporterEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.0f, 23f)
                curveToRelative(-0.2f, -0.01f, -3.52f, -0.49f, -7.0f, -0.5f)
                curveToRelative(-3.34f, 0f, -6.83f, 0.48f, -6.86f, 0.49f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                reflectiveCurveToRelative(0.3f, -1.05f, 0.85f, -1.13f)
                curveToRelative(0.15f, -0.02f, 3.65f, -0.51f, 7.14f, -0.51f)
                reflectiveCurveToRelative(6.99f, 0.49f, 7.14f, 0.51f)
                curveToRelative(0.55f, 0.08f, 0.93f, 0.58f, 0.85f, 1.13f)
                curveToRelative(-0.07f, 0.5f, -0.5f, 0.86f, -0.99f, 0.86f)
                close()
            }
        }.also { _TransporterEmpty = it}
