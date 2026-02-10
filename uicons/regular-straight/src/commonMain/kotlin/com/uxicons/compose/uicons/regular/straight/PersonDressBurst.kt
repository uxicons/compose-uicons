package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressBurst: ImageVector? = null

val Icons.Rs.PersonDressBurst: ImageVector
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
                moveTo(16.13f, 18f)
                horizontalLineToRelative(5.73f)
                lineToRelative(-1.14f, -9.12f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.38f, -0.99f, 0.88f)
                lineToRelative(-1.14f, 9.12f)
                close()
                moveTo(11.07f, 4.25f)
                lineToRelative(2.24f, 4.09f)
                curveToRelative(0.12f, -0.91f, 0.48f, -1.74f, 1.02f, -2.42f)
                lineTo(11.07f, 0f)
                lineToRelative(-2.47f, 4.64f)
                lineTo(0f, 0.02f)
                lineTo(5.19f, 8.17f)
                lineTo(0.22f, 10.62f)
                lineToRelative(5.1f, 2.25f)
                lineToRelative(-1.89f, 5.15f)
                lineToRelative(5.14f, -1.77f)
                lineToRelative(2.61f, 4.88f)
                lineToRelative(0.72f, -1.46f)
                lineToRelative(0.74f, -5.89f)
                lineToRelative(-1.49f, 3.03f)
                lineToRelative(-1.61f, -3.01f)
                lineToRelative(-2.77f, 0.95f)
                lineToRelative(1.09f, -2.96f)
                lineToRelative(-2.9f, -1.28f)
                lineToRelative(3.13f, -1.54f)
                lineToRelative(-2.27f, -3.56f)
                lineToRelative(3.61f, 1.94f)
                lineToRelative(1.65f, -3.1f)
                close()
            }
        }.also { _PersonDressBurst = it}
