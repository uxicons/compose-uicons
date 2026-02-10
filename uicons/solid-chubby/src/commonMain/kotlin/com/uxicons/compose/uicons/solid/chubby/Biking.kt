package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Biking: ImageVector? = null

val Icons.Sc.Biking: ImageVector
    get() = _Biking ?: UXIcon(name = "Biking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.12f, 13.82f)
                curveToRelative(-2.73f, 0f, -4.12f, 1.39f, -4.12f, 4.13f)
                reflectiveCurveToRelative(1.39f, 4.13f, 4.12f, 4.13f)
                reflectiveCurveToRelative(4.12f, -1.39f, 4.12f, -4.13f)
                reflectiveCurveToRelative(-1.39f, -4.13f, -4.12f, -4.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.88f, 13.82f)
                curveToRelative(-2.74f, 0f, -4.12f, 1.39f, -4.12f, 4.13f)
                reflectiveCurveToRelative(1.39f, 4.13f, 4.12f, 4.13f)
                reflectiveCurveToRelative(4.12f, -1.39f, 4.12f, -4.13f)
                reflectiveCurveToRelative(-1.39f, -4.13f, -4.12f, -4.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.18f, 7.18f)
                curveToRelative(1.62f, 0f, 2.63f, -1.01f, 2.63f, -2.63f)
                reflectiveCurveToRelative(-1.01f, -2.63f, -2.63f, -2.63f)
                reflectiveCurveToRelative(-2.63f, 1.01f, -2.63f, 2.63f)
                reflectiveCurveToRelative(1.01f, 2.63f, 2.63f, 2.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.02f, 11.1f)
                curveToRelative(0.31f, -0.57f, 0.82f, -1.01f, 1.42f, -1.24f)
                lineToRelative(0.69f, 0.68f)
                curveToRelative(1.07f, 1.05f, 2.48f, 1.63f, 3.97f, 1.63f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-0.7f, 0f, -1.37f, -0.27f, -1.87f, -0.77f)
                lineToRelative(-1.27f, -1.25f)
                curveToRelative(-0.33f, -0.32f, -0.78f, -0.47f, -1.23f, -0.42f)
                curveToRelative(-2.36f, 0.28f, -4.33f, 2.03f, -4.88f, 4.35f)
                curveToRelative(-0.11f, 0.48f, 0.01f, 0.98f, 0.34f, 1.35f)
                lineToRelative(1.59f, 1.79f)
                curveToRelative(0.48f, 0.5f, 0.74f, 1.15f, 0.74f, 1.84f)
                verticalLineToRelative(1.9f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -1.47f, -0.56f, -2.86f, -1.53f, -3.88f)
                lineToRelative(-0.96f, -1.08f)
                close()
            }
        }.also { _Biking = it}
