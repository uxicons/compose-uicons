package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkSlash: ImageVector? = null

val Icons.Ss.LinkSlash: ImageVector
    get() = _LinkSlash ?: UXIcon(name = "LinkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.06f, 11.96f)
                lineToRelative(2.81f, -2.81f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(-2.81f, 2.81f)
                curveToRelative(-0.95f, 0.95f, -1.48f, 2.22f, -1.48f, 3.56f)
                curveToRelative(0f, 1.35f, 0.52f, 2.61f, 1.48f, 3.56f)
                curveToRelative(0.95f, 0.96f, 2.22f, 1.49f, 3.57f, 1.49f)
                horizontalLineToRelative(0.03f)
                curveToRelative(1.33f, 0f, 2.59f, -0.52f, 3.53f, -1.46f)
                lineToRelative(2.82f, -2.83f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-2.82f, 2.83f)
                curveToRelative(-1.32f, 1.32f, -3.07f, 2.04f, -4.94f, 2.04f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-1.88f, -0.01f, -3.64f, -0.75f, -4.97f, -2.08f)
                curveTo(0.73f, 20.59f, 0f, 18.82f, 0f, 16.94f)
                curveToRelative(0f, -1.88f, 0.73f, -3.65f, 2.06f, -4.98f)
                close()
                moveTo(10.56f, 14.85f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(1.46f, 0.04f)
                lineTo(7.73f, 6.31f)
                lineTo(11.98f, 2.06f)
                curveTo(13.31f, 0.73f, 15.08f, 0f, 16.96f, 0f)
                reflectiveCurveToRelative(3.65f, 0.73f, 4.98f, 2.06f)
                curveToRelative(1.33f, 1.33f, 2.06f, 3.1f, 2.06f, 4.98f)
                reflectiveCurveToRelative(-0.73f, 3.65f, -2.06f, 4.98f)
                lineToRelative(-4.25f, 4.26f)
                lineToRelative(6.27f, 6.27f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                close()
                moveTo(20.52f, 10.6f)
                curveToRelative(0.95f, -0.95f, 1.48f, -2.22f, 1.48f, -3.56f)
                reflectiveCurveToRelative(-0.52f, -2.61f, -1.48f, -3.56f)
                reflectiveCurveToRelative(-2.22f, -1.48f, -3.56f, -1.48f)
                reflectiveCurveToRelative(-2.61f, 0.52f, -3.56f, 1.48f)
                lineToRelative(-4.25f, 4.25f)
                lineToRelative(2.86f, 2.86f)
                lineToRelative(2.86f, -2.86f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(2.86f, 2.86f)
                lineToRelative(4.25f, -4.25f)
                close()
            }
        }.also { _LinkSlash = it}
