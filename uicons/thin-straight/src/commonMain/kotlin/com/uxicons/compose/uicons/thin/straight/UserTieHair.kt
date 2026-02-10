package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHair: ImageVector? = null

val Icons.Ts.UserTieHair: ImageVector
    get() = _UserTieHair ?: UXIcon(name = "UserTieHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.53f, 0f, 1.04f, 0.11f, 1.52f, 0.26f)
                curveToRelative(-0.68f, 2.21f, -2.7f, 3.74f, -5.02f, 3.74f)
                horizontalLineToRelative(-1.4f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(2.72f, 0f, 5.09f, -1.77f, 5.94f, -4.34f)
                curveToRelative(1.52f, 0.86f, 2.56f, 2.47f, 2.56f, 4.34f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(16.5f, 14f)
                horizontalLineToRelative(-9f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.58f)
                lineToRelative(1.88f, 2.61f)
                lineToRelative(-1.5f, 6.39f)
                horizontalLineToRelative(1.03f)
                lineToRelative(1.52f, -6.44f)
                lineToRelative(1.52f, 6.44f)
                horizontalLineToRelative(1.03f)
                lineToRelative(-1.5f, -6.39f)
                lineToRelative(1.88f, -2.61f)
                horizontalLineToRelative(1.58f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(12f, 17.34f)
                lineTo(10.31f, 15f)
                horizontalLineToRelative(3.38f)
                close()
            }
        }.also { _UserTieHair = it}
