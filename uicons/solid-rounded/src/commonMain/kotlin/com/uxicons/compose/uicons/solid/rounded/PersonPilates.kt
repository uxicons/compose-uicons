package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPilates: ImageVector? = null

val Icons.Sr.PersonPilates: ImageVector
    get() = _PersonPilates ?: UXIcon(name = "PersonPilates") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                horizontalLineTo(11.73f)
                lineToRelative(5.0f, -4.84f)
                lineToRelative(5.7f, -2.76f)
                curveToRelative(0.5f, -0.24f, 0.7f, -0.84f, 0.46f, -1.34f)
                curveToRelative(-0.24f, -0.5f, -0.84f, -0.7f, -1.34f, -0.46f)
                lineToRelative(-5.84f, 2.83f)
                curveToRelative(-0.1f, 0.05f, -0.18f, 0.11f, -0.26f, 0.18f)
                lineToRelative(-3.96f, 3.89f)
                lineToRelative(-4.92f, -5.5f)
                horizontalLineToRelative(6.42f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveToRelative(-0.01f, 0f, -0.03f, 0.01f, -0.04f, 0.01f)
                curveToRelative(-0.66f, -0.01f, -1.33f, 0.19f, -1.88f, 0.64f)
                curveToRelative(-0.62f, 0.5f, -1.0f, 1.22f, -1.07f, 2.02f)
                curveToRelative(-0.07f, 0.8f, 0.19f, 1.57f, 0.71f, 2.17f)
                lineToRelative(4.53f, 5.18f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(1f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonPilates = it}
