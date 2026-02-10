package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerHospital: ImageVector? = null

val Icons.Bs.MarkerHospital: ImageVector
    get() = _MarkerHospital ?: UXIcon(name = "MarkerHospital") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-5.54f, 0.01f, -10.06f, 4.52f, -10.06f, 10.07f)
                curveToRelative(0.45f, 6.25f, 8.32f, 12.3f, 10.07f, 13.93f)
                curveToRelative(1.74f, -1.62f, 9.63f, -7.7f, 10.07f, -13.94f)
                curveToRelative(-0.01f, -5.54f, -4.52f, -10.06f, -10.07f, -10.06f)
                close()
                moveTo(12f, 20.04f)
                curveToRelative(-3.58f, -3.24f, -7.07f, -7.57f, -7.07f, -9.97f)
                curveToRelative(0.0f, -3.89f, 3.17f, -7.06f, 7.07f, -7.07f)
                curveToRelative(3.89f, 0.01f, 7.06f, 3.17f, 7.07f, 7.07f)
                curveToRelative(0f, 2.4f, -3.48f, 6.74f, -7.07f, 9.98f)
                close()
                moveTo(13.5f, 8.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _MarkerHospital = it}
