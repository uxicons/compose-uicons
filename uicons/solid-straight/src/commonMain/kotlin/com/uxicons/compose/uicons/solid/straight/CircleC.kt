package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Ss.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(11.63f, 16.25f)
                horizontalLineToRelative(0.45f)
                curveToRelative(1.21f, 0f, 2.24f, -0.59f, 2.75f, -1.58f)
                lineToRelative(1.78f, 0.92f)
                curveToRelative(-0.85f, 1.64f, -2.58f, 2.67f, -4.53f, 2.67f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(-2.83f, 0f, -5.05f, -2.2f, -5.05f, -5f)
                verticalLineToRelative(-2.41f)
                curveToRelative(0f, -2.81f, 2.27f, -5.09f, 5.05f, -5.09f)
                horizontalLineToRelative(0.45f)
                curveToRelative(1.95f, 0f, 3.69f, 1.08f, 4.56f, 2.83f)
                lineToRelative(-1.79f, 0.89f)
                curveToRelative(-0.53f, -1.06f, -1.59f, -1.72f, -2.77f, -1.72f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(-1.71f, 0f, -3.05f, 1.36f, -3.05f, 3.09f)
                verticalLineToRelative(2.41f)
                curveToRelative(0f, 1.68f, 1.34f, 3f, 3.05f, 3f)
                close()
            }
        }.also { _CircleC = it}
