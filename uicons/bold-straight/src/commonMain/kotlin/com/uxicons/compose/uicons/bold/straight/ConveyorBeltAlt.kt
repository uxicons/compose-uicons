package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConveyorBeltAlt: ImageVector? = null

val Icons.Bs.ConveyorBeltAlt: ImageVector
    get() = _ConveyorBeltAlt ?: UXIcon(name = "ConveyorBeltAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 15f)
                lineTo(4.5f, 15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(15.26f, 18f)
                curveToRelative(-0.17f, 0.47f, -0.26f, 0.97f, -0.26f, 1.5f)
                reflectiveCurveToRelative(0.09f, 1.03f, 0.26f, 1.5f)
                horizontalLineToRelative(-6.51f)
                curveToRelative(0.17f, -0.47f, 0.26f, -0.97f, 0.26f, -1.5f)
                reflectiveCurveToRelative(-0.09f, -1.03f, -0.26f, -1.5f)
                horizontalLineToRelative(6.51f)
                close()
                moveTo(3f, 19.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _ConveyorBeltAlt = it}
