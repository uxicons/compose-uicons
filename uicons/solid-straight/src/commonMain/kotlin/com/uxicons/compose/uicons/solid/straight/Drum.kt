package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Ss.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 15.31f)
                curveToRelative(1.52f, 0.37f, 3.2f, 0.59f, 5f, 0.66f)
                verticalLineToRelative(8.01f)
                curveToRelative(-1.82f, -0.08f, -3.51f, -0.37f, -5f, -0.82f)
                verticalLineToRelative(-7.84f)
                close()
                moveTo(13f, 23.97f)
                curveToRelative(1.82f, -0.08f, 3.51f, -0.37f, 5f, -0.82f)
                verticalLineToRelative(-7.84f)
                curveToRelative(-1.52f, 0.37f, -3.2f, 0.59f, -5f, 0.66f)
                verticalLineToRelative(8.01f)
                close()
                moveTo(0f, 17.5f)
                curveToRelative(0f, 1.96f, 1.54f, 3.69f, 4f, 4.87f)
                verticalLineToRelative(-7.67f)
                curveToRelative(-1.62f, -0.59f, -2.99f, -1.35f, -4f, -2.25f)
                verticalLineToRelative(5.04f)
                close()
                moveTo(20f, 22.37f)
                curveToRelative(2.46f, -1.18f, 4f, -2.91f, 4f, -4.87f)
                verticalLineToRelative(-5.04f)
                curveToRelative(-1.01f, 0.9f, -2.38f, 1.66f, -4f, 2.25f)
                verticalLineToRelative(7.67f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, -1.51f, -1.33f, -2.86f, -3.47f, -3.86f)
                lineToRelative(3.43f, -3.19f)
                lineTo(22.6f, -0.01f)
                lineToRelative(-11.13f, 10.2f)
                lineToRelative(-1.36f, -1.47f)
                lineToRelative(5.92f, -5.4f)
                curveToRelative(-1.26f, -0.21f, -2.61f, -0.32f, -4.02f, -0.32f)
                curveTo(5.37f, 3f, 0f, 5.46f, 0f, 8.5f)
                reflectiveCurveToRelative(5.37f, 5.5f, 12f, 5.5f)
                reflectiveCurveToRelative(12f, -2.46f, 12f, -5.5f)
                close()
            }
        }.also { _Drum = it}
