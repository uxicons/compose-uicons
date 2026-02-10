package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckContainerEmpty: ImageVector? = null

val Icons.Bs.TruckContainerEmpty: ImageVector
    get() = _TruckContainerEmpty ?: UXIcon(name = "TruckContainerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.15f)
                curveToRelative(0f, -0.59f, -0.1f, -1.18f, -0.28f, -1.74f)
                lineToRelative(-1.34f, -4.02f)
                curveToRelative(-0.48f, -1.43f, -1.81f, -2.39f, -3.32f, -2.39f)
                horizontalLineToRelative(-4.06f)
                verticalLineToRelative(12f)
                lineTo(0f, 17.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                horizontalLineToRelative(1.1f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                horizontalLineToRelative(6.1f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                horizontalLineToRelative(2.05f)
                verticalLineToRelative(-6.85f)
                close()
                moveTo(19.06f, 8f)
                curveToRelative(0.22f, 0f, 0.41f, 0.14f, 0.47f, 0.34f)
                lineToRelative(1.34f, 4.02f)
                curveToRelative(0.09f, 0.26f, 0.13f, 0.52f, 0.13f, 0.79f)
                verticalLineToRelative(0.35f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1.06f)
                close()
            }
        }.also { _TruckContainerEmpty = it}
