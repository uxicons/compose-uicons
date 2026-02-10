package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTubeAlt: ImageVector? = null

val Icons.Ss.BloodTestTubeAlt: ImageVector
    get() = _BloodTestTubeAlt ?: UXIcon(name = "BloodTestTubeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.35f, 14.72f)
                lineToRelative(-7.81f, 7.81f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.12f, 0f, -7.07f)
                lineToRelative(7.81f, -7.81f)
                lineToRelative(7.07f, 7.07f)
                close()
                moveTo(14.76f, 0.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-3.72f, 3.72f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(3.72f, -3.72f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(1.41f, -1.41f)
                lineTo(14.76f, 0.04f)
                close()
                moveTo(22.83f, 22.83f)
                curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
                reflectiveCurveToRelative(-0.42f, -2.07f, -1.18f, -2.84f)
                lineToRelative(-2.82f, -2.76f)
                lineToRelative(-2.83f, 2.77f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                close()
            }
        }.also { _BloodTestTubeAlt = it}
