package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraduationCap: ImageVector? = null

val Icons.Ts.GraduationCap: ImageVector
    get() = _GraduationCap ?: UXIcon(name = "GraduationCap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 8f)
                lineTo(14.24f, 1.66f)
                curveToRelative(-1.36f, -0.88f, -3.12f, -0.88f, -4.48f, 0f)
                lineTo(-0.01f, 8f)
                lineToRelative(4.01f, 2.6f)
                verticalLineToRelative(9.96f)
                curveToRelative(0.09f, 0.09f, 2.5f, 2.44f, 8f, 2.44f)
                reflectiveCurveToRelative(7.91f, -2.34f, 8f, -2.44f)
                verticalLineToRelative(-9.97f)
                lineToRelative(3f, -1.95f)
                verticalLineToRelative(11.35f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(0f)
                close()
                moveTo(19f, 20.13f)
                curveToRelative(-0.55f, 0.44f, -2.67f, 1.87f, -7f, 1.87f)
                curveToRelative(-4.3f, 0f, -6.45f, -1.44f, -7f, -1.87f)
                verticalLineToRelative(-8.88f)
                lineToRelative(4.76f, 3.09f)
                curveToRelative(0.68f, 0.44f, 1.46f, 0.66f, 2.24f, 0.66f)
                reflectiveCurveToRelative(1.56f, -0.22f, 2.24f, -0.66f)
                lineToRelative(4.76f, -3.09f)
                verticalLineToRelative(8.88f)
                close()
                moveTo(13.7f, 13.5f)
                curveToRelative(-1.05f, 0.68f, -2.35f, 0.68f, -3.39f, 0f)
                lineTo(1.83f, 8f)
                lineTo(10.3f, 2.5f)
                curveToRelative(1.05f, -0.68f, 2.35f, -0.68f, 3.39f, 0f)
                lineToRelative(8.47f, 5.5f)
                lineToRelative(-8.47f, 5.5f)
                close()
            }
        }.also { _GraduationCap = it}
