package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceNauseated: ImageVector? = null

val Icons.Ss.FaceNauseated: ImageVector
    get() = _FaceNauseated ?: UXIcon(name = "FaceNauseated") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(4.63f, 8.57f)
                curveToRelative(1.19f, -0.47f, 2.27f, -1.37f, 3.04f, -2.53f)
                lineToRelative(1.66f, 1.11f)
                curveToRelative(-1.01f, 1.51f, -2.38f, 2.65f, -3.96f, 3.28f)
                lineToRelative(-0.74f, -1.86f)
                close()
                moveTo(8.5f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.82f, 18.52f)
                lineToRelative(-1.53f, 1.41f)
                curveToRelative(-0.11f, -0.11f, -0.76f, -0.91f, -1.11f, -1.94f)
                horizontalLineToRelative(-4.36f)
                curveToRelative(-0.35f, 1.03f, -1.12f, 1.83f, -1.23f, 1.94f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.27f, -0.27f, 0.82f, -1.0f, 0.82f, -1.52f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -0.82f, -1.52f)
                lineToRelative(1.42f, -1.41f)
                curveToRelative(0.11f, 0.11f, 0.87f, 0.91f, 1.23f, 1.94f)
                horizontalLineToRelative(4.36f)
                curveToRelative(0.35f, -1.03f, 1.12f, -1.83f, 1.23f, -1.94f)
                lineToRelative(1.42f, 1.41f)
                curveToRelative(-0.27f, 0.27f, -0.82f, 1.0f, -0.82f, 1.52f)
                reflectiveCurveToRelative(0.56f, 1.25f, 0.82f, 1.52f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.63f, 10.43f)
                curveToRelative(-1.58f, -0.63f, -2.95f, -1.76f, -3.96f, -3.28f)
                lineToRelative(1.66f, -1.11f)
                curveToRelative(0.77f, 1.16f, 1.85f, 2.06f, 3.04f, 2.53f)
                lineToRelative(-0.74f, 1.86f)
                close()
            }
        }.also { _FaceNauseated = it}
