package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransporterEmpty: ImageVector? = null

val Icons.Sc.TransporterEmpty: ImageVector
    get() = _TransporterEmpty ?: UXIcon(name = "TransporterEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 23.5f)
                curveToRelative(-0.3f, 0f, -3.22f, -0.5f, -6.5f, -0.5f)
                curveToRelative(-3.05f, 0f, -6.24f, 0.48f, -6.28f, 0.48f)
                curveToRelative(-0.82f, 0.12f, -1.58f, -0.44f, -1.71f, -1.26f)
                curveToRelative(-0.12f, -0.82f, 0.44f, -1.58f, 1.26f, -1.71f)
                curveToRelative(0.14f, -0.02f, 3.44f, -0.52f, 6.73f, -0.52f)
                reflectiveCurveToRelative(6.59f, 0.5f, 6.73f, 0.52f)
                curveToRelative(0.82f, 0.12f, 1.38f, 0.89f, 1.26f, 1.71f)
                curveToRelative(-0.11f, 0.74f, -0.75f, 1.27f, -1.48f, 1.27f)
                close()
            }
        }.also { _TransporterEmpty = it}
