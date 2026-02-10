package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Ss.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-2f)
                lineTo(22f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.4f, 0f, -0.65f, -0.22f, -0.77f, -0.36f)
                curveToRelative(-0.11f, -0.13f, -0.29f, -0.42f, -0.22f, -0.81f)
                curveToRelative(0.58f, -3.33f, 0.98f, -6.55f, 0.98f, -7.83f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.28f, 0.41f, 4.5f, 0.98f, 7.83f)
                curveToRelative(0.07f, 0.4f, -0.11f, 0.68f, -0.22f, 0.81f)
                reflectiveCurveToRelative(-0.36f, 0.36f, -0.77f, 0.36f)
                lineTo(3f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(24f, 20f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Stamp = it}
