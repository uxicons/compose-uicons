package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Supplier: ImageVector? = null

val Icons.Br.Supplier: ImageVector
    get() = _Supplier ?: UXIcon(name = "Supplier") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.75f, 18.05f)
            curveToRelative(0.46f, 0.69f, 0.27f, 1.62f, -0.42f, 2.08f)
            curveToRelative(-1f, 0.67f, -2.35f, 0.49f, -3.14f, -0.42f)
            lineToRelative(-1.77f, -2.02f)
            curveToRelative(-1.51f, 1.12f, -2.42f, 2.91f, -2.42f, 4.81f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -3.17f, 1.71f, -6.14f, 4.45f, -7.76f)
            curveToRelative(0.91f, -0.53f, 2.09f, -0.34f, 2.79f, 0.47f)
            lineToRelative(1.93f, 2.2f)
            curveToRelative(0.59f, -0.13f, 1.22f, 0.1f, 1.58f, 0.63f)
            close()
            moveTo(3f, 6f)
            curveTo(3f, 2.69f, 5.69f, 0f, 9f, 0f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            close()
            moveTo(6f, 6f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            close()
            moveTo(24f, 17f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
            close()
            moveTo(20.5f, 18f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            close()
        }
    }.also { _Supplier = it }
