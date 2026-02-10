package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kazoo: ImageVector? = null

val Icons.Sr.Kazoo: ImageVector
    get() = _Kazoo ?: UXIcon(name = "Kazoo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.06f, 15.35f)
                lineToRelative(-1.15f, 1.15f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(1.19f, -1.19f)
                curveToRelative(-2.76f, -0.72f, -4.94f, -2.87f, -5.7f, -5.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.45f, 2.25f)
                lineToRelative(-0.7f, -0.7f)
                curveToRelative(-0.67f, -0.67f, -1.73f, -0.78f, -2.52f, -0.25f)
                lineToRelative(-6.01f, 4.32f)
                curveToRelative(2.47f, 0.8f, 4.42f, 2.77f, 5.2f, 5.25f)
                lineToRelative(4.29f, -6.1f)
                curveToRelative(0.53f, -0.79f, 0.42f, -1.85f, -0.25f, -2.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.77f, 7.23f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12.77f, 14.23f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Kazoo = it}
