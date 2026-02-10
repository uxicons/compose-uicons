package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headphones: ImageVector? = null

val Icons.Sc.Headphones: ImageVector
    get() = _Headphones ?: UXIcon(name = "Headphones") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.23f, 12.73f)
                curveToRelative(-0.03f, -7.65f, -2.96f, -11.21f, -9.22f, -11.21f)
                reflectiveCurveTo(2.8f, 5.09f, 2.77f, 12.76f)
                curveToRelative(-1.01f, 0.79f, -1.77f, 2.09f, -1.77f, 4.26f)
                curveToRelative(0f, 4.89f, 3.64f, 5.46f, 6.38f, 5.46f)
                curveToRelative(0.43f, 0f, 0.81f, -0.28f, 0.95f, -0.69f)
                curveToRelative(1.02f, -3.08f, 1.02f, -6.46f, 0f, -9.54f)
                curveToRelative(-0.14f, -0.41f, -0.52f, -0.69f, -0.95f, -0.69f)
                curveToRelative(-0.38f, 0f, -0.94f, 0f, -1.57f, 0.07f)
                curveToRelative(0.31f, -6.56f, 3.22f, -7.13f, 6.2f, -7.13f)
                reflectiveCurveToRelative(5.89f, 0.57f, 6.2f, 7.14f)
                curveToRelative(-0.54f, -0.06f, -1.07f, -0.08f, -1.57f, -0.08f)
                curveToRelative(-0.43f, 0f, -0.81f, 0.28f, -0.95f, 0.69f)
                curveToRelative(-1.02f, 3.08f, -1.02f, 6.46f, 0f, 9.54f)
                curveToRelative(0.14f, 0.41f, 0.52f, 0.69f, 0.95f, 0.69f)
                curveToRelative(1.58f, 0f, 6.38f, 0f, 6.38f, -5.46f)
                curveToRelative(0f, -2.19f, -0.73f, -3.51f, -1.77f, -4.3f)
                close()
            }
        }.also { _Headphones = it}
