package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EducationPodcast: ImageVector? = null

val Icons.Ss.EducationPodcast: ImageVector
    get() = _EducationPodcast ?: UXIcon(name = "EducationPodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, 2.21f, -1.21f, 4.15f, -3f, 5.19f)
                verticalLineToRelative(-2.57f)
                curveToRelative(0.61f, -0.7f, 1f, -1.61f, 1f, -2.62f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.01f, 0.39f, 1.92f, 1f, 2.62f)
                verticalLineToRelative(2.57f)
                curveToRelative(-1.79f, -1.04f, -3f, -2.97f, -3f, -5.19f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(24f, 11.25f)
                verticalLineToRelative(10.57f)
                lineToRelative(-12f, 2.18f)
                lineToRelative(-12f, -2.18f)
                verticalLineToRelative(-16.82f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.08f, -2.3f)
                curveToRelative(0.68f, -0.57f, 1.58f, -0.81f, 2.46f, -0.65f)
                lineToRelative(4.24f, 1.03f)
                curveToRelative(0.96f, 0.17f, 1.79f, 0.71f, 2.37f, 1.45f)
                curveToRelative(-0.09f, 0.48f, -0.14f, 0.97f, -0.14f, 1.47f)
                curveToRelative(0f, 1.36f, 0.36f, 2.68f, 1f, 3.84f)
                verticalLineToRelative(11.95f)
                lineToRelative(1f, 0.18f)
                lineToRelative(1f, -0.18f)
                verticalLineToRelative(-9.56f)
                curveToRelative(0.31f, 0.25f, 0.64f, 0.49f, 0.99f, 0.69f)
                lineToRelative(1.0f, 0.58f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                lineToRelative(1.0f, -0.58f)
                curveToRelative(0.77f, -0.45f, 1.43f, -1.02f, 2.0f, -1.67f)
                close()
            }
        }.also { _EducationPodcast = it}
