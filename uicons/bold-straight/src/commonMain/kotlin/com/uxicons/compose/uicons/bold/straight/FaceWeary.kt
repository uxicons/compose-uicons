package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Bs.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 16f)
                curveToRelative(-3f, 0f, -6f, 1.0f, -6f, 1f)
                curveToRelative(0.61f, -2.28f, 2.67f, -5.0f, 6.01f, -5f)
                curveToRelative(3.34f, 0.0f, 5.38f, 2.72f, 6f, 5f)
                curveToRelative(0f, 0.0f, -3.01f, -1f, -6.01f, -1f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(18.89f, 8.46f)
                reflectiveCurveToRelative(-2.24f, 0.03f, -3.14f, -0.4f)
                reflectiveCurveToRelative(-2.27f, -2.2f, -2.27f, -2.2f)
                curveToRelative(-0.71f, 1.47f, -0.83f, 4.04f, 0.97f, 4.91f)
                reflectiveCurveToRelative(3.73f, -0.83f, 4.44f, -2.3f)
                close()
                moveTo(9.55f, 10.76f)
                curveToRelative(1.8f, -0.87f, 1.68f, -3.44f, 0.97f, -4.91f)
                curveToRelative(0f, 0f, -1.37f, 1.77f, -2.27f, 2.2f)
                reflectiveCurveToRelative(-3.14f, 0.4f, -3.14f, 0.4f)
                curveToRelative(0.71f, 1.47f, 2.64f, 3.17f, 4.44f, 2.3f)
                close()
            }
        }.also { _FaceWeary = it}
