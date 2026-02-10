package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHair: ImageVector? = null

val Icons.Ss.UserTieHair: ImageVector
    get() = _UserTieHair ?: UXIcon(name = "UserTieHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.41f, 0f, 4.57f, -1.29f, 5.78f, -3.28f)
                curveToRelative(-0.56f, -0.39f, -1.23f, -0.62f, -1.94f, -0.69f)
                curveToRelative(-0.88f, 1.2f, -2.28f, 1.97f, -3.84f, 1.97f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.83f, -2.33f, 3.04f, -4f, 5.65f, -4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(8f, 14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                lineToRelative(1.39f, -6.92f)
                lineToRelative(-2.05f, -3.08f)
                horizontalLineToRelative(-1.33f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-1.33f)
                lineToRelative(-2.05f, 3.08f)
                lineToRelative(1.39f, 6.92f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _UserTieHair = it}
