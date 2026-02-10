package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperclipVertical: ImageVector? = null

val Icons.Sc.PaperclipVertical: ImageVector
    get() = _PaperclipVertical ?: UXIcon(name = "PaperclipVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-6.22f, 0f, -9f, -2.78f, -9f, -9f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -4.37f, 2.13f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.13f, 6.5f, 6.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 2.62f, -1.38f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.38f, -4f, -4f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.95f, 0.05f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.05f, 1f, -1f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -2.75f, -0.75f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 0.75f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 4.54f, 1.46f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.46f, 6f, -6f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 6.22f, -2.77f, 9f, -9f, 9f)
                close()
            }
        }.also { _PaperclipVertical = it}
