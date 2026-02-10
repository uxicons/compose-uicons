package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Underline: ImageVector? = null

val Icons.Rc.Underline: ImageVector
    get() = _Underline ?: UXIcon(name = "Underline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.27f, 21f)
                horizontalLineTo(3.73f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(20.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.05f, 18.87f)
                curveToRelative(5.78f, 0f, 7.74f, -3.26f, 7.74f, -12.92f)
                curveToRelative(0f, -1.49f, -0.07f, -2.86f, -0.2f, -4.05f)
                curveToRelative(-0.06f, -0.55f, -0.56f, -0.95f, -1.1f, -0.89f)
                curveToRelative(-0.55f, 0.06f, -0.95f, 0.55f, -0.89f, 1.1f)
                curveToRelative(0.12f, 1.13f, 0.18f, 2.42f, 0.18f, 3.84f)
                curveToRelative(0f, 10.16f, -2.27f, 10.92f, -5.74f, 10.92f)
                reflectiveCurveToRelative(-5.74f, -0.76f, -5.74f, -10.92f)
                curveToRelative(0f, -1.42f, 0.06f, -2.71f, 0.19f, -3.84f)
                curveToRelative(0.06f, -0.55f, -0.34f, -1.04f, -0.89f, -1.1f)
                curveToRelative(-0.56f, -0.06f, -1.04f, 0.34f, -1.1f, 0.89f)
                curveToRelative(-0.13f, 1.2f, -0.2f, 2.56f, -0.2f, 4.05f)
                curveToRelative(0f, 9.54f, 2.02f, 12.92f, 7.74f, 12.92f)
                close()
            }
        }.also { _Underline = it}
