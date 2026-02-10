package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkSlash: ImageVector? = null

val Icons.Rs.LinkSlash: ImageVector
    get() = _LinkSlash ?: UXIcon(name = "LinkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.69f, 16.27f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(4.25f, -4.25f)
                curveToRelative(0.95f, -0.95f, 1.48f, -2.22f, 1.48f, -3.56f)
                reflectiveCurveToRelative(-0.52f, -2.61f, -1.48f, -3.56f)
                reflectiveCurveToRelative(-2.22f, -1.48f, -3.56f, -1.48f)
                reflectiveCurveToRelative(-2.61f, 0.52f, -3.56f, 1.48f)
                lineToRelative(-4.25f, 4.25f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(11.98f, 2.06f)
                curveTo(13.31f, 0.73f, 15.08f, 0f, 16.96f, 0f)
                reflectiveCurveToRelative(3.65f, 0.73f, 4.98f, 2.06f)
                curveToRelative(1.33f, 1.33f, 2.06f, 3.1f, 2.06f, 4.98f)
                reflectiveCurveToRelative(-0.73f, 3.65f, -2.06f, 4.98f)
                lineToRelative(-4.25f, 4.25f)
                close()
                moveTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 12.0f)
                lineToRelative(2.86f, -2.86f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.86f, 2.86f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                close()
                moveTo(0f, 16.94f)
                curveToRelative(0f, 1.88f, 0.73f, 3.65f, 2.06f, 4.98f)
                curveToRelative(1.33f, 1.33f, 3.1f, 2.07f, 4.97f, 2.08f)
                curveToRelative(1.87f, 0f, 3.66f, -0.73f, 4.98f, -2.04f)
                lineToRelative(2.82f, -2.83f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(-2.82f, 2.83f)
                curveToRelative(-0.94f, 0.94f, -2.27f, 1.46f, -3.6f, 1.46f)
                curveToRelative(-1.35f, -0.01f, -2.57f, -0.54f, -3.52f, -1.49f)
                curveToRelative(-0.95f, -0.95f, -1.48f, -2.22f, -1.48f, -3.56f)
                curveToRelative(0f, -1.35f, 0.52f, -2.61f, 1.48f, -3.56f)
                lineToRelative(2.81f, -2.81f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(-2.81f, 2.81f)
                curveTo(0.73f, 13.29f, 0f, 15.06f, 0f, 16.94f)
                close()
                moveTo(10.56f, 14.86f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.42f, -1.42f)
                close()
            }
        }.also { _LinkSlash = it}
