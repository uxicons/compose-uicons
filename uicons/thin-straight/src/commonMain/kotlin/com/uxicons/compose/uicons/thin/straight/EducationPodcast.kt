package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EducationPodcast: ImageVector? = null

val Icons.Ts.EducationPodcast: ImageVector
    get() = _EducationPodcast ?: UXIcon(name = "EducationPodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(18f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17.5f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.42f, -1.44f, 4.5f, -3.5f, 5.45f)
                verticalLineToRelative(-1.14f)
                curveToRelative(1.49f, -0.87f, 2.5f, -2.46f, 2.5f, -4.3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 1.84f, 1.01f, 3.44f, 2.5f, 4.3f)
                verticalLineToRelative(1.14f)
                curveToRelative(-2.06f, -0.95f, -3.5f, -3.03f, -3.5f, -5.45f)
                close()
                moveTo(23f, 12.24f)
                curveToRelative(0.36f, -0.29f, 0.69f, -0.61f, 1f, -0.96f)
                verticalLineToRelative(10.55f)
                lineToRelative(-12f, 2.17f)
                lineToRelative(-12f, -2.17f)
                verticalLineToRelative(-17.24f)
                curveToRelative(0f, -0.77f, 0.34f, -1.5f, 0.93f, -1.99f)
                curveToRelative(0.59f, -0.49f, 1.36f, -0.7f, 2.12f, -0.56f)
                lineToRelative(6.46f, 1.18f)
                curveToRelative(0.32f, 0.06f, 0.61f, 0.16f, 0.89f, 0.29f)
                curveToRelative(-0.1f, 0.32f, -0.19f, 0.65f, -0.25f, 0.98f)
                curveToRelative(-0.25f, -0.14f, -0.52f, -0.24f, -0.81f, -0.29f)
                lineToRelative(-6.46f, -1.17f)
                curveToRelative(-0.46f, -0.08f, -0.94f, 0.04f, -1.3f, 0.34f)
                curveToRelative(-0.36f, 0.3f, -0.57f, 0.75f, -0.57f, 1.22f)
                verticalLineToRelative(16.4f)
                lineToRelative(10.5f, 1.91f)
                verticalLineToRelative(-12.25f)
                curveToRelative(0.3f, 0.41f, 0.63f, 0.8f, 1f, 1.15f)
                verticalLineToRelative(11.1f)
                lineToRelative(10.5f, -1.91f)
                close()
            }
        }.also { _EducationPodcast = it}
