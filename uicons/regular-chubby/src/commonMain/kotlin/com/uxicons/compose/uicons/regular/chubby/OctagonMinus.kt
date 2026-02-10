package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonMinus: ImageVector? = null

val Icons.Rc.OctagonMinus: ImageVector
    get() = _OctagonMinus ?: UXIcon(name = "OctagonMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.47f, 7.76f)
                curveToRelative(-0.04f, -0.18f, -0.14f, -0.34f, -0.26f, -0.47f)
                lineToRelative(-5.5f, -5.5f)
                curveToRelative(-0.13f, -0.13f, -0.29f, -0.22f, -0.47f, -0.26f)
                curveToRelative(-0.09f, -0.02f, -2.14f, -0.53f, -4.24f, -0.53f)
                reflectiveCurveToRelative(-4.16f, 0.51f, -4.24f, 0.53f)
                curveToRelative(-0.18f, 0.04f, -0.34f, 0.14f, -0.47f, 0.26f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-0.13f, 0.13f, -0.22f, 0.29f, -0.26f, 0.47f)
                curveToRelative(-0.02f, 0.09f, -0.53f, 2.14f, -0.53f, 4.24f)
                reflectiveCurveToRelative(0.51f, 4.16f, 0.53f, 4.24f)
                curveToRelative(0.04f, 0.18f, 0.14f, 0.34f, 0.26f, 0.47f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.13f, 0.13f, 0.29f, 0.22f, 0.47f, 0.26f)
                curveToRelative(0.09f, 0.02f, 2.14f, 0.53f, 4.24f, 0.53f)
                reflectiveCurveToRelative(4.16f, -0.51f, 4.24f, -0.53f)
                curveToRelative(0.18f, -0.04f, 0.34f, -0.14f, 0.47f, -0.26f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(0.13f, -0.13f, 0.22f, -0.29f, 0.26f, -0.47f)
                curveToRelative(0.02f, -0.09f, 0.53f, -2.14f, 0.53f, -4.24f)
                reflectiveCurveToRelative(-0.51f, -4.16f, -0.53f, -4.24f)
                close()
                moveTo(20.59f, 15.5f)
                lineTo(15.5f, 20.59f)
                curveToRelative(-0.58f, 0.13f, -2.05f, 0.41f, -3.5f, 0.41f)
                reflectiveCurveToRelative(-2.91f, -0.28f, -3.5f, -0.41f)
                lineToRelative(-5.09f, -5.09f)
                curveToRelative(-0.13f, -0.58f, -0.41f, -2.05f, -0.41f, -3.5f)
                reflectiveCurveToRelative(0.28f, -2.91f, 0.41f, -3.5f)
                lineToRelative(5.09f, -5.09f)
                curveToRelative(0.58f, -0.13f, 2.05f, -0.41f, 3.5f, -0.41f)
                reflectiveCurveToRelative(2.91f, 0.28f, 3.5f, 0.41f)
                lineToRelative(5.09f, 5.09f)
                curveToRelative(0.13f, 0.58f, 0.41f, 2.05f, 0.41f, 3.5f)
                reflectiveCurveToRelative(-0.28f, 2.91f, -0.41f, 3.5f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _OctagonMinus = it}
