package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPresenting: ImageVector? = null

val Icons.Ss.PersonPresenting: ImageVector
    get() = _PersonPresenting ?: UXIcon(name = "PersonPresenting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(7f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-13.4f)
                curveToRelative(0.56f, 0.69f, 0.9f, 1.55f, 0.9f, 2.5f)
                curveToRelative(0f, 0.53f, -0.11f, 1.04f, -0.3f, 1.5f)
                horizontalLineToRelative(8.8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-2.28f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _PersonPresenting = it}
