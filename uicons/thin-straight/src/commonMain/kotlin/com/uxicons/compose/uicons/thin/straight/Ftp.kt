package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ftp: ImageVector? = null

val Icons.Ts.Ftp: ImageVector
    get() = _Ftp ?: UXIcon(name = "Ftp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                horizontalLineToRelative(-9.55f)
                curveToRelative(-0.2f, -0.98f, -0.97f, -1.75f, -1.95f, -1.95f)
                verticalLineToRelative(-4.05f)
                horizontalLineToRelative(8.5f)
                lineTo(21f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6.34f)
                lineToRelative(-2.91f, -2f)
                horizontalLineToRelative(-3.75f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(4.05f)
                curveToRelative(-0.98f, 0.2f, -1.75f, 0.97f, -1.95f, 1.95f)
                lineTo(0f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9.55f)
                curveToRelative(0.23f, 1.14f, 1.24f, 2f, 2.45f, 2f)
                reflectiveCurveToRelative(2.22f, -0.86f, 2.45f, -2f)
                horizontalLineToRelative(9.55f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5.5f, 1f)
                horizontalLineToRelative(3.44f)
                lineToRelative(2.91f, 2f)
                horizontalLineToRelative(6.66f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(4f, 6f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4f, 7f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(7f)
                lineTo(4f, 14f)
                verticalLineToRelative(-7f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Ftp = it}
