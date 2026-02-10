package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsFromLine: ImageVector? = null

val Icons.Sc.ArrowsFromLine: ImageVector
    get() = _ArrowsFromLine ?: UXIcon(name = "ArrowsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.41f, 6.78f)
                curveToRelative(0.74f, 0.37f, 1.64f, 0.08f, 2.02f, -0.66f)
                curveToRelative(0.02f, -0.05f, 0.05f, -0.08f, 0.07f, -0.12f)
                verticalLineToRelative(2.02f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0.02f, 0.04f, 0.05f, 0.08f, 0.07f, 0.12f)
                curveToRelative(0.27f, 0.52f, 1.04f, 1.12f, 2.02f, 0.66f)
                curveToRelative(0.75f, -0.35f, 1.03f, -1.28f, 0.66f, -2.02f)
                curveToRelative(-1.4f, -2.77f, -3.5f, -3.59f, -3.74f, -3.68f)
                curveToRelative(-0.33f, -0.12f, -0.69f, -0.12f, -1.02f, 0f)
                curveToRelative(-0.23f, 0.09f, -2.33f, 0.91f, -3.74f, 3.68f)
                curveToRelative(-0.38f, 0.74f, -0.08f, 1.64f, 0.66f, 2.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.59f, 17.22f)
                curveToRelative(-0.74f, -0.37f, -1.64f, -0.08f, -2.02f, 0.66f)
                curveToRelative(-0.02f, 0.05f, -0.05f, 0.08f, -0.07f, 0.12f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.02f)
                curveToRelative(-0.02f, -0.04f, -0.05f, -0.08f, -0.07f, -0.12f)
                curveToRelative(-0.27f, -0.52f, -1.04f, -1.12f, -2.02f, -0.66f)
                curveToRelative(-0.75f, 0.35f, -1.03f, 1.28f, -0.66f, 2.02f)
                curveToRelative(1.4f, 2.77f, 3.5f, 3.59f, 3.74f, 3.68f)
                curveToRelative(0.33f, 0.12f, 0.69f, 0.12f, 1.02f, 0f)
                curveToRelative(0.23f, -0.09f, 2.33f, -0.91f, 3.74f, -3.68f)
                curveToRelative(0.38f, -0.74f, 0.08f, -1.64f, -0.66f, -2.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10.49f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowsFromLine = it}
