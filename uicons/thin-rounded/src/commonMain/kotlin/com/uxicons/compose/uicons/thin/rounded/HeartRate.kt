package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Tr.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.55f, 21f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.4f, -0.0f, -0.74f, -0.27f, -0.85f, -0.65f)
                lineToRelative(-3.72f, -16.01f)
                lineToRelative(-3.69f, 14.02f)
                curveToRelative(-0.12f, 0.39f, -0.44f, 0.63f, -0.82f, 0.64f)
                curveToRelative(-0.39f, 0.01f, -0.72f, -0.2f, -0.86f, -0.55f)
                lineToRelative(-1.6f, -5.48f)
                curveToRelative(-0.2f, -0.57f, -0.77f, -0.97f, -1.4f, -0.97f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.09f)
                curveToRelative(1.05f, 0f, 2.0f, 0.67f, 2.35f, 1.66f)
                lineToRelative(1.47f, 5.05f)
                lineToRelative(3.7f, -14.06f)
                curveToRelative(0.13f, -0.4f, 0.47f, -0.66f, 0.87f, -0.65f)
                curveToRelative(0.4f, 0.01f, 0.73f, 0.27f, 0.84f, 0.65f)
                lineToRelative(3.72f, 15.98f)
                lineToRelative(1.56f, -6.76f)
                curveToRelative(0.3f, -1.11f, 1.29f, -1.87f, 2.42f, -1.87f)
                horizontalLineToRelative(2.97f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.97f)
                curveToRelative(-0.68f, 0f, -1.27f, 0.46f, -1.45f, 1.11f)
                lineToRelative(-1.67f, 7.22f)
                curveToRelative(-0.13f, 0.41f, -0.47f, 0.67f, -0.86f, 0.67f)
                close()
            }
        }.also { _HeartRate = it}
