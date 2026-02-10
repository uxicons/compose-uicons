package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransporterEmpty: ImageVector? = null

val Icons.Tc.TransporterEmpty: ImageVector
    get() = _TransporterEmpty ?: UXIcon(name = "TransporterEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 22.54f)
                curveToRelative(-0.24f, 0f, -0.46f, -0.18f, -0.49f, -0.43f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.42f, -0.56f)
                curveToRelative(0.04f, -0.01f, 3.87f, -0.54f, 7.57f, -0.54f)
                reflectiveCurveToRelative(7.53f, 0.54f, 7.57f, 0.54f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.29f, 0.42f, 0.56f)
                curveToRelative(-0.04f, 0.27f, -0.28f, 0.46f, -0.56f, 0.42f)
                curveToRelative(-0.04f, -0.01f, -3.81f, -0.53f, -7.43f, -0.53f)
                curveToRelative(-3.73f, 0.0f, -7.33f, 0.53f, -7.5f, 0.54f)
                close()
            }
        }.also { _TransporterEmpty = it}
