package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Tc.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.28f, 23f)
                curveToRelative(-4.33f, 0f, -6.28f, -3.22f, -6.28f, -5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(1.23f, 0f, 2.37f, 0.48f, 3.23f, 1.36f)
                lineToRelative(0.5f, 0.51f)
                curveToRelative(0.73f, -0.29f, 2.23f, -0.94f, 3.47f, -2.18f)
                reflectiveCurveToRelative(1.89f, -2.73f, 2.18f, -3.47f)
                lineToRelative(-0.51f, -0.5f)
                curveToRelative(-0.88f, -0.85f, -1.36f, -2f, -1.36f, -3.23f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(2.28f, 0f, 5.5f, 1.95f, 5.5f, 6.28f)
                curveToRelative(0f, 2.33f, -2.22f, 7.15f, -5.4f, 10.33f)
                reflectiveCurveToRelative(-8.0f, 5.4f, -10.33f, 5.4f)
                close()
                moveTo(5.5f, 14f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.74f, 1.43f, 4.5f, 5.28f, 4.5f)
                curveToRelative(1.89f, 0f, 6.46f, -1.94f, 9.62f, -5.1f)
                reflectiveCurveToRelative(5.1f, -7.74f, 5.1f, -9.62f)
                curveToRelative(0f, -3.84f, -2.76f, -5.28f, -4.5f, -5.28f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.95f, 0.38f, 1.84f, 1.06f, 2.51f)
                lineToRelative(0.75f, 0.74f)
                curveToRelative(0.18f, 0.17f, 0.18f, 0.44f, 0.07f, 0.65f)
                curveToRelative(-0.24f, 0.62f, -0.97f, 2.5f, -2.48f, 4.01f)
                curveToRelative(-1.51f, 1.51f, -3.39f, 2.24f, -4.01f, 2.48f)
                curveToRelative(-0.21f, 0.11f, -0.48f, 0.11f, -0.65f, -0.07f)
                lineToRelative(-0.74f, -0.75f)
                curveToRelative(-0.67f, -0.68f, -1.56f, -1.06f, -2.51f, -1.06f)
                close()
            }
        }.also { _PhoneFlip = it}
