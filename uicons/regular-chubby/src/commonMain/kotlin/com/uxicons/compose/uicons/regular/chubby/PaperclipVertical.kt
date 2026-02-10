package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperclipVertical: ImageVector? = null

val Icons.Rc.PaperclipVertical: ImageVector
    get() = _PaperclipVertical ?: UXIcon(name = "PaperclipVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 4.84f, -2.16f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -2.16f, -7f, -7f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -3.41f, 1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.99f, -1.01f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.01f, -3f, -3f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.88f, 0.12f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.12f, 1f, -1f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.3f, -0.7f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.7f, -3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 3.74f, 1.26f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.26f, 5f, -5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _PaperclipVertical = it}
