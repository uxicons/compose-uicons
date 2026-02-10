package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyes: ImageVector? = null

val Icons.Rs.Eyes: ImageVector
    get() = _Eyes ?: UXIcon(name = "Eyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                curveToRelative(-2.35f, 0f, -4.36f, 2.19f, -5.5f, 5.54f)
                curveTo(10.86f, 2.19f, 8.85f, 0f, 6.5f, 0f)
                curveTo(2.85f, 0f, 0f, 5.27f, 0f, 12f)
                reflectiveCurveToRelative(2.85f, 12f, 6.5f, 12f)
                curveToRelative(2.35f, 0f, 4.36f, -2.19f, 5.5f, -5.54f)
                curveToRelative(1.14f, 3.35f, 3.15f, 5.54f, 5.5f, 5.54f)
                curveToRelative(3.65f, 0f, 6.5f, -5.27f, 6.5f, -12f)
                reflectiveCurveTo(21.14f, 0f, 17.5f, 0f)
                close()
                moveTo(6.5f, 22f)
                curveToRelative(-1.48f, 0f, -3.08f, -1.99f, -3.91f, -5.18f)
                curveToRelative(0.28f, 0.11f, 0.59f, 0.18f, 0.91f, 0.18f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.56f, 0f, -1.07f, 0.19f, -1.49f, 0.5f)
                curveToRelative(-0.0f, -0.17f, -0.01f, -0.33f, -0.01f, -0.5f)
                curveTo(2f, 6.11f, 4.37f, 2f, 6.5f, 2f)
                reflectiveCurveToRelative(4.5f, 4.11f, 4.5f, 10f)
                reflectiveCurveToRelative(-2.37f, 10f, -4.5f, 10f)
                close()
                moveTo(17.5f, 22f)
                curveToRelative(-1.48f, 0f, -3.08f, -1.99f, -3.91f, -5.18f)
                curveToRelative(0.28f, 0.11f, 0.59f, 0.18f, 0.91f, 0.18f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.56f, 0f, -1.07f, 0.19f, -1.49f, 0.5f)
                curveToRelative(-0.0f, -0.17f, -0.01f, -0.33f, -0.01f, -0.5f)
                curveToRelative(0f, -5.89f, 2.37f, -10f, 4.5f, -10f)
                reflectiveCurveToRelative(4.5f, 4.11f, 4.5f, 10f)
                reflectiveCurveToRelative(-2.37f, 10f, -4.5f, 10f)
                close()
            }
        }.also { _Eyes = it}
