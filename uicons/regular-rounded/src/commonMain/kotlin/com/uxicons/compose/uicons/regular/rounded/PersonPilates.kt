package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPilates: ImageVector? = null

val Icons.Rr.PersonPilates: ImageVector
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
                lineToRelative(-3.23f, 3.12f)
                lineToRelative(-4.24f, -4.73f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(0f, 0f, -8.04f, 0.01f, -8.06f, 0.01f)
                curveToRelative(-0.65f, -0.01f, -1.31f, 0.19f, -1.85f, 0.63f)
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
                moveTo(4.0f, 11.83f)
                curveToRelative(0.02f, -0.25f, 0.14f, -0.47f, 0.33f, -0.63f)
                curveToRelative(0.17f, -0.14f, 0.37f, -0.2f, 0.57f, -0.2f)
                curveToRelative(0.24f, 0f, 0.49f, 0.1f, 0.66f, 0.29f)
                lineToRelative(5.22f, 5.83f)
                lineToRelative(-0.62f, 0.6f)
                curveToRelative(-0.2f, 0.19f, -0.45f, 0.29f, -0.72f, 0.27f)
                curveToRelative(-0.27f, -0.01f, -0.52f, -0.13f, -0.7f, -0.32f)
                lineToRelative(-4.53f, -5.17f)
                curveToRelative(-0.17f, -0.19f, -0.24f, -0.43f, -0.22f, -0.68f)
                close()
                moveTo(1f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonPilates = it}
