package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Sc.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.56f, 4.56f)
                lineToRelative(-14.35f, 14.4f)
                curveToRelative(1.64f, 0.09f, 3.3f, -0.04f, 4.98f, -0.39f)
                curveToRelative(0.8f, -0.18f, 1.61f, 0.35f, 1.77f, 1.16f)
                curveToRelative(0.17f, 0.81f, -0.35f, 1.61f, -1.16f, 1.77f)
                curveToRelative(-1.55f, 0.33f, -3.1f, 0.49f, -4.63f, 0.49f)
                reflectiveCurveToRelative(-3.05f, -0.16f, -4.54f, -0.49f)
                curveToRelative(-0.57f, -0.12f, -1.02f, -0.57f, -1.14f, -1.14f)
                curveToRelative(-0.65f, -2.97f, -0.65f, -6.06f, -0.0f, -9.17f)
                curveToRelative(0.17f, -0.81f, 0.96f, -1.33f, 1.77f, -1.16f)
                curveToRelative(0.81f, 0.17f, 1.33f, 0.96f, 1.16f, 1.77f)
                curveToRelative(-0.36f, 1.72f, -0.48f, 3.42f, -0.39f, 5.09f)
                lineToRelative(14.4f, -14.45f)
                curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.12f, -0.0f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.53f, 0.0f, 2.12f)
                close()
            }
        }.also { _ArrowDownLeft = it}
