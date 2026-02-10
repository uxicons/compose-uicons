package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLocation: ImageVector? = null

val Icons.Ss.LandLocation: ImageVector
    get() = _LandLocation ?: UXIcon(name = "LandLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.95f, 2.05f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                reflectiveCurveToRelative(-3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.01f, 9.91f)
                lineToRelative(4.94f, 4.83f)
                lineToRelative(4.95f, -4.84f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(12f, 9.99f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                close()
                moveTo(0.77f, 18.0f)
                lineToRelative(6.35f, 0.01f)
                lineToRelative(-0.75f, 5.99f)
                lineTo(0f, 24f)
                lineToRelative(0.01f, -1.67f)
                lineToRelative(0.75f, -4.33f)
                close()
                moveTo(7.47f, 15.16f)
                lineToRelative(-0.11f, 0.85f)
                lineToRelative(-6.25f, -0.01f)
                lineToRelative(1.04f, -6.0f)
                horizontalLineToRelative(1.36f)
                curveToRelative(0.44f, 1.26f, 1.17f, 2.41f, 2.15f, 3.39f)
                lineToRelative(1.82f, 1.78f)
                close()
                moveTo(24f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6.37f)
                lineToRelative(-0.75f, -5.97f)
                lineToRelative(6.34f, 0.01f)
                lineToRelative(0.77f, 4.46f)
                close()
                moveTo(14.87f, 18.02f)
                lineToRelative(0.75f, 5.98f)
                horizontalLineToRelative(-7.24f)
                lineToRelative(0.75f, -5.99f)
                lineToRelative(1.26f, 0.0f)
                lineToRelative(1.61f, 1.57f)
                lineToRelative(1.6f, -1.57f)
                lineToRelative(1.27f, 0.0f)
                close()
                moveTo(22.88f, 16.04f)
                lineToRelative(-6.25f, -0.01f)
                lineToRelative(-0.11f, -0.86f)
                lineToRelative(1.84f, -1.8f)
                curveToRelative(0.97f, -0.97f, 1.69f, -2.11f, 2.13f, -3.36f)
                horizontalLineToRelative(1.35f)
                lineToRelative(1.04f, 6.04f)
                close()
            }
        }.also { _LandLocation = it}
