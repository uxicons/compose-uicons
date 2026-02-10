package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Rc.Hourglass: ImageVector
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
                moveTo(12f, 21f)
                curveToRelative(-4.17f, 0f, -5.69f, -1.56f, -6.13f, -2.17f)
                curveToRelative(0.94f, -3.4f, 2.78f, -5.12f, 4.18f, -5.97f)
                curveToRelative(0.3f, -0.18f, 0.48f, -0.51f, 0.48f, -0.85f)
                reflectiveCurveToRelative(-0.18f, -0.67f, -0.48f, -0.85f)
                curveToRelative(-1.4f, -0.85f, -3.24f, -2.57f, -4.18f, -5.97f)
                curveToRelative(0.45f, -0.63f, 1.98f, -2.17f, 6.13f, -2.17f)
                reflectiveCurveToRelative(5.69f, 1.56f, 6.13f, 2.17f)
                curveToRelative(-0.94f, 3.4f, -2.78f, 5.12f, -4.18f, 5.97f)
                curveToRelative(-0.3f, 0.18f, -0.48f, 0.51f, -0.48f, 0.85f)
                reflectiveCurveToRelative(0.18f, 0.67f, 0.48f, 0.85f)
                curveToRelative(1.4f, 0.85f, 3.24f, 2.57f, 4.18f, 5.97f)
                curveToRelative(-0.45f, 0.63f, -1.98f, 2.17f, -6.13f, 2.17f)
                close()
            }
        }.also { _Hourglass = it}
