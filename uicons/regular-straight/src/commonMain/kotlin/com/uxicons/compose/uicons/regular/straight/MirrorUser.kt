package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MirrorUser: ImageVector? = null

val Icons.Rs.MirrorUser: ImageVector
    get() = _MirrorUser ?: UXIcon(name = "MirrorUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                curveToRelative(-3.42f, 0f, -6f, 5.16f, -6f, 12f)
                reflectiveCurveToRelative(2.58f, 12f, 6f, 12f)
                reflectiveCurveToRelative(6f, -5.16f, 6f, -12f)
                reflectiveCurveTo(21.42f, 0f, 18f, 0f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-1.89f, 0f, -4f, -4.28f, -4f, -10f)
                reflectiveCurveToRelative(2.11f, -10f, 4f, -10f)
                curveToRelative(0.83f, 0f, 1.71f, 0.83f, 2.42f, 2.25f)
                curveToRelative(-1.53f, 1.8f, -3.04f, 5.64f, -4.34f, 8.54f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(2.33f)
                lineToRelative(0.45f, 3.39f)
                curveToRelative(0.11f, 0.83f, 0.55f, 1.54f, 1.19f, 2.02f)
                curveToRelative(-0.64f, 1.01f, -1.36f, 1.59f, -2.05f, 1.59f)
                close()
                moveTo(20.97f, 18.48f)
                curveToRelative(-0.06f, -0.11f, -0.1f, -0.22f, -0.12f, -0.35f)
                lineToRelative(-0.68f, -5.13f)
                horizontalLineToRelative(-1.99f)
                lineToRelative(0.47f, -1.06f)
                curveToRelative(0.87f, -2.0f, 1.76f, -4.03f, 2.63f, -5.44f)
                curveToRelative(0.44f, 1.56f, 0.72f, 3.43f, 0.72f, 5.5f)
                curveToRelative(0f, 2.52f, -0.41f, 4.76f, -1.03f, 6.48f)
                close()
                moveTo(9.91f, 12.59f)
                lineToRelative(0.09f, 0.19f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.48f, 2.61f, -2.97f, 2.61f)
                lineTo(2f, 21.0f)
                verticalLineToRelative(3f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-5f)
                lineTo(4.25f, 19.0f)
                curveToRelative(0.5f, 0f, 0.93f, -0.37f, 0.99f, -0.87f)
                lineToRelative(0.68f, -5.13f)
                horizontalLineToRelative(1.99f)
                curveToRelative(-0.29f, -0.67f, -0.58f, -1.37f, -0.88f, -2.07f)
                curveToRelative(-0.94f, -2.26f, -1.92f, -4.59f, -2.81f, -5.7f)
                lineToRelative(0.01f, -0.01f)
                curveTo(3.11f, 3.76f, 1.66f, 2.69f, 0f, 2.11f)
                lineTo(0f, 0f)
                curveTo(2.27f, 0.64f, 4.29f, 2.0f, 5.78f, 3.97f)
                horizontalLineToRelative(0f)
                curveToRelative(1.46f, 1.79f, 2.92f, 5.91f, 4.14f, 8.62f)
                close()
            }
        }.also { _MirrorUser = it}
