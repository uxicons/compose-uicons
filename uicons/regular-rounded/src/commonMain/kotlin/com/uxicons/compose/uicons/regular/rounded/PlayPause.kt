package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Rr.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(21f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(23f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(18f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(17f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(19f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(4.33f, 20.73f)
                curveToRelative(-0.51f, 0f, -1.02f, -0.12f, -1.51f, -0.37f)
                curveToRelative(-1.14f, -0.58f, -1.82f, -1.68f, -1.82f, -2.96f)
                lineTo(1f, 6.6f)
                curveToRelative(0f, -1.27f, 0.68f, -2.38f, 1.82f, -2.96f)
                curveToRelative(1.12f, -0.57f, 2.45f, -0.46f, 3.46f, 0.28f)
                lineToRelative(7.37f, 5.4f)
                curveToRelative(0.86f, 0.63f, 1.35f, 1.61f, 1.35f, 2.67f)
                reflectiveCurveToRelative(-0.49f, 2.04f, -1.35f, 2.67f)
                lineToRelative(-7.37f, 5.4f)
                curveToRelative(-0.59f, 0.43f, -1.26f, 0.65f, -1.95f, 0.65f)
                close()
                moveTo(4.32f, 5.27f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.05f, -0.6f, 0.15f)
                curveToRelative(-0.46f, 0.23f, -0.72f, 0.66f, -0.72f, 1.17f)
                verticalLineToRelative(10.81f)
                curveToRelative(0f, 0.51f, 0.26f, 0.94f, 0.72f, 1.17f)
                curveToRelative(0.46f, 0.23f, 0.96f, 0.19f, 1.37f, -0.11f)
                lineToRelative(7.37f, -5.4f)
                curveToRelative(0.35f, -0.25f, 0.54f, -0.63f, 0.54f, -1.06f)
                reflectiveCurveToRelative(-0.19f, -0.81f, -0.54f, -1.06f)
                lineTo(5.09f, 5.54f)
                curveToRelative(-0.23f, -0.17f, -0.5f, -0.26f, -0.77f, -0.26f)
                close()
            }
        }.also { _PlayPause = it}
