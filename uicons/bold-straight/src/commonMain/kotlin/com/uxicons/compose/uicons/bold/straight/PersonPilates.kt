package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPilates: ImageVector? = null

val Icons.Bs.PersonPilates: ImageVector
    get() = _PersonPilates ?: UXIcon(name = "PersonPilates") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(9.52f)
                curveToRelative(-0.66f, -0.13f, -1.29f, -0.45f, -1.8f, -0.96f)
                lineTo(2.46f, 12.12f)
                curveToRelative(-0.45f, -0.51f, -0.67f, -1.18f, -0.61f, -1.85f)
                curveToRelative(0.06f, -0.67f, 0.39f, -1.3f, 0.91f, -1.72f)
                curveToRelative(0.45f, -0.36f, 0.98f, -0.53f, 1.51f, -0.54f)
                verticalLineToRelative(-0.01f)
                horizontalLineTo(14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.85f)
                lineToRelative(3.48f, 3.79f)
                lineToRelative(3.45f, -3.57f)
                lineToRelative(6.39f, -3.11f)
                lineToRelative(1.31f, 2.7f)
                lineToRelative(-5.91f, 2.87f)
                lineToRelative(-4.2f, 4.35f)
                curveToRelative(-0.51f, 0.51f, -1.14f, 0.83f, -1.8f, 0.96f)
                horizontalLineToRelative(13.13f)
                close()
                moveTo(3.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(1f, 3.12f, 1f, 4.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonPilates = it}
