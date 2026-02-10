package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EducationPodcast: ImageVector? = null

val Icons.Rs.EducationPodcast: ImageVector
    get() = _EducationPodcast ?: UXIcon(name = "EducationPodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15f, 11.19f)
                verticalLineToRelative(-2.57f)
                curveToRelative(-0.61f, -0.7f, -1f, -1.61f, -1f, -2.62f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.01f, -0.39f, 1.92f, -1f, 2.62f)
                verticalLineToRelative(2.57f)
                curveToRelative(1.79f, -1.04f, 3f, -2.97f, 3f, -5.19f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 2.21f, 1.21f, 4.15f, 3f, 5.19f)
                close()
                moveTo(22f, 20.15f)
                lineTo(13f, 21.79f)
                verticalLineToRelative(-9.54f)
                curveToRelative(-0.81f, -0.65f, -1.49f, -1.45f, -2f, -2.37f)
                verticalLineToRelative(11.91f)
                lineToRelative(-9f, -1.64f)
                verticalLineToRelative(-15.15f)
                curveToRelative(0f, -0.41f, 0.23f, -0.66f, 0.36f, -0.77f)
                curveToRelative(0.13f, -0.11f, 0.41f, -0.29f, 0.82f, -0.22f)
                lineToRelative(6.18f, 1.12f)
                curveToRelative(0.24f, 0.04f, 0.47f, 0.13f, 0.67f, 0.26f)
                curveToRelative(0.05f, -0.7f, 0.2f, -1.37f, 0.41f, -2.01f)
                curveToRelative(-0.23f, -0.09f, -0.47f, -0.17f, -0.73f, -0.21f)
                lineToRelative(-6.18f, -1.12f)
                curveToRelative(-0.88f, -0.16f, -1.77f, 0.08f, -2.46f, 0.65f)
                curveToRelative(-0.69f, 0.57f, -1.08f, 1.41f, -1.08f, 2.3f)
                verticalLineToRelative(16.82f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                verticalLineToRelative(-10.54f)
                curveToRelative(-0.57f, 0.65f, -1.25f, 1.21f, -2f, 1.64f)
                close()
            }
        }.also { _EducationPodcast = it}
