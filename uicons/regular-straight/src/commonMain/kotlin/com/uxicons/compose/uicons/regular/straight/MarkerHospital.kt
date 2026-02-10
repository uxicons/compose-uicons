package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerHospital: ImageVector? = null

val Icons.Rs.MarkerHospital: ImageVector
    get() = _MarkerHospital ?: UXIcon(name = "MarkerHospital") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.1f, 23.96f)
                curveToRelative(-3.87f, -3.04f, -9.99f, -8.79f, -10.1f, -13.91f)
                curveToRelative(0f, -5.54f, 4.51f, -10.05f, 10.05f, -10.05f)
                curveToRelative(5.38f, -0.1f, 10.29f, 4.66f, 10.05f, 10.07f)
                curveToRelative(-0.12f, 4.83f, -5.65f, 10.28f, -10.0f, 13.89f)
                close()
                moveTo(12.05f, 2f)
                curveToRelative(-4.44f, 0f, -8.05f, 3.61f, -8.05f, 8.05f)
                curveToRelative(0f, 3.85f, 5.23f, 8.89f, 8.05f, 11.32f)
                curveToRelative(5.15f, -4.47f, 7.98f, -8.47f, 8.05f, -11.34f)
                curveToRelative(0.05f, -2.08f, -0.75f, -4.06f, -2.23f, -5.58f)
                curveToRelative(-1.52f, -1.56f, -3.65f, -2.45f, -5.82f, -2.45f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MarkerHospital = it}
