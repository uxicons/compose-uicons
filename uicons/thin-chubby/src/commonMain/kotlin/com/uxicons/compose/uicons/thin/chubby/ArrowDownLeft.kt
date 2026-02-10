package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownLeft: ImageVector? = null

val Icons.Tc.ArrowDownLeft: ImageVector
    get() = _ArrowDownLeft ?: UXIcon(name = "ArrowDownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.85f, 2.85f)
                lineToRelative(-17.77f, 17.83f)
                curveToRelative(2.69f, 0.47f, 5.46f, 0.41f, 8.27f, -0.18f)
                curveToRelative(0.27f, -0.06f, 0.54f, 0.12f, 0.59f, 0.39f)
                curveToRelative(0.06f, 0.27f, -0.12f, 0.54f, -0.39f, 0.59f)
                curveToRelative(-1.64f, 0.34f, -3.27f, 0.52f, -4.88f, 0.52f)
                reflectiveCurveToRelative(-3.2f, -0.17f, -4.76f, -0.52f)
                curveToRelative(-0.19f, -0.04f, -0.34f, -0.19f, -0.38f, -0.38f)
                curveToRelative(-0.69f, -3.14f, -0.69f, -6.4f, 0f, -9.7f)
                curveToRelative(0.06f, -0.27f, 0.32f, -0.45f, 0.59f, -0.39f)
                curveToRelative(0.27f, 0.06f, 0.44f, 0.32f, 0.39f, 0.59f)
                curveToRelative(-0.59f, 2.85f, -0.64f, 5.68f, -0.17f, 8.41f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f)
                lineToRelative(17.78f, -17.84f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                close()
            }
        }.also { _ArrowDownLeft = it}
