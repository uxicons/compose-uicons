package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BankApp: ImageVector? = null

val Icons.Bs.BankApp: ImageVector
    get() = _BankApp ?: UXIcon(name = "BankApp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                lineTo(13.61f, 3f)
                reflectiveCurveToRelative(2.26f, -1.22f, 2.39f, -1.27f)
                lineTo(16f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 18f)
                lineTo(3f, 3f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(6f, 22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(-1.14f)
                curveToRelative(0f, -0.71f, -0.39f, -1.36f, -1.01f, -1.7f)
                lineToRelative(-4.56f, -2.49f)
                curveToRelative(-0.58f, -0.32f, -1.28f, -0.32f, -1.86f, 0f)
                lineToRelative(-4.56f, 2.49f)
                curveToRelative(-0.62f, 0.34f, -1.01f, 0.99f, -1.01f, 1.71f)
                verticalLineToRelative(1.14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _BankApp = it}
