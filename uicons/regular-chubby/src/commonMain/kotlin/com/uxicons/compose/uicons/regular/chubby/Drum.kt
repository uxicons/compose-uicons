package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Rc.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.33f, 6.53f)
                curveToRelative(-0.26f, -0.49f, -0.87f, -0.67f, -1.35f, -0.41f)
                reflectiveCurveToRelative(-0.67f, 0.87f, -0.41f, 1.35f)
                curveToRelative(0.29f, 0.54f, 0.43f, 1.2f, 0.43f, 2.03f)
                curveToRelative(0f, 2.78f, -1.51f, 4.5f, -9f, 4.5f)
                reflectiveCurveToRelative(-9.0f, -1.72f, -9.0f, -4.5f)
                reflectiveCurveToRelative(1.5f, -4.5f, 9f, -4.5f)
                curveToRelative(0.69f, 0f, 1.34f, 0.01f, 1.95f, 0.05f)
                curveToRelative(0.54f, 0.03f, 1.02f, -0.4f, 1.05f, -0.95f)
                curveToRelative(0.03f, -0.55f, -0.4f, -1.02f, -0.95f, -1.05f)
                curveToRelative(-0.64f, -0.03f, -1.32f, -0.05f, -2.05f, -0.05f)
                curveToRelative(-5.44f, 0f, -11f, 0.77f, -11f, 6.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 5.73f, 5.56f, 6.5f, 11f, 6.5f)
                reflectiveCurveToRelative(11f, -0.77f, 11f, -6.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.16f, -0.22f, -2.13f, -0.67f, -2.97f)
                close()
                moveTo(11f, 20.98f)
                curveToRelative(-1.15f, -0.03f, -2.15f, -0.1f, -3f, -0.22f)
                verticalLineToRelative(-4.98f)
                curveToRelative(0.97f, 0.12f, 1.98f, 0.18f, 3f, 0.2f)
                close()
                moveTo(13f, 15.99f)
                curveToRelative(1.02f, -0.02f, 2.03f, -0.08f, 3f, -0.2f)
                verticalLineToRelative(4.98f)
                curveToRelative(-0.85f, 0.12f, -1.85f, 0.19f, -3f, 0.22f)
                close()
                moveTo(3f, 16.5f)
                verticalLineToRelative(-2.47f)
                curveToRelative(0.82f, 0.65f, 1.85f, 1.09f, 3f, 1.38f)
                verticalLineToRelative(4.93f)
                curveToRelative(-2.38f, -0.74f, -3f, -2.08f, -3f, -3.85f)
                close()
                moveTo(18f, 20.35f)
                verticalLineToRelative(-4.93f)
                curveToRelative(1.15f, -0.3f, 2.18f, -0.74f, 3f, -1.38f)
                verticalLineToRelative(2.47f)
                curveToRelative(0f, 1.77f, -0.62f, 3.11f, -3f, 3.85f)
                close()
                moveTo(12.34f, 9.25f)
                lineTo(21.34f, 1.25f)
                curveToRelative(0.41f, -0.37f, 1.04f, -0.33f, 1.41f, 0.08f)
                reflectiveCurveToRelative(0.33f, 1.04f, -0.08f, 1.41f)
                lineToRelative(-9f, 8.0f)
                curveToRelative(-0.41f, 0.36f, -1.04f, 0.33f, -1.41f, -0.08f)
                curveToRelative(-0.37f, -0.41f, -0.33f, -1.04f, 0.08f, -1.41f)
                close()
            }
        }.also { _Drum = it}
