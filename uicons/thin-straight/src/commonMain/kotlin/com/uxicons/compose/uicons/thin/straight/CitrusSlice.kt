package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CitrusSlice: ImageVector? = null

val Icons.Ts.CitrusSlice: ImageVector
    get() = _CitrusSlice ?: UXIcon(name = "CitrusSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.91f, 0.39f)
                lineToRelative(-0.35f, -0.35f)
                lineTo(0.04f, 19.55f)
                lineToRelative(0.35f, 0.35f)
                curveToRelative(2.61f, 2.61f, 6.07f, 4.04f, 9.76f, 4.04f)
                reflectiveCurveToRelative(7.15f, -1.44f, 9.76f, -4.04f)
                reflectiveCurveToRelative(4.04f, -6.07f, 4.04f, -9.76f)
                reflectiveCurveToRelative(-1.44f, -7.15f, -4.04f, -9.76f)
                close()
                moveTo(17.49f, 16.78f)
                lineToRelative(-6.63f, -6.63f)
                lineToRelative(0.15f, -0.15f)
                horizontalLineToRelative(9.03f)
                curveToRelative(0.04f, 2.43f, -0.81f, 4.87f, -2.55f, 6.78f)
                close()
                moveTo(3.51f, 17.49f)
                lineToRelative(5.49f, -5.49f)
                verticalLineToRelative(7.97f)
                curveToRelative(-2.04f, -0.23f, -3.95f, -1.09f, -5.49f, -2.49f)
                close()
                moveTo(10f, 11.0f)
                lineToRelative(0.15f, -0.15f)
                lineToRelative(6.63f, 6.63f)
                curveToRelative(-1.82f, 1.65f, -4.16f, 2.55f, -6.63f, 2.55f)
                curveToRelative(-0.05f, 0f, -0.1f, -0.0f, -0.15f, -0.0f)
                verticalLineToRelative(-9.04f)
                close()
                moveTo(12.01f, 9.0f)
                lineToRelative(5.49f, -5.49f)
                curveToRelative(1.43f, 1.57f, 2.25f, 3.5f, 2.48f, 5.49f)
                horizontalLineToRelative(-7.97f)
                close()
                moveTo(19.2f, 19.2f)
                curveToRelative(-4.87f, 4.87f, -12.73f, 4.99f, -17.74f, 0.35f)
                lineToRelative(1.35f, -1.35f)
                curveToRelative(2.01f, 1.84f, 4.6f, 2.85f, 7.34f, 2.85f)
                curveToRelative(2.91f, 0f, 5.65f, -1.13f, 7.71f, -3.19f)
                curveToRelative(4.13f, -4.13f, 4.24f, -10.78f, 0.34f, -15.05f)
                lineToRelative(1.35f, -1.35f)
                curveToRelative(4.64f, 5.01f, 4.53f, 12.87f, -0.35f, 17.74f)
                close()
            }
        }.also { _CitrusSlice = it}
