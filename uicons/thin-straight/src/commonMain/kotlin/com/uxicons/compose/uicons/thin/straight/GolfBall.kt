package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Ts.GolfBall: ImageVector
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
                moveTo(16f, 17.06f)
                verticalLineToRelative(0.57f)
                curveToRelative(0f, 0.69f, -0.29f, 1.36f, -0.8f, 1.83f)
                lineToRelative(-2.7f, 2.51f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.03f)
                lineToRelative(-2.7f, -2.51f)
                curveToRelative(-0.51f, -0.47f, -0.8f, -1.14f, -0.8f, -1.83f)
                verticalLineToRelative(-0.57f)
                curveToRelative(-3.06f, -1.51f, -5f, -4.61f, -5f, -8.06f)
                curveTo(3f, 4.04f, 7.04f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 3.45f, -1.94f, 6.54f, -5f, 8.06f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(0.63f)
                curveToRelative(0f, 0.42f, 0.17f, 0.82f, 0.48f, 1.1f)
                lineToRelative(2.52f, 2.34f)
                lineToRelative(2.52f, -2.34f)
                curveToRelative(0.3f, -0.28f, 0.48f, -0.68f, 0.48f, -1.1f)
                verticalLineToRelative(-0.63f)
                close()
                moveTo(20f, 9f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 4.59f, 4f, 9f)
                curveToRelative(0f, 2.95f, 1.59f, 5.6f, 4.13f, 7f)
                horizontalLineToRelative(7.74f)
                curveToRelative(2.54f, -1.4f, 4.13f, -4.05f, 4.13f, -7f)
                close()
            }
        }.also { _GolfBall = it}
