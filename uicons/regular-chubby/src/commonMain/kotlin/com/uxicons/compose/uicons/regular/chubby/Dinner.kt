package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Rc.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 12.94f)
                verticalLineToRelative(9.06f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-9.06f)
                curveToRelative(-2.71f, -0.3f, -4f, -1.88f, -4f, -4.94f)
                curveToRelative(0f, -3.48f, 1.55f, -7f, 5f, -7f)
                reflectiveCurveToRelative(5f, 3.52f, 5f, 7f)
                curveToRelative(0f, 3.05f, -1.28f, 4.64f, -4f, 4.94f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, -1.86f, -0.63f, -5f, -3f, -5f)
                reflectiveCurveToRelative(-3f, 3.14f, -3f, 5f)
                curveToRelative(0f, 2.3f, 0.7f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.7f, 3f, -3f)
                close()
                moveTo(13.67f, 18.5f)
                curveToRelative(-0.96f, 0.34f, -2.16f, 0.5f, -3.67f, 0.5f)
                curveToRelative(-5.17f, 0f, -7f, -1.83f, -7f, -7f)
                reflectiveCurveToRelative(1.83f, -7f, 7f, -7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                reflectiveCurveToRelative(2.69f, 9f, 9f, 9f)
                curveToRelative(1.74f, 0f, 3.15f, -0.2f, 4.33f, -0.61f)
                curveToRelative(0.52f, -0.18f, 0.8f, -0.75f, 0.61f, -1.27f)
                curveToRelative(-0.18f, -0.52f, -0.75f, -0.8f, -1.27f, -0.61f)
                close()
            }
        }.also { _Dinner = it}
