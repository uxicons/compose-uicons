package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Tc.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.8f, 5.68f)
                curveToRelative(-0.18f, -0.21f, -0.49f, -0.24f, -0.7f, -0.06f)
                curveToRelative(-0.21f, 0.18f, -0.24f, 0.49f, -0.07f, 0.7f)
                curveToRelative(0.65f, 0.79f, 0.97f, 1.83f, 0.97f, 3.18f)
                curveToRelative(0f, 3.3f, -1.7f, 5.5f, -10f, 5.5f)
                reflectiveCurveToRelative(-10.0f, -2.2f, -10.0f, -5.5f)
                reflectiveCurveToRelative(1.7f, -5.5f, 10f, -5.5f)
                curveToRelative(1.52f, 0f, 2.81f, 0.07f, 3.94f, 0.21f)
                curveToRelative(0.27f, 0.03f, 0.52f, -0.16f, 0.56f, -0.43f)
                curveToRelative(0.03f, -0.27f, -0.16f, -0.52f, -0.43f, -0.56f)
                curveToRelative(-1.17f, -0.15f, -2.5f, -0.22f, -4.06f, -0.22f)
                curveToRelative(-7.81f, 0.0f, -11f, 1.88f, -11f, 6.5f)
                verticalLineToRelative(7.22f)
                curveToRelative(0f, 4.46f, 3.19f, 6.28f, 11f, 6.28f)
                reflectiveCurveToRelative(11f, -1.82f, 11f, -6.28f)
                verticalLineToRelative(-7.22f)
                curveToRelative(0f, -1.6f, -0.39f, -2.85f, -1.2f, -3.82f)
                close()
                moveTo(11.5f, 21.99f)
                curveToRelative(-1.57f, -0.02f, -2.89f, -0.12f, -4f, -0.28f)
                verticalLineToRelative(-6.0f)
                curveToRelative(1.16f, 0.17f, 2.49f, 0.27f, 4f, 0.28f)
                verticalLineToRelative(6f)
                close()
                moveTo(12.5f, 15.99f)
                curveToRelative(1.51f, -0.02f, 2.84f, -0.11f, 4f, -0.28f)
                verticalLineToRelative(6.0f)
                curveToRelative(-1.11f, 0.17f, -2.43f, 0.27f, -4f, 0.28f)
                close()
                moveTo(2f, 16.73f)
                verticalLineToRelative(-3.65f)
                curveToRelative(0.87f, 1.2f, 2.35f, 2.0f, 4.5f, 2.45f)
                verticalLineToRelative(5.99f)
                curveToRelative(-3.6f, -0.79f, -4.5f, -2.52f, -4.5f, -4.8f)
                close()
                moveTo(22f, 16.73f)
                curveToRelative(0f, 2.28f, -0.9f, 4.01f, -4.5f, 4.8f)
                verticalLineToRelative(-5.99f)
                curveToRelative(2.15f, -0.45f, 3.63f, -1.25f, 4.5f, -2.45f)
                close()
                moveTo(12.17f, 10.13f)
                lineTo(22.16f, 1.13f)
                curveToRelative(0.2f, -0.18f, 0.52f, -0.17f, 0.71f, 0.04f)
                curveToRelative(0.18f, 0.2f, 0.17f, 0.52f, -0.04f, 0.71f)
                lineToRelative(-10.0f, 9.0f)
                curveToRelative(-0.2f, 0.18f, -0.52f, 0.17f, -0.71f, -0.04f)
                curveToRelative(-0.18f, -0.2f, -0.17f, -0.52f, 0.04f, -0.71f)
                close()
            }
        }.also { _Drum = it}
