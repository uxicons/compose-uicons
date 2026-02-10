package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Procedures: ImageVector? = null

val Icons.Rs.Procedures: ImageVector
    get() = _Procedures ?: UXIcon(name = "Procedures") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.67f, 2f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.58f)
                lineToRelative(-0.83f, -2f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-1.44f, 0f, -2.64f, 1.02f, -2.93f, 2.37f)
                curveToRelative(-0.47f, -0.24f, -1.0f, -0.37f, -1.57f, -0.37f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.54f, 0.12f, 1.04f, 0.34f, 1.5f)
                horizontalLineToRelative(-1.34f)
                lineTo(2.0f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 13.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                lineTo(2f, 19f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.03f)
                lineToRelative(-3.26f, 3.91f)
                lineToRelative(-2.42f, -5.8f)
                lineToRelative(-1.26f, 1.89f)
                horizontalLineToRelative(-7.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.96f)
                lineTo(14.7f, -0.11f)
                lineToRelative(2.58f, 6.2f)
                lineToRelative(1.74f, -2.09f)
                horizontalLineToRelative(4.97f)
                close()
            }
        }.also { _Procedures = it}
