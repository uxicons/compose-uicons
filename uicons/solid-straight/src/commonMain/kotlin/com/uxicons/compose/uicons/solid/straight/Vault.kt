package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vault: ImageVector? = null

val Icons.Ss.Vault: ImageVector
    get() = _Vault ?: UXIcon(name = "Vault") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.86f)
                curveToRelative(-0.45f, 1.72f, -2f, 3f, -3.86f, 3f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(1.86f, 0f, 3.41f, 1.28f, 3.86f, 3f)
                horizontalLineToRelative(-2.86f)
                close()
                moveTo(24f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                lineTo(2f, 24f)
                verticalLineToRelative(-2f)
                lineTo(0f, 22f)
                verticalLineToRelative(-4f)
                lineTo(3f, 18f)
                verticalLineToRelative(-2f)
                lineTo(0f, 16f)
                verticalLineToRelative(-7f)
                lineTo(3f, 9f)
                verticalLineToRelative(-2f)
                lineTo(0f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 22f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _Vault = it}
