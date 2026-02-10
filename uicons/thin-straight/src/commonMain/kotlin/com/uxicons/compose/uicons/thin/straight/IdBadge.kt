package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IdBadge: ImageVector? = null

val Icons.Ts.IdBadge: ImageVector
    get() = _IdBadge ?: UXIcon(name = "IdBadge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 4f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 3f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(9f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _IdBadge = it}
