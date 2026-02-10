package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SchoolLock: ImageVector? = null

val Icons.Bs.SchoolLock: ImageVector
    get() = _SchoolLock ?: UXIcon(name = "SchoolLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13.5f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 8.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(-1.15f, -1.83f, -3.18f, -3.05f, -5.5f, -3.05f)
                curveToRelative(-1.88f, 0f, -3.58f, 0.81f, -4.76f, 2.09f)
                lineToRelative(-1.74f, -1.88f)
                lineToRelative(-5.34f, 5.79f)
                lineTo(3f, 13.0f)
                verticalLineToRelative(8f)
                lineTo(11f, 21.0f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                lineTo(0f, 24.0f)
                lineTo(0f, 8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.46f)
                lineToRelative(1.04f, -1.13f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-3.34f, 2.09f)
                lineToRelative(0.38f, 0.41f)
                horizontalLineToRelative(6.46f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(7.19f, 8f)
                lineTo(3.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.34f)
                lineToRelative(1.85f, -2f)
                close()
            }
        }.also { _SchoolLock = it}
