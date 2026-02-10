package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handstand: ImageVector? = null

val Icons.Sr.Handstand: ImageVector
    get() = _Handstand ?: UXIcon(name = "Handstand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 19.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(19.99f, 23.87f)
                curveToRelative(-0.47f, 0.27f, -1.09f, 0.1f, -1.36f, -0.38f)
                lineToRelative(-4.21f, -7.49f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-4.21f, 7.49f)
                curveToRelative(-0.27f, 0.49f, -0.89f, 0.65f, -1.36f, 0.38f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.88f, -0.38f, -1.36f)
                lineToRelative(4.37f, -7.77f)
                verticalLineToRelative(-13.74f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13.74f)
                lineToRelative(4.37f, 7.77f)
                curveToRelative(0.27f, 0.48f, 0.1f, 1.09f, -0.38f, 1.36f)
                close()
            }
        }.also { _Handstand = it}
