package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToLine: ImageVector? = null

val Icons.Tc.ArrowsToLine: ImageVector
    get() = _ArrowsToLine ?: UXIcon(name = "ArrowsToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 11.5f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(22.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.56f, 5.15f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.68f, 0.21f)
                curveToRelative(-0.76f, 1.45f, -1.74f, 2.26f, -2.38f, 2.67f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.53f)
                curveToRelative(-0.64f, -0.41f, -1.62f, -1.22f, -2.38f, -2.67f)
                curveToRelative(-0.09f, -0.17f, -0.36f, -0.38f, -0.68f, -0.21f)
                curveToRelative(-0.24f, 0.13f, -0.34f, 0.43f, -0.21f, 0.68f)
                curveToRelative(1.42f, 2.71f, 3.52f, 3.47f, 3.6f, 3.5f)
                curveToRelative(0.11f, 0.04f, 0.23f, 0.04f, 0.33f, 0f)
                curveToRelative(0.09f, -0.03f, 2.19f, -0.79f, 3.6f, -3.5f)
                curveToRelative(0.13f, -0.24f, 0.03f, -0.55f, -0.21f, -0.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.44f, 18.85f)
                curveToRelative(0.24f, 0.13f, 0.55f, 0.03f, 0.68f, -0.21f)
                curveToRelative(0.76f, -1.45f, 1.74f, -2.26f, 2.38f, -2.67f)
                verticalLineToRelative(6.53f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0.64f, 0.41f, 1.62f, 1.22f, 2.38f, 2.67f)
                curveToRelative(0.09f, 0.17f, 0.36f, 0.38f, 0.68f, 0.21f)
                curveToRelative(0.24f, -0.13f, 0.34f, -0.43f, 0.21f, -0.68f)
                curveToRelative(-1.42f, -2.71f, -3.52f, -3.47f, -3.6f, -3.5f)
                curveToRelative(-0.11f, -0.04f, -0.23f, -0.04f, -0.33f, 0f)
                curveToRelative(-0.09f, 0.03f, -2.19f, 0.79f, -3.6f, 3.5f)
                curveToRelative(-0.13f, 0.24f, -0.03f, 0.55f, 0.21f, 0.68f)
                close()
            }
        }.also { _ArrowsToLine = it}
