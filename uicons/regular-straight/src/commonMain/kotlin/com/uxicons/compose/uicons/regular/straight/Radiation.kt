package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radiation: ImageVector? = null

val Icons.Rs.Radiation: ImageVector
    get() = _Radiation ?: UXIcon(name = "Radiation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 11.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(-8.0f, -0.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.0f, -1.52f, -0.86f, -2.89f, -2.25f, -3.57f)
                lineToRelative(-1.0f, -0.49f)
                lineTo(17.08f, 0.09f)
                lineToRelative(0.83f, 0.47f)
                curveToRelative(3.76f, 2.13f, 6.09f, 6.13f, 6.09f, 10.44f)
                close()
                moveTo(21.95f, 10.0f)
                curveToRelative(-0.29f, -2.89f, -1.84f, -5.52f, -4.22f, -7.19f)
                lineToRelative(-2.15f, 3.4f)
                curveToRelative(1.25f, 0.92f, 2.08f, 2.27f, 2.33f, 3.79f)
                lineToRelative(4.03f, 0.0f)
                close()
                moveTo(8.0f, 12.0f)
                lineToRelative(-8.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0f, 6.69f, 2.33f, 2.69f, 6.09f, 0.56f)
                lineToRelative(0.83f, -0.47f)
                lineToRelative(4.32f, 6.84f)
                lineToRelative(-1.0f, 0.49f)
                curveToRelative(-1.39f, 0.68f, -2.25f, 2.05f, -2.25f, 3.57f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.42f, 6.21f)
                lineToRelative(-2.15f, -3.4f)
                curveToRelative(-2.38f, 1.67f, -3.93f, 4.3f, -4.22f, 7.19f)
                lineToRelative(4.03f, -0.0f)
                curveToRelative(0.26f, -1.52f, 1.09f, -2.87f, 2.33f, -3.79f)
                close()
                moveTo(15.19f, 13.63f)
                lineToRelative(3.96f, 7.04f)
                lineToRelative(-0.81f, 0.51f)
                curveToRelative(-1.91f, 1.19f, -4.1f, 1.82f, -6.34f, 1.82f)
                reflectiveCurveToRelative(-4.43f, -0.63f, -6.34f, -1.83f)
                lineToRelative(-0.81f, -0.51f)
                lineToRelative(3.96f, -7.04f)
                lineToRelative(0.9f, 0.63f)
                curveToRelative(1.37f, 0.96f, 3.19f, 0.96f, 4.57f, -0.0f)
                lineToRelative(0.9f, -0.64f)
                close()
                moveTo(16.45f, 19.95f)
                lineToRelative(-1.97f, -3.5f)
                curveToRelative(-1.56f, 0.72f, -3.4f, 0.72f, -4.96f, 0.0f)
                lineToRelative(-1.97f, 3.49f)
                curveToRelative(2.77f, 1.39f, 6.13f, 1.38f, 8.89f, 0f)
                close()
            }
        }.also { _Radiation = it}
