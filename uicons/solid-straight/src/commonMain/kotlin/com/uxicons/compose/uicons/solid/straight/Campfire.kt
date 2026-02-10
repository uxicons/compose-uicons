package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Campfire: ImageVector? = null

val Icons.Ss.Campfire: ImageVector
    get() = _Campfire ?: UXIcon(name = "Campfire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.07f, 19.01f)
                lineToRelative(8.84f, 3.05f)
                lineToRelative(-0.65f, 1.89f)
                lineToRelative(-11.25f, -3.88f)
                lineTo(0.75f, 23.95f)
                lineToRelative(-0.65f, -1.89f)
                lineToRelative(8.84f, -3.05f)
                lineTo(0.1f, 15.96f)
                lineToRelative(0.65f, -1.89f)
                lineToRelative(11.25f, 3.88f)
                lineToRelative(11.25f, -3.88f)
                lineToRelative(0.65f, 1.89f)
                lineToRelative(-8.84f, 3.05f)
                close()
                moveTo(5f, 9f)
                curveToRelative(0f, -2.01f, 1.17f, -3.57f, 2.33f, -4.77f)
                curveToRelative(0f, 0f, 0.77f, 2.69f, 1.48f, 2.69f)
                curveToRelative(2.0f, 0f, 1.07f, -4.47f, 3.19f, -6.92f)
                curveToRelative(2.21f, 2.21f, 7f, 4.95f, 7f, 9f)
                curveToRelative(0f, 3.87f, -3.13f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.13f, -7f, -7f)
                close()
                moveTo(10.59f, 13.41f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _Campfire = it}
