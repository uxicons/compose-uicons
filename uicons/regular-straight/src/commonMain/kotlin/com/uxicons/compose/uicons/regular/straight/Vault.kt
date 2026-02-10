package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vault: ImageVector? = null

val Icons.Rs.Vault: ImageVector
    get() = _Vault ?: UXIcon(name = "Vault") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(20f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(24f, 5f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(2f, 15f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(2f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(13f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(13f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(1.86f, 0f, 3.41f, 1.28f, 3.86f, 3f)
                horizontalLineToRelative(-2.86f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.86f)
                curveToRelative(-0.45f, 1.72f, -2f, 3f, -3.86f, 3f)
                close()
            }
        }.also { _Vault = it}
