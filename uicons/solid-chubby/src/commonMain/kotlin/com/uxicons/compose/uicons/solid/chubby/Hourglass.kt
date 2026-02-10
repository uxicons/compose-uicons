package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Sc.Hourglass: ImageVector
    get() = _Hourglass ?: UXIcon(name = "Hourglass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.19f, 12f)
                curveToRelative(1.52f, -1.26f, 3.15f, -3.34f, 3.99f, -6.73f)
                curveToRelative(0.05f, -0.21f, 0.04f, -0.43f, -0.05f, -0.63f)
                curveToRelative(-0.06f, -0.15f, -1.6f, -3.64f, -8.13f, -3.64f)
                reflectiveCurveTo(3.94f, 4.49f, 3.87f, 4.64f)
                curveToRelative(-0.08f, 0.2f, -0.1f, 0.42f, -0.05f, 0.63f)
                curveToRelative(0.84f, 3.39f, 2.47f, 5.47f, 3.99f, 6.73f)
                curveToRelative(-1.52f, 1.26f, -3.15f, 3.34f, -3.99f, 6.73f)
                curveToRelative(-0.05f, 0.21f, -0.04f, 0.43f, 0.05f, 0.63f)
                curveToRelative(0.06f, 0.15f, 1.6f, 3.64f, 8.13f, 3.64f)
                reflectiveCurveToRelative(8.06f, -3.49f, 8.13f, -3.64f)
                curveToRelative(0.08f, -0.2f, 0.1f, -0.42f, 0.05f, -0.63f)
                curveToRelative(-0.84f, -3.39f, -2.47f, -5.47f, -3.99f, -6.73f)
                close()
            }
        }.also { _Hourglass = it}
