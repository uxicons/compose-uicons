package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChimneySmoke: ImageVector? = null

val Icons.Sr.ChimneySmoke: ImageVector
    get() = _ChimneySmoke ?: UXIcon(name = "ChimneySmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 12f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(7f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                close()
                moveTo(9f, 18f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(11f, 20f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                close()
                moveTo(21f, 0f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.3f, -2f, 0.78f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                reflectiveCurveToRelative(-1.47f, 0.3f, -2f, 0.78f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                reflectiveCurveToRelative(-1.47f, 0.3f, -2f, 0.78f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                curveToRelative(1.12f, 0f, 2.14f, 0.38f, 2.97f, 1f)
                horizontalLineToRelative(1.03f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _ChimneySmoke = it}
