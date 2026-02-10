package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonClimbing: ImageVector? = null

val Icons.Bs.PersonClimbing: ImageVector
    get() = _PersonClimbing ?: UXIcon(name = "PersonClimbing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 12.97f)
                lineToRelative(0.71f, 3.03f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.82f)
                lineToRelative(-0.62f, -2.49f)
                curveToRelative(-0.02f, -0.07f, -0.04f, -0.13f, -0.07f, -0.2f)
                lineToRelative(-3.15f, 3.86f)
                curveToRelative(-0.9f, 1.06f, -2.09f, 1.63f, -3.21f, 1.64f)
                horizontalLineToRelative(-4.15f)
                lineToRelative(-2.62f, 3.41f)
                lineToRelative(-2.38f, -1.83f)
                lineToRelative(3.52f, -4.59f)
                horizontalLineToRelative(3.41f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(-1.92f, -1.92f)
                lineTo(5f, 14.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.12f)
                lineToRelative(2.6f, 2.6f)
                lineToRelative(2.9f, -3.52f)
                lineToRelative(-3.62f, -2.84f)
                lineTo(13f, 2.12f)
                lineTo(3f, 12.12f)
                verticalLineToRelative(11.88f)
                lineTo(0f, 24f)
                lineTo(0f, 10.88f)
                lineTo(10.88f, 0f)
                horizontalLineToRelative(5.12f)
                lineTo(16f, 5.77f)
                lineToRelative(5.35f, 4.2f)
                curveToRelative(0.96f, 0.75f, 1.64f, 1.81f, 1.94f, 2.99f)
                close()
                moveTo(21.5f, 8f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonClimbing = it}
