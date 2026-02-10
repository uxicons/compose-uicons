package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLeft: ImageVector? = null

val Icons.Rr.UserLeft: ImageVector
    get() = _UserLeft ?: UXIcon(name = "UserLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.0f, 22.92f)
                curveToRelative(0.04f, 0.55f, -0.37f, 1.03f, -0.92f, 1.07f)
                curveToRelative(-0.54f, 0.04f, -1.03f, -0.37f, -1.07f, -0.92f)
                curveToRelative(-0.22f, -2.85f, -2.63f, -5.08f, -5.5f, -5.08f)
                reflectiveCurveToRelative(-5.29f, 2.23f, -5.5f, 5.08f)
                curveToRelative(-0.04f, 0.55f, -0.51f, 0.96f, -1.07f, 0.92f)
                curveToRelative(-0.55f, -0.04f, -0.96f, -0.52f, -0.92f, -1.07f)
                curveToRelative(0.3f, -3.88f, 3.59f, -6.92f, 7.5f, -6.92f)
                reflectiveCurveToRelative(7.2f, 3.04f, 7.5f, 6.92f)
                close()
                moveTo(2f, 8.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                close()
                moveTo(4f, 8.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(23f, 4f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(1.45f, -1.45f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.86f, 2.86f)
                curveToRelative(-0.28f, 0.28f, -0.43f, 0.65f, -0.43f, 1.04f)
                reflectiveCurveToRelative(0.15f, 0.76f, 0.43f, 1.04f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.52f, -1.52f)
                horizontalLineToRelative(4.82f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _UserLeft = it}
