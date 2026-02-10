package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BankApp: ImageVector? = null

val Icons.Ss.BankApp: ImageVector
    get() = _BankApp ?: UXIcon(name = "BankApp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                verticalLineToRelative(-0.91f)
                curveToRelative(0f, -0.66f, -0.36f, -1.26f, -0.93f, -1.57f)
                lineToRelative(-4.21f, -2.29f)
                curveToRelative(-0.54f, -0.29f, -1.18f, -0.29f, -1.72f, 0f)
                lineToRelative(-4.21f, 2.29f)
                curveToRelative(-0.58f, 0.31f, -0.93f, 0.92f, -0.93f, 1.57f)
                verticalLineToRelative(0.91f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(10f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 3.56f)
                lineToRelative(-4.02f, 2.19f)
                curveToRelative(-1.22f, 0.66f, -1.98f, 1.94f, -1.98f, 3.33f)
                verticalLineToRelative(6.91f)
                close()
                moveTo(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 18f)
                verticalLineToRelative(3f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(6f, 22f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BankApp = it}
