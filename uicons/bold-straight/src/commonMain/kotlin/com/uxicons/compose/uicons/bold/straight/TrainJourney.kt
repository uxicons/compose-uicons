package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainJourney: ImageVector? = null

val Icons.Bs.TrainJourney: ImageVector
    get() = _TrainJourney ?: UXIcon(name = "TrainJourney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.1f, 17.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.6f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -2.5f, -1.5f)
                horizontalLineToRelative(-6.1f)
                curveToRelative(-2.5f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -2.42f, 2.01f, -4.38f, 4.41f, -4.48f)
                curveToRelative(0.33f, 1.08f, 0.91f, 2.1f, 1.77f, 2.96f)
                lineToRelative(0.02f, 0.02f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(-0.83f, 0f, -1.6f, 0.67f, -1.6f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.1f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(4.89f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(0f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.78f)
                lineToRelative(-0.92f, -2.35f)
                curveToRelative(-0.68f, -1.74f, -2.32f, -2.86f, -4.19f, -2.86f)
                close()
                moveTo(5f, 17.0f)
                curveToRelative(0.58f, 0.04f, 1.07f, 0.41f, 1.29f, 0.95f)
                lineToRelative(0.41f, 1.04f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 1.46f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.01f, 7.08f)
                lineToRelative(3.52f, 3.45f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                close()
                moveTo(19f, 7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _TrainJourney = it}
