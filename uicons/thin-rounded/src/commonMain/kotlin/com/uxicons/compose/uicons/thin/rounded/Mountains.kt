package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Tr.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(20f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(19.16f, 11.87f)
                curveToRelative(-0.43f, -0.81f, -1.24f, -1.3f, -2.16f, -1.3f)
                reflectiveCurveToRelative(-1.73f, 0.48f, -2.16f, 1.3f)
                lineToRelative(-4.55f, 8.53f)
                curveToRelative(-0.41f, 0.77f, -0.39f, 1.67f, 0.06f, 2.41f)
                curveToRelative(0.45f, 0.74f, 1.23f, 1.19f, 2.1f, 1.19f)
                horizontalLineToRelative(9.1f)
                curveToRelative(0.87f, 0f, 1.65f, -0.45f, 2.1f, -1.19f)
                curveToRelative(0.45f, -0.74f, 0.47f, -1.65f, 0.06f, -2.41f)
                lineToRelative(-4.55f, -8.53f)
                close()
                moveTo(22.79f, 22.3f)
                curveToRelative(-0.27f, 0.44f, -0.73f, 0.7f, -1.24f, 0.7f)
                horizontalLineToRelative(-9.1f)
                curveToRelative(-0.52f, 0f, -0.98f, -0.26f, -1.24f, -0.7f)
                reflectiveCurveToRelative(-0.28f, -0.97f, -0.04f, -1.43f)
                lineToRelative(4.55f, -8.53f)
                curveToRelative(0.26f, -0.48f, 0.73f, -0.77f, 1.28f, -0.77f)
                reflectiveCurveToRelative(1.02f, 0.29f, 1.28f, 0.77f)
                lineToRelative(4.55f, 8.53f)
                curveToRelative(0.24f, 0.45f, 0.23f, 0.99f, -0.04f, 1.43f)
                close()
                moveTo(9.98f, 6f)
                curveToRelative(-0.53f, 0f, -1.0f, 0.28f, -1.25f, 0.75f)
                lineTo(1.17f, 20.91f)
                curveToRelative(-0.24f, 0.44f, -0.22f, 0.97f, 0.04f, 1.4f)
                curveToRelative(0.26f, 0.43f, 0.71f, 0.69f, 1.22f, 0.69f)
                horizontalLineToRelative(5.08f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.42f, 24.0f)
                curveToRelative(-0.86f, 0f, -1.63f, -0.44f, -2.07f, -1.17f)
                reflectiveCurveToRelative(-0.46f, -1.63f, -0.06f, -2.38f)
                lineTo(7.84f, 6.28f)
                curveToRelative(0.43f, -0.8f, 1.23f, -1.28f, 2.14f, -1.28f)
                reflectiveCurveToRelative(1.71f, 0.48f, 2.13f, 1.28f)
                lineToRelative(1.59f, 2.98f)
                curveToRelative(0.13f, 0.24f, 0.04f, 0.55f, -0.21f, 0.68f)
                curveToRelative(-0.24f, 0.13f, -0.55f, 0.04f, -0.68f, -0.21f)
                lineToRelative(-1.59f, -2.98f)
                curveToRelative(-0.25f, -0.47f, -0.72f, -0.75f, -1.25f, -0.75f)
                close()
            }
        }.also { _Mountains = it}
