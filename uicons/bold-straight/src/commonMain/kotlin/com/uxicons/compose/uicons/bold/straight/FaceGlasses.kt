package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceGlasses: ImageVector? = null

val Icons.Bs.FaceGlasses: ImageVector
    get() = _FaceGlasses ?: UXIcon(name = "FaceGlasses") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 3f)
                curveToRelative(2.66f, 0f, 5.05f, 1.16f, 6.7f, 3f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-0.82f, 0f, -1.54f, 0.39f, -2.0f, 1f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.46f, -0.61f, -1.18f, -1f, -2.0f, -1f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(1.65f, -1.84f, 4.04f, -3f, 6.7f, -3f)
                close()
                moveTo(19f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(8f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.79f, 0f, -8.72f, -3.76f, -8.98f, -8.49f)
                curveToRelative(0.42f, 0.31f, 0.93f, 0.49f, 1.49f, 0.49f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.56f, 0f, 1.07f, -0.18f, 1.49f, -0.49f)
                curveToRelative(-0.27f, 4.73f, -4.19f, 8.49f, -8.98f, 8.49f)
                close()
                moveTo(16.0f, 14.38f)
                lineToRelative(1.99f, 2.24f)
                curveToRelative(-0.11f, 0.1f, -2.7f, 2.38f, -6.0f, 2.38f)
                reflectiveCurveToRelative(-5.89f, -2.28f, -6.0f, -2.38f)
                lineToRelative(1.99f, -2.24f)
                curveToRelative(0.02f, 0.02f, 1.87f, 1.62f, 4.0f, 1.62f)
                reflectiveCurveToRelative(3.99f, -1.61f, 4.0f, -1.62f)
                close()
            }
        }.also { _FaceGlasses = it}
