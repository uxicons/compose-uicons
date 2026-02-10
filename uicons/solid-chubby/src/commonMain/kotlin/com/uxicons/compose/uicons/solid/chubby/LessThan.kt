package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Sc.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 23f)
                curveToRelative(-11.28f, -0.86f, -19.8f, -9.62f, -20.09f, -9.97f)
                curveToRelative(-0.55f, -0.58f, -0.55f, -1.48f, 0f, -2.06f)
                curveToRelative(0.35f, -0.37f, 8.6f, -8.98f, 19.96f, -9.96f)
                curveToRelative(0.81f, -0.07f, 1.55f, 0.54f, 1.62f, 1.36f)
                curveToRelative(0.07f, 0.82f, -0.54f, 1.55f, -1.36f, 1.62f)
                curveToRelative(-7.98f, 0.69f, -14.47f, 5.79f, -16.95f, 8.01f)
                curveToRelative(2.48f, 2.22f, 8.97f, 7.31f, 16.95f, 8.01f)
                curveToRelative(0.82f, 0.07f, 1.44f, 0.8f, 1.36f, 1.62f)
                curveToRelative(-0.07f, 0.78f, -0.72f, 1.37f, -1.49f, 1.37f)
                close()
            }
        }.also { _LessThan = it}
