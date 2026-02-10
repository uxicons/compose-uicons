package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UfoBeam: ImageVector? = null

val Icons.Rs.UfoBeam: ImageVector
    get() = _UfoBeam ?: UXIcon(name = "UfoBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.84f, 15.2f)
                curveToRelative(0.66f, 0.17f, 1.35f, 0.29f, 2.05f, 0.4f)
                lineToRelative(-3.39f, 8.39f)
                lineTo(1.29f, 24f)
                lineToRelative(3.56f, -8.8f)
                close()
                moveTo(17f, 15.61f)
                lineToRelative(3.39f, 8.39f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-3.56f, -8.8f)
                curveToRelative(-0.66f, 0.17f, -1.35f, 0.29f, -2.05f, 0.4f)
                close()
                moveTo(24f, 9.33f)
                curveToRelative(0f, 3.06f, -6.04f, 4.67f, -12f, 4.67f)
                reflectiveCurveTo(0f, 12.4f, 0f, 9.33f)
                curveToRelative(0f, -1.85f, 2.19f, -3.32f, 6.05f, -4.11f)
                curveToRelative(0.38f, -2.94f, 2.9f, -5.23f, 5.95f, -5.23f)
                reflectiveCurveToRelative(5.57f, 2.28f, 5.95f, 5.23f)
                curveToRelative(3.86f, 0.79f, 6.05f, 2.26f, 6.05f, 4.11f)
                close()
                moveTo(8f, 6.35f)
                curveToRelative(0.5f, 0.24f, 1.69f, 0.65f, 4f, 0.65f)
                curveToRelative(2.29f, 0f, 3.48f, -0.41f, 4f, -0.66f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(0.35f)
                close()
                moveTo(22f, 9.33f)
                curveToRelative(0f, -0.4f, -1.04f, -1.38f, -4f, -2.05f)
                verticalLineToRelative(0.02f)
                lineToRelative(-0.29f, 0.29f)
                curveToRelative(-0.23f, 0.23f, -1.61f, 1.4f, -5.71f, 1.4f)
                reflectiveCurveToRelative(-5.47f, -1.17f, -5.71f, -1.4f)
                lineToRelative(-0.29f, -0.29f)
                verticalLineToRelative(-0.02f)
                curveToRelative(-2.96f, 0.67f, -4f, 1.65f, -4f, 2.05f)
                curveToRelative(0f, 0.94f, 3.8f, 2.67f, 10f, 2.67f)
                reflectiveCurveToRelative(10f, -1.73f, 10f, -2.67f)
                close()
            }
        }.also { _UfoBeam = it}
