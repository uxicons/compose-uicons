package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Sc.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 10f)
                curveToRelative(0f, -6.22f, -2.77f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.77f, -9f, 9f)
                curveToRelative(0f, 5.89f, 2.91f, 10.04f, 7.38f, 10.85f)
                curveToRelative(-0.41f, 0.25f, -0.66f, 0.63f, -0.79f, 1.19f)
                curveToRelative(-0.11f, 0.49f, 0.26f, 0.97f, 0.77f, 0.97f)
                horizontalLineToRelative(3.27f)
                curveToRelative(0.51f, 0f, 0.88f, -0.47f, 0.77f, -0.97f)
                curveToRelative(-0.12f, -0.55f, -0.38f, -0.94f, -0.79f, -1.19f)
                curveToRelative(4.47f, -0.8f, 7.38f, -4.95f, 7.38f, -10.85f)
                close()
                moveTo(15.89f, 14.46f)
                curveToRelative(-0.26f, 0.49f, -0.87f, 0.68f, -1.35f, 0.42f)
                curveToRelative(-0.49f, -0.26f, -0.68f, -0.86f, -0.42f, -1.35f)
                curveToRelative(0.73f, -1.4f, 0.89f, -3.17f, 0.89f, -3.54f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.6f, -0.2f, 2.72f, -1.11f, 4.46f)
                close()
            }
        }.also { _Balloon = it}
