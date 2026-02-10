package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperclipVertical: ImageVector? = null

val Icons.Tc.PaperclipVertical: ImageVector
    get() = _PaperclipVertical ?: UXIcon(name = "PaperclipVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 4.56f, -1.94f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -1.94f, -6.5f, -6.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -3.15f, 1.35f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 1.35f, 4.5f, 4.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.71f, -0.79f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -0.79f, -2.5f, -2.5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.15f, 0.35f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.35f, 1.5f, -1.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.58f, -0.92f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 0.92f, -3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 4.01f, 1.49f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.49f, 5.5f, -5.5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _PaperclipVertical = it}
