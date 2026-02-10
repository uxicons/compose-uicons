package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Sr.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.0f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineToRelative(-18.0f, 0.0f)
                curveToRelative(-1.66f, 0f, -3.0f, -1.34f, -3.0f, -3f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(21f, 2.0f)
                curveToRelative(-0.18f, 0f, -0.35f, 0.02f, -0.52f, 0.05f)
                curveTo(19.29f, 1.02f, 17.52f, -0.0f, 15.14f, -0.0f)
                curveTo(11.12f, -0.0f, 4.32f, 4.39f, 2.3f, 16.0f)
                horizontalLineToRelative(19.34f)
                curveToRelative(-0.41f, -2.33f, -1.02f, -4.36f, -1.75f, -6.13f)
                curveToRelative(-2.22f, -0.51f, -3.89f, -2.49f, -3.89f, -4.87f)
                curveToRelative(0f, -0.65f, 0.12f, -1.28f, 0.36f, -1.88f)
                curveToRelative(0.21f, -0.51f, 0.79f, -0.76f, 1.3f, -0.55f)
                curveToRelative(0.51f, 0.21f, 0.76f, 0.79f, 0.55f, 1.3f)
                curveToRelative(-0.14f, 0.36f, -0.22f, 0.74f, -0.22f, 1.12f)
                curveToRelative(0f, 1.42f, 1.0f, 2.61f, 2.33f, 2.92f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0.22f, 0.05f, 0.44f, 0.08f, 0.67f, 0.08f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _HatSanta = it}
