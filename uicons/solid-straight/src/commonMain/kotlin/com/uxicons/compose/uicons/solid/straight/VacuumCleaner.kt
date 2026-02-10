package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumCleaner: ImageVector? = null

val Icons.Ss.VacuumCleaner: ImageVector
    get() = _VacuumCleaner ?: UXIcon(name = "VacuumCleaner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(8f, 21f)
                curveToRelative(0f, -1.13f, 0.39f, -2.16f, 1.03f, -3f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                close()
                moveTo(20.13f, 0f)
                lineTo(18.08f, 4.31f)
                lineTo(15.94f, 3.29f)
                curveToRelative(-1.49f, -0.71f, -3.28f, -0.08f, -4.0f, 1.41f)
                lineToRelative(-2.65f, 5.53f)
                curveToRelative(-0.35f, 0.72f, -0.39f, 1.54f, -0.12f, 2.3f)
                curveToRelative(0.27f, 0.76f, 0.81f, 1.36f, 1.53f, 1.7f)
                lineToRelative(2.16f, 1.06f)
                lineToRelative(-0.36f, 0.75f)
                curveToRelative(0.17f, -0.02f, 0.32f, -0.05f, 0.49f, -0.05f)
                curveToRelative(0.57f, 0f, 1.1f, 0.12f, 1.61f, 0.29f)
                lineToRelative(6.79f, -14.29f)
                horizontalLineToRelative(2.6f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.87f)
                close()
            }
        }.also { _VacuumCleaner = it}
