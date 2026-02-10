package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VacuumCleaner: ImageVector? = null

val Icons.Sr.VacuumCleaner: ImageVector
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
                curveToRelative(0f, 0f, 0f, 2f, 2f, 2f)
                horizontalLineToRelative(7.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                close()
                moveTo(23f, 0f)
                curveToRelative(-1.85f, 0f, -3.35f, 1.01f, -4.22f, 2.85f)
                lineToRelative(-0.69f, 1.46f)
                lineToRelative(-1.25f, -0.59f)
                curveToRelative(-1.99f, -0.95f, -4.38f, -0.1f, -5.32f, 1.88f)
                lineToRelative(-1.81f, 3.68f)
                curveToRelative(-0.97f, 1.97f, -0.16f, 4.36f, 1.8f, 5.34f)
                lineToRelative(1.36f, 0.68f)
                lineToRelative(-0.36f, 0.75f)
                curveToRelative(0.17f, -0.02f, 0.32f, -0.05f, 0.49f, -0.05f)
                curveToRelative(0.57f, 0f, 1.1f, 0.12f, 1.61f, 0.29f)
                lineToRelative(5.98f, -12.58f)
                curveToRelative(0.54f, -1.14f, 1.35f, -1.71f, 2.42f, -1.71f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _VacuumCleaner = it}
