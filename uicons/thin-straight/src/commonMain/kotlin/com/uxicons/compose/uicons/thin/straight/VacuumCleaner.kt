package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumCleaner: ImageVector? = null

val Icons.Ts.VacuumCleaner: ImageVector
    get() = _VacuumCleaner ?: UXIcon(name = "VacuumCleaner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.45f, 0f)
                lineToRelative(-2.42f, 5.11f)
                lineToRelative(-1.81f, -0.86f)
                curveToRelative(-1.24f, -0.59f, -2.74f, -0.07f, -3.33f, 1.18f)
                lineToRelative(-2.65f, 5.53f)
                curveToRelative(-0.61f, 1.2f, -0.04f, 2.78f, 1.18f, 3.33f)
                lineToRelative(1.84f, 0.91f)
                lineToRelative(-1.33f, 2.81f)
                curveToRelative(-0.85f, 0.02f, -1.62f, 0.4f, -2.15f, 0.99f)
                horizontalLineToRelative(-6.28f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(8.02f)
                curveToRelative(-0.23f, -0.31f, -0.43f, -0.64f, -0.59f, -1f)
                horizontalLineToRelative(-6.43f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.68f)
                curveToRelative(-0.11f, 0.31f, -0.18f, 0.65f, -0.18f, 1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.32f, -0.86f, -2.42f, -2.04f, -2.83f)
                lineToRelative(8.12f, -17.17f)
                horizontalLineToRelative(2.92f)
                verticalLineToRelative(-1f)
                close()
                moveTo(11.86f, 13.39f)
                curveToRelative(-0.74f, -0.33f, -1.07f, -1.28f, -0.71f, -2.0f)
                lineToRelative(2.65f, -5.53f)
                curveToRelative(0.35f, -0.74f, 1.25f, -1.06f, 2.0f, -0.71f)
                lineToRelative(1.81f, 0.86f)
                lineToRelative(-3.92f, 8.28f)
                lineToRelative(-1.83f, -0.9f)
                close()
                moveTo(14f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _VacuumCleaner = it}
