package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Sr.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.12f, 12.88f)
                curveToRelative(0.56f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                curveToRelative(-1.13f, 1.14f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.87f, -2.11f)
                lineToRelative(1.79f, -1.74f)
                curveToRelative(0.1f, -0.1f, 0.22f, -0.14f, 0.35f, -0.14f)
                reflectiveCurveToRelative(0.25f, 0.05f, 0.35f, 0.14f)
                lineToRelative(1.77f, 1.73f)
                close()
                moveTo(19.78f, 20.78f)
                curveToRelative(-2.08f, 2.08f, -4.84f, 3.22f, -7.78f, 3.22f)
                reflectiveCurveToRelative(-5.7f, -1.15f, -7.78f, -3.22f)
                curveTo(-0.07f, 16.49f, -0.07f, 9.51f, 4.22f, 5.22f)
                lineToRelative(3.99f, -3.69f)
                curveToRelative(1.0f, -0.98f, 2.35f, -1.53f, 3.79f, -1.53f)
                reflectiveCurveToRelative(2.78f, 0.55f, 3.81f, 1.55f)
                lineToRelative(3.94f, 3.64f)
                curveToRelative(4.32f, 4.32f, 4.32f, 11.29f, 0.03f, 15.58f)
                close()
                moveTo(17f, 15.0f)
                curveToRelative(0f, -1.34f, -0.52f, -2.59f, -1.47f, -3.54f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-1.78f, -1.73f)
                curveToRelative(-0.97f, -0.95f, -2.5f, -0.95f, -3.48f, -0.0f)
                lineToRelative(-1.8f, 1.75f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                close()
            }
        }.also { _FireFlameSimple = it}
