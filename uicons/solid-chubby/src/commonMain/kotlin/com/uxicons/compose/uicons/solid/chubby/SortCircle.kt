package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircle: ImageVector? = null

val Icons.Sc.SortCircle: ImageVector
    get() = _SortCircle ?: UXIcon(name = "SortCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(16.81f, 15f)
                curveToRelative(-1.11f, 1.56f, -2.52f, 2.82f, -4.31f, 3.86f)
                curveToRelative(-0.31f, 0.18f, -0.7f, 0.18f, -1.01f, 0f)
                curveToRelative(-1.79f, -1.04f, -3.2f, -2.31f, -4.31f, -3.86f)
                curveToRelative(-0.42f, -0.55f, -0.09f, -1.42f, 0.59f, -1.56f)
                curveToRelative(0.08f, -0.02f, 1.95f, -0.44f, 4.23f, -0.44f)
                reflectiveCurveToRelative(4.15f, 0.43f, 4.22f, 0.44f)
                curveToRelative(0.68f, 0.14f, 1.01f, 1.01f, 0.59f, 1.56f)
                close()
                moveTo(16.94f, 9.94f)
                curveToRelative(-0.12f, 0.31f, -0.39f, 0.55f, -0.71f, 0.62f)
                curveToRelative(-0.08f, 0.02f, -1.95f, 0.44f, -4.22f, 0.44f)
                reflectiveCurveToRelative(-4.15f, -0.43f, -4.23f, -0.44f)
                curveToRelative(-0.68f, -0.14f, -1.01f, -1.01f, -0.59f, -1.56f)
                curveToRelative(1.11f, -1.55f, 2.52f, -2.82f, 4.31f, -3.86f)
                curveToRelative(0.31f, -0.18f, 0.7f, -0.18f, 1.01f, 0f)
                curveToRelative(1.78f, 1.04f, 3.19f, 2.31f, 4.31f, 3.86f)
                curveToRelative(0.2f, 0.27f, 0.24f, 0.62f, 0.12f, 0.94f)
                close()
            }
        }.also { _SortCircle = it}
