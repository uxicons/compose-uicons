package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendUp: ImageVector? = null

val Icons.Tc.ArrowTrendUp: ImageVector
    get() = _ArrowTrendUp ?: UXIcon(name = "ArrowTrendUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.04f, 6.18f)
                curveToRelative(-0.03f, -0.05f, -0.07f, -0.09f, -0.12f, -0.13f)
                curveToRelative(-0.14f, -0.1f, -3.47f, -2.52f, -8.63f, 0.32f)
                curveToRelative(-0.24f, 0.13f, -0.33f, 0.44f, -0.2f, 0.68f)
                curveToRelative(0.13f, 0.24f, 0.44f, 0.33f, 0.68f, 0.2f)
                curveToRelative(3.56f, -1.96f, 6.09f, -1.16f, 7.08f, -0.67f)
                lineToRelative(-7.18f, 7.08f)
                curveToRelative(-0.5f, 0.5f, -1.14f, 0.76f, -1.82f, 0.73f)
                curveToRelative(-0.68f, -0.03f, -1.3f, -0.34f, -1.77f, -0.89f)
                curveToRelative(-0.64f, -0.76f, -1.53f, -1.2f, -2.49f, -1.24f)
                curveToRelative(-0.94f, -0.04f, -1.87f, 0.32f, -2.6f, 1.06f)
                lineToRelative(-3.89f, 4.86f)
                curveToRelative(-0.17f, 0.22f, -0.15f, 0.54f, 0.08f, 0.7f)
                curveToRelative(0.31f, 0.23f, 0.6f, 0.04f, 0.7f, -0.08f)
                lineToRelative(3.85f, -4.82f)
                curveToRelative(0.5f, -0.5f, 1.15f, -0.76f, 1.82f, -0.73f)
                curveToRelative(0.68f, 0.03f, 1.3f, 0.34f, 1.77f, 0.89f)
                curveToRelative(0.64f, 0.76f, 1.53f, 1.2f, 2.48f, 1.24f)
                curveToRelative(0.97f, 0.04f, 1.87f, -0.32f, 2.57f, -1.02f)
                lineToRelative(7.12f, -7.03f)
                curveToRelative(0.46f, 1.16f, 1.11f, 3.85f, -0.67f, 7.6f)
                curveToRelative(-0.12f, 0.25f, -0.02f, 0.56f, 0.24f, 0.67f)
                curveToRelative(0.34f, 0.14f, 0.58f, -0.06f, 0.67f, -0.24f)
                curveToRelative(2.62f, -5.5f, 0.4f, -9.05f, 0.3f, -9.2f)
                close()
            }
        }.also { _ArrowTrendUp = it}
