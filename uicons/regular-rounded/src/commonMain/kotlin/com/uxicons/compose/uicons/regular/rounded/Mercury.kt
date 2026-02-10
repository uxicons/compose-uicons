package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Rr.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                curveToRelative(0f, -3.01f, -1.67f, -5.63f, -4.13f, -7.0f)
                curveToRelative(0.62f, -0.35f, 1.2f, -0.78f, 1.73f, -1.29f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.42f, -0.01f)
                curveToRelative(-1.13f, 1.1f, -2.62f, 1.71f, -4.2f, 1.71f)
                reflectiveCurveToRelative(-3.07f, -0.61f, -4.2f, -1.71f)
                curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.42f, 0.01f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.01f, 1.41f)
                curveToRelative(0.52f, 0.51f, 1.1f, 0.94f, 1.73f, 1.29f)
                curveToRelative(-2.46f, 1.37f, -4.13f, 3.99f, -4.13f, 7.0f)
                curveToRelative(0f, 4.07f, 3.06f, 7.44f, 7f, 7.94f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.06f)
                curveToRelative(3.94f, -0.49f, 7f, -3.87f, 7f, -7.94f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _Mercury = it}
