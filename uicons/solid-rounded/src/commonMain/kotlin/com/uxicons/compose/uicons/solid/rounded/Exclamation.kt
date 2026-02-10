package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exclamation: ImageVector? = null

val Icons.Sr.Exclamation: ImageVector
    get() = _Exclamation ?: UXIcon(name = "Exclamation", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 512f)
                curveToRelative(141.38f, 0f, 256f, -114.61f, 256f, -256f)
                reflectiveCurveTo(397.39f, 0f, 256f, 0f)
                reflectiveCurveTo(0f, 114.61f, 0f, 256f)
                curveTo(0.15f, 397.32f, 114.68f, 511.85f, 256f, 512f)
                close()
                moveTo(234.67f, 128f)
                curveToRelative(0f, -11.78f, 9.55f, -21.33f, 21.33f, -21.33f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                verticalLineToRelative(170.67f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineTo(128f)
                close()
                moveTo(256f, 384f)
                curveToRelative(11.78f, 0f, 21.33f, 9.55f, 21.33f, 21.33f)
                reflectiveCurveToRelative(-9.55f, 21.33f, -21.33f, 21.33f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                reflectiveCurveTo(244.22f, 384f, 256f, 384f)
                close()
            }
        }.also { _Exclamation = it}
