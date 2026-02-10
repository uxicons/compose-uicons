package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UtensilsSlash: ImageVector? = null

val Icons.Bs.UtensilsSlash: ImageVector
    get() = _UtensilsSlash ?: UXIcon(name = "UtensilsSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.05f, 10f)
                lineToRelative(2.95f, 2.95f)
                verticalLineToRelative(11.05f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.55f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(1.55f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.55f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.05f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(3.05f)
                close()
                moveTo(24.01f, 21.89f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(-0.01f, 2.11f)
                lineTo(2.11f, -0.01f)
                lineToRelative(2.89f, 2.89f)
                lineTo(5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.88f)
                lineToRelative(2f, 2f)
                lineTo(10f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.4f, -0.09f, 0.79f, -0.22f, 1.16f)
                lineToRelative(3.22f, 3.22f)
                lineTo(16f, 2.5f)
                curveToRelative(0f, -1.1f, 0.67f, -2.03f, 1.71f, -2.37f)
                curveToRelative(1.03f, -0.34f, 2.15f, 0.01f, 2.8f, 0.88f)
                curveToRelative(1.59f, 2.14f, 3.49f, 5.39f, 3.49f, 8.75f)
                curveToRelative(0f, 3.45f, -1.84f, 6.63f, -3.4f, 8.71f)
                lineToRelative(3.42f, 3.42f)
                close()
                moveTo(19f, 15.53f)
                curveToRelative(1.04f, -1.62f, 2f, -3.67f, 2f, -5.76f)
                curveToRelative(0f, -1.98f, -0.95f, -4.02f, -2f, -5.66f)
                verticalLineToRelative(11.42f)
                close()
            }
        }.also { _UtensilsSlash = it}
