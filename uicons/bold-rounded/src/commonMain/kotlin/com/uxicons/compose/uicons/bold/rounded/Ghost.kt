package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Br.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10f, 10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(15.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(22f, 10f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.76f, -0.57f, 1.43f, -1.33f, 1.51f)
            curveToRelative(-0.76f, 0.09f, -1.46f, -0.39f, -1.63f, -1.13f)
            curveToRelative(-0.1f, -0.42f, -0.61f, -0.88f, -1.37f, -0.88f)
            reflectiveCurveToRelative(-1.27f, 0.45f, -1.37f, 0.88f)
            curveToRelative(-0.16f, 0.68f, -0.76f, 1.16f, -1.46f, 1.16f)
            reflectiveCurveToRelative(-1.3f, -0.48f, -1.46f, -1.16f)
            curveToRelative(-0.1f, -0.42f, -0.61f, -0.88f, -1.37f, -0.88f)
            reflectiveCurveToRelative(-1.27f, 0.45f, -1.37f, 0.88f)
            curveToRelative(-0.16f, 0.68f, -0.76f, 1.16f, -1.46f, 1.16f)
            reflectiveCurveToRelative(-1.3f, -0.48f, -1.46f, -1.16f)
            curveToRelative(-0.1f, -0.42f, -0.61f, -0.88f, -1.37f, -0.88f)
            reflectiveCurveToRelative(-1.27f, 0.45f, -1.37f, 0.88f)
            curveToRelative(-0.16f, 0.69f, -0.77f, 1.16f, -1.46f, 1.16f)
            curveToRelative(-0.06f, 0f, -0.11f, -0.0f, -0.17f, -0.01f)
            curveToRelative(-0.76f, -0.09f, -1.33f, -0.73f, -1.33f, -1.49f)
            verticalLineToRelative(-12.54f)
            curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
            reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
            close()
            moveTo(19f, 10f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
            verticalLineToRelative(9.19f)
            curveToRelative(0.42f, -0.13f, 0.87f, -0.19f, 1.33f, -0.19f)
            curveToRelative(1.06f, 0f, 2.06f, 0.36f, 2.83f, 0.96f)
            curveToRelative(0.77f, -0.6f, 1.77f, -0.96f, 2.83f, -0.96f)
            reflectiveCurveToRelative(2.06f, 0.36f, 2.83f, 0.96f)
            curveToRelative(1.11f, -0.86f, 2.77f, -1.18f, 4.17f, -0.77f)
            verticalLineToRelative(-9.19f)
            close()
        }
    }.also { _Ghost = it }
