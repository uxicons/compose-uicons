package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLunge: ImageVector? = null

val Icons.Ss.PersonLunge: ImageVector
    get() = _PersonLunge ?: UXIcon(name = "PersonLunge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5.97f)
                lineToRelative(-2.44f, 1.91f)
                lineToRelative(1.38f, 3.71f)
                lineToRelative(-1.88f, 0.69f)
                lineToRelative(-1.56f, -4.22f)
                verticalLineToRelative(-1.12f)
                lineToRelative(4.08f, -3.2f)
                curveToRelative(0.7f, -0.53f, 1.56f, -0.81f, 2.42f, -0.81f)
                horizontalLineToRelative(0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                close()
                moveTo(8.77f, 22f)
                lineTo(3f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.18f)
                lineToRelative(1.51f, -4.2f)
                curveToRelative(-0.67f, -0.18f, -1.27f, -0.5f, -1.79f, -0.92f)
                lineToRelative(-1.12f, 3.11f)
                close()
            }
        }.also { _PersonLunge = it}
