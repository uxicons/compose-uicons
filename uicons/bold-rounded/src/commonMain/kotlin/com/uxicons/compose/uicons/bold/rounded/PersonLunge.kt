package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLunge: ImageVector? = null

val Icons.Br.PersonLunge: ImageVector
    get() = _PersonLunge ?: UXIcon(name = "PersonLunge") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 17.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-1.65f, 0f, -3.5f, -1.67f, -3.5f, -3.5f)
            verticalLineToRelative(-4.79f)
            lineToRelative(-1.91f, 1.32f)
            lineToRelative(1.1f, 2.94f)
            curveToRelative(0.29f, 0.78f, -0.1f, 1.64f, -0.88f, 1.93f)
            curveToRelative(-0.77f, 0.29f, -1.64f, -0.1f, -1.93f, -0.88f)
            lineToRelative(-1.22f, -3.24f)
            curveToRelative(-0.4f, -1.07f, -0.04f, -2.29f, 0.87f, -2.98f)
            lineToRelative(2.81f, -1.95f)
            curveToRelative(0.73f, -0.55f, 1.69f, -0.87f, 2.65f, -0.87f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(12.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(10.85f, 19.04f)
            curveToRelative(-0.77f, -0.3f, -1.64f, 0.08f, -1.94f, 0.85f)
            lineToRelative(-0.43f, 1.11f)
            horizontalLineToRelative(-3.98f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4.32f)
            curveToRelative(1.04f, 0f, 1.95f, -0.62f, 2.33f, -1.59f)
            lineToRelative(0.56f, -1.43f)
            curveToRelative(0.3f, -0.77f, -0.08f, -1.64f, -0.85f, -1.94f)
            close()
        }
    }.also { _PersonLunge = it }
