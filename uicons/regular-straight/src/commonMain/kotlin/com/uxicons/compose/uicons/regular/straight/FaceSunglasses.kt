package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSunglasses: ImageVector? = null

val Icons.Rs.FaceSunglasses: ImageVector
    get() = _FaceSunglasses ?: UXIcon(name = "FaceSunglasses") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.71f, 0f, 6.96f, 2.03f, 8.68f, 5.04f)
                curveToRelative(-0.15f, -0.03f, -0.29f, -0.04f, -0.45f, -0.04f)
                horizontalLineToRelative(-6.15f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(-1f, -1f)
                lineTo(3.77f, 7f)
                curveToRelative(-0.15f, 0f, -0.3f, 0.01f, -0.45f, 0.04f)
                curveToRelative(1.73f, -3.01f, 4.97f, -5.04f, 8.68f, -5.04f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.36f, 0f, -9.75f, -4.24f, -9.99f, -9.54f)
                curveToRelative(0.51f, 0.93f, 1.5f, 1.54f, 2.6f, 1.54f)
                horizontalLineToRelative(3.34f)
                curveToRelative(1.37f, 0f, 2.56f, -0.93f, 2.89f, -2.26f)
                lineToRelative(0.44f, -1.74f)
                horizontalLineToRelative(1.44f)
                lineToRelative(0.44f, 1.74f)
                curveToRelative(0.33f, 1.33f, 1.52f, 2.26f, 2.89f, 2.26f)
                horizontalLineToRelative(3.34f)
                curveToRelative(1.1f, 0f, 2.09f, -0.61f, 2.6f, -1.54f)
                curveToRelative(-0.24f, 5.3f, -4.63f, 9.54f, -9.99f, 9.54f)
                close()
                moveTo(16.34f, 15.25f)
                lineToRelative(1.33f, 1.49f)
                curveToRelative(-0.1f, 0.09f, -2.56f, 2.25f, -5.67f, 2.25f)
                reflectiveCurveToRelative(-5.56f, -2.16f, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                curveToRelative(0.02f, 0.02f, 2.0f, 1.75f, 4.34f, 1.75f)
                reflectiveCurveToRelative(4.32f, -1.73f, 4.34f, -1.75f)
                close()
            }
        }.also { _FaceSunglasses = it}
