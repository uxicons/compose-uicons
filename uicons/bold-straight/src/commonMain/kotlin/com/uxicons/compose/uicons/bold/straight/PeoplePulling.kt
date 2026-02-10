package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeoplePulling: ImageVector? = null

val Icons.Bs.PeoplePulling: ImageVector
    get() = _PeoplePulling ?: UXIcon(name = "PeoplePulling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.12f, 15.02f)
                lineToRelative(0.69f, -2.33f)
                lineToRelative(3.7f, 2.16f)
                lineToRelative(1.52f, -2.59f)
                lineToRelative(-4.38f, -2.57f)
                curveToRelative(0.1f, -1.05f, -0.17f, -2.04f, -0.78f, -2.72f)
                curveToRelative(-0.56f, -0.63f, -1.35f, -0.98f, -2.24f, -0.98f)
                curveToRelative(-0.13f, 0f, -0.46f, 0f, -1.41f, 0.3f)
                lineToRelative(-4.79f, 2.55f)
                lineToRelative(-5.76f, -2.3f)
                curveToRelative(-0.49f, -0.4f, -1.12f, -0.63f, -1.79f, -0.63f)
                curveToRelative(-0.87f, 0f, -1.69f, 0.39f, -2.23f, 1.07f)
                curveTo(0.08f, 7.67f, -0.12f, 8.54f, 0.07f, 9.39f)
                lineToRelative(1.82f, 8.19f)
                lineToRelative(1.45f, -0.35f)
                lineToRelative(1.64f, 6.77f)
                horizontalLineToRelative(3.09f)
                lineToRelative(-1.81f, -7.47f)
                lineToRelative(1.46f, -0.35f)
                lineToRelative(-1.48f, -5.76f)
                lineToRelative(4.36f, 1.75f)
                lineToRelative(3.87f, -2.08f)
                lineToRelative(-1.55f, 5.18f)
                lineToRelative(5.93f, 3.78f)
                lineToRelative(2.46f, 4.91f)
                lineToRelative(2.68f, -1.34f)
                lineToRelative(-2.83f, -5.65f)
                lineToRelative(-3.04f, -1.94f)
                close()
                moveTo(2.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(3.88f, 0f, 2.5f, 0f)
                reflectiveCurveTo(0f, 1.12f, 0f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(10.3f, 24f)
                horizontalLineToRelative(3.13f)
                lineToRelative(1.51f, -5.07f)
                lineToRelative(-2.63f, -1.68f)
                lineToRelative(-2.01f, 6.75f)
                close()
            }
        }.also { _PeoplePulling = it}
