package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonWalkingArrowRight: ImageVector? = null

val Icons.Bs.PersonWalkingArrowRight: ImageVector
    get() = _PersonWalkingArrowRight ?: UXIcon(name = "PersonWalkingArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 12.6f)
                lineToRelative(-3.7f, 3.39f)
                verticalLineToRelative(-2.49f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.62f)
                lineToRelative(3.7f, 3.39f)
                curveToRelative(0.4f, 0.35f, 0.4f, 0.97f, 0f, 1.33f)
                close()
                moveTo(9.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(4.57f, 17.57f)
                lineToRelative(-1.57f, 6.43f)
                horizontalLineToRelative(3.3f)
                lineToRelative(0.87f, -4.22f)
                lineToRelative(-2.25f, -1.87f)
                curveToRelative(-0.13f, -0.1f, -0.23f, -0.22f, -0.35f, -0.34f)
                close()
                moveTo(13.67f, 11.01f)
                lineToRelative(2.27f, 1.81f)
                lineToRelative(-1.88f, 2.34f)
                lineToRelative(-2.73f, -2.19f)
                lineToRelative(-0.92f, -1.66f)
                lineToRelative(-0.99f, 3.83f)
                lineToRelative(2.58f, 2.15f)
                verticalLineToRelative(6.7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.3f)
                lineToRelative(-2.8f, -2.33f)
                curveToRelative(-1.02f, -0.85f, -1.47f, -2.19f, -1.17f, -3.49f)
                lineToRelative(0.76f, -3.23f)
                lineToRelative(-1.53f, 0.51f)
                lineToRelative(-0.8f, 3.2f)
                lineToRelative(-2.91f, -0.73f)
                lineTo(1.75f, 7.84f)
                lineToRelative(4.44f, -1.48f)
                curveToRelative(1.03f, -0.38f, 2.23f, -0.38f, 3.32f, -0.36f)
                curveToRelative(0.94f, 0.13f, 1.79f, 0.73f, 2.26f, 1.58f)
                lineToRelative(1.91f, 3.43f)
                close()
            }
        }.also { _PersonWalkingArrowRight = it}
