package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPilates: ImageVector? = null

val Icons.Ss.PersonPilates: ImageVector
    get() = _PersonPilates ?: UXIcon(name = "PersonPilates") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.73f, 19f)
                lineToRelative(5.0f, -4.84f)
                lineToRelative(6.0f, -2.92f)
                lineToRelative(-0.88f, -1.8f)
                lineToRelative(-6.15f, 2.99f)
                lineToRelative(-4.24f, 4.05f)
                lineToRelative(-4.91f, -5.48f)
                horizontalLineToRelative(7.43f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.67f, -0.02f, -1.36f, 0.17f, -1.92f, 0.62f)
                curveToRelative(-0.62f, 0.5f, -1.0f, 1.22f, -1.07f, 2.02f)
                curveToRelative(-0.07f, 0.8f, 0.19f, 1.57f, 0.71f, 2.17f)
                lineToRelative(4.53f, 5.18f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11.73f)
                close()
                moveTo(1f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonPilates = it}
