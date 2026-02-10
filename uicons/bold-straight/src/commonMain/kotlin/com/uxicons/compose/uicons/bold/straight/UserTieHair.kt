package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHair: ImageVector? = null

val Icons.Bs.UserTieHair: ImageVector
    get() = _UserTieHair ?: UXIcon(name = "UserTieHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.49f)
                lineToRelative(-1.23f, 1.84f)
                lineToRelative(1.22f, 5.16f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.22f, -5.16f)
                lineToRelative(-1.23f, -1.84f)
                horizontalLineToRelative(-1.49f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -1.0f, -0.5f, -1.89f, -1.26f, -2.43f)
                curveToRelative(-0.87f, 1.45f, -2.45f, 2.43f, -4.26f, 2.43f)
                curveToRelative(-0.16f, 0f, -0.32f, -0.03f, -0.47f, -0.05f)
                curveToRelative(0f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _UserTieHair = it}
