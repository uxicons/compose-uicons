package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MushroomAlt: ImageVector? = null

val Icons.Ss.MushroomAlt: ImageVector
    get() = _MushroomAlt ?: UXIcon(name = "MushroomAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.11f, 2.19f)
                curveToRelative(1.34f, -0.94f, 2.87f, -1.62f, 4.54f, -1.96f)
                curveToRelative(0.22f, 0.37f, 0.36f, 0.8f, 0.36f, 1.26f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.14f, 0f, -2.09f, -0.77f, -2.39f, -1.81f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(1f)
                lineTo(0f, 13f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.3f, 1.34f, -6.3f, 3.51f, -8.47f)
                curveToRelative(0.74f, 1.46f, 2.25f, 2.47f, 3.99f, 2.47f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -0.52f, -0.11f, -1.02f, -0.27f, -1.49f)
                curveToRelative(0.09f, -0.0f, 0.18f, -0.01f, 0.27f, -0.01f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(13f, 9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(19f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(7.55f, 15f)
                curveToRelative(-0.35f, 2.11f, -0.55f, 4.23f, -0.55f, 5f)
                curveToRelative(0f, 2.43f, 1.96f, 4f, 5f, 4f)
                reflectiveCurveToRelative(5f, -1.57f, 5f, -4f)
                curveToRelative(0f, -0.77f, -0.2f, -2.89f, -0.55f, -5f)
                lineTo(7.55f, 15f)
                close()
            }
        }.also { _MushroomAlt = it}
