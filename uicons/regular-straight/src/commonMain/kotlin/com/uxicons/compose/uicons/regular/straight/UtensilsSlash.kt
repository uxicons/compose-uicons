package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UtensilsSlash: ImageVector? = null

val Icons.Rs.UtensilsSlash: ImageVector
    get() = _UtensilsSlash ?: UXIcon(name = "UtensilsSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 19.24f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(2.76f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.76f)
                close()
                moveTo(5f, 10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.76f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(2.76f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.76f)
                lineToRelative(-2.24f, -2.24f)
                horizontalLineToRelative(-0.76f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(0.54f, 0.54f)
                verticalLineToRelative(-0.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(2f, 2f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.59f)
                lineToRelative(2f, 2f)
                lineTo(10f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.45f, -0.11f, 0.89f, -0.3f, 1.28f)
                lineToRelative(3.3f, 3.3f)
                lineTo(15f, 2.0f)
                curveToRelative(0f, -0.88f, 0.54f, -1.62f, 1.37f, -1.9f)
                curveToRelative(0.83f, -0.27f, 1.72f, 0.0f, 2.24f, 0.71f)
                curveToRelative(1.55f, 2.08f, 3.39f, 5.23f, 3.39f, 8.46f)
                curveToRelative(0f, 3.04f, -1.62f, 6.0f, -3.17f, 8.15f)
                lineToRelative(5.13f, 5.13f)
                close()
                moveTo(17.39f, 15.98f)
                curveToRelative(1.19f, -1.7f, 2.61f, -4.24f, 2.61f, -6.71f)
                curveToRelative(0f, -2.68f, -1.63f, -5.42f, -3.0f, -7.26f)
                lineToRelative(-0.01f, 13.58f)
                lineToRelative(0.39f, 0.39f)
                close()
            }
        }.also { _UtensilsSlash = it}
