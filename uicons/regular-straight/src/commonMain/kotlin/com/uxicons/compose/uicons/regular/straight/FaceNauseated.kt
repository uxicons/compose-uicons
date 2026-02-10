package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceNauseated: ImageVector? = null

val Icons.Rs.FaceNauseated: ImageVector
    get() = _FaceNauseated ?: UXIcon(name = "FaceNauseated") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(7f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(17f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5.37f, 10.43f)
                lineToRelative(-0.74f, -1.86f)
                curveToRelative(1.19f, -0.47f, 2.27f, -1.37f, 3.04f, -2.53f)
                lineToRelative(1.66f, 1.11f)
                curveToRelative(-1.01f, 1.51f, -2.38f, 2.65f, -3.96f, 3.28f)
                close()
                moveTo(19.37f, 8.57f)
                lineToRelative(-0.74f, 1.86f)
                curveToRelative(-1.58f, -0.63f, -2.95f, -1.76f, -3.96f, -3.28f)
                lineToRelative(1.66f, -1.11f)
                curveToRelative(0.77f, 1.16f, 1.85f, 2.06f, 3.04f, 2.53f)
                close()
                moveTo(16.82f, 15.47f)
                curveToRelative(-0.27f, 0.27f, -0.82f, 1.0f, -0.82f, 1.52f)
                reflectiveCurveToRelative(0.56f, 1.25f, 0.82f, 1.52f)
                lineToRelative(-1.42f, 1.41f)
                curveToRelative(-0.11f, -0.11f, -0.88f, -0.9f, -1.23f, -1.94f)
                horizontalLineToRelative(-4.35f)
                curveToRelative(-0.35f, 1.03f, -1.12f, 1.83f, -1.23f, 1.94f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.27f, -0.27f, 0.82f, -1.0f, 0.82f, -1.52f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -0.82f, -1.52f)
                lineToRelative(1.42f, -1.41f)
                curveToRelative(0.11f, 0.11f, 0.88f, 0.9f, 1.23f, 1.94f)
                horizontalLineToRelative(4.35f)
                curveToRelative(0.35f, -1.03f, 1.12f, -1.83f, 1.23f, -1.94f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.71f, 0.7f)
                close()
            }
        }.also { _FaceNauseated = it}
