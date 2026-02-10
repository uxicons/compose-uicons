package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tasks: ImageVector? = null

val Icons.Br.Tasks: ImageVector
    get() = _Tasks ?: UXIcon(name = "Tasks") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13.5f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-13.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 5.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-12f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(8.67f, 12.43f)
            lineTo(8.22f, 12.01f)
            curveToRelative(-0.41f, -0.38f, -0.43f, -1.02f, -0.04f, -1.43f)
            curveToRelative(0.38f, -0.39f, 1.0f, -0.41f, 1.4f, -0.04f)
            lineToRelative(0.52f, 0.48f)
            lineToRelative(1.59f, -1.65f)
            curveToRelative(0.39f, -0.41f, 1.04f, -0.41f, 1.44f, -0.01f)
            curveToRelative(0.38f, 0.39f, 0.38f, 1.0f, 0.01f, 1.39f)
            lineToRelative(-1.63f, 1.69f)
            curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(22.13f, 18.75f)
            lineTo(20.5f, 20.44f)
            curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
            lineToRelative(-0.46f, -0.42f)
            curveToRelative(-0.41f, -0.38f, -0.43f, -1.02f, -0.04f, -1.43f)
            curveToRelative(0.38f, -0.39f, 1.0f, -0.41f, 1.4f, -0.04f)
            lineToRelative(0.52f, 0.48f)
            lineToRelative(1.59f, -1.65f)
            curveToRelative(0.39f, -0.41f, 1.04f, -0.41f, 1.44f, -0.01f)
            curveToRelative(0.38f, 0.39f, 0.38f, 1.0f, 0.01f, 1.39f)
            close()
            moveTo(15f, 15f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            close()
        }
    }.also { _Tasks = it }
