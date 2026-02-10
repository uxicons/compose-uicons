package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceTissue: ImageVector? = null

val Icons.Ss.FaceTissue: ImageVector
    get() = _FaceTissue ?: UXIcon(name = "FaceTissue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                curveToRelative(0f, 0.66f, 0.07f, 1.3f, 0.17f, 1.93f)
                lineToRelative(12.13f, -2.23f)
                lineToRelative(-0.65f, 3.55f)
                lineToRelative(0.35f, 0.35f)
                lineToRelative(2.02f, -2.02f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.07f, 3.07f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-2.02f, 2.0f)
                lineToRelative(-0.79f, -0.78f)
                lineToRelative(-1.13f, 6.2f)
                curveToRelative(0.63f, 0.1f, 1.26f, 0.17f, 1.92f, 0.17f)
                curveToRelative(6.63f, 0f, 12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                close()
                moveTo(7.62f, 11.78f)
                lineToRelative(-1.25f, -1.56f)
                lineToRelative(1.52f, -1.22f)
                lineToRelative(-1.52f, -1.22f)
                lineToRelative(1.25f, -1.56f)
                lineToRelative(3.48f, 2.78f)
                lineToRelative(-3.48f, 2.78f)
                close()
                moveTo(17.62f, 10.22f)
                lineToRelative(-1.25f, 1.56f)
                lineToRelative(-3.48f, -2.78f)
                lineToRelative(3.48f, -2.78f)
                lineToRelative(1.25f, 1.56f)
                lineToRelative(-1.52f, 1.22f)
                lineToRelative(1.52f, 1.22f)
                close()
                moveTo(8.03f, 23.94f)
                lineToRelative(-2.73f, -2.19f)
                lineToRelative(-4.36f, 1.31f)
                lineToRelative(1.35f, -4.36f)
                lineTo(0.1f, 15.97f)
                lineToRelative(9.71f, -1.78f)
                lineToRelative(-1.78f, 9.75f)
                close()
            }
        }.also { _FaceTissue = it}
