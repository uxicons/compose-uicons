package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SecondMedal: ImageVector? = null

val Icons.Sr.SecondMedal: ImageVector
    get() = _SecondMedal ?: UXIcon(name = "SecondMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveToRelative(-4.04f, -9f, -9f, -9f)
                close()
                moveTo(14f, 20f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-0.73f, 0f, -1.36f, -0.44f, -1.62f, -1.11f)
                curveToRelative(-0.26f, -0.68f, -0.08f, -1.44f, 0.46f, -1.93f)
                curveToRelative(0.23f, -0.2f, 0.51f, -0.43f, 0.81f, -0.68f)
                curveToRelative(1.15f, -0.93f, 2.73f, -2.21f, 2.59f, -3.48f)
                curveToRelative(-0.05f, -0.44f, -0.48f, -0.79f, -0.99f, -0.79f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.53f, 0f, 2.81f, 1.1f, 2.98f, 2.57f)
                curveToRelative(0.26f, 2.36f, -1.9f, 4.1f, -3.32f, 5.26f)
                curveToRelative(-0.07f, 0.06f, -0.14f, 0.12f, -0.21f, 0.17f)
                horizontalLineToRelative(2.56f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(3.99f, 7.48f)
                lineTo(1.72f, 2.87f)
                curveToRelative(-0.31f, -0.62f, -0.27f, -1.34f, 0.1f, -1.93f)
                curveToRelative(0.36f, -0.59f, 1.0f, -0.94f, 1.69f, -0.94f)
                horizontalLineToRelative(2.26f)
                curveToRelative(1.53f, 0f, 2.91f, 0.85f, 3.59f, 2.23f)
                lineToRelative(0.94f, 1.92f)
                curveToRelative(-2.47f, 0.39f, -4.67f, 1.59f, -6.3f, 3.33f)
                close()
                moveTo(22.3f, 2.87f)
                lineToRelative(-2.28f, 4.62f)
                curveToRelative(-1.64f, -1.75f, -3.84f, -2.96f, -6.32f, -3.35f)
                lineToRelative(0.94f, -1.92f)
                curveToRelative(0.68f, -1.38f, 2.05f, -2.23f, 3.59f, -2.23f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.69f, 0f, 1.32f, 0.35f, 1.69f, 0.94f)
                curveToRelative(0.37f, 0.59f, 0.4f, 1.31f, 0.1f, 1.93f)
                close()
            }
        }.also { _SecondMedal = it}
