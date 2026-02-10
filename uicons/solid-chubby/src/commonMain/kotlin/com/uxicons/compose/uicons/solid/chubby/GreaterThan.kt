package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Sc.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 23f)
                curveToRelative(-0.77f, 0f, -1.43f, -0.59f, -1.49f, -1.37f)
                curveToRelative(-0.07f, -0.82f, 0.54f, -1.55f, 1.36f, -1.62f)
                curveToRelative(7.98f, -0.69f, 14.47f, -5.79f, 16.95f, -8.01f)
                curveToRelative(-2.48f, -2.22f, -8.97f, -7.31f, -16.95f, -8.01f)
                curveToRelative(-0.82f, -0.07f, -1.44f, -0.8f, -1.36f, -1.62f)
                reflectiveCurveToRelative(0.8f, -1.44f, 1.62f, -1.36f)
                curveToRelative(11.36f, 0.99f, 19.61f, 9.6f, 19.96f, 9.96f)
                curveToRelative(0.55f, 0.58f, 0.55f, 1.48f, 0f, 2.06f)
                curveToRelative(-0.28f, 0.34f, -8.82f, 9.12f, -20.09f, 9.97f)
                close()
            }
        }.also { _GreaterThan = it}
