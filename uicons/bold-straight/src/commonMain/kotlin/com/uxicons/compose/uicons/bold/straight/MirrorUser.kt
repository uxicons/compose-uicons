package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MirrorUser: ImageVector? = null

val Icons.Bs.MirrorUser: ImageVector
    get() = _MirrorUser ?: UXIcon(name = "MirrorUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.84f, 9.96f)
                curveToRelative(-1.0f, -2.42f, -1.92f, -4.64f, -3.0f, -6.0f)
                horizontalLineToRelative(-0.0f)
                curveTo(4.36f, 2.0f, 2.29f, 0.64f, 0f, 0f)
                verticalLineTo(3.15f)
                curveToRelative(1.36f, 0.54f, 2.57f, 1.45f, 3.48f, 2.66f)
                curveToRelative(0.01f, 0.01f, 0.03f, 0.03f, 0.04f, 0.04f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(0.96f, 1.17f, 2.23f, 4.52f, 3.14f, 6.65f)
                horizontalLineToRelative(-1.56f)
                lineToRelative(-0.7f, 5.07f)
                curveToRelative(-0.03f, 0.25f, -0.25f, 0.43f, -0.49f, 0.43f)
                horizontalLineTo(0f)
                verticalLineToRelative(6f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.89f)
                curveToRelative(1.74f, 0f, 3.23f, -1.3f, 3.47f, -3.02f)
                lineToRelative(0.34f, -2.48f)
                horizontalLineToRelative(2.3f)
                verticalLineToRelative(-2.82f)
                curveToRelative(-0.4f, -0.88f, -0.77f, -1.78f, -1.16f, -2.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                curveToRelative(-3.94f, 0f, -6f, 6.04f, -6f, 12f)
                reflectiveCurveToRelative(2.06f, 12f, 6f, 12f)
                reflectiveCurveToRelative(6f, -6.04f, 6f, -12f)
                reflectiveCurveTo(21.94f, 0f, 18f, 0f)
                close()
                moveTo(18f, 21f)
                curveToRelative(-1.06f, 0f, -3f, -3.42f, -3f, -9f)
                reflectiveCurveToRelative(1.94f, -9f, 3f, -9f)
                curveToRelative(0.59f, 0f, 1.46f, 1.07f, 2.11f, 2.98f)
                curveToRelative(-1.1f, 1.94f, -2.17f, 4.62f, -3.11f, 6.7f)
                verticalLineToRelative(2.82f)
                horizontalLineToRelative(2.3f)
                lineToRelative(0.34f, 2.48f)
                curveToRelative(0.04f, 0.26f, 0.11f, 0.51f, 0.2f, 0.74f)
                curveToRelative(-0.61f, 1.47f, -1.33f, 2.28f, -1.84f, 2.28f)
                close()
            }
        }.also { _MirrorUser = it}
