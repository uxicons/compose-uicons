package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Br.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(20.53f, 14.59f)
            curveToRelative(-0.29f, 0.27f, -0.66f, 0.41f, -1.03f, 0.41f)
            curveToRelative(-0.4f, 0f, -0.8f, -0.16f, -1.09f, -0.47f)
            lineToRelative(-0.78f, -0.83f)
            lineToRelative(0.32f, 2.33f)
            curveToRelative(0.14f, 1.0f, -0.17f, 2.01f, -0.83f, 2.77f)
            curveToRelative(-0.31f, 0.36f, -0.69f, 0.64f, -1.11f, 0.84f)
            verticalLineToRelative(2.86f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.86f)
            curveToRelative(-0.42f, -0.2f, -0.8f, -0.48f, -1.11f, -0.84f)
            curveToRelative(-0.67f, -0.76f, -0.97f, -1.77f, -0.83f, -2.77f)
            lineToRelative(0.32f, -2.33f)
            lineToRelative(-0.78f, 0.83f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.47f, -1.09f, 0.47f)
            curveToRelative(-0.37f, 0f, -0.74f, -0.14f, -1.03f, -0.41f)
            curveToRelative(-0.6f, -0.57f, -0.63f, -1.52f, -0.07f, -2.12f)
            curveToRelative(0f, 0f, 4.75f, -5.04f, 4.78f, -5.06f)
            curveToRelative(0.85f, -0.86f, 2.02f, -1.41f, 3.31f, -1.41f)
            reflectiveCurveToRelative(2.46f, 0.54f, 3.31f, 1.41f)
            curveToRelative(0.03f, 0.03f, 4.78f, 5.06f, 4.78f, 5.06f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.07f, 2.12f)
            close()
            moveTo(12.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.54f, 0.62f, -1.65f, 1.44f)
            lineToRelative(-0.82f, 5.99f)
            curveToRelative(-0.03f, 0.2f, 0.06f, 0.33f, 0.12f, 0.4f)
            curveToRelative(0.06f, 0.06f, 0.18f, 0.17f, 0.38f, 0.17f)
            horizontalLineToRelative(3.95f)
            curveToRelative(0.2f, 0f, 0.32f, -0.11f, 0.38f, -0.17f)
            curveToRelative(0.06f, -0.06f, 0.15f, -0.2f, 0.12f, -0.4f)
            lineToRelative(-0.82f, -5.99f)
            curveToRelative(-0.11f, -0.82f, -0.82f, -1.44f, -1.65f, -1.44f)
            close()
        }
    }.also { _PersonDress = it }
