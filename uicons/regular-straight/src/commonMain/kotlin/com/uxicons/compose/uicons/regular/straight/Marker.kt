package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Marker: ImageVector? = null

val Icons.Rs.Marker: ImageVector
    get() = _Marker ?: UXIcon(name = "Marker", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.1f, 512.17f)
                lineToRelative(-14.87f, -12.75f)
                curveTo(219.73f, 482.26f, 40.72f, 327.66f, 40.72f, 214.58f)
                curveToRelative(0f, -118.4f, 95.98f, -214.38f, 214.38f, -214.38f)
                reflectiveCurveToRelative(214.38f, 95.98f, 214.38f, 214.38f)
                curveToRelative(0f, 113.08f, -179.01f, 267.68f, -199.42f, 284.93f)
                lineTo(255.1f, 512.17f)
                close()
                moveTo(255.1f, 46.55f)
                curveToRelative(-92.75f, 0.1f, -167.92f, 75.27f, -168.02f, 168.02f)
                curveToRelative(0f, 71.04f, 110.13f, 184.53f, 168.02f, 236.47f)
                curveToRelative(57.89f, -51.96f, 168.02f, -165.52f, 168.02f, -236.47f)
                curveTo(423.02f, 121.82f, 347.86f, 46.66f, 255.1f, 46.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.1f, 299.55f)
                curveToRelative(-46.93f, 0f, -84.98f, -38.05f, -84.98f, -84.98f)
                reflectiveCurveToRelative(38.05f, -84.98f, 84.98f, -84.98f)
                reflectiveCurveToRelative(84.98f, 38.05f, 84.98f, 84.98f)
                reflectiveCurveTo(302.04f, 299.55f, 255.1f, 299.55f)
                close()
                moveTo(255.1f, 172.09f)
                curveToRelative(-23.47f, 0f, -42.49f, 19.02f, -42.49f, 42.49f)
                reflectiveCurveToRelative(19.02f, 42.49f, 42.49f, 42.49f)
                reflectiveCurveToRelative(42.49f, -19.02f, 42.49f, -42.49f)
                reflectiveCurveTo(278.57f, 172.09f, 255.1f, 172.09f)
                close()
            }
        }.also { _Marker = it}
