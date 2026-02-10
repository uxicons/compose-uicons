package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowmanHead: ImageVector? = null

val Icons.Ts.SnowmanHead: ImageVector
    get() = _SnowmanHead ?: UXIcon(name = "SnowmanHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                lineTo(2f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.52f)
                curveToRelative(-0.98f, 1.47f, -1.52f, 3.22f, -1.52f, 5f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.78f, -0.53f, -3.53f, -1.52f, -5f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                lineTo(6f, 9f)
                lineTo(6f, 2.5f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -1.84f, 0.61f, -3.57f, 1.75f, -5f)
                horizontalLineToRelative(12.49f)
                curveToRelative(1.15f, 1.43f, 1.75f, 3.16f, 1.75f, 5f)
                close()
                moveTo(7f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 21.52f)
                lineToRelative(0.44f, -0.78f)
                curveToRelative(0.26f, -0.47f, 1.56f, -2.83f, 1.56f, -3.75f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.91f, 1.3f, 3.28f, 1.56f, 3.75f)
                lineToRelative(0.44f, 0.78f)
                close()
                moveTo(12f, 16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.34f, -0.46f, 1.41f, -1f, 2.44f)
                curveToRelative(-0.54f, -1.04f, -1f, -2.1f, -1f, -2.44f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _SnowmanHead = it}
