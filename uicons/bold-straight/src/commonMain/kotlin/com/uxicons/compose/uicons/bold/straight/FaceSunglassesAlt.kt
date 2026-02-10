package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSunglassesAlt: ImageVector? = null

val Icons.Bs.FaceSunglassesAlt: ImageVector
    get() = _FaceSunglassesAlt ?: UXIcon(name = "FaceSunglassesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.11f, 0f, 5.86f, 1.59f, 7.48f, 4f)
                horizontalLineToRelative(-5.68f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-1.64f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-5.63f)
                curveToRelative(1.62f, -2.41f, 4.37f, -4f, 7.48f, -4f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                curveToRelative(0f, -0.14f, 0.01f, -0.28f, 0.02f, -0.41f)
                curveToRelative(0.4f, 0.84f, 1.26f, 1.42f, 2.22f, 1.42f)
                horizontalLineToRelative(3.15f)
                curveToRelative(1.14f, 0f, 2.13f, -0.77f, 2.41f, -1.88f)
                lineToRelative(0.03f, -0.12f)
                horizontalLineToRelative(2.27f)
                lineToRelative(0.03f, 0.12f)
                curveToRelative(0.28f, 1.1f, 1.27f, 1.88f, 2.41f, 1.88f)
                horizontalLineToRelative(3.15f)
                curveToRelative(1.0f, 0f, 1.89f, -0.61f, 2.27f, -1.51f)
                curveToRelative(0.01f, 0.17f, 0.03f, 0.34f, 0.03f, 0.51f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                close()
                moveTo(15.75f, 13.67f)
                lineToRelative(2.5f, 1.66f)
                curveToRelative(-1.62f, 2.43f, -4.06f, 3.67f, -7.25f, 3.67f)
                verticalLineToRelative(-3f)
                curveToRelative(0.88f, 0f, 3.2f, 0f, 4.75f, -2.33f)
                close()
            }
        }.also { _FaceSunglassesAlt = it}
