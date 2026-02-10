package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podcast: ImageVector? = null

val Icons.Ts.Podcast: ImageVector
    get() = _Podcast ?: UXIcon(name = "Podcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 12f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 5.18f, -3.31f, 9.59f, -7.92f, 11.27f)
                lineToRelative(0.21f, -1.14f)
                curveToRelative(3.94f, -1.68f, 6.71f, -5.58f, 6.71f, -10.13f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 4.55f, 2.77f, 8.46f, 6.72f, 10.13f)
                lineToRelative(0.2f, 1.14f)
                curveTo(3.31f, 21.59f, 0f, 17.18f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(6f, 12f)
                curveToRelative(0f, 1.54f, 0.59f, 2.94f, 1.55f, 4.01f)
                curveToRelative(-0.19f, 0.31f, -0.33f, 0.65f, -0.42f, 1.01f)
                curveToRelative(-1.31f, -1.27f, -2.12f, -3.05f, -2.12f, -5.01f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.96f, -0.81f, 3.73f, -2.11f, 5f)
                curveToRelative(-0.09f, -0.35f, -0.23f, -0.69f, -0.43f, -1.0f)
                curveToRelative(0.95f, -1.06f, 1.54f, -2.46f, 1.54f, -4.0f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                close()
                moveTo(13.97f, 16.43f)
                curveToRelative(-1.08f, -0.35f, -1.67f, -0.43f, -1.97f, -0.43f)
                reflectiveCurveToRelative(-0.88f, 0.07f, -1.96f, 0.42f)
                curveToRelative(-0.71f, 0.23f, -1.15f, 0.97f, -1.01f, 1.72f)
                lineToRelative(1.05f, 5.86f)
                horizontalLineToRelative(3.84f)
                lineToRelative(1.07f, -5.9f)
                curveToRelative(0.13f, -0.71f, -0.32f, -1.44f, -1.02f, -1.67f)
                close()
                moveTo(14.0f, 17.93f)
                lineToRelative(-0.92f, 5.07f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(-0.9f, -5.04f)
                curveToRelative(-0.05f, -0.26f, 0.1f, -0.51f, 0.34f, -0.59f)
                curveToRelative(1.04f, -0.34f, 1.5f, -0.38f, 1.65f, -0.38f)
                reflectiveCurveToRelative(0.61f, 0.04f, 1.66f, 0.38f)
                curveToRelative(0.23f, 0.07f, 0.39f, 0.32f, 0.34f, 0.55f)
                close()
            }
        }.also { _Podcast = it}
