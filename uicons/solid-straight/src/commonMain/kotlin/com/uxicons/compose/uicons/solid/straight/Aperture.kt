package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aperture: ImageVector? = null

val Icons.Ss.Aperture: ImageVector
    get() = _Aperture ?: UXIcon(name = "Aperture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.62f, 12.0f)
                lineToRelative(-2.44f, 4.0f)
                horizontalLineToRelative(-4.42f)
                lineToRelative(-2.32f, -4.12f)
                lineToRelative(2.37f, -3.88f)
                horizontalLineToRelative(4.38f)
                reflectiveCurveToRelative(2.43f, 4.01f, 2.43f, 4.01f)
                close()
                moveTo(11.03f, 6.0f)
                horizontalLineToRelative(11.36f)
                curveToRelative(-1.67f, -2.88f, -4.51f, -5.01f, -7.86f, -5.73f)
                lineToRelative(-3.49f, 5.73f)
                close()
                moveTo(22.49f, 17.82f)
                curveToRelative(0.96f, -1.72f, 1.51f, -3.71f, 1.51f, -5.82f)
                curveToRelative(0f, -1.4f, -0.24f, -2.75f, -0.69f, -4.0f)
                horizontalLineToRelative(-6.78f)
                reflectiveCurveToRelative(5.96f, 9.82f, 5.96f, 9.82f)
                close()
                moveTo(1.73f, 5.8f)
                curveToRelative(-1.1f, 1.81f, -1.73f, 3.93f, -1.73f, 6.2f)
                curveToRelative(0f, 1.4f, 0.24f, 2.75f, 0.69f, 4f)
                horizontalLineToRelative(6.78f)
                lineTo(1.73f, 5.8f)
                close()
                moveTo(6.32f, 9.88f)
                lineTo(12.34f, 0.01f)
                curveToRelative(-0.11f, -0.0f, -0.23f, -0.01f, -0.34f, -0.01f)
                curveToRelative(-3.56f, 0f, -6.77f, 1.56f, -8.97f, 4.04f)
                lineToRelative(3.29f, 5.85f)
                close()
                moveTo(17.79f, 13.93f)
                lineToRelative(-6.14f, 10.07f)
                curveToRelative(0.11f, 0.0f, 0.23f, 0.01f, 0.34f, 0.01f)
                curveToRelative(3.72f, 0f, 7.05f, -1.7f, 9.26f, -4.37f)
                lineToRelative(-3.46f, -5.7f)
                close()
                moveTo(12.97f, 18f)
                lineTo(1.61f, 18f)
                curveToRelative(1.67f, 2.88f, 4.51f, 5.01f, 7.86f, 5.73f)
                lineToRelative(3.49f, -5.73f)
                close()
            }
        }.also { _Aperture = it}
