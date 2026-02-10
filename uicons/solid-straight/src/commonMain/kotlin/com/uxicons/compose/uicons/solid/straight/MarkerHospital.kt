package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerHospital: ImageVector? = null

val Icons.Ss.MarkerHospital: ImageVector
    get() = _MarkerHospital ?: UXIcon(name = "MarkerHospital") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.3f, 3.05f)
                curveToRelative(-1.9f, -1.94f, -4.54f, -3.05f, -7.25f, -3.05f)
                curveToRelative(-5.54f, 0f, -10.05f, 4.51f, -10.05f, 10.05f)
                curveToRelative(0f, 4.8f, 5.86f, 10.43f, 9.4f, 13.39f)
                lineToRelative(0.7f, 0.52f)
                lineToRelative(0.65f, -0.55f)
                curveToRelative(4.21f, -3.56f, 9.25f, -8.76f, 9.35f, -13.34f)
                curveToRelative(0.06f, -2.62f, -0.94f, -5.11f, -2.8f, -7.02f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MarkerHospital = it}
