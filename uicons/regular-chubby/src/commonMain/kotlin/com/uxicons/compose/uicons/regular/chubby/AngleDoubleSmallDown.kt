package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Rc.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.8f, 11.46f)
                curveToRelative(-0.5f, -0.22f, -1.09f, 0f, -1.32f, 0.51f)
                curveToRelative(-0.62f, 1.4f, -1.83f, 2.33f, -2.48f, 2.76f)
                curveToRelative(-0.66f, -0.43f, -1.86f, -1.37f, -2.48f, -2.76f)
                curveToRelative(-0.23f, -0.5f, -0.82f, -0.73f, -1.32f, -0.51f)
                curveToRelative(-0.5f, 0.23f, -0.73f, 0.82f, -0.51f, 1.32f)
                curveToRelative(1.18f, 2.63f, 3.75f, 3.95f, 3.86f, 4.0f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.11f, 0.45f, 0.11f)
                reflectiveCurveToRelative(0.31f, -0.04f, 0.45f, -0.11f)
                curveToRelative(0.11f, -0.06f, 2.68f, -1.37f, 3.86f, -4.0f)
                curveToRelative(0.23f, -0.5f, 0f, -1.1f, -0.51f, -1.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.45f, 12.46f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.17f, 0.55f, 0.17f)
                reflectiveCurveToRelative(0.38f, -0.06f, 0.55f, -0.17f)
                curveToRelative(0.08f, -0.06f, 2.06f, -1.37f, 3.21f, -3.95f)
                curveToRelative(0.23f, -0.5f, 0f, -1.1f, -0.51f, -1.32f)
                curveToRelative(-0.51f, -0.22f, -1.09f, 0f, -1.32f, 0.51f)
                curveToRelative(-0.56f, 1.26f, -1.39f, 2.15f, -1.93f, 2.65f)
                curveToRelative(-0.54f, -0.49f, -1.37f, -1.38f, -1.93f, -2.65f)
                curveToRelative(-0.23f, -0.5f, -0.82f, -0.73f, -1.32f, -0.51f)
                curveToRelative(-0.5f, 0.23f, -0.73f, 0.82f, -0.51f, 1.32f)
                curveToRelative(1.15f, 2.58f, 3.12f, 3.89f, 3.21f, 3.95f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
