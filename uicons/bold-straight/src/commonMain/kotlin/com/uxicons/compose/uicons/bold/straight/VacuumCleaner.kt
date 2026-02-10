package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumCleaner: ImageVector? = null

val Icons.Bs.VacuumCleaner: ImageVector
    get() = _VacuumCleaner ?: UXIcon(name = "VacuumCleaner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-6.39f, 13.45f)
                curveToRelative(-0.63f, -0.28f, -1.32f, -0.45f, -2.06f, -0.45f)
                curveToRelative(-0.37f, 0f, -0.72f, 0.05f, -1.07f, 0.13f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.01f, 0.0f, -0.02f, 0.0f, -0.03f, 0.01f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-1.6f, -0.76f)
                curveToRelative(-1.72f, -0.78f, -2.5f, -2.99f, -1.65f, -4.67f)
                lineToRelative(2.65f, -5.53f)
                curveToRelative(0.83f, -1.74f, 2.92f, -2.48f, 4.66f, -1.65f)
                lineToRelative(1.58f, 0.75f)
                lineToRelative(2.02f, -4.26f)
                horizontalLineToRelative(4.45f)
                close()
                moveTo(16.24f, 6.97f)
                lineTo(14.66f, 6.21f)
                curveToRelative(-0.25f, -0.12f, -0.55f, -0.01f, -0.67f, 0.23f)
                lineToRelative(-2.65f, 5.54f)
                curveToRelative(-0.1f, 0.33f, -0.05f, 0.47f, 0.23f, 0.67f)
                lineToRelative(1.6f, 0.76f)
                lineToRelative(3.06f, -6.44f)
                close()
                moveTo(8.11f, 20f)
                horizontalLineToRelative(-5.11f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9.02f)
                curveToRelative(-0.63f, -0.84f, -1.02f, -1.87f, -1.02f, -3f)
                curveToRelative(0f, -0.34f, 0.04f, -0.68f, 0.11f, -1f)
                close()
            }
        }.also { _VacuumCleaner = it}
