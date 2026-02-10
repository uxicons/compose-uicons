package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficLightGo: ImageVector? = null

val Icons.Sc.TrafficLightGo: ImageVector
    get() = _TrafficLightGo ?: UXIcon(name = "TrafficLightGo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.18f, 2.96f)
                curveToRelative(-0.06f, -0.32f, -0.28f, -0.59f, -0.58f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -2.9f, -1.23f, -6.59f, -1.23f)
                curveToRelative(-3.73f, 0f, -6.48f, 1.18f, -6.59f, 1.23f)
                curveToRelative(-0.3f, 0.13f, -0.52f, 0.4f, -0.58f, 0.72f)
                curveToRelative(-0.03f, 0.17f, -0.82f, 4.24f, -0.82f, 9.04f)
                reflectiveCurveToRelative(0.79f, 8.87f, 0.82f, 9.04f)
                curveToRelative(0.06f, 0.32f, 0.28f, 0.59f, 0.58f, 0.72f)
                curveToRelative(0.12f, 0.05f, 2.9f, 1.23f, 6.59f, 1.23f)
                curveToRelative(3.73f, 0f, 6.48f, -1.18f, 6.59f, -1.23f)
                curveToRelative(0.3f, -0.13f, 0.52f, -0.4f, 0.58f, -0.72f)
                curveToRelative(0.03f, -0.17f, 0.82f, -4.24f, 0.82f, -9.04f)
                reflectiveCurveToRelative(-0.79f, -8.87f, -0.82f, -9.04f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 1.04f, -0.54f, 1.96f, -1.34f, 2.5f)
                curveToRelative(0.81f, 0.54f, 1.34f, 1.46f, 1.34f, 2.5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.04f, 0.54f, -1.96f, 1.34f, -2.5f)
                curveToRelative(-0.81f, -0.54f, -1.34f, -1.46f, -1.34f, -2.5f)
                reflectiveCurveToRelative(0.54f, -1.96f, 1.34f, -2.5f)
                curveToRelative(-0.81f, -0.54f, -1.34f, -1.46f, -1.34f, -2.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.04f, -0.54f, 1.96f, -1.34f, 2.5f)
                curveToRelative(0.81f, 0.54f, 1.34f, 1.46f, 1.34f, 2.5f)
                close()
            }
        }.also { _TrafficLightGo = it}
