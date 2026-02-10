package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerHospital: ImageVector? = null

val Icons.Br.MarkerHospital: ImageVector
    get() = _MarkerHospital ?: UXIcon(name = "MarkerHospital") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 10f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 10.44f)
            curveToRelative(0f, 2.83f, -2.2f, 6.77f, -6.54f, 11.71f)
            curveToRelative(-1.0f, 1.14f, -2.45f, 1.79f, -3.96f, 1.79f)
            curveToRelative(-1.52f, -0.0f, -2.96f, -0.65f, -3.95f, -1.79f)
            curveToRelative(-4.34f, -4.94f, -6.54f, -8.88f, -6.54f, -11.71f)
            curveToRelative(0.01f, -5.78f, 4.72f, -10.49f, 10.5f, -10.5f)
            horizontalLineToRelative(0.01f)
            curveToRelative(5.78f, 0.01f, 10.49f, 4.72f, 10.5f, 10.5f)
            close()
            moveTo(19.5f, 10.45f)
            curveToRelative(-0.01f, -4.13f, -3.37f, -7.49f, -7.5f, -7.5f)
            curveToRelative(-4.13f, 0.01f, -7.5f, 3.37f, -7.5f, 7.5f)
            curveToRelative(0f, 0.94f, 0.56f, 3.77f, 5.79f, 9.72f)
            curveToRelative(0.4f, 0.46f, 0.95f, 0.73f, 1.56f, 0.77f)
            curveToRelative(0.7f, 0.05f, 1.39f, -0.24f, 1.85f, -0.76f)
            curveToRelative(5.23f, -5.96f, 5.8f, -8.79f, 5.8f, -9.73f)
            close()
        }
    }.also { _MarkerHospital = it }
