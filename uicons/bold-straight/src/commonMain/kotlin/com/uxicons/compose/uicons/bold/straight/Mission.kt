package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mission: ImageVector? = null

val Icons.Bs.Mission: ImageVector
    get() = _Mission ?: UXIcon(name = "Mission") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.59f)
                curveToRelative(1.41f, -1f, 2.39f, -2.5f, 2.39f, -4.35f)
                curveToRelative(2.0f, -2.21f, 3.21f, -4.81f, 3.95f, -6.87f)
                curveToRelative(0.1f, -0.29f, 0.1f, -0.61f, 0f, -0.9f)
                curveToRelative(-0.25f, -0.69f, -1.01f, -1.05f, -1.7f, -0.8f)
                curveToRelative(-2.05f, 0.74f, -4.61f, 1.9f, -6.84f, 3.92f)
                curveToRelative(-1.88f, 0f, -3.38f, 1f, -4.38f, 2.42f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(2f)
                lineToRelative(0.49f, 0.49f)
                lineToRelative(-1.48f, 1.48f)
                lineToRelative(2.02f, 2.02f)
                lineToRelative(1.48f, -1.48f)
                lineToRelative(0.49f, 0.49f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.26f, 15.57f)
                lineTo(8.14f, 21f)
                horizontalLineToRelative(15.86f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-2.5f)
                lineToRelative(11f, -14.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(2.0f)
                lineToRelative(6f, 7.91f)
                verticalLineToRelative(4.96f)
                lineToRelative(-3.65f, -4.81f)
                lineToRelative(-1.53f, 2.54f)
                lineToRelative(-1.82f, -2.5f)
                lineToRelative(-2.5f, 3.5f)
                close()
            }
        }.also { _Mission = it}
