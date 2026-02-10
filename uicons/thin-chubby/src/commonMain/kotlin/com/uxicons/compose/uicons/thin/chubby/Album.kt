package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Album: ImageVector? = null

val Icons.Tc.Album: ImageVector
    get() = _Album ?: UXIcon(name = "Album") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 5.61f, -2.39f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -2.39f, -8f, -8f)
                reflectiveCurveToRelative(2.39f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.39f, 8f, 8f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -5.1f, -1.9f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 1.9f, -7f, 7f)
                reflectiveCurveToRelative(1.9f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -1.9f, 7f, -7f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.67f, -1.05f, 9.51f, -1.06f, 9.56f)
                curveToRelative(-0.04f, 0.19f, -0.19f, 0.34f, -0.38f, 0.38f)
                curveToRelative(-0.05f, 0.01f, -4.89f, 1.06f, -9.56f, 1.06f)
                reflectiveCurveToRelative(-9.51f, -1.05f, -9.56f, -1.06f)
                curveToRelative(-0.19f, -0.04f, -0.34f, -0.19f, -0.38f, -0.38f)
                curveToRelative(-0.01f, -0.05f, -1.06f, -4.89f, -1.06f, -9.56f)
                reflectiveCurveToRelative(1.05f, -9.51f, 1.06f, -9.56f)
                curveToRelative(0.04f, -0.19f, 0.19f, -0.34f, 0.38f, -0.38f)
                curveToRelative(0.05f, -0.01f, 4.89f, -1.06f, 9.56f, -1.06f)
                reflectiveCurveToRelative(9.51f, 1.05f, 9.56f, 1.06f)
                curveToRelative(0.19f, 0.04f, 0.34f, 0.19f, 0.38f, 0.38f)
                curveToRelative(0.01f, 0.05f, 1.06f, 4.89f, 1.06f, 9.56f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -3.88f, -0.74f, -7.89f, -0.97f, -9.03f)
                curveToRelative(-1.14f, -0.23f, -5.15f, -0.97f, -9.03f, -0.97f)
                reflectiveCurveToRelative(-7.89f, 0.74f, -9.03f, 0.97f)
                curveToRelative(-0.23f, 1.14f, -0.97f, 5.15f, -0.97f, 9.03f)
                reflectiveCurveToRelative(0.74f, 7.89f, 0.97f, 9.03f)
                curveToRelative(1.14f, 0.23f, 5.15f, 0.97f, 9.03f, 0.97f)
                reflectiveCurveToRelative(7.89f, -0.74f, 9.03f, -0.97f)
                curveToRelative(0.23f, -1.14f, 0.97f, -5.15f, 0.97f, -9.03f)
                close()
            }
        }.also { _Album = it}
