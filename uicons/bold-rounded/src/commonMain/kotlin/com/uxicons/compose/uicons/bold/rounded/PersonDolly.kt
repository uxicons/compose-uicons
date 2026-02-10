package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDolly: ImageVector? = null

val Icons.Br.PersonDolly: ImageVector
    get() = _PersonDolly ?: UXIcon(name = "PersonDolly") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1f, 2.5f)
            curveTo(1f, 1.12f, 2.12f, 0f, 3.5f, 0f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(1f, 3.88f, 1f, 2.5f)
            close()
            moveTo(1.5f, 18.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(23.96f, 18.04f)
            curveToRelative(-0.19f, -0.81f, -0.99f, -1.31f, -1.8f, -1.12f)
            lineToRelative(-6.81f, 1.58f)
            lineToRelative(-2.86f, -12.34f)
            curveToRelative(-0.19f, -0.81f, -0.99f, -1.31f, -1.8f, -1.12f)
            curveToRelative(-0.81f, 0.19f, -1.31f, 0.99f, -1.12f, 1.8f)
            lineToRelative(0.73f, 3.16f)
            horizontalLineToRelative(-1.97f)
            lineToRelative(-1.32f, -2.12f)
            curveToRelative(-0.74f, -1.18f, -2.0f, -1.88f, -3.39f, -1.88f)
            horizontalLineToRelative(-0.61f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(4.08f)
            curveToRelative(0f, 1.4f, 0.74f, 2.71f, 1.94f, 3.43f)
            lineToRelative(3.06f, 1.83f)
            verticalLineToRelative(4.15f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.43f)
            curveToRelative(0f, -0.87f, -0.47f, -1.7f, -1.21f, -2.14f)
            lineToRelative(-1.79f, -1.07f)
            verticalLineToRelative(-4.52f)
            lineToRelative(0.94f, 1.5f)
            curveToRelative(0.46f, 0.73f, 1.25f, 1.17f, 2.12f, 1.17f)
            horizontalLineToRelative(2.94f)
            lineToRelative(1.45f, 6.24f)
            curveToRelative(-0.85f, 0.4f, -1.44f, 1.26f, -1.44f, 2.26f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.02f, -0.0f, -0.05f, -0.0f, -0.07f)
            lineToRelative(6.84f, -1.59f)
            curveToRelative(0.81f, -0.19f, 1.31f, -0.99f, 1.12f, -1.8f)
            close()
            moveTo(16.43f, 14.63f)
            curveToRelative(0.2f, 0.86f, 1.06f, 1.39f, 1.92f, 1.19f)
            lineToRelative(2.91f, -0.69f)
            curveToRelative(0.85f, -0.2f, 1.38f, -1.06f, 1.18f, -1.91f)
            lineToRelative(-0.7f, -2.99f)
            curveToRelative(-0.2f, -0.86f, -1.06f, -1.39f, -1.92f, -1.19f)
            lineToRelative(-2.91f, 0.69f)
            curveToRelative(-0.85f, 0.2f, -1.38f, 1.06f, -1.18f, 1.91f)
            lineToRelative(0.7f, 2.99f)
            close()
        }
    }.also { _PersonDolly = it }
