package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Satellite: ImageVector? = null

val Icons.Ss.Satellite: ImageVector
    get() = _Satellite ?: UXIcon(name = "Satellite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.2f, 9.7f)
                lineToRelative(-3.65f, -3.65f)
                lineTo(8.5f, 0.09f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-5.96f, 5.96f)
                close()
                moveTo(14.28f, 17.78f)
                lineToRelative(3.67f, 3.67f)
                lineToRelative(5.96f, -5.96f)
                lineToRelative(-3.67f, -3.67f)
                lineToRelative(-5.96f, 5.96f)
                close()
                moveTo(5.26f, 12.09f)
                curveToRelative(-1.78f, 0f, -3.45f, 0.69f, -4.7f, 1.95f)
                lineToRelative(-0.35f, 0.35f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.35f, -0.35f)
                curveToRelative(1.26f, -1.26f, 1.95f, -2.93f, 1.95f, -4.7f)
                reflectiveCurveToRelative(-0.69f, -3.45f, -1.95f, -4.7f)
                curveToRelative(-1.26f, -1.26f, -2.93f, -1.95f, -4.7f, -1.95f)
                close()
                moveTo(23.27f, 2.43f)
                lineToRelative(-1.73f, -1.73f)
                curveToRelative(-0.95f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-9.88f, 9.88f)
                curveToRelative(1.21f, 0.42f, 2.31f, 1.11f, 3.25f, 2.04f)
                curveToRelative(0.92f, 0.92f, 1.6f, 2.02f, 2.03f, 3.21f)
                lineToRelative(9.87f, -9.87f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                close()
            }
        }.also { _Satellite = it}
