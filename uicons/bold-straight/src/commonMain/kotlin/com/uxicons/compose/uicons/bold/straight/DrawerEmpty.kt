package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawerEmpty: ImageVector? = null

val Icons.Bs.DrawerEmpty: ImageVector
    get() = _DrawerEmpty ?: UXIcon(name = "DrawerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 2.72f)
                curveToRelative(-0.36f, -1.6f, -1.77f, -2.72f, -3.41f, -2.72f)
                lineTo(5.6f, 0f)
                curveToRelative(-1.65f, 0f, -3.05f, 1.12f, -3.41f, 2.72f)
                lineTo(0.04f, 12.17f)
                lineToRelative(-0.04f, 11.83f)
                lineTo(24f, 24f)
                lineTo(24f, 12.5f)
                lineToRelative(-2.18f, -9.78f)
                close()
                moveTo(18f, 5f)
                lineTo(5.97f, 5f)
                lineToRelative(0.02f, -2f)
                horizontalLineToRelative(12.01f)
                verticalLineToRelative(2f)
                close()
                moveTo(5.58f, 8f)
                horizontalLineToRelative(12.87f)
                lineToRelative(0.68f, 3f)
                lineTo(4.88f, 11f)
                lineToRelative(0.69f, -3f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-7f)
                lineTo(21f, 14f)
                verticalLineToRelative(7f)
                lineTo(3f, 21f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _DrawerEmpty = it}
