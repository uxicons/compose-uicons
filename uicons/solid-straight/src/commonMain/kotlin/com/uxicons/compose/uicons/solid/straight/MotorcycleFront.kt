package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MotorcycleFront: ImageVector? = null

val Icons.Ss.MotorcycleFront: ImageVector
    get() = _MotorcycleFront ?: UXIcon(name = "MotorcycleFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.85f)
                curveToRelative(-0.21f, 0f, -0.42f, 0.07f, -0.59f, 0.19f)
                lineToRelative(-2.7f, 1.96f)
                curveToRelative(0.08f, 0.27f, 0.14f, 0.55f, 0.14f, 0.85f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -0.3f, 0.06f, -0.58f, 0.14f, -0.85f)
                lineToRelative(-2.7f, -1.96f)
                curveToRelative(-0.17f, -0.12f, -0.38f, -0.19f, -0.59f, -0.19f)
                horizontalLineToRelative(-5.85f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.85f)
                curveToRelative(0.64f, 0f, 1.25f, 0.2f, 1.76f, 0.57f)
                lineToRelative(2.69f, 1.96f)
                curveToRelative(0.48f, -0.33f, 1.07f, -0.53f, 1.7f, -0.53f)
                reflectiveCurveToRelative(1.22f, 0.2f, 1.7f, 0.53f)
                lineToRelative(2.69f, -1.96f)
                curveToRelative(0.52f, -0.38f, 1.12f, -0.57f, 1.76f, -0.57f)
                horizontalLineToRelative(5.85f)
                close()
                moveTo(11f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19.6f, 7.6f)
                curveToRelative(-0.77f, -0.58f, -0.76f, -0.73f, -2.69f, -1.61f)
                curveToRelative(-0.46f, 2.29f, -2.48f, 4.02f, -4.9f, 4.02f)
                reflectiveCurveToRelative(-4.44f, -1.73f, -4.9f, -4.02f)
                curveToRelative(-1.94f, 0.89f, -1.92f, 1.03f, -2.69f, 1.61f)
                lineToRelative(1.81f, 9.4f)
                horizontalLineToRelative(-3.21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.6f)
                lineToRelative(0.58f, 3f)
                horizontalLineToRelative(3.83f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3.83f)
                lineToRelative(0.58f, -3f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.21f)
                close()
            }
        }.also { _MotorcycleFront = it}
