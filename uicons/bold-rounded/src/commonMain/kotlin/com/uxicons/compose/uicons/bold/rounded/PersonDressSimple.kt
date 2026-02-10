package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressSimple: ImageVector? = null

val Icons.Br.PersonDressSimple: ImageVector
    get() = _PersonDressSimple ?: UXIcon(name = "PersonDressSimple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(17.11f, 18.8f)
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
            lineToRelative(0.82f, -5.99f)
            curveToRelative(0.32f, -2.3f, 2.3f, -4.04f, 4.63f, -4.04f)
            reflectiveCurveToRelative(4.31f, 1.74f, 4.63f, 4.04f)
            lineToRelative(0.82f, 5.99f)
            curveToRelative(0.14f, 1.0f, -0.17f, 2.01f, -0.83f, 2.77f)
            close()
            moveTo(10.03f, 16.43f)
            curveToRelative(-0.03f, 0.2f, 0.06f, 0.33f, 0.12f, 0.4f)
            reflectiveCurveToRelative(0.18f, 0.17f, 0.38f, 0.17f)
            horizontalLineToRelative(3.95f)
            curveToRelative(0.2f, 0f, 0.32f, -0.11f, 0.38f, -0.17f)
            reflectiveCurveToRelative(0.14f, -0.2f, 0.12f, -0.4f)
            lineToRelative(-0.82f, -5.99f)
            curveToRelative(-0.11f, -0.82f, -0.82f, -1.44f, -1.65f, -1.44f)
            reflectiveCurveToRelative(-1.54f, 0.62f, -1.65f, 1.44f)
            lineToRelative(-0.82f, 5.99f)
            close()
        }
    }.also { _PersonDressSimple = it }
