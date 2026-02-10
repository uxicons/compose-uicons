package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressBurst: ImageVector? = null

val Icons.Ss.PersonDressBurst: ImageVector
    get() = _PersonDressBurst ?: UXIcon(name = "PersonDressBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 20f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(1.42f, -11.37f)
                curveToRelative(0.19f, -1.5f, 1.47f, -2.63f, 2.98f, -2.63f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.51f, 0f, 2.79f, 1.13f, 2.98f, 2.63f)
                lineToRelative(1.42f, 11.37f)
                horizontalLineToRelative(-2.13f)
                close()
                moveTo(11.07f, 0f)
                lineToRelative(-2.47f, 4.64f)
                lineTo(0f, 0.02f)
                lineTo(5.19f, 8.17f)
                lineTo(0.22f, 10.62f)
                lineToRelative(5.1f, 2.25f)
                lineToRelative(-1.89f, 5.15f)
                lineToRelative(5.14f, -1.77f)
                lineToRelative(2.61f, 4.88f)
                lineToRelative(0.72f, -1.46f)
                lineToRelative(1.42f, -11.33f)
                curveToRelative(0.12f, -0.91f, 0.48f, -1.74f, 1.02f, -2.42f)
                lineTo(11.07f, 0f)
                close()
            }
        }.also { _PersonDressBurst = it}
