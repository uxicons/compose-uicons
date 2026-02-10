package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italic: ImageVector? = null

val Icons.Rc.Italic: ImageVector
    get() = _Italic ?: UXIcon(name = "Italic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.98f, 1f)
                horizontalLineTo(8.77f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.55f)
                curveToRelative(-2.56f, 5.12f, -4.25f, 12.5f, -5.02f, 18f)
                horizontalLineTo(3.02f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(15.23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.92f)
                curveToRelative(0.79f, -5.5f, 2.49f, -12.79f, 5.05f, -17.61f)
                lineToRelative(0.21f, -0.39f)
                horizontalLineToRelative(5.41f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Italic = it}
