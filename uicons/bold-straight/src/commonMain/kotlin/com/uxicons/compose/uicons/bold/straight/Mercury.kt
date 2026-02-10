package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mercury: ImageVector? = null

val Icons.Bs.Mercury: ImageVector
    get() = _Mercury ?: UXIcon(name = "Mercury") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                curveToRelative(0f, -2.67f, -1.32f, -5.05f, -3.34f, -6.5f)
                curveToRelative(1.22f, -0.88f, 2.18f, -2.09f, 2.75f, -3.5f)
                horizontalLineToRelative(-3.44f)
                curveToRelative(-0.91f, 1.21f, -2.35f, 2f, -3.97f, 2f)
                reflectiveCurveToRelative(-3.06f, -0.79f, -3.97f, -2f)
                horizontalLineToRelative(-3.44f)
                curveToRelative(0.57f, 1.41f, 1.54f, 2.62f, 2.75f, 3.5f)
                curveToRelative(-2.02f, 1.45f, -3.34f, 3.83f, -3.34f, 6.5f)
                curveToRelative(0f, 3.9f, 2.8f, 7.15f, 6.5f, 7.86f)
                verticalLineToRelative(1.14f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.14f)
                curveToRelative(3.7f, -0.7f, 6.5f, -3.96f, 6.5f, -7.86f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
            }
        }.also { _Mercury = it}
