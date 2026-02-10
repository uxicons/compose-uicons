package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BankApp: ImageVector? = null

val Icons.Sr.BankApp: ImageVector
    get() = _BankApp ?: UXIcon(name = "BankApp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 14f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0.57f, -0.12f, 1f, -0.59f, 1f, -1.19f)
                curveToRelative(0f, -0.45f, -0.25f, -0.87f, -0.65f, -1.09f)
                lineToRelative(-4.5f, -2.45f)
                curveToRelative(-0.54f, -0.29f, -1.18f, -0.29f, -1.72f, 0f)
                lineToRelative(-4.5f, 2.45f)
                curveToRelative(-0.4f, 0.22f, -0.65f, 0.64f, -0.65f, 1.09f)
                curveToRelative(0f, 0.6f, 0.43f, 1.08f, 1f, 1.19f)
                verticalLineToRelative(4.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                lineTo(12f, 0f)
                curveToRelative(1.97f, 0f, 4f, 1.6f, 4f, 3.56f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-4.02f, 2.19f, -4.02f, 2.19f)
                curveToRelative(-1.22f, 0.66f, -1.98f, 1.94f, -1.98f, 3.33f)
                verticalLineToRelative(6.91f)
                close()
                moveTo(0f, 20f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(12f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _BankApp = it}
