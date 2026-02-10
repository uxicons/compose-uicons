package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Sr.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14.82f, 9.49f)
                curveToRelative(-0.25f, -1.99f, -1.95f, -3.49f, -3.95f, -3.49f)
                reflectiveCurveToRelative(-3.7f, 1.5f, -3.95f, 3.49f)
                lineToRelative(-0.07f, 0.54f)
                lineToRelative(3.71f, 2.44f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.28f, 1.39f)
                curveToRelative(-0.19f, 0.29f, -0.51f, 0.45f, -0.83f, 0.45f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.05f, -0.55f, -0.17f)
                lineToRelative(-2.87f, -1.89f)
                lineToRelative(-0.55f, 4.38f)
                curveToRelative(-0.11f, 0.85f, 0.16f, 1.71f, 0.73f, 2.36f)
                curveToRelative(0.34f, 0.39f, 0.78f, 0.66f, 1.25f, 0.83f)
                verticalLineToRelative(3.19f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.43f, 0f, 0.81f, -0.27f, 0.94f, -0.67f)
                curveToRelative(0.11f, -0.31f, 1.05f, -3.11f, 1.05f, -4.83f)
                curveToRelative(0f, -2.15f, -1.26f, -4.12f, -3.18f, -5.01f)
                close()
            }
        }.also { _PersonPregnant = it}
