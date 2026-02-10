package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacePersevering: ImageVector? = null

val Icons.Rs.FacePersevering: ImageVector
    get() = _FacePersevering ?: UXIcon(name = "FacePersevering") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(17.62f, 11.78f)
                lineToRelative(-1.52f, 1.22f)
                lineToRelative(1.52f, 1.22f)
                lineToRelative(-1.25f, 1.56f)
                lineToRelative(-3.48f, -2.78f)
                lineToRelative(3.48f, -2.78f)
                lineToRelative(1.25f, 1.56f)
                close()
                moveTo(11.1f, 13f)
                lineToRelative(-3.48f, 2.78f)
                lineToRelative(-1.25f, -1.56f)
                lineToRelative(1.52f, -1.22f)
                lineToRelative(-1.52f, -1.22f)
                lineToRelative(1.25f, -1.56f)
                lineToRelative(3.48f, 2.78f)
                close()
                moveTo(12f, 16f)
                curveToRelative(1.97f, 0f, 3.53f, 1.15f, 3.6f, 1.2f)
                lineToRelative(-1.2f, 1.6f)
                curveToRelative(-0.01f, -0.01f, -1.11f, -0.8f, -2.4f, -0.8f)
                reflectiveCurveToRelative(-2.4f, 0.8f, -2.41f, 0.81f)
                lineToRelative(-1.19f, -1.61f)
                curveToRelative(0.07f, -0.05f, 1.63f, -1.2f, 3.6f, -1.2f)
                close()
                moveTo(5.37f, 9.33f)
                lineToRelative(-0.74f, -1.86f)
                curveToRelative(1.19f, -0.47f, 2.27f, -1.37f, 3.04f, -2.53f)
                lineToRelative(1.66f, 1.11f)
                curveToRelative(-1.01f, 1.51f, -2.38f, 2.65f, -3.96f, 3.28f)
                close()
                moveTo(19.37f, 7.48f)
                lineToRelative(-0.74f, 1.86f)
                curveToRelative(-1.58f, -0.63f, -2.95f, -1.77f, -3.96f, -3.28f)
                lineToRelative(1.66f, -1.11f)
                curveToRelative(0.77f, 1.16f, 1.85f, 2.06f, 3.04f, 2.53f)
                close()
            }
        }.also { _FacePersevering = it}
