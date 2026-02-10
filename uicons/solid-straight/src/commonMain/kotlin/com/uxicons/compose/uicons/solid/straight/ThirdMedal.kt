package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThirdMedal: ImageVector? = null

val Icons.Ss.ThirdMedal: ImageVector
    get() = _ThirdMedal ?: UXIcon(name = "ThirdMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.48f, 6.91f)
                curveToRelative(-1.73f, -1.59f, -3.97f, -2.64f, -6.45f, -2.87f)
                lineTo(15.03f, 0f)
                horizontalLineToRelative(7.87f)
                lineToRelative(-3.42f, 6.91f)
                close()
                moveTo(11.03f, 4.05f)
                lineToRelative(-2.0f, -4.05f)
                lineTo(1.06f, 0f)
                lineToRelative(3.45f, 6.99f)
                curveToRelative(1.74f, -1.64f, 4.01f, -2.71f, 6.52f, -2.94f)
                close()
                moveTo(21.03f, 15f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3.03f, 19.96f, 3.03f, 15f)
                reflectiveCurveTo(7.07f, 6f, 12.03f, 6f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(15.67f, 17f)
                curveToRelative(0f, -0.96f, -0.45f, -1.81f, -1.16f, -2.36f)
                curveToRelative(0.31f, -0.47f, 0.49f, -1.03f, 0.49f, -1.64f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.17f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _ThirdMedal = it}
