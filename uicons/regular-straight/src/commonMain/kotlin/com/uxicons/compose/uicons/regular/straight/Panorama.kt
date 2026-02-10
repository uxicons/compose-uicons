package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Rs.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.61f, 10.96f)
                curveToRelative(1.41f, 0.27f, 2.62f, -0.95f, 2.35f, -2.35f)
                curveToRelative(-0.15f, -0.78f, -0.79f, -1.42f, -1.57f, -1.57f)
                curveToRelative(-1.41f, -0.27f, -2.62f, 0.95f, -2.35f, 2.35f)
                curveToRelative(0.15f, 0.78f, 0.79f, 1.42f, 1.57f, 1.57f)
                close()
                moveTo(24f, 0.07f)
                lineToRelative(-1.39f, 0.58f)
                curveToRelative(-0.06f, 0.02f, -5.64f, 2.35f, -10.61f, 2.35f)
                reflectiveCurveTo(1.44f, 0.68f, 1.39f, 0.66f)
                lineTo(0f, 0.07f)
                verticalLineToRelative(23.95f)
                reflectiveCurveToRelative(1.35f, -0.51f, 1.35f, -0.51f)
                curveToRelative(0.06f, -0.02f, 5.66f, -2.12f, 10.65f, -2.12f)
                reflectiveCurveToRelative(10.59f, 2.1f, 10.65f, 2.12f)
                lineToRelative(1.35f, 0.51f)
                lineTo(24f, 0.07f)
                close()
                moveTo(12f, 5f)
                curveToRelative(3.86f, 0f, 7.93f, -1.24f, 10f, -1.97f)
                verticalLineToRelative(17.85f)
                lineToRelative(-10.95f, -10.95f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.38f, 0f)
                lineToRelative(-4.67f, 4.67f)
                lineTo(2.0f, 3.03f)
                curveToRelative(2.07f, 0.73f, 6.14f, 1.97f, 10f, 1.97f)
                close()
                moveTo(2f, 21.18f)
                verticalLineToRelative(-3.76f)
                lineToRelative(6.08f, -6.08f)
                curveToRelative(0.43f, -0.43f, 1.12f, -0.43f, 1.55f, 0f)
                lineToRelative(8.88f, 8.88f)
                curveToRelative(-1.95f, -0.45f, -4.27f, -0.83f, -6.52f, -0.83f)
                curveToRelative(-3.87f, 0f, -7.94f, 1.12f, -10f, 1.78f)
                close()
            }
        }.also { _Panorama = it}
