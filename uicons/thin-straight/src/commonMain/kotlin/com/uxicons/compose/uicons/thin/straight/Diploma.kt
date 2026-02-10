package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diploma: ImageVector? = null

val Icons.Ts.Diploma: ImageVector
    get() = _Diploma ?: UXIcon(name = "Diploma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 9f)
                lineTo(7f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 5f)
                lineTo(7f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 17.94f)
                verticalLineToRelative(6.0f)
                lineToRelative(-2.5f, -1.68f)
                lineToRelative(-2.5f, 1.68f)
                verticalLineToRelative(-6.0f)
                curveToRelative(-0.62f, -0.63f, -1f, -1.49f, -1f, -2.44f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.54f, 0f, 1.04f, 0.13f, 1.5f, 0.35f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(5.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(3f, 22f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(10.56f)
                curveToRelative(0.62f, 0.63f, 1f, 1.49f, 1f, 2.44f)
                reflectiveCurveToRelative(-0.38f, 1.81f, -1f, 2.44f)
                close()
                moveTo(16f, 15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(20f, 22.06f)
                verticalLineToRelative(-3.41f)
                curveToRelative(-0.46f, 0.22f, -0.96f, 0.35f, -1.5f, 0.35f)
                reflectiveCurveToRelative(-1.04f, -0.13f, -1.5f, -0.35f)
                verticalLineToRelative(3.41f)
                lineToRelative(1.5f, -1.01f)
                lineToRelative(1.5f, 1.01f)
                close()
            }
        }.also { _Diploma = it}
