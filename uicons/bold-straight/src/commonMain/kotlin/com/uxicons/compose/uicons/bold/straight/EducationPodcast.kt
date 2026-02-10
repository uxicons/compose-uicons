package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EducationPodcast: ImageVector? = null

val Icons.Bs.EducationPodcast: ImageVector
    get() = _EducationPodcast ?: UXIcon(name = "EducationPodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 6f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(16.5f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 11.19f)
                verticalLineToRelative(-5.19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5.19f)
                curveToRelative(1.79f, -1.04f, 3f, -2.97f, 3f, -5.19f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 2.21f, 1.21f, 4.15f, 3f, 5.19f)
                close()
                moveTo(21f, 13.41f)
                verticalLineToRelative(5.9f)
                lineToRelative(-7.5f, 1.36f)
                verticalLineToRelative(-8.06f)
                curveToRelative(-1.36f, -0.93f, -2.42f, -2.28f, -3f, -3.85f)
                verticalLineToRelative(11.91f)
                lineToRelative(-7.5f, -1.36f)
                verticalLineToRelative(-13.9f)
                curveToRelative(0.05f, -0.31f, 0.17f, -0.41f, 0.48f, -0.4f)
                reflectiveCurveToRelative(5.9f, 1.07f, 5.9f, 1.07f)
                curveToRelative(0.25f, 0.05f, 0.46f, 0.17f, 0.64f, 0.33f)
                curveToRelative(-0.01f, -0.14f, -0.02f, -0.27f, -0.02f, -0.41f)
                curveToRelative(0f, -0.96f, 0.18f, -1.88f, 0.49f, -2.73f)
                curveToRelative(-0.18f, -0.06f, -0.38f, -0.11f, -0.57f, -0.14f)
                curveToRelative(0f, 0f, -5.9f, -1.07f, -5.9f, -1.07f)
                curveToRelative(-0.99f, -0.13f, -2.02f, 0.07f, -2.79f, 0.74f)
                curveToRelative(-0.78f, 0.65f, -1.23f, 1.6f, -1.23f, 2.62f)
                verticalLineToRelative(16.41f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                verticalLineToRelative(-10.54f)
                curveToRelative(-0.81f, 0.93f, -1.84f, 1.66f, -3f, 2.13f)
                close()
            }
        }.also { _EducationPodcast = it}
