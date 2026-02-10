package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Bs.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.13f, 17.01f)
                curveToRelative(3.84f, -3.9f, 3.82f, -10.2f, -0.06f, -14.08f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                curveToRelative(-2.64f, 0f, -5.13f, 1.02f, -7.01f, 2.87f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.83f, -4.83f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.87f, 0f, 3.63f, 0.73f, 4.95f, 2.05f)
                curveToRelative(2.71f, 2.71f, 2.73f, 7.12f, 0.06f, 9.84f)
                lineTo(7.11f, 4.99f)
                curveToRelative(1.31f, -1.28f, 3.05f, -1.99f, 4.89f, -1.99f)
                close()
                moveTo(13.44f, 18.39f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.56f, 3.48f)
                lineToRelative(-7.06f, -6.9f)
                curveToRelative(-2.65f, -2.65f, -3.54f, -6.38f, -2.58f, -9.78f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(-0.01f, 1.81f, 0.66f, 3.61f, 2.04f, 4.99f)
                lineToRelative(4.95f, 4.84f)
                lineToRelative(1.44f, -1.41f)
                close()
            }
        }.also { _MapMarkerSlash = it}
