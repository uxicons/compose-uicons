package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italic: ImageVector? = null

val Icons.Tc.Italic: ImageVector
    get() = _Italic ?: UXIcon(name = "Italic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.46f, 1f)
                horizontalLineTo(8.6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.7f)
                lineToRelative(-0.12f, 0.23f)
                curveToRelative(-2.88f, 5.43f, -4.81f, 13.96f, -5.61f, 19.77f)
                horizontalLineTo(2.54f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(15.4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.83f)
                curveToRelative(0.8f, -5.72f, 2.68f, -14.03f, 5.48f, -19.3f)
                lineToRelative(0.37f, -0.7f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Italic = it}
