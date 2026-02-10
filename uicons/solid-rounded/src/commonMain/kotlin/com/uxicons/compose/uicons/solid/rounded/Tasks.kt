package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tasks: ImageVector? = null

val Icons.Sr.Tasks: ImageVector
    get() = _Tasks ?: UXIcon(name = "Tasks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 5f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
                moveTo(20.63f, 17.75f)
                curveToRelative(0.38f, -0.39f, 0.37f, -1.01f, -0.01f, -1.39f)
                curveToRelative(-0.39f, -0.4f, -1.04f, -0.4f, -1.44f, 0.01f)
                lineToRelative(-1.59f, 1.65f)
                lineToRelative(-0.52f, -0.48f)
                curveToRelative(-0.4f, -0.37f, -1.02f, -0.35f, -1.4f, 0.04f)
                curveToRelative(-0.39f, 0.4f, -0.37f, 1.05f, 0.04f, 1.43f)
                lineToRelative(0.46f, 0.42f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(1.63f, -1.69f)
                close()
                moveTo(12.13f, 9.75f)
                curveToRelative(0.38f, -0.39f, 0.37f, -1.01f, -0.01f, -1.39f)
                curveToRelative(-0.39f, -0.4f, -1.04f, -0.4f, -1.44f, 0.01f)
                lineToRelative(-1.59f, 1.65f)
                lineToRelative(-0.52f, -0.48f)
                curveToRelative(-0.4f, -0.37f, -1.02f, -0.35f, -1.4f, 0.04f)
                curveToRelative(-0.39f, 0.4f, -0.37f, 1.05f, 0.04f, 1.43f)
                lineToRelative(0.46f, 0.42f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(1.63f, -1.69f)
                close()
                moveTo(14f, 7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-12f)
                close()
            }
        }.also { _Tasks = it}
