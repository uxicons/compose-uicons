package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Br.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 13f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(13f)
            curveToRelative(0f, -3.34f, -2.36f, -6.15f, -5.5f, -6.84f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(6.16f)
            curveToRelative(-3.14f, 0.69f, -5.5f, 3.49f, -5.5f, 6.84f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(13f)
            curveTo(2f, 8f, 5.69f, 3.84f, 10.5f, 3.11f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.61f)
            curveToRelative(4.81f, 0.73f, 8.5f, 4.88f, 8.5f, 9.89f)
            close()
        }
    }.also { _ManatSign = it }
