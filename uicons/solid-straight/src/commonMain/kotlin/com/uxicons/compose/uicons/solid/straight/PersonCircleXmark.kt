package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCircleXmark: ImageVector? = null

val Icons.Ss.PersonCircleXmark: ImageVector
    get() = _PersonCircleXmark ?: UXIcon(name = "PersonCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12.71f)
                curveToRelative(-1.04f, 1.18f, -1.8f, 2.66f, -2f, 4.29f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.64f, 0f, 2.97f, 1.32f, 3.0f, 2.95f)
                curveToRelative(0f, 0.02f, 0.0f, 0.03f, 0.0f, 0.05f)
                verticalLineToRelative(3.71f)
                close()
                moveTo(4.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.24f, 13.76f)
                curveToRelative(-2.34f, -2.34f, -6.14f, -2.34f, -8.48f, 0f)
                reflectiveCurveToRelative(-2.34f, 6.14f, 0f, 8.48f)
                reflectiveCurveToRelative(6.14f, 2.34f, 8.48f, 0f)
                reflectiveCurveToRelative(2.34f, -6.14f, 0f, -8.48f)
                close()
                moveTo(20.12f, 21.54f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _PersonCircleXmark = it}
