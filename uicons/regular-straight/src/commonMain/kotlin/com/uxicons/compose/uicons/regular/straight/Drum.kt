package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Rs.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.52f, 10.23f)
                lineTo(22.63f, 0.01f)
                lineToRelative(1.35f, 1.47f)
                lineToRelative(-11.12f, 10.21f)
                lineToRelative(-1.35f, -1.47f)
                close()
                moveTo(24f, 9.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.58f, -5.38f, 6.5f, -12f, 6.5f)
                reflectiveCurveTo(0f, 21.08f, 0f, 17.5f)
                verticalLineToRelative(-8f)
                curveTo(0f, 5.86f, 5.27f, 3f, 12f, 3f)
                curveToRelative(1.42f, 0f, 2.77f, 0.13f, 4.03f, 0.36f)
                lineToRelative(-1.9f, 1.74f)
                curveToRelative(-0.68f, -0.07f, -1.39f, -0.11f, -2.13f, -0.11f)
                curveToRelative(-5.89f, 0f, -10f, 2.37f, -10f, 4.5f)
                reflectiveCurveToRelative(4.11f, 4.5f, 10f, 4.5f)
                reflectiveCurveToRelative(10f, -2.37f, 10f, -4.5f)
                curveToRelative(0f, -0.74f, -0.5f, -1.51f, -1.39f, -2.2f)
                lineToRelative(1.49f, -1.36f)
                curveToRelative(1.21f, 1.02f, 1.91f, 2.24f, 1.91f, 3.56f)
                close()
                moveTo(11f, 15.98f)
                curveToRelative(-1.42f, -0.06f, -2.77f, -0.25f, -4f, -0.55f)
                verticalLineToRelative(5.91f)
                curveToRelative(1.19f, 0.33f, 2.54f, 0.56f, 4f, 0.63f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13f, 21.98f)
                curveToRelative(1.46f, -0.07f, 2.81f, -0.3f, 4f, -0.63f)
                verticalLineToRelative(-5.91f)
                curveToRelative(-1.23f, 0.3f, -2.58f, 0.49f, -4f, 0.55f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(5f, 20.61f)
                verticalLineToRelative(-5.8f)
                curveToRelative(-1.18f, -0.45f, -2.2f, -1.02f, -3f, -1.67f)
                verticalLineToRelative(4.36f)
                curveToRelative(0f, 1.09f, 1.13f, 2.25f, 3f, 3.12f)
                close()
                moveTo(22f, 17.5f)
                verticalLineToRelative(-4.36f)
                curveToRelative(-0.8f, 0.65f, -1.82f, 1.22f, -3f, 1.67f)
                verticalLineToRelative(5.8f)
                curveToRelative(1.87f, -0.87f, 3f, -2.02f, 3f, -3.12f)
                close()
            }
        }.also { _Drum = it}
