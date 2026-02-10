package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Tr.GolfBall: ImageVector
    get() = _GolfBall ?: UXIcon(name = "GolfBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(13f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(15f, 8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(17f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(16.0f, 17.08f)
                curveToRelative(-0.04f, 1.31f, -0.58f, 2.54f, -1.51f, 3.48f)
                lineToRelative(-1.99f, 1.99f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.96f)
                lineToRelative(-1.99f, -1.99f)
                curveToRelative(-0.93f, -0.93f, -1.47f, -2.16f, -1.51f, -3.48f)
                curveToRelative(-3.05f, -1.51f, -5.0f, -4.64f, -5.0f, -8.06f)
                curveTo(3f, 4.06f, 7.04f, 0.02f, 12f, 0.02f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 3.42f, -1.95f, 6.54f, -5.0f, 8.06f)
                close()
                moveTo(15.0f, 17f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.03f, 1.08f, 0.46f, 2.08f, 1.22f, 2.85f)
                lineToRelative(1.78f, 1.78f)
                lineToRelative(1.78f, -1.78f)
                curveToRelative(0.76f, -0.76f, 1.19f, -1.77f, 1.22f, -2.85f)
                close()
                moveTo(20f, 9.02f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 4.61f, 4f, 9.02f)
                curveToRelative(0f, 2.9f, 1.59f, 5.58f, 4.1f, 6.98f)
                horizontalLineToRelative(7.8f)
                curveToRelative(2.51f, -1.41f, 4.1f, -4.08f, 4.1f, -6.98f)
                close()
            }
        }.also { _GolfBall = it}
