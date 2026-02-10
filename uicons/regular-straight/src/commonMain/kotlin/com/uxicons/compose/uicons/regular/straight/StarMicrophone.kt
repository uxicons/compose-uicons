package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarMicrophone: ImageVector? = null

val Icons.Rs.StarMicrophone: ImageVector
    get() = _StarMicrophone ?: UXIcon(name = "StarMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.95f, 22f)
                horizontalLineToRelative(1.27f)
                lineToRelative(-0.59f, 2f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-6.04f, 0f, -10.95f, -4.93f, -10.95f, -11f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 4.96f, 4.02f, 9f, 8.95f, 9f)
                close()
                moveTo(10.0f, 19.74f)
                verticalLineToRelative(-2.09f)
                curveToRelative(-2.02f, -0.72f, -3.55f, -2.49f, -3.91f, -4.65f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                reflectiveCurveToRelative(5.43f, 2.17f, 5.91f, 5f)
                horizontalLineToRelative(-3.91f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -4.41f, -3.59f, -8.0f, -8f, -8.0f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.72f, 2.56f, 6.84f, 6.0f, 7.74f)
                close()
                moveTo(19.83f, 16.36f)
                lineTo(18.54f, 12f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-1.28f, 4.36f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(1.01f)
                lineToRelative(3.08f, 2.02f)
                lineToRelative(-1.18f, 4.02f)
                lineToRelative(0.79f, 0.59f)
                lineToRelative(3.33f, -2.34f)
                lineToRelative(3.38f, 2.34f)
                lineToRelative(0.82f, -0.57f)
                lineToRelative(-1.27f, -3.98f)
                lineToRelative(3.05f, -2.08f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }.also { _StarMicrophone = it}
