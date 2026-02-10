package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailStar: ImageVector? = null

val Icons.Rr.EmailStar: ImageVector
    get() = _EmailStar ?: UXIcon(name = "EmailStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineToRelative(7.52f, 7.52f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                lineToRelative(0.89f, -0.89f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.89f, 0.89f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineToRelative(-6.46f, -6.46f)
                verticalLineToRelative(9.93f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14.73f, 7.33f)
                lineTo(13.79f, 10.34f)
                curveToRelative(-0.13f, 0.41f, 0.01f, 0.85f, 0.35f, 1.1f)
                curveToRelative(0.34f, 0.26f, 0.8f, 0.27f, 1.16f, 0.03f)
                lineToRelative(2.71f, -1.81f)
                lineToRelative(2.75f, 1.79f)
                curveToRelative(0.35f, 0.23f, 0.82f, 0.21f, 1.16f, -0.05f)
                reflectiveCurveToRelative(0.47f, -0.7f, 0.34f, -1.11f)
                lineToRelative(-0.98f, -2.98f)
                lineToRelative(2.37f, -1.93f)
                curveToRelative(0.32f, -0.27f, 0.44f, -0.71f, 0.29f, -1.11f)
                reflectiveCurveToRelative(-0.52f, -0.66f, -0.94f, -0.66f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-1.06f, -2.98f)
                curveToRelative(-0.15f, -0.39f, -0.52f, -0.65f, -0.94f, -0.65f)
                reflectiveCurveToRelative(-0.79f, 0.26f, -0.94f, 0.65f)
                lineToRelative(-1.06f, 2.98f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.42f, 0f, -0.79f, 0.26f, -0.94f, 0.66f)
                curveToRelative(-0.14f, 0.39f, -0.03f, 0.83f, 0.29f, 1.11f)
                lineToRelative(2.38f, 1.93f)
                close()
            }
        }.also { _EmailStar = it}
