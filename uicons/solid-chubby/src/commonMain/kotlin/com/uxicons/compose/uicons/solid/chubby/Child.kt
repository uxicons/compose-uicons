package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Child: ImageVector? = null

val Icons.Sc.Child: ImageVector
    get() = _Child ?: UXIcon(name = "Child") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.64f, 17.97f)
                curveToRelative(-0.03f, 0.12f, -0.08f, 0.23f, -0.14f, 0.32f)
                verticalLineToRelative(3.21f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.51f)
                curveToRelative(-0.17f, 0.01f, -0.34f, 0.01f, -0.5f, 0.01f)
                reflectiveCurveToRelative(-0.33f, -0.01f, -0.5f, -0.01f)
                verticalLineToRelative(2.51f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.21f)
                curveToRelative(-0.06f, -0.1f, -0.12f, -0.2f, -0.14f, -0.32f)
                curveToRelative(-0.01f, -0.07f, -0.36f, -1.63f, -0.36f, -3.47f)
                reflectiveCurveToRelative(0.34f, -3.4f, 0.36f, -3.47f)
                curveToRelative(0.09f, -0.4f, 0.41f, -0.7f, 0.81f, -0.77f)
                curveToRelative(0.06f, -0.01f, 1.56f, -0.26f, 2.83f, -0.26f)
                reflectiveCurveToRelative(2.77f, 0.25f, 2.83f, 0.26f)
                curveToRelative(0.4f, 0.07f, 0.72f, 0.37f, 0.81f, 0.77f)
                curveToRelative(0.01f, 0.07f, 0.36f, 1.63f, 0.36f, 3.47f)
                reflectiveCurveToRelative(-0.34f, 3.4f, -0.36f, 3.47f)
                close()
                moveTo(12f, 9f)
                curveToRelative(1.43f, 0f, 2f, -0.57f, 2f, -2f)
                reflectiveCurveToRelative(-0.57f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.57f, -2f, 2f)
                reflectiveCurveToRelative(0.57f, 2f, 2f, 2f)
                close()
            }
        }.also { _Child = it}
