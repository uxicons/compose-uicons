package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDollyEmpty: ImageVector? = null

val Icons.Bs.PersonDollyEmpty: ImageVector
    get() = _PersonDollyEmpty ?: UXIcon(name = "PersonDollyEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveTo(1f, 1.12f, 2.12f, 0f, 3.5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1f, 3.88f, 1f, 2.5f)
                close()
                moveTo(0f, 18.12f)
                verticalLineToRelative(5.88f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.97f)
                lineToRelative(-2.38f, -1.46f)
                curveToRelative(-0.22f, -0.14f, -0.43f, -0.29f, -0.62f, -0.45f)
                close()
                moveTo(23.82f, 19.61f)
                lineToRelative(-0.68f, -2.92f)
                lineToRelative(-7.79f, 1.81f)
                lineToRelative(-2.94f, -12.66f)
                lineToRelative(-2.92f, 0.68f)
                lineToRelative(0.81f, 3.49f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(-1.47f, -2.35f)
                curveToRelative(-0.64f, -1.03f, -1.75f, -1.65f, -2.97f, -1.65f)
                horizontalLineToRelative(-1.39f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.66f)
                curveToRelative(0f, 1.05f, 0.53f, 2.0f, 1.43f, 2.56f)
                lineToRelative(3.46f, 2.12f)
                verticalLineToRelative(5.16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.84f)
                lineToRelative(-2.89f, -1.77f)
                verticalLineToRelative(-5.06f)
                lineToRelative(1.67f, 2.67f)
                horizontalLineToRelative(4.32f)
                lineToRelative(1.45f, 6.24f)
                curveToRelative(-0.85f, 0.4f, -1.44f, 1.26f, -1.44f, 2.26f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.02f, -0.0f, -0.05f, -0.0f, -0.07f)
                lineToRelative(7.82f, -1.81f)
                close()
            }
        }.also { _PersonDollyEmpty = it}
