package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLines: ImageVector? = null

val Icons.Tc.GripLines: ImageVector
    get() = _GripLines ?: UXIcon(name = "GripLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 9.67f)
                curveToRelative(-0.07f, -0.27f, 0.1f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.17f, -0.04f, 4.33f, -1.06f, 10.62f, -1.06f)
                reflectiveCurveToRelative(10.45f, 1.02f, 10.62f, 1.06f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.36f)
                curveToRelative(-0.04f, -0.01f, -4.22f, -1.03f, -10.38f, -1.03f)
                reflectiveCurveToRelative(-10.34f, 1.02f, -10.38f, 1.03f)
                curveToRelative(-0.27f, 0.06f, -0.54f, -0.1f, -0.61f, -0.36f)
                close()
                moveTo(22.62f, 15.06f)
                curveToRelative(-0.17f, -0.04f, -4.33f, -1.06f, -10.62f, -1.06f)
                reflectiveCurveToRelative(-10.45f, 1.02f, -10.62f, 1.06f)
                curveToRelative(-0.27f, 0.07f, -0.43f, 0.34f, -0.36f, 0.61f)
                reflectiveCurveToRelative(0.33f, 0.43f, 0.61f, 0.36f)
                curveToRelative(0.04f, -0.01f, 4.22f, -1.03f, 10.38f, -1.03f)
                reflectiveCurveToRelative(10.34f, 1.02f, 10.38f, 1.03f)
                curveToRelative(0.26f, 0.07f, 0.54f, -0.09f, 0.61f, -0.36f)
                curveToRelative(0.07f, -0.27f, -0.1f, -0.54f, -0.36f, -0.61f)
                close()
            }
        }.also { _GripLines = it}
