package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Sc.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(20.31f, 11.77f)
                reflectiveCurveToRelative(-3.31f, -5.77f, -8.31f, -5.77f)
                reflectiveCurveToRelative(-8.32f, 5.78f, -8.32f, 5.78f)
                curveToRelative(-0.4f, 0.73f, -0.13f, 1.64f, 0.59f, 2.04f)
                curveToRelative(0.71f, 0.4f, 1.64f, 0.14f, 2.04f, -0.59f)
                curveToRelative(0.01f, -0.02f, 0.48f, -0.84f, 1.33f, -1.76f)
                curveToRelative(-0.44f, 2.09f, -0.68f, 4.4f, -0.64f, 6.07f)
                curveToRelative(0.02f, 0.71f, 0.01f, 0.69f, 0.0f, 1.04f)
                curveToRelative(0.03f, 0.44f, 0.35f, 0.81f, 0.78f, 0.91f)
                curveToRelative(0.03f, 0.01f, 0.31f, 0.07f, 0.72f, 0.14f)
                verticalLineToRelative(1.88f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.51f)
                curveToRelative(0.17f, 0.01f, 0.34f, 0.01f, 0.5f, 0.01f)
                reflectiveCurveToRelative(0.33f, -0.01f, 0.5f, -0.01f)
                verticalLineToRelative(1.51f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.88f)
                curveToRelative(0.41f, -0.08f, 0.69f, -0.14f, 0.72f, -0.14f)
                curveToRelative(0.43f, -0.1f, 0.75f, -0.47f, 0.78f, -0.91f)
                curveToRelative(-0.0f, -0.35f, -0.01f, -0.33f, 0.0f, -1.04f)
                curveToRelative(0.04f, -1.67f, -0.2f, -3.97f, -0.64f, -6.06f)
                curveToRelative(0.84f, 0.92f, 1.32f, 1.75f, 1.33f, 1.77f)
                curveToRelative(0.4f, 0.72f, 1.31f, 0.98f, 2.04f, 0.58f)
                curveToRelative(0.72f, -0.4f, 0.99f, -1.31f, 0.58f, -2.04f)
                close()
            }
        }.also { _PersonDress = it}
