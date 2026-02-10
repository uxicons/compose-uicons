package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareBolt: ImageVector? = null

val Icons.Ts.SquareBolt: ImageVector
    get() = _SquareBolt ?: UXIcon(name = "SquareBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.44f, 19.69f)
                lineToRelative(-0.89f, -0.46f)
                lineToRelative(3.4f, -6.52f)
                curveToRelative(0.05f, -0.08f, 0.05f, -0.12f, 0.03f, -0.15f)
                curveToRelative(-0.02f, -0.04f, -0.05f, -0.05f, -0.09f, -0.05f)
                horizontalLineToRelative(-5.78f)
                curveToRelative(-0.36f, 0f, -0.68f, -0.16f, -0.9f, -0.45f)
                curveToRelative(-0.21f, -0.29f, -0.28f, -0.65f, -0.17f, -0.99f)
                lineToRelative(3.51f, -6.84f)
                lineToRelative(0.89f, 0.46f)
                lineToRelative(-3.47f, 6.76f)
                reflectiveCurveToRelative(0.04f, 0f, 0.05f, 0.02f)
                curveToRelative(0.02f, 0.02f, 0.04f, 0.05f, 0.09f, 0.05f)
                horizontalLineToRelative(5.78f)
                curveToRelative(0.41f, 0f, 0.78f, 0.22f, 0.97f, 0.58f)
                curveToRelative(0.19f, 0.36f, 0.17f, 0.79f, -0.05f, 1.13f)
                lineToRelative(-3.37f, 6.48f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(2.5f)
                close()
            }
        }.also { _SquareBolt = it}
