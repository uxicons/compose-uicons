package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AccessDenied: ImageVector? = null

val Icons.Sr.AccessDenied: ImageVector
    get() = _AccessDenied ?: UXIcon(name = "AccessDenied") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.06f, 18.04f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.35f, 0f, 0.65f, 0.2f, 0.83f, 0.47f)
                curveToRelative(1.31f, -2.65f, 4.03f, -4.47f, 7.17f, -4.47f)
                curveToRelative(0.35f, 0f, 0.7f, 0.03f, 1.04f, 0.07f)
                curveToRelative(-0.52f, -0.71f, -1.22f, -1.29f, -2.04f, -1.65f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7.73f)
                curveToRelative(-1.67f, -1.47f, -2.73f, -3.61f, -2.73f, -6f)
                close()
                moveTo(5.06f, 7.04f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.71f, 19.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.29f, 1.29f)
                close()
            }
        }.also { _AccessDenied = it}
