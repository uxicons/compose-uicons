package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleVideo: ImageVector? = null

val Icons.Tr.CircleVideo: ImageVector
    get() = _CircleVideo ?: UXIcon(name = "CircleVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(19.11f, 8.19f)
                curveToRelative(-0.54f, -0.28f, -1.19f, -0.24f, -1.7f, 0.1f)
                lineToRelative(-2.41f, 1.36f)
                verticalLineToRelative(-0.14f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.14f)
                lineToRelative(2.38f, 1.34f)
                curveToRelative(0.28f, 0.2f, 0.62f, 0.3f, 0.95f, 0.3f)
                curveToRelative(0.26f, 0f, 0.53f, -0.06f, 0.77f, -0.19f)
                curveToRelative(0.55f, -0.29f, 0.9f, -0.85f, 0.9f, -1.47f)
                verticalLineToRelative(-4.67f)
                curveToRelative(0f, -0.62f, -0.34f, -1.19f, -0.9f, -1.47f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 14.34f)
                curveToRelative(0f, 0.25f, -0.13f, 0.47f, -0.36f, 0.59f)
                curveToRelative(-0.22f, 0.12f, -0.48f, 0.1f, -0.73f, -0.07f)
                lineToRelative(-2.92f, -1.65f)
                verticalLineToRelative(-2.42f)
                lineToRelative(2.92f, -1.65f)
                lineToRelative(0.04f, -0.03f)
                curveToRelative(0.21f, -0.14f, 0.46f, -0.16f, 0.69f, -0.04f)
                curveToRelative(0.22f, 0.12f, 0.36f, 0.34f, 0.36f, 0.59f)
                verticalLineToRelative(4.67f)
                close()
            }
        }.also { _CircleVideo = it}
