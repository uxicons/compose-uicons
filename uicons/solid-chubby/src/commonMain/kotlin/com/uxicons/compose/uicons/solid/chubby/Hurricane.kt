package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Sc.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.44f, 6.03f)
                curveToRelative(-1.23f, -1.04f, -2.61f, -1.49f, -3.77f, -1.68f)
                lineToRelative(1.48f, -1.47f)
                curveToRelative(0.27f, -0.27f, 0.36f, -0.67f, 0.24f, -1.02f)
                curveToRelative(-0.12f, -0.36f, -0.43f, -0.62f, -0.81f, -0.67f)
                curveToRelative(-0.34f, -0.05f, -8.48f, -1.14f, -12.7f, 2.53f)
                curveToRelative(-1.64f, 1.42f, -2.47f, 3.35f, -2.47f, 5.72f)
                curveToRelative(0f, 3.81f, 1.04f, 6.64f, 3.09f, 8.41f)
                curveToRelative(1.26f, 1.09f, 2.69f, 1.57f, 3.87f, 1.77f)
                lineToRelative(-1.52f, 1.51f)
                curveToRelative(-0.27f, 0.27f, -0.36f, 0.67f, -0.24f, 1.03f)
                reflectiveCurveToRelative(0.44f, 0.62f, 0.82f, 0.67f)
                curveToRelative(0.13f, 0.02f, 1.31f, 0.17f, 2.96f, 0.17f)
                curveToRelative(2.85f, 0f, 7.1f, -0.44f, 9.76f, -2.77f)
                curveToRelative(1.61f, -1.42f, 2.43f, -3.31f, 2.43f, -5.64f)
                curveToRelative(0f, -3.92f, -1.06f, -6.8f, -3.14f, -8.55f)
                close()
                moveTo(12f, 15.17f)
                curveToRelative(-2.1f, 0f, -3.17f, -1.07f, -3.17f, -3.17f)
                reflectiveCurveToRelative(1.07f, -3.17f, 3.17f, -3.17f)
                reflectiveCurveToRelative(3.17f, 1.07f, 3.17f, 3.17f)
                reflectiveCurveToRelative(-1.07f, 3.17f, -3.17f, 3.17f)
                close()
            }
        }.also { _Hurricane = it}
