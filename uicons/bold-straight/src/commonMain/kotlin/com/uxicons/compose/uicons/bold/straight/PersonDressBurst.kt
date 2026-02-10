package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressBurst: ImageVector? = null

val Icons.Bs.PersonDressBurst: ImageVector
    get() = _PersonDressBurst ?: UXIcon(name = "PersonDressBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(1.49f, -11.94f)
                curveToRelative(0.22f, -1.75f, 1.71f, -3.06f, 3.47f, -3.06f)
                horizontalLineToRelative(1.14f)
                curveToRelative(1.76f, 0f, 3.25f, 1.32f, 3.47f, 3.07f)
                lineToRelative(1.49f, 11.93f)
                horizontalLineToRelative(-2.01f)
                close()
                moveTo(16.34f, 18f)
                horizontalLineToRelative(4.27f)
                lineToRelative(-1.07f, -8.56f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.14f)
                curveToRelative(-0.25f, 0f, -0.47f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-1.07f, 8.56f)
                close()
                moveTo(11.06f, -0.04f)
                lineToRelative(-2.45f, 4.61f)
                lineTo(0.13f, 0.07f)
                lineTo(4.99f, 8.26f)
                lineTo(-0.04f, 10.74f)
                lineToRelative(5.21f, 2.3f)
                lineToRelative(-1.93f, 5.25f)
                lineToRelative(5.3f, -1.82f)
                lineToRelative(2.4f, 4.47f)
                lineToRelative(0.64f, -5.13f)
                lineToRelative(-1.6f, -3.01f)
                lineToRelative(-1.75f, 0.6f)
                lineToRelative(0.72f, -1.97f)
                lineToRelative(-1.91f, -0.84f)
                lineToRelative(2.18f, -1.07f)
                lineToRelative(-1.06f, -1.78f)
                lineToRelative(1.67f, 0.89f)
                lineToRelative(1.22f, -2.29f)
                lineToRelative(1.35f, 2.77f)
                lineToRelative(0.04f, -0.29f)
                curveToRelative(0.16f, -1.26f, 0.75f, -2.37f, 1.6f, -3.21f)
                lineTo(11.06f, -0.04f)
                close()
            }
        }.also { _PersonDressBurst = it}
