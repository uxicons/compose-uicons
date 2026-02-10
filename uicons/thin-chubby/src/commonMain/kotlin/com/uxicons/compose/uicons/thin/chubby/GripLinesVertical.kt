package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLinesVertical: ImageVector? = null

val Icons.Tc.GripLinesVertical: ImageVector
    get() = _GripLinesVertical ?: UXIcon(name = "GripLinesVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.04f, 1.62f)
                curveToRelative(-0.01f, 0.04f, -1.03f, 4.22f, -1.03f, 10.38f)
                reflectiveCurveToRelative(1.02f, 10.34f, 1.03f, 10.38f)
                curveToRelative(0.07f, 0.27f, -0.1f, 0.54f, -0.36f, 0.61f)
                curveToRelative(-0.26f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                curveToRelative(-0.04f, -0.17f, -1.06f, -4.33f, -1.06f, -10.62f)
                reflectiveCurveToRelative(1.02f, -10.45f, 1.06f, -10.62f)
                curveToRelative(0.07f, -0.27f, 0.34f, -0.43f, 0.61f, -0.36f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, -6.16f, 1.02f, -10.34f, 1.03f, -10.38f)
                curveToRelative(0.07f, -0.27f, -0.1f, -0.54f, -0.36f, -0.61f)
                curveToRelative(-0.27f, -0.06f, -0.54f, 0.1f, -0.61f, 0.36f)
                curveToRelative(-0.04f, 0.17f, -1.06f, 4.33f, -1.06f, 10.62f)
                reflectiveCurveToRelative(1.02f, 10.45f, 1.06f, 10.62f)
                curveToRelative(0.07f, 0.27f, 0.34f, 0.43f, 0.61f, 0.36f)
                curveToRelative(0.27f, -0.07f, 0.43f, -0.34f, 0.36f, -0.61f)
                curveToRelative(-0.01f, -0.04f, -1.03f, -4.22f, -1.03f, -10.38f)
                close()
            }
        }.also { _GripLinesVertical = it}
