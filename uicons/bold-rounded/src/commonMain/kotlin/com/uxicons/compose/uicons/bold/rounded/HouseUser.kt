package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUser: ImageVector? = null

val Icons.Br.HouseUser: ImageVector
    get() = _HouseUser ?: UXIcon(name = "HouseUser") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.58f, 5.33f)
            lineTo(15.08f, 0.94f)
            curveToRelative(-1.87f, -1.26f, -4.29f, -1.26f, -6.15f, 0f)
            lineTo(2.42f, 5.33f)
            curveToRelative(-1.52f, 1.02f, -2.42f, 2.73f, -2.42f, 4.56f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, -0.91f, -3.53f, -2.42f, -4.56f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -0.83f, 0.41f, -1.61f, 1.1f, -2.07f)
            lineToRelative(6.5f, -4.39f)
            curveToRelative(0.42f, -0.29f, 0.91f, -0.43f, 1.4f, -0.43f)
            reflectiveCurveToRelative(0.97f, 0.14f, 1.4f, 0.43f)
            lineToRelative(6.5f, 4.39f)
            curveToRelative(0.69f, 0.47f, 1.1f, 1.24f, 1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            close()
            moveTo(15f, 11f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
        }
    }.also { _HouseUser = it }
