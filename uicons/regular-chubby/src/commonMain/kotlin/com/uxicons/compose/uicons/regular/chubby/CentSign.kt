package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Rc.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.77f, 15.06f)
                curveToRelative(-0.52f, -0.18f, -1.09f, 0.09f, -1.27f, 0.61f)
                curveToRelative(-0.81f, 2.33f, -2.76f, 3.33f, -6.5f, 3.33f)
                curveToRelative(-5.17f, 0f, -7f, -1.83f, -7f, -7f)
                reflectiveCurveToRelative(1.83f, -7f, 7f, -7f)
                curveToRelative(3.74f, 0f, 5.68f, 1.0f, 6.5f, 3.33f)
                curveToRelative(0.18f, 0.52f, 0.75f, 0.8f, 1.27f, 0.61f)
                curveToRelative(0.52f, -0.18f, 0.8f, -0.75f, 0.61f, -1.27f)
                curveToRelative(-1.33f, -3.81f, -4.79f, -4.55f, -7.58f, -4.65f)
                curveToRelative(0.1f, -0.5f, 0.17f, -0.77f, 0.17f, -0.77f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.19f, -1.21f, 0.73f)
                curveToRelative(-0.01f, 0.02f, -0.12f, 0.48f, -0.27f, 1.29f)
                curveToRelative(-5.36f, 0.36f, -7.76f, 3.16f, -7.76f, 8.96f)
                reflectiveCurveToRelative(2.41f, 8.6f, 7.76f, 8.96f)
                curveToRelative(0.15f, 0.81f, 0.26f, 1.26f, 0.27f, 1.29f)
                curveToRelative(0.13f, 0.54f, 0.69f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.54f, -0.13f, 0.86f, -0.68f, 0.73f, -1.21f)
                curveToRelative(0f, -0.0f, -0.07f, -0.28f, -0.17f, -0.77f)
                curveToRelative(2.8f, -0.1f, 6.25f, -0.84f, 7.58f, -4.65f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.27f)
                close()
            }
        }.also { _CentSign = it}
