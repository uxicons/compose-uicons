package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Sc.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12.83f)
                verticalLineToRelative(8.67f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-8.67f)
                curveToRelative(-2.03f, -0.46f, -3f, -1.97f, -3f, -4.83f)
                curveToRelative(0f, -3.14f, 1.39f, -7f, 4.5f, -7f)
                reflectiveCurveToRelative(4.5f, 3.86f, 4.5f, 7f)
                curveToRelative(0f, 2.86f, -0.97f, 4.37f, -3f, 4.83f)
                close()
                moveTo(15f, 14.23f)
                verticalLineToRelative(5.89f)
                curveToRelative(-1.31f, 0.59f, -2.97f, 0.88f, -5f, 0.88f)
                curveToRelative(-6.31f, 0f, -9f, -2.69f, -9f, -9f)
                reflectiveCurveToRelative(2.69f, -9f, 9f, -9f)
                curveToRelative(1.08f, 0f, 2.04f, 0.09f, 2.91f, 0.25f)
                curveToRelative(-0.6f, 1.44f, -0.91f, 3.1f, -0.91f, 4.75f)
                curveToRelative(0f, 3.52f, 1.31f, 5.34f, 3f, 6.23f)
                close()
                moveTo(11f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.59f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2f, -2f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                close()
            }
        }.also { _Dinner = it}
