package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainJourney: ImageVector? = null

val Icons.Rs.TrainJourney: ImageVector
    get() = _TrainJourney ?: UXIcon(name = "TrainJourney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.39f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
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
                moveTo(5f, 17f)
                horizontalLineToRelative(0.39f)
                curveToRelative(0.83f, 0f, 1.56f, 0.5f, 1.86f, 1.27f)
                lineToRelative(0.67f, 1.73f)
                horizontalLineToRelative(-2.93f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 11.99f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.01f, 7.08f)
                lineToRelative(3.53f, 3.45f)
                close()
                moveTo(16.88f, 2.88f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                reflectiveCurveToRelative(1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0.01f, 4.24f)
                lineToRelative(-2.13f, 2.08f)
                lineToRelative(-2.12f, -2.07f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(24f, 18.0f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(0.68f)
                curveToRelative(0.34f, 0.71f, 0.8f, 1.38f, 1.39f, 1.97f)
                lineToRelative(0.03f, 0.03f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.0f, 4.79f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _TrainJourney = it}
