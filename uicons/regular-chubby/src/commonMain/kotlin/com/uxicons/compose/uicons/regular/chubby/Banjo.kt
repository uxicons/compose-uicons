package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Rc.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.95f, 17.68f)
                curveToRelative(0.17f, 0.52f, -0.11f, 1.09f, -0.63f, 1.26f)
                curveToRelative(-0.51f, 0.17f, -1.09f, -0.1f, -1.26f, -0.63f)
                curveToRelative(0f, 0f, -0.26f, -0.73f, -0.95f, -1.42f)
                reflectiveCurveToRelative(-1.42f, -0.95f, -1.42f, -0.95f)
                curveToRelative(-0.52f, -0.18f, -0.8f, -0.75f, -0.62f, -1.27f)
                reflectiveCurveToRelative(0.74f, -0.8f, 1.26f, -0.63f)
                curveToRelative(0.12f, 0.04f, 1.18f, 0.41f, 2.2f, 1.43f)
                curveToRelative(1.02f, 1.02f, 1.4f, 2.08f, 1.43f, 2.2f)
                close()
                moveTo(22.8f, 4.6f)
                curveToRelative(-0.07f, 0.09f, -1.66f, 2.13f, -4.34f, 2.36f)
                lineToRelative(-3.63f, 3.63f)
                curveToRelative(0.79f, 1.19f, 1.18f, 2.81f, 1.18f, 4.91f)
                curveToRelative(0f, 5.19f, -2.31f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -2.31f, -7.5f, -7.5f)
                reflectiveCurveToRelative(2.31f, -7.5f, 7.5f, -7.5f)
                curveToRelative(2.1f, 0f, 3.71f, 0.39f, 4.91f, 1.18f)
                lineToRelative(3.63f, -3.63f)
                curveToRelative(0.22f, -2.68f, 2.26f, -4.27f, 2.36f, -4.34f)
                curveToRelative(0.26f, -0.2f, 0.6f, -0.26f, 0.92f, -0.15f)
                curveToRelative(0.09f, 0.03f, 0.86f, 0.3f, 1.6f, 1.04f)
                reflectiveCurveToRelative(1.01f, 1.51f, 1.04f, 1.6f)
                curveToRelative(0.1f, 0.31f, 0.05f, 0.65f, -0.15f, 0.92f)
                close()
                moveTo(14f, 15.5f)
                curveToRelative(0f, -4.11f, -1.39f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 1.39f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.39f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.39f, 5.5f, -5.5f)
                close()
            }
        }.also { _Banjo = it}
