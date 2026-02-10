package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Bs.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256.01f, 0.13f)
                lineTo(10.59f, 404.68f)
                lineToRelative(-0.19f, 0.32f)
                curveToRelative(-19.9f, 33.69f, -8.72f, 77.12f, 24.97f, 97.02f)
                curveToRelative(10.91f, 6.44f, 23.34f, 9.84f, 36.01f, 9.85f)
                horizontalLineToRelative(369.25f)
                curveToRelative(39.12f, -0.01f, 70.83f, -31.73f, 70.82f, -70.85f)
                curveToRelative(-0f, -12.79f, -3.47f, -25.35f, -10.03f, -36.33f)
                lineTo(256.01f, 0.13f)
                close()
                moveTo(446.66f, 444.52f)
                curveToRelative(-1.19f, 2.2f, -3.52f, 3.55f, -6.03f, 3.49f)
                horizontalLineTo(350.14f)
                lineToRelative(-94.13f, -150.05f)
                lineToRelative(-94.15f, 150.05f)
                horizontalLineTo(71.38f)
                curveToRelative(-3.85f, -0.01f, -6.96f, -3.13f, -6.95f, -6.98f)
                curveToRelative(0f, -1.2f, 0.31f, -2.37f, 0.9f, -3.41f)
                lineToRelative(190.67f, -314.25f)
                lineToRelative(190.61f, 314.23f)
                curveTo(447.91f, 439.72f, 447.93f, 442.39f, 446.66f, 444.52f)
                close()
            }
        }.also { _Camping = it}
