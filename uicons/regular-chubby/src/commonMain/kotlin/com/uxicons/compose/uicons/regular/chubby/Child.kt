package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Child: ImageVector? = null

val Icons.Rc.Child: ImageVector
    get() = _Child ?: UXIcon(name = "Child") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 7f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(16f, 14.5f)
                curveToRelative(0f, 1.84f, -0.34f, 3.4f, -0.36f, 3.47f)
                curveToRelative(-0.07f, 0.34f, -0.32f, 0.6f, -0.64f, 0.71f)
                verticalLineToRelative(3.32f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.04f)
                curveToRelative(-0.33f, 0.03f, -0.67f, 0.04f, -1f, 0.04f)
                reflectiveCurveToRelative(-0.67f, -0.02f, -1f, -0.04f)
                verticalLineToRelative(3.04f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.32f)
                curveToRelative(-0.32f, -0.11f, -0.57f, -0.38f, -0.64f, -0.71f)
                curveToRelative(-0.01f, -0.07f, -0.36f, -1.63f, -0.36f, -3.47f)
                reflectiveCurveToRelative(0.34f, -3.4f, 0.36f, -3.47f)
                curveToRelative(0.09f, -0.4f, 0.41f, -0.7f, 0.81f, -0.77f)
                curveToRelative(0.06f, -0.01f, 1.56f, -0.26f, 2.83f, -0.26f)
                reflectiveCurveToRelative(2.77f, 0.25f, 2.83f, 0.26f)
                curveToRelative(0.4f, 0.07f, 0.72f, 0.37f, 0.81f, 0.77f)
                curveToRelative(0.01f, 0.07f, 0.36f, 1.63f, 0.36f, 3.47f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0f, -0.93f, -0.1f, -1.8f, -0.19f, -2.36f)
                curveToRelative(-0.5f, -0.06f, -1.2f, -0.14f, -1.81f, -0.14f)
                reflectiveCurveToRelative(-1.31f, 0.07f, -1.81f, 0.14f)
                curveToRelative(-0.09f, 0.57f, -0.19f, 1.43f, -0.19f, 2.36f)
                reflectiveCurveToRelative(0.1f, 1.8f, 0.19f, 2.36f)
                curveToRelative(0.5f, 0.06f, 1.2f, 0.14f, 1.81f, 0.14f)
                reflectiveCurveToRelative(1.31f, -0.07f, 1.81f, -0.14f)
                curveToRelative(0.09f, -0.57f, 0.19f, -1.43f, 0.19f, -2.36f)
                close()
            }
        }.also { _Child = it}
