package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Tr.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
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
                moveTo(15.4f, 19f)
                curveToRelative(-4.47f, 0f, -10.4f, -5.93f, -10.4f, -10.4f)
                curveToRelative(0f, -0.96f, 0.36f, -1.86f, 1.03f, -2.52f)
                lineToRelative(0.68f, -0.59f)
                curveToRelative(0.61f, -0.61f, 1.78f, -0.63f, 2.43f, 0.02f)
                lineToRelative(1.13f, 1.46f)
                curveToRelative(0.29f, 0.28f, 0.47f, 0.71f, 0.47f, 1.18f)
                reflectiveCurveToRelative(-0.18f, 0.9f, -0.51f, 1.23f)
                lineToRelative(-0.7f, 0.88f)
                curveToRelative(0.88f, 2.02f, 2.26f, 3.41f, 4.22f, 4.22f)
                lineToRelative(0.91f, -0.72f)
                curveToRelative(0.68f, -0.66f, 1.76f, -0.65f, 2.44f, 0.02f)
                lineToRelative(1.36f, 1.04f)
                curveToRelative(0.73f, 0.72f, 0.73f, 1.82f, 0.05f, 2.5f)
                lineToRelative(-0.54f, 0.62f)
                curveToRelative(-0.69f, 0.69f, -1.58f, 1.05f, -2.54f, 1.05f)
                close()
                moveTo(7.91f, 6f)
                curveToRelative(-0.2f, 0f, -0.38f, 0.08f, -0.52f, 0.22f)
                lineToRelative(-0.68f, 0.59f)
                curveToRelative(-0.45f, 0.45f, -0.71f, 1.09f, -0.71f, 1.79f)
                curveToRelative(0f, 4.15f, 5.83f, 9.4f, 9.4f, 9.4f)
                curveToRelative(0.7f, 0f, 1.34f, -0.26f, 1.81f, -0.73f)
                lineToRelative(0.54f, -0.62f)
                curveToRelative(0.31f, -0.31f, 0.31f, -0.78f, 0.02f, -1.07f)
                lineToRelative(-1.36f, -1.04f)
                curveToRelative(-0.34f, -0.33f, -0.81f, -0.33f, -1.09f, -0.04f)
                lineToRelative(-1.42f, 1.14f)
                lineToRelative(-0.27f, -0.1f)
                curveToRelative(-2.42f, -0.93f, -4.16f, -2.66f, -5.16f, -5.16f)
                lineToRelative(-0.11f, -0.27f)
                lineToRelative(1.1f, -1.39f)
                curveToRelative(0.18f, -0.18f, 0.26f, -0.37f, 0.26f, -0.56f)
                reflectiveCurveToRelative(-0.08f, -0.38f, -0.22f, -0.52f)
                lineToRelative(-1.13f, -1.46f)
                curveToRelative(-0.1f, -0.09f, -0.28f, -0.17f, -0.48f, -0.17f)
                close()
            }
        }.also { _CirclePhone = it}
