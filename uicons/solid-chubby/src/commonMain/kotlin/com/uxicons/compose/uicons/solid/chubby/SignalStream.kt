package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStream: ImageVector? = null

val Icons.Sc.SignalStream: ImageVector
    get() = _SignalStream ?: UXIcon(name = "SignalStream") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 12f)
                curveToRelative(0f, -2.32f, 1.05f, -4.6f, 2.96f, -6.41f)
                curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.05f, -2.12f)
                curveToRelative(-0.57f, -0.6f, -1.52f, -0.62f, -2.12f, -0.05f)
                curveToRelative(-2.51f, 2.39f, -3.9f, 5.44f, -3.9f, 8.59f)
                reflectiveCurveToRelative(1.38f, 6.2f, 3.9f, 8.59f)
                curveToRelative(0.29f, 0.28f, 1.2f, 0.83f, 2.12f, -0.05f)
                curveToRelative(0.58f, -0.56f, 0.55f, -1.55f, -0.05f, -2.12f)
                curveToRelative(-1.91f, -1.82f, -2.96f, -4.09f, -2.96f, -6.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.11f, 3.41f)
                curveToRelative(-0.6f, -0.57f, -1.55f, -0.55f, -2.12f, 0.05f)
                curveToRelative(-0.57f, 0.6f, -0.55f, 1.55f, 0.05f, 2.12f)
                curveToRelative(1.91f, 1.82f, 2.96f, 4.09f, 2.96f, 6.41f)
                reflectiveCurveToRelative(-1.05f, 4.6f, -2.96f, 6.41f)
                curveToRelative(-0.6f, 0.57f, -0.63f, 1.57f, -0.05f, 2.12f)
                curveToRelative(0.92f, 0.88f, 1.83f, 0.33f, 2.12f, 0.05f)
                curveToRelative(2.51f, -2.39f, 3.9f, -5.44f, 3.9f, -8.59f)
                reflectiveCurveToRelative(-1.38f, -6.2f, -3.9f, -8.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.77f, 15.23f)
                curveToRelative(-1.03f, -0.98f, -1.57f, -2.1f, -1.57f, -3.23f)
                reflectiveCurveToRelative(0.54f, -2.25f, 1.57f, -3.23f)
                curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.05f, -2.12f)
                curveToRelative(-0.57f, -0.6f, -1.52f, -0.62f, -2.12f, -0.05f)
                curveToRelative(-1.62f, 1.54f, -2.51f, 3.46f, -2.51f, 5.41f)
                reflectiveCurveToRelative(0.89f, 3.87f, 2.51f, 5.41f)
                curveToRelative(0.29f, 0.28f, 1.2f, 0.8f, 2.12f, -0.05f)
                curveToRelative(0.61f, -0.56f, 0.55f, -1.55f, -0.05f, -2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.3f, 6.59f)
                curveToRelative(-0.6f, -0.57f, -1.55f, -0.55f, -2.12f, 0.05f)
                curveToRelative(-0.57f, 0.6f, -0.55f, 1.55f, 0.05f, 2.12f)
                curveToRelative(1.03f, 0.98f, 1.57f, 2.1f, 1.57f, 3.23f)
                reflectiveCurveToRelative(-0.54f, 2.25f, -1.57f, 3.23f)
                curveToRelative(-0.6f, 0.57f, -0.66f, 1.56f, -0.05f, 2.12f)
                curveToRelative(0.92f, 0.85f, 1.83f, 0.33f, 2.12f, 0.05f)
                curveToRelative(1.62f, -1.54f, 2.51f, -3.46f, 2.51f, -5.41f)
                reflectiveCurveToRelative(-0.89f, -3.87f, -2.51f, -5.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.55f, 12f)
                arcToRelative(2.45f, 2.44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                arcToRelative(2.45f, 2.44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.9f, 0f)
                close()
            }
        }.also { _SignalStream = it}
