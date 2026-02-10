package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BankApp: ImageVector? = null

val Icons.Rs.BankApp: ImageVector
    get() = _BankApp ?: UXIcon(name = "BankApp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineToRelative(14f)
                lineTo(16f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                lineTo(2f, 16f)
                lineTo(2f, 2f)
                close()
                moveTo(14f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                lineTo(14f, 18f)
                close()
                moveTo(24f, 8f)
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
                moveTo(15f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(21f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(10f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BankApp = it}
