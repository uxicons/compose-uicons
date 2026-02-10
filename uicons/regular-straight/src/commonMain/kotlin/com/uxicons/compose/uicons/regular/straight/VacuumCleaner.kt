package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumCleaner: ImageVector? = null

val Icons.Rs.VacuumCleaner: ImageVector
    get() = _VacuumCleaner ?: UXIcon(name = "VacuumCleaner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.13f, 0f)
                lineToRelative(-2.05f, 4.31f)
                lineToRelative(-2.15f, -1.02f)
                curveToRelative(-1.49f, -0.71f, -3.28f, -0.08f, -4.0f, 1.41f)
                lineToRelative(-2.65f, 5.53f)
                curveToRelative(-0.73f, 1.43f, -0.05f, 3.34f, 1.41f, 4.0f)
                lineToRelative(2.16f, 1.06f)
                lineToRelative(-0.83f, 1.75f)
                curveToRelative(-0.76f, 0.1f, -1.45f, 0.44f, -1.98f, 0.95f)
                horizontalLineToRelative(-6.06f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8.26f)
                curveToRelative(-0.48f, -0.58f, -0.83f, -1.26f, -1.04f, -2f)
                horizontalLineToRelative(-5.21f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5.05f)
                curveToRelative(-0.02f, 0.17f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.36f, -0.79f, -2.52f, -1.92f, -3.1f)
                lineToRelative(7.32f, -15.4f)
                horizontalLineToRelative(2.6f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.57f, 12.44f)
                curveToRelative(-0.49f, -0.22f, -0.71f, -0.85f, -0.47f, -1.33f)
                lineToRelative(2.65f, -5.54f)
                curveToRelative(0.24f, -0.5f, 0.83f, -0.71f, 1.33f, -0.47f)
                lineToRelative(2.15f, 1.02f)
                lineToRelative(-3.5f, 7.37f)
                lineToRelative(-2.15f, -1.06f)
                close()
                moveTo(12.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _VacuumCleaner = it}
