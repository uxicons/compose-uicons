package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleStar: ImageVector? = null

val Icons.Tr.CircleStar: ImageVector
    get() = _CircleStar ?: UXIcon(name = "CircleStar") {
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
                moveTo(8.74f, 17f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                curveToRelative(-0.34f, -0.25f, -0.48f, -0.7f, -0.35f, -1.1f)
                lineToRelative(0.94f, -3.01f)
                lineToRelative(-2.37f, -1.93f)
                curveToRelative(-0.33f, -0.28f, -0.44f, -0.72f, -0.3f, -1.11f)
                curveToRelative(0.14f, -0.39f, 0.52f, -0.65f, 0.94f, -0.65f)
                horizontalLineToRelative(3f)
                lineToRelative(1.06f, -2.85f)
                curveToRelative(0.14f, -0.38f, 0.51f, -0.62f, 0.94f, -0.62f)
                reflectiveCurveToRelative(0.8f, 0.24f, 0.94f, 0.62f)
                lineToRelative(1.06f, 2.85f)
                horizontalLineToRelative(3f)
                curveToRelative(0.42f, 0f, 0.8f, 0.26f, 0.94f, 0.66f)
                horizontalLineToRelative(0f)
                curveToRelative(0.14f, 0.39f, 0.03f, 0.84f, -0.29f, 1.1f)
                lineToRelative(-2.37f, 1.93f)
                lineToRelative(0.98f, 2.98f)
                curveToRelative(0.13f, 0.4f, 0f, 0.85f, -0.34f, 1.1f)
                curveToRelative(-0.34f, 0.26f, -0.8f, 0.28f, -1.15f, 0.05f)
                lineToRelative(-2.75f, -1.79f)
                lineToRelative(-2.71f, 1.81f)
                curveToRelative(-0.17f, 0.11f, -0.37f, 0.17f, -0.56f, 0.17f)
                close()
                moveTo(7f, 9.99f)
                lineToRelative(2.62f, 2.13f)
                curveToRelative(0.16f, 0.13f, 0.22f, 0.34f, 0.16f, 0.54f)
                lineToRelative(-1.04f, 3.34f)
                lineToRelative(2.98f, -1.99f)
                curveToRelative(0.17f, -0.11f, 0.38f, -0.11f, 0.55f, 0f)
                lineToRelative(3.03f, 1.97f)
                lineToRelative(-1.09f, -3.31f)
                curveToRelative(-0.07f, -0.2f, 0f, -0.41f, 0.16f, -0.54f)
                lineToRelative(2.62f, -2.13f)
                horizontalLineToRelative(-3.35f)
                curveToRelative(-0.21f, 0f, -0.4f, -0.13f, -0.47f, -0.33f)
                lineToRelative(-1.18f, -3.18f)
                lineToRelative(-1.18f, 3.18f)
                curveToRelative(-0.07f, 0.2f, -0.26f, 0.33f, -0.47f, 0.33f)
                horizontalLineToRelative(-3.35f)
                close()
                moveTo(17f, 9.99f)
                horizontalLineToRelative(0f)
                close()
                moveTo(17f, 9.99f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
            }
        }.also { _CircleStar = it}
