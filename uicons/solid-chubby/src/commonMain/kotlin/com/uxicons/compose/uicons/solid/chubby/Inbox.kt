package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inbox: ImageVector? = null

val Icons.Sc.Inbox: ImageVector
    get() = _Inbox ?: UXIcon(name = "Inbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.44f, 9.16f)
                horizontalLineToRelative(11.13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(6.44f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.44f, 4.46f)
                horizontalLineToRelative(11.13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(6.44f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 11.04f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineToRelative(-5.96f)
                curveToRelative(-0.52f, 0f, -0.95f, 0.39f, -1.0f, 0.91f)
                curveToRelative(-0.05f, 0.53f, -0.13f, 1.07f, -0.25f, 1.6f)
                curveToRelative(-1.86f, 0.4f, -3.74f, 0.4f, -5.6f, 0f)
                curveToRelative(-0.11f, -0.53f, -0.2f, -1.07f, -0.25f, -1.6f)
                curveToRelative(-0.05f, -0.51f, -0.48f, -0.91f, -1.0f, -0.91f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.11f, -0.71f, 0.29f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.45f, -0.29f, 0.71f)
                curveToRelative(0.03f, 5.0f, 1.15f, 8.77f, 1.19f, 8.92f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.59f, 0.7f, 0.68f)
                curveToRelative(0.18f, 0.05f, 4.44f, 1.19f, 9.11f, 1.19f)
                curveToRelative(4.84f, 0f, 8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.16f, -3.9f, 1.19f, -8.93f)
                curveToRelative(0.0f, -0.27f, -0.1f, -0.52f, -0.29f, -0.71f)
                close()
            }
        }.also { _Inbox = it}
