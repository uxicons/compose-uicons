package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Ss.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-24f, 0.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.34f, 3f, 3.0f)
                close()
                moveTo(19.89f, 9.87f)
                curveToRelative(-2.22f, -0.51f, -3.89f, -2.49f, -3.89f, -4.87f)
                curveToRelative(0f, -0.4f, 0.06f, -0.78f, 0.15f, -1.16f)
                curveToRelative(0.35f, -0.84f, 0.8f, -1.53f, 1.35f, -1.34f)
                curveToRelative(0.58f, 0.19f, 0.89f, 0.38f, 1.18f, 0.62f)
                curveToRelative(-0.42f, 0.52f, -0.68f, 1.16f, -0.68f, 1.88f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.02f, -0.52f, 0.05f)
                curveToRelative(-1.19f, -1.03f, -2.95f, -2.05f, -5.33f, -2.05f)
                curveTo(11.12f, 0f, 4.32f, 4.39f, 2.3f, 16f)
                horizontalLineToRelative(19.34f)
                curveToRelative(-0.41f, -2.33f, -1.02f, -4.36f, -1.75f, -6.13f)
                close()
            }
        }.also { _HatSanta = it}
