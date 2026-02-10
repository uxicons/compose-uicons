package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Tr.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(8.6f, 19f)
                curveToRelative(-0.96f, 0f, -1.86f, -0.36f, -2.52f, -1.03f)
                lineToRelative(-0.59f, -0.68f)
                curveToRelative(-0.3f, -0.3f, -0.49f, -0.74f, -0.49f, -1.2f)
                reflectiveCurveToRelative(0.18f, -0.9f, 0.51f, -1.23f)
                lineToRelative(1.46f, -1.13f)
                curveToRelative(0.62f, -0.63f, 1.71f, -0.64f, 2.39f, 0.02f)
                lineToRelative(0.91f, 0.72f)
                curveToRelative(1.96f, -0.82f, 3.34f, -2.2f, 4.21f, -4.22f)
                lineToRelative(-0.74f, -0.93f)
                curveToRelative(-0.64f, -0.64f, -0.64f, -1.74f, 0.04f, -2.42f)
                lineToRelative(1.04f, -1.36f)
                curveToRelative(0.74f, -0.76f, 1.84f, -0.71f, 2.5f, -0.05f)
                lineToRelative(0.62f, 0.54f)
                curveToRelative(0.69f, 0.68f, 1.05f, 1.58f, 1.05f, 2.54f)
                curveToRelative(0f, 4.47f, -5.93f, 10.4f, -10.4f, 10.4f)
                close()
                moveTo(8.15f, 14.27f)
                curveToRelative(-0.19f, 0f, -0.38f, 0.07f, -0.52f, 0.22f)
                lineToRelative(-1.46f, 1.13f)
                curveToRelative(-0.09f, 0.1f, -0.17f, 0.28f, -0.17f, 0.48f)
                reflectiveCurveToRelative(0.08f, 0.38f, 0.22f, 0.52f)
                lineToRelative(0.59f, 0.68f)
                curveToRelative(0.45f, 0.45f, 1.09f, 0.71f, 1.79f, 0.71f)
                curveToRelative(3.57f, 0f, 9.4f, -5.25f, 9.4f, -9.4f)
                curveToRelative(0f, -0.7f, -0.26f, -1.34f, -0.73f, -1.81f)
                lineToRelative(-0.62f, -0.54f)
                curveToRelative(-0.33f, -0.33f, -0.79f, -0.3f, -1.07f, -0.02f)
                lineToRelative(-1.04f, 1.36f)
                curveToRelative(-0.33f, 0.34f, -0.33f, 0.81f, -0.04f, 1.09f)
                lineToRelative(1.14f, 1.43f)
                lineToRelative(-0.11f, 0.27f)
                curveToRelative(-1.0f, 2.5f, -2.74f, 4.23f, -5.16f, 5.16f)
                lineToRelative(-0.27f, 0.1f)
                lineToRelative(-1.42f, -1.14f)
                curveToRelative(-0.14f, -0.14f, -0.33f, -0.22f, -0.52f, -0.22f)
                close()
            }
        }.also { _CirclePhoneFlip = it}
