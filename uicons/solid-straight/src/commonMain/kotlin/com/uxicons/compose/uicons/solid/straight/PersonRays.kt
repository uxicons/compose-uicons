package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRays: ImageVector? = null

val Icons.Ss.PersonRays: ImageVector
    get() = _PersonRays ?: UXIcon(name = "PersonRays") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(-0.01f, 22.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.7f, -4.7f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(-0.01f, 22.59f)
                close()
                moveTo(24.01f, 1.41f)
                lineTo(22.59f, -0.01f)
                lineToRelative(-4.7f, 4.7f)
                lineToRelative(1.41f, 1.41f)
                lineTo(24.01f, 1.41f)
                close()
                moveTo(17.89f, 19.31f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.7f, -4.7f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(-0.01f, 1.41f)
                lineTo(4.69f, 6.11f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, -0.01f)
                lineTo(-0.01f, 1.41f)
                close()
            }
        }.also { _PersonRays = it}
