package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Bs.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.02f, 6.82f)
                lineToRelative(-2.27f, 2.04f)
                curveToRelative(0.81f, 0.55f, 1.25f, 1.13f, 1.25f, 1.64f)
                curveToRelative(0f, 1.43f, -3.51f, 3.5f, -9f, 3.5f)
                reflectiveCurveToRelative(-9f, -2.07f, -9f, -3.5f)
                curveToRelative(0f, -1.37f, 3.23f, -3.33f, 8.35f, -3.49f)
                lineToRelative(3.19f, -2.88f)
                curveToRelative(-0.81f, -0.09f, -1.67f, -0.13f, -2.54f, -0.13f)
                curveTo(5.16f, 4f, 0f, 6.79f, 0f, 10.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 3.71f, 5.16f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.79f, 12f, -6.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.39f, -0.72f, -2.65f, -1.98f, -3.68f)
                close()
                moveTo(10.5f, 20.95f)
                curveToRelative(-0.9f, -0.07f, -1.74f, -0.19f, -2.5f, -0.35f)
                verticalLineToRelative(-3.94f)
                curveToRelative(0.79f, 0.14f, 1.63f, 0.24f, 2.5f, 0.3f)
                verticalLineToRelative(3.99f)
                close()
                moveTo(13.5f, 16.95f)
                curveToRelative(0.87f, -0.05f, 1.71f, -0.15f, 2.5f, -0.3f)
                verticalLineToRelative(3.94f)
                curveToRelative(-0.76f, 0.16f, -1.6f, 0.28f, -2.5f, 0.35f)
                verticalLineToRelative(-3.99f)
                close()
                moveTo(3f, 17.5f)
                verticalLineToRelative(-2.61f)
                curveToRelative(0.59f, 0.36f, 1.26f, 0.68f, 2f, 0.96f)
                verticalLineToRelative(3.73f)
                curveToRelative(-1.29f, -0.66f, -2f, -1.43f, -2f, -2.08f)
                close()
                moveTo(19f, 19.57f)
                verticalLineToRelative(-3.73f)
                curveToRelative(0.74f, -0.28f, 1.41f, -0.6f, 2f, -0.96f)
                verticalLineToRelative(2.61f)
                curveToRelative(0f, 0.64f, -0.71f, 1.42f, -2f, 2.08f)
                close()
                moveTo(11.19f, 9.85f)
                lineTo(22.03f, 0.08f)
                lineToRelative(2.01f, 2.23f)
                lineToRelative(-10.85f, 9.77f)
                lineToRelative(-2.01f, -2.23f)
                close()
            }
        }.also { _Drum = it}
