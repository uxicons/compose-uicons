package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TeamCheckAlt: ImageVector? = null

val Icons.Bs.TeamCheckAlt: ImageVector
    get() = _TeamCheckAlt ?: UXIcon(name = "TeamCheckAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(15f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(7f, 11f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(7.03f, 7f)
                horizontalLineToRelative(-3.53f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.25f, -1.23f, 0.96f, -2.28f, 1.93f, -3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.36f, 16.74f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(3.61f, -3.7f)
                close()
                moveTo(12.97f, 7f)
                curveToRelative(0.97f, 0.72f, 1.68f, 1.77f, 1.93f, 3f)
                horizontalLineToRelative(3.1f)
                curveToRelative(0.68f, 0f, 1.34f, 0.09f, 1.97f, 0.26f)
                curveToRelative(-0.13f, -1.81f, -1.63f, -3.25f, -3.47f, -3.25f)
                horizontalLineToRelative(-3.53f)
                close()
                moveTo(4f, 18.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0f, -1.06f, 0.21f, -2.07f, 0.59f, -3f)
                horizontalLineToRelative(-3.09f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
        }.also { _TeamCheckAlt = it}
