package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CruzeiroSign: ImageVector? = null

val Icons.Rc.CruzeiroSign: ImageVector
    get() = _CruzeiroSign ?: UXIcon(name = "CruzeiroSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.28f, 16.83f)
                curveToRelative(-1.23f, 3.53f, -4.19f, 5.17f, -9.32f, 5.17f)
                curveToRelative(-7.01f, 0f, -10f, -2.99f, -10f, -10f)
                reflectiveCurveToRelative(2.99f, -10f, 10f, -10f)
                curveToRelative(5.12f, 0f, 8.09f, 1.64f, 9.32f, 5.17f)
                curveToRelative(0.18f, 0.52f, -0.09f, 1.09f, -0.61f, 1.27f)
                curveToRelative(-0.52f, 0.18f, -1.09f, -0.09f, -1.27f, -0.61f)
                curveToRelative(-0.94f, -2.69f, -3.16f, -3.83f, -7.43f, -3.83f)
                curveToRelative(-5.91f, 0f, -8f, 2.09f, -8f, 8f)
                curveToRelative(0f, 4.89f, 1.45f, 7.17f, 5.3f, 7.8f)
                curveToRelative(-0.13f, -0.92f, -0.27f, -2.23f, -0.27f, -3.8f)
                curveToRelative(0f, -3.09f, 0.51f, -5.16f, 0.53f, -5.24f)
                curveToRelative(0.13f, -0.53f, 0.68f, -0.86f, 1.21f, -0.73f)
                curveToRelative(0.43f, 0.11f, 0.71f, 0.48f, 0.74f, 0.91f)
                curveToRelative(1.43f, -0.8f, 3.13f, -0.94f, 4.52f, -0.94f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-3.45f, 0f, -4.45f, 1.12f, -4.94f, 2.25f)
                curveToRelative(-0.04f, 0.53f, -0.06f, 1.11f, -0.06f, 1.75f)
                curveToRelative(0f, 1.78f, 0.18f, 3.17f, 0.32f, 3.98f)
                curveToRelative(0.21f, 0.01f, 0.42f, 0.01f, 0.65f, 0.01f)
                curveToRelative(4.27f, 0f, 6.49f, -1.15f, 7.43f, -3.83f)
                curveToRelative(0.18f, -0.52f, 0.75f, -0.8f, 1.27f, -0.61f)
                curveToRelative(0.52f, 0.18f, 0.8f, 0.75f, 0.61f, 1.27f)
                close()
            }
        }.also { _CruzeiroSign = it}
