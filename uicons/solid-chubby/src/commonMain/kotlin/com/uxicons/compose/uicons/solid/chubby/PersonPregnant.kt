package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Sc.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(14.88f, 9.58f)
                curveToRelative(-0.24f, -0.83f, -0.5f, -1.51f, -0.77f, -2.03f)
                curveToRelative(-0.78f, -1.55f, -2.54f, -1.55f, -3.11f, -1.55f)
                reflectiveCurveToRelative(-2.33f, 0f, -3.11f, 1.54f)
                curveToRelative(-0.36f, 0.69f, -0.68f, 1.61f, -0.95f, 2.64f)
                curveToRelative(1.35f, 1.34f, 3.28f, 1.85f, 3.3f, 1.85f)
                curveToRelative(0.54f, 0.14f, 0.86f, 0.68f, 0.72f, 1.21f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.1f, -0.02f, -1.74f, -0.45f, -3.3f, -1.59f)
                curveToRelative(-0.32f, 1.83f, -0.49f, 3.72f, -0.46f, 5.14f)
                curveToRelative(0.02f, 0.72f, 0.01f, 0.69f, 0.0f, 1.04f)
                curveToRelative(0.03f, 0.44f, 0.35f, 0.81f, 0.78f, 0.91f)
                curveToRelative(0.04f, 0.01f, 0.54f, 0.12f, 1.22f, 0.23f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.36f, 0f, 0.68f, -0.01f, 1f, -0.03f)
                verticalLineToRelative(1.53f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.24f, -0.03f, 0.48f, -0.07f, 0.68f, -0.1f)
                curveToRelative(0.22f, -0.03f, 0.42f, -0.06f, 0.59f, -0.08f)
                curveToRelative(0.39f, -0.05f, 0.71f, -0.32f, 0.83f, -0.69f)
                curveToRelative(0.34f, -1.06f, 0.9f, -3.03f, 0.9f, -4.35f)
                curveToRelative(0f, -2.1f, -1.23f, -4.01f, -3.12f, -4.92f)
                close()
            }
        }.also { _PersonPregnant = it}
