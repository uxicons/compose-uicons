package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPilates: ImageVector? = null

val Icons.Rs.PersonPilates: ImageVector
    get() = _PersonPilates ?: UXIcon(name = "PersonPilates") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.73f, 19f)
                lineToRelative(5.0f, -4.84f)
                lineToRelative(6.0f, -2.92f)
                lineToRelative(-0.88f, -1.8f)
                lineToRelative(-6.15f, 2.99f)
                lineToRelative(-3.48f, 3.3f)
                lineToRelative(-4.24f, -4.73f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2f)
                lineTo(5f, 9f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.67f, -0.02f, -1.36f, 0.18f, -1.92f, 0.63f)
                curveToRelative(-0.62f, 0.5f, -1.0f, 1.22f, -1.07f, 2.02f)
                curveToRelative(-0.07f, 0.8f, 0.19f, 1.57f, 0.71f, 2.17f)
                lineToRelative(4.53f, 5.18f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                lineTo(24f, 21f)
                verticalLineToRelative(-2f)
                lineTo(11.73f, 19f)
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
