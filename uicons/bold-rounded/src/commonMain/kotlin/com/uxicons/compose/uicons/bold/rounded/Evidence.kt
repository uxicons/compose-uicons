package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Evidence: ImageVector? = null

val Icons.Br.Evidence: ImageVector
    get() = _Evidence ?: UXIcon(name = "Evidence") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-5.54f, -5.54f)
            curveToRelative(1.22f, -1.66f, 1.96f, -3.7f, 1.96f, -5.91f)
            curveToRelative(0f, -5.51f, -4.48f, -9.99f, -9.99f, -9.99f)
            reflectiveCurveToRelative(-9.99f, 4.48f, -9.99f, 9.99f)
            reflectiveCurveToRelative(4.48f, 9.99f, 9.99f, 9.99f)
            curveToRelative(2.21f, 0f, 4.25f, -0.73f, 5.91f, -1.96f)
            lineToRelative(5.54f, 5.54f)
            curveToRelative(0.58f, 0.58f, 1.53f, 0.58f, 2.12f, 0f)
            reflectiveCurveToRelative(0.58f, -1.53f, 0f, -2.12f)
            close()
            moveTo(3.0f, 9.99f)
            curveToRelative(0f, -3.85f, 3.14f, -6.99f, 6.99f, -6.99f)
            reflectiveCurveToRelative(6.99f, 3.14f, 6.99f, 6.99f)
            curveToRelative(-0.0f, 3.85f, -3.14f, 6.99f, -6.99f, 6.99f)
            curveToRelative(-3.85f, 0f, -6.99f, -3.14f, -6.99f, -6.99f)
            close()
            moveTo(11.5f, 11.02f)
            curveToRelative(-0.28f, -0.83f, -0.48f, -2.1f, -0.48f, -3.0f)
            curveToRelative(0f, -1.5f, 0.62f, -2.5f, 1.5f, -2.5f)
            curveToRelative(1.0f, 0f, 2.5f, 0.18f, 2.5f, 3.18f)
            curveToRelative(0f, 0.7f, -0.5f, 2.31f, -0.5f, 2.31f)
            curveToRelative(0f, 0.0f, -3.01f, 0f, -3.01f, 0f)
            close()
            moveTo(11.52f, 12.02f)
            horizontalLineToRelative(2.8f)
            curveToRelative(0f, 1.25f, -0.15f, 3.0f, -1.45f, 3.0f)
            curveToRelative(-0.73f, 0f, -1.36f, -0.63f, -1.36f, -1.5f)
            curveToRelative(0.01f, -0.31f, 0f, -1.5f, 0f, -1.5f)
            close()
            moveTo(9.02f, 8.02f)
            curveToRelative(0f, 0.89f, -0.21f, 2.17f, -0.48f, 3.0f)
            curveToRelative(0f, 0f, -3.01f, 0.0f, -3.01f, 0f)
            curveToRelative(0f, 0f, -0.5f, -1.62f, -0.5f, -2.31f)
            curveToRelative(0f, -3.0f, 1.5f, -3.18f, 2.5f, -3.18f)
            curveToRelative(0.88f, 0f, 1.5f, 1.0f, 1.5f, 2.5f)
            close()
            moveTo(8.52f, 12.02f)
            reflectiveCurveToRelative(-0.01f, 1.19f, 0f, 1.5f)
            curveToRelative(0f, 0.87f, -0.62f, 1.5f, -1.36f, 1.5f)
            curveToRelative(-1.29f, 0f, -1.45f, -1.75f, -1.45f, -3.0f)
            close()
        }
    }.also { _Evidence = it }
