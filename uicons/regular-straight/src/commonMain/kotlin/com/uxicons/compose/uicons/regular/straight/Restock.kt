package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restock: ImageVector? = null

val Icons.Rs.Restock: ImageVector
    get() = _Restock ?: UXIcon(name = "Restock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-4.05f, 0f, -7.79f, -2.06f, -9.99f, -5.37f)
                lineToRelative(-0.01f, 2.37f)
                lineTo(0f, 21f)
                verticalLineToRelative(-3.99f)
                curveToRelative(0f, -1.11f, 0.9f, -2.01f, 2.01f, -2.01f)
                horizontalLineToRelative(3.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(1.78f, 3.06f, 5.05f, 5f, 8.64f, 5f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                close()
                moveTo(22f, 3f)
                lineToRelative(-0.01f, 2.35f)
                curveTo(19.81f, 2.04f, 16.11f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(3.64f, 0f, 6.9f, 1.92f, 8.67f, 5f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.99f)
                curveToRelative(1.11f, 0f, 2.01f, -0.9f, 2.01f, -2.01f)
                verticalLineToRelative(-3.99f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 17f)
                lineTo(7f, 17f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(15f, 9.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Restock = it}
