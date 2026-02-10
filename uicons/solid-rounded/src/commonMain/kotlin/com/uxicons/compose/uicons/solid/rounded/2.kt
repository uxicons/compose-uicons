package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sr2: ImageVector? = null

val Icons.Sr.Sr2: ImageVector
    get() = _Sr2 ?: UXIcon(name = "Sr2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.92f, 0f, -1.76f, -0.5f, -2.2f, -1.31f)
                curveToRelative(-0.44f, -0.81f, -0.4f, -1.8f, 0.11f, -2.58f)
                curveToRelative(1.23f, -1.88f, 3.6f, -3.06f, 6.11f, -4.31f)
                curveToRelative(4.08f, -2.04f, 7.94f, -3.96f, 7.42f, -8.68f)
                curveToRelative(-0.32f, -2.87f, -2.93f, -5.12f, -5.95f, -5.12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                curveToRelative(4.09f, 0f, 7.5f, 2.97f, 7.94f, 6.9f)
                curveToRelative(0.68f, 6.1f, -4.42f, 8.65f, -8.52f, 10.69f)
                curveToRelative(-2.26f, 1.13f, -4.4f, 2.19f, -5.33f, 3.62f)
                curveToRelative(-0.15f, 0.23f, -0.07f, 0.45f, -0.03f, 0.53f)
                curveToRelative(0.05f, 0.1f, 0.18f, 0.26f, 0.44f, 0.26f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Sr2 = it}
