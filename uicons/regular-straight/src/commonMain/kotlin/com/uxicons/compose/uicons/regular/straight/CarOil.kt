package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarOil: ImageVector? = null

val Icons.Rs.CarOil: ImageVector
    get() = _CarOil ?: UXIcon(name = "CarOil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9.36f)
                lineToRelative(-2.83f, 2.81f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.1f, 0f, 5.66f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
                reflectiveCurveToRelative(-0.42f, -2.07f, -1.17f, -2.83f)
                close()
                moveTo(13.41f, 16.41f)
                curveToRelative(-0.76f, 0.76f, -2.07f, 0.76f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, -0.0f, -2.83f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.41f)
                close()
                moveTo(22f, 4f)
                lineTo(18.5f, 0.5f)
                lineTo(17.01f, 1.99f)
                lineTo(15.03f, 0f)
                horizontalLineToRelative(-10.03f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17.03f)
                lineToRelative(-1.49f, -1.49f)
                lineToRelative(1.49f, -1.49f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1.2f)
                lineToRelative(5f, 5f)
                close()
            }
        }.also { _CarOil = it}
