package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stop: ImageVector? = null

val Icons.Rc.Stop: ImageVector
    get() = _Stop ?: UXIcon(name = "Stop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 2.86f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveTo(3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                close()
                moveTo(20.04f, 20.02f)
                curveToRelative(-1.24f, 0.3f, -4.46f, 0.97f, -8.04f, 0.97f)
                reflectiveCurveToRelative(-6.8f, -0.68f, -8.04f, -0.98f)
                curveToRelative(-0.3f, -1.18f, -0.96f, -4.23f, -0.96f, -8.02f)
                curveToRelative(0f, -3.75f, 0.67f, -6.83f, 0.96f, -8.02f)
                curveToRelative(1.25f, -0.3f, 4.47f, -0.98f, 8.04f, -0.98f)
                reflectiveCurveToRelative(6.8f, 0.68f, 8.04f, 0.98f)
                curveToRelative(0.3f, 1.19f, 0.96f, 4.23f, 0.96f, 8.02f)
                curveToRelative(0f, 3.75f, -0.67f, 6.83f, -0.96f, 8.03f)
                close()
            }
        }.also { _Stop = it}
