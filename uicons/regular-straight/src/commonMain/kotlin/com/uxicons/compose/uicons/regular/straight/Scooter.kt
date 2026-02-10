package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scooter: ImageVector? = null

val Icons.Rs.Scooter: ImageVector
    get() = _Scooter ?: UXIcon(name = "Scooter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.72f, 17.02f)
                lineToRelative(-3.39f, -14.7f)
                curveToRelative(-0.32f, -1.37f, -1.52f, -2.33f, -2.92f, -2.33f)
                horizontalLineToRelative(-3.41f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.41f)
                curveToRelative(0.47f, 0f, 0.87f, 0.32f, 0.97f, 0.78f)
                lineToRelative(2.15f, 9.32f)
                lineToRelative(-4.01f, 4.9f)
                lineTo(0f, 17.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.35f)
                curveToRelative(-0.22f, 0.46f, -0.35f, 0.96f, -0.35f, 1.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.54f, -0.13f, -1.04f, -0.35f, -1.5f)
                horizontalLineToRelative(6.83f)
                lineToRelative(3.63f, -4.44f)
                lineToRelative(0.67f, 2.91f)
                curveToRelative(-1.05f, 0.6f, -1.77f, 1.73f, -1.77f, 3.03f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.85f, -1.45f, -3.36f, -3.28f, -3.48f)
                close()
                moveTo(6f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Scooter = it}
