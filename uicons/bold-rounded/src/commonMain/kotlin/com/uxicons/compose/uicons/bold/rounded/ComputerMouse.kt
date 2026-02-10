package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Br.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 3f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
            close()
            moveTo(17.97f, 10f)
            horizontalLineToRelative(-4.47f)
            verticalLineToRelative(-4f)
            curveToRelative(2.31f, 0f, 4.22f, 1.75f, 4.47f, 4f)
            close()
            moveTo(10.5f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4.47f)
            curveToRelative(0.25f, -2.25f, 2.16f, -4f, 4.47f, -4f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            close()
        }
    }.also { _ComputerMouse = it }
