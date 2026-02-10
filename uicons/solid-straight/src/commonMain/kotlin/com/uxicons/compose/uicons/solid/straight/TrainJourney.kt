package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainJourney: ImageVector? = null

val Icons.Ss.TrainJourney: ImageVector
    get() = _TrainJourney ?: UXIcon(name = "TrainJourney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.47f, 8.54f)
                curveToRelative(-1.96f, -1.96f, -1.96f, -5.13f, -0.01f, -7.08f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
                horizontalLineToRelative(0f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.12f, 0f, 7.07f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.53f, -3.45f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-0.03f, -0.03f)
                curveToRelative(-0.59f, -0.59f, -1.05f, -1.26f, -1.39f, -1.97f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(5.39f, 15f)
                horizontalLineToRelative(-0.39f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                lineTo(0f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.19f)
                lineToRelative(-0.88f, -2.27f)
                curveToRelative(-0.6f, -1.55f, -2.07f, -2.55f, -3.73f, -2.55f)
                close()
            }
        }.also { _TrainJourney = it}
