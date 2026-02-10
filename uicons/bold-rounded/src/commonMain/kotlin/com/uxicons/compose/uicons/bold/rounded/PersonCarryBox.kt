package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCarryBox: ImageVector? = null

val Icons.Br.PersonCarryBox: ImageVector
    get() = _PersonCarryBox ?: UXIcon(name = "PersonCarryBox") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-1.67f)
            lineToRelative(-1.32f, -2.12f)
            curveToRelative(-0.73f, -1.18f, -2.0f, -1.88f, -3.39f, -1.88f)
            horizontalLineToRelative(-0.61f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(4.08f)
            curveToRelative(0f, 1.4f, 0.74f, 2.71f, 1.94f, 3.43f)
            lineToRelative(3.06f, 1.83f)
            verticalLineToRelative(4.15f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.43f)
            curveToRelative(0f, -0.87f, -0.46f, -1.69f, -1.21f, -2.14f)
            lineToRelative(-1.79f, -1.07f)
            verticalLineToRelative(-4.52f)
            lineToRelative(0.93f, 1.49f)
            curveToRelative(0.46f, 0.74f, 1.25f, 1.18f, 2.12f, 1.18f)
            horizontalLineToRelative(7.45f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(18f, 10f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(6f, 20f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _PersonCarryBox = it }
