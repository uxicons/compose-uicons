package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Ss.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(5.9f, 8.64f)
                curveToRelative(0.5f, 0.3f, 1.13f, 0.42f, 1.71f, 0.33f)
                curveToRelative(0.66f, -0.11f, 1.2f, -0.49f, 1.58f, -1.13f)
                lineToRelative(1.71f, 1.04f)
                curveToRelative(-0.69f, 1.12f, -1.74f, 1.85f, -2.96f, 2.06f)
                curveToRelative(-0.24f, 0.04f, -0.48f, 0.06f, -0.72f, 0.06f)
                curveToRelative(-0.82f, 0f, -1.65f, -0.23f, -2.36f, -0.66f)
                lineToRelative(1.04f, -1.71f)
                close()
                moveTo(11.99f, 17f)
                curveToRelative(-3f, 0f, -6f, 1.0f, -6f, 1f)
                curveToRelative(0.61f, -2.28f, 2.67f, -5.0f, 6.01f, -5f)
                curveToRelative(3.34f, 0.0f, 5.38f, 2.72f, 6f, 5f)
                curveToRelative(0f, 0.0f, -3.01f, -1f, -6.01f, -1f)
                close()
                moveTo(16.8f, 11f)
                curveToRelative(-0.24f, 0f, -0.48f, -0.02f, -0.72f, -0.06f)
                curveToRelative(-1.22f, -0.2f, -2.26f, -0.93f, -2.94f, -2.05f)
                lineToRelative(1.71f, -1.04f)
                curveToRelative(0.39f, 0.63f, 0.91f, 1.01f, 1.57f, 1.12f)
                curveToRelative(0.56f, 0.1f, 1.19f, -0.03f, 1.69f, -0.33f)
                lineToRelative(1.04f, 1.71f)
                curveToRelative(-0.7f, 0.43f, -1.52f, 0.65f, -2.34f, 0.65f)
                close()
            }
        }.also { _FaceWeary = it}
